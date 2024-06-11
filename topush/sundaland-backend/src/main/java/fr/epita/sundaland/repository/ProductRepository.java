package fr.epita.sundaland.repository;

import fr.epita.sundaland.repository.entity.ProductEntity;
import io.quarkus.mongodb.panache.PanacheMongoRepositoryBase;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.UUID;

@ApplicationScoped
public class ProductRepository implements PanacheMongoRepositoryBase<ProductEntity, UUID> {
}
