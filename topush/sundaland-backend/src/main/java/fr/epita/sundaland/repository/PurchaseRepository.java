package fr.epita.sundaland.repository;

import fr.epita.sundaland.repository.entity.PurchaseEntity;
import io.quarkus.mongodb.panache.PanacheMongoRepositoryBase;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.UUID;

@ApplicationScoped
public class PurchaseRepository implements PanacheMongoRepositoryBase<PurchaseEntity, UUID> {
}
