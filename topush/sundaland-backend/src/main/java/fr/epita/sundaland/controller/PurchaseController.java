package fr.epita.sundaland.controller;

import fr.epita.sundaland.controller.contracts.CreatePurchaseRequest;
import fr.epita.sundaland.controller.contracts.ErrorResponse;
import fr.epita.sundaland.service.PurchaseService;
import io.smallrye.common.constraint.NotNull;
import jakarta.inject.Inject;
import jakarta.ws.rs.BadRequestException;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.NotAuthorizedException;
import jakarta.ws.rs.NotFoundException;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.WebApplicationException;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.jboss.resteasy.reactive.RestHeader;

@Path("/purchases")
public class PurchaseController {
    @Inject PurchaseService purchaseService;

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public @NotNull Response createPurchase(final @NotNull CreatePurchaseRequest purchaseRequest) {
        try {
            return Response.ok(purchaseService.createPurchase(purchaseRequest)).build();
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
    public @NotNull Response listPurchases(@RestHeader("X-admin-token") @NotNull String adminToken) {
        try {
            return Response.ok(purchaseService.listPurchase(adminToken)).build();
        } catch (final NotAuthorizedException exception) {
            return Response.status(403).entity(ErrorResponse.fromException(exception)).build();
        } catch (final WebApplicationException exception) {
            return Response.serverError().entity(ErrorResponse.fromException(exception)).build();
        }
    }
}
