package fr.epita.sundaland.controller;

import fr.epita.sundaland.service.AuthService;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;
import org.jboss.resteasy.reactive.RestHeader;

@Path("/auth")
public class AuthController {
    @Inject AuthService authService;

    @GET
    public Response checkAdminToken(@RestHeader("X-admin-token") final String adminToken) {
        if (authService.isAdminTokenValid(adminToken))
            return Response.ok().build();
        return Response.status(403).build();
    }
}
