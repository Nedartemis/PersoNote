package fr.epita.sundaland.repository.entity;

import io.quarkus.mongodb.panache.common.MongoEntity;
import io.smallrye.common.constraint.NotNull;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.With;
import org.bson.codecs.pojo.annotations.BsonId;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.List;
import java.util.UUID;

@With @AllArgsConstructor @NoArgsConstructor @Setter
@MongoEntity(collection = "Purchases")
public class PurchaseEntity {
    public @NotNull @BsonId UUID id;
    public @NotNull Instant createdTimestamp;
    public @NotNull List<UUID> products;
    public @NotNull String customerName;
    public @NotNull String customerAddress;
    public @NotNull BigDecimal totalPrice;
}
