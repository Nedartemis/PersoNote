package fr.epita.sundaland.controller.contracts;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;
import java.util.UUID;

public class CreatePurchaseRequest {
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public List<UUID> products;
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public String customerName;
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public String customerAddress;
}
