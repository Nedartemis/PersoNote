package fr.epita.sundaland.controller;

import fr.epita.sundaland.controller.contracts.CreateProductRequest;
import fr.epita.sundaland.controller.contracts.ErrorResponse;
import fr.epita.sundaland.controller.contracts.UpdateProductRequest;
import fr.epita.sundaland.service.ProductService;
import io.smallrye.common.constraint.NotNull;
import jakarta.inject.Inject;
import jakarta.ws.rs.BadRequestException;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.NotAuthorizedException;
import jakarta.ws.rs.NotFoundException;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.WebApplicationException;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.jboss.resteasy.reactive.RestHeader;
import org.jboss.resteasy.reactive.RestPath;

import java.util.UUID;

@Path("/products")
public class ProductController {
    @Inject ProductService productService;

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public @NotNull Response createProduct(@RestHeader("X-admin-token") final @NotNull String adminToken,
                                           final @NotNull CreateProductRequest createProductRequest) {
        try {
            return Response.ok(productService.createProduct(adminToken, createProductRequest)).build();
        } catch (final BadRequestException exception) {
            return Response.status(400).entity(ErrorResponse.fromException(exception)).build();
        } catch (final NotAuthorizedException exception) {
            return Response.status(403).entity(ErrorResponse.fromException(exception)).build();
        } catch (final WebApplicationException exception) {
            return Response.serverError().entity(ErrorResponse.fromException(exception)).build();
        }
    }

    @PUT
    @Path("/{productId}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public @NotNull Response updateProduct(@RestHeader("X-admin-token") final @NotNull String adminToken,
                                           @RestPath("productId") final @NotNull UUID productId,
                                           final @NotNull UpdateProductRequest productRequest) {
        try {
            return Response.ok(productService.updateProduct(adminToken, productId, productRequest)).build();
        } catch (final BadRequestException exception) {
            return Response.status(400).entity(ErrorResponse.fromException(exception)).build();
        } catch (final NotAuthorizedException exception) {
            return Response.status(403).entity(ErrorResponse.fromException(exception)).build();
        } catch (final NotFoundException exception) {
            return Response.status(404).entity(ErrorResponse.fromException(exception)).build();
        } catch (final WebApplicationException exception) {
            return Response.serverError().entity(ErrorResponse.fromException(exception)).build();
        }
    }

    @DELETE
    @Path("/{productId}")
    public @NotNull Response deleteProduct(@RestHeader("X-admin-token") final @NotNull String adminToken,
                                           @RestPath("productId") final @NotNull
                                           UUID productId) {
        try {
            productService.deleteProduct(adminToken, productId);
            return Response.ok().build();
        } catch (final BadRequestException exception) {
            return Response.status(400).entity(ErrorResponse.fromException(exception)).build();
        } catch (final NotAuthorizedException exception) {
            return Response.status(403).entity(ErrorResponse.fromException(exception)).build();
        } catch (final NotFoundException exception) {
            return Response.status(404).entity(ErrorResponse.fromException(exception)).build();
        } catch (final WebApplicationException exception) {
            return Response.serverError().entity(ErrorResponse.fromException(exception)).build();
        }
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public @NotNull Response listProducts() {
        try {
            return Response.ok(productService.listProducts()).build();
        } catch (final WebApplicationException exception) {
            return Response.serverError().entity(ErrorResponse.fromException(exception)).build();
        }
    }
}
