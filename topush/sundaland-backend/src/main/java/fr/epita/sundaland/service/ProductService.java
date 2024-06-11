package fr.epita.sundaland.service;

import fr.epita.sundaland.controller.contracts.CreateProductRequest;
import fr.epita.sundaland.controller.contracts.ProductResponse;
import fr.epita.sundaland.controller.contracts.UpdateProductRequest;
import fr.epita.sundaland.repository.ProductRepository;
import fr.epita.sundaland.repository.entity.ProductEntity;
import io.smallrye.common.constraint.NotNull;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.BadRequestException;
import jakarta.ws.rs.InternalServerErrorException;
import jakarta.ws.rs.NotAuthorizedException;
import jakarta.ws.rs.NotFoundException;
import org.eclipse.microprofile.config.ConfigProvider;
import org.jboss.logging.Logger;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

import static fr.epita.sundaland.utils.Validators.assertNotNull;

@ApplicationScoped
public class ProductService {
    @Inject Logger logger;

    @Inject ProductRepository productRepository;

    public @NotNull ProductResponse createProduct(final @NotNull String adminToken,
                                                  final @NotNull CreateProductRequest productRequest) {
        logger.info("Creating new product");

        assertNotNull(adminToken, new NotAuthorizedException("No admin token provided"));
        assertNotNull(productRequest, new BadRequestException("No request body"));

        if (adminToken.isEmpty() || !adminToken.equals(ConfigProvider.getConfig()
                                                                     .getValue("sundaland.admin.token",
                                                                               String.class))) {
            throw new NotAuthorizedException("Invalid admin token provided");
        }

        if (productRequest.price.compareTo(BigDecimal.ZERO) <= 0) {
            throw new BadRequestException("Invalid product: negative or null price");
        }
        if (productRequest.stock < 0) {
            throw new BadRequestException("Invalid product: negative stock");
        }

        final var createEntity = new ProductEntity()
                .withId(UUID.randomUUID())
                .withName(productRequest.name)
                .withCategory(productRequest.category)
                .withPrice(productRequest.price)
                .withPicturesPaths(productRequest.picturesPaths)
                .withStock(productRequest.stock);

        productRepository.persist(createEntity);

        return new ProductResponse(createEntity.id,
                                   createEntity.name,
                                   createEntity.category,
                                   createEntity.price,
                                   createEntity.picturesPaths,
                                   createEntity.stock);
    }

    public @NotNull ProductResponse updateProduct(final @NotNull String adminToken,
                                                  final @NotNull UUID productId,
                                                  final @NotNull
                                                  UpdateProductRequest productRequest) {
        logger.info("Updating product " + productId);

        assertNotNull(adminToken, new NotAuthorizedException("No admin token provided"));
        assertNotNull(productId, new BadRequestException("No product id provided"));
        assertNotNull(productRequest, new BadRequestException("No request body"));

        if (adminToken.isEmpty() || !adminToken.equals(ConfigProvider.getConfig()
                                                                     .getValue("sundaland.admin.token",
                                                                               String.class))) {
            throw new NotAuthorizedException("Invalid admin token provided");
        }

        if (productRequest.price.compareTo(BigDecimal.ZERO) <= 0) {
            throw new BadRequestException("Invalid product: negative or null price");
        }
        if (productRequest.stock < 0) {
            throw new BadRequestException("Invalid product: negative stock");
        }

        final var product = productRepository.findById(productId);
        if (product == null)
            throw new NotFoundException("Product not found");

        product.setName(productRequest.name);
        product.setCategory(productRequest.category);
        product.setPrice(productRequest.price);
        product.setPicturesPaths(productRequest.picturesPaths);
        product.setStock(productRequest.stock);

        productRepository.update(product);

        return new ProductResponse(product.id,
                                   product.name,
                                   product.category,
                                   product.price,
                                   product.picturesPaths,
                                   product.stock);
    }

    public void deleteProduct(final @NotNull String adminToken, final @NotNull UUID productId) {
        logger.info("Deleting product " + productId);

        assertNotNull(adminToken, new NotAuthorizedException("No admin token provided"));
        assertNotNull(productId, new BadRequestException("No product id provided"));

        if (adminToken.isEmpty() || !adminToken.equals(ConfigProvider.getConfig()
                                                                     .getValue("sundaland.admin.token",
                                                                               String.class))) {
            throw new NotAuthorizedException("Invalid admin token provided");
        }

        if (productRepository.findById(productId) == null)
            throw new NotFoundException("Product was not found");

        if (!productRepository.deleteById(productId))
            throw new InternalServerErrorException("Could not delete product");
    }

    public @NotNull List<ProductResponse> listProducts() {
        logger.info("Listing all products");

        return productRepository.listAll()
                                .stream()
                                .map(product -> new ProductResponse(product.id,
                                                                    product.name,
                                                                    product.category,
                                                                    product.price,
                                                                    product.picturesPaths,
                                                                    product.stock)).toList();
    }
}
