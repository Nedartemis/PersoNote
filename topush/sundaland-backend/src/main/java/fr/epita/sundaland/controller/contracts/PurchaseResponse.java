package fr.epita.sundaland.controller.contracts;

import io.smallrye.common.constraint.NotNull;
import lombok.AllArgsConstructor;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.List;
import java.util.UUID;

@AllArgsConstructor
public class PurchaseResponse {
    public @NotNull UUID id;
    public Instant createdTimestamp;
    public List<UUID> products;
    public String customerName;
    public String customerAddress;
    public BigDecimal totalPrice;
}
