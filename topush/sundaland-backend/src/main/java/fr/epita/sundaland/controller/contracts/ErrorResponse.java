package fr.epita.sundaland.controller.contracts;

import io.smallrye.common.constraint.NotNull;
import jakarta.ws.rs.WebApplicationException;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.With;

@AllArgsConstructor @NoArgsConstructor @With
public class ErrorResponse {
    public @NotNull String error;
    public @NotNull String details;

    public static ErrorResponse fromException(WebApplicationException exception) {
        return new ErrorResponse().withError(exception.getClass().getName()).withDetails(exception.getMessage());
    }
}
