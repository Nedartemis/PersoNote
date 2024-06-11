package fr.epita.sundaland.service;

import fr.epita.sundaland.controller.contracts.CreatePurchaseRequest;
import fr.epita.sundaland.controller.contracts.PurchaseResponse;
import fr.epita.sundaland.repository.ProductRepository;
import fr.epita.sundaland.repository.PurchaseRepository;
import fr.epita.sundaland.repository.entity.PurchaseEntity;
import io.smallrye.common.constraint.NotNull;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.BadRequestException;
import jakarta.ws.rs.NotAuthorizedException;
import jakarta.ws.rs.NotFoundException;
import org.eclipse.microprofile.config.ConfigProvider;
import org.jboss.logging.Logger;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.List;
import java.util.UUID;

import static fr.epita.sundaland.utils.Validators.assertNotNull;

@ApplicationScoped
public class PurchaseService {
    @Inject Logger logger;

    @Inject ProductRepository productRepository;
    @Inject PurchaseRepository purchaseRepository;

    public @NotNull PurchaseResponse createPurchase(final @NotNull CreatePurchaseRequest purchaseRequest) {
        logger.info("Creating new purchase");

        assertNotNull(purchaseRequest, new BadRequestException("No request body"));

        if (purchaseRequest.products.isEmpty())
            throw new BadRequestException("can't place an order without products");

        BigDecimal totalPrice = BigDecimal.ZERO;

        for (var productId : purchaseRequest.products) {
            final var product = productRepository.findById(productId);
            if (product == null)
                throw new NotFoundException("product " + productId + " was not found");

            if (product.stock <= 0)
                throw new BadRequestException("product " + productId + " is out of stock");

            totalPrice = totalPrice.add(product.price);
        }

        for (var productId : purchaseRequest.products) {
            final var product = productRepository.findById(productId);
            product.stock--;
            productRepository.update(product);
        }

        final var createdPurchase = new PurchaseEntity()
                .withId(UUID.randomUUID())
                .withCreatedTimestamp(Instant.now())
                .withProducts(purchaseRequest.products)
                .withCustomerName(purchaseRequest.customerName)
                .withCustomerAddress(purchaseRequest.customerAddress)
                .withTotalPrice(totalPrice);

        purchaseRepository.persist(createdPurchase);

        return new PurchaseResponse(createdPurchase.id,
                                    createdPurchase.createdTimestamp,
                                    createdPurchase.products,
                                    createdPurchase.customerName,
                                    createdPurchase.customerAddress,
                                    createdPurchase.totalPrice);
    }

    public @NotNull List<PurchaseResponse> listPurchase(final @NotNull String adminToken) {
        logger.info("Listing purchases");

        assertNotNull(adminToken, new NotAuthorizedException("No admin token provided"));

        if (adminToken.isEmpty() || !adminToken.equals(ConfigProvider.getConfig()
                                                                     .getValue("sundaland.admin.token",
                                                                               String.class))) {
            throw new NotAuthorizedException("Invalid admin token provided");
        }

        return purchaseRepository.listAll().stream().map(purchase -> new PurchaseResponse(
                purchase.id,
                purchase.createdTimestamp,
                purchase.products,
                purchase.customerName,
                purchase.customerAddress,
                purchase.totalPrice
        )).toList();
    }
}
