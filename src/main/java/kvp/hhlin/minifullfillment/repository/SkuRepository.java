package kvp.hhlin.minifullfillment.repository;

import kvp.hhlin.minifullfillment.domain.Sku;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SkuRepository extends JpaRepository<Sku, Long> {
}