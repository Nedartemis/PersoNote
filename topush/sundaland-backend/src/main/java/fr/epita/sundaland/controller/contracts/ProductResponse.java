package fr.epita.sundaland.controller.contracts;

import io.smallrye.common.constraint.NotNull;
import lombok.AllArgsConstructor;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

@AllArgsConstructor
public class ProductResponse {
    public @NotNull UUID id;
    public String name;
    public String category;
    public BigDecimal price;
    public List<String> picturesPaths;
    public Integer stock;
}
