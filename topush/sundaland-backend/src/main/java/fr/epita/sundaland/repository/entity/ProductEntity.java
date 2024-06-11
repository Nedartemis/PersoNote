package fr.epita.sundaland.repository.entity;

import io.quarkus.mongodb.panache.common.MongoEntity;
import io.smallrye.common.constraint.NotNull;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.With;
import org.bson.codecs.pojo.annotations.BsonId;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

@With @AllArgsConstructor @NoArgsConstructor @Setter
@MongoEntity(collection = "Products")
public class ProductEntity {
    public @NotNull @BsonId UUID id;
    public @NotNull String name;
    public @NotNull String category;
    public @NotNull BigDecimal price;
    public @NotNull List<String> picturesPaths;
    public @NotNull Integer stock;
}
