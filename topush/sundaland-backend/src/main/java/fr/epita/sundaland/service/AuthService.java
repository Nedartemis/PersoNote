package fr.epita.sundaland.service;

import io.smallrye.common.constraint.NotNull;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.NotAuthorizedException;
import org.eclipse.microprofile.config.ConfigProvider;
import org.jboss.logging.Logger;

import static fr.epita.sundaland.utils.Validators.assertNotNull;

@ApplicationScoped public class AuthService {
    @Inject Logger logger;

    public @NotNull boolean isAdminTokenValid(@NotNull final String adminToken) {
        logger.info("Checking admin token");

        assertNotNull(adminToken, new NotAuthorizedException("No admin token provided"));

        return adminToken.equals(ConfigProvider.getConfig().getValue("sundaland.admin.token", String.class));
    }
}
