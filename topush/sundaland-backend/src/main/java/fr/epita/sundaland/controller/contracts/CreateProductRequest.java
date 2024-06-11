package fr.epita.sundaland.controller.contracts;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.math.BigDecimal;
import java.util.List;

public class CreateProductRequest {
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public String name;

    @JsonInclude()
    public String category;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public BigDecimal price;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<String> picturesPaths;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer stock;
}
