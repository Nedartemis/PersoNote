package fr.epita.sundaland.utils;

import io.smallrye.common.constraint.NotNull;
import jakarta.ws.rs.InternalServerErrorException;
import jakarta.ws.rs.WebApplicationException;

public enum Validators {
    ;

    public static void assertNotNull(final Exception exception) {
        if (exception == null) {
            throw new InternalServerErrorException("Null exception was passed");
        }
    }

    public static void assertNotNull(final Object object, final @NotNull WebApplicationException exception) {
        assertNotNull(exception);

        if (object == null) {
            throw exception;
        }
    }
}
