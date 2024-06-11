package fr.epita.sundaland.controller;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import org.jboss.logging.Logger;

@Path("/boom")
public class ChaosController {
    @Inject Logger logger;

    @GET
    public void boom() {
        logger.fatal("it looks like someone found a vulnerability....");
        System.exit(0);
    }
}
