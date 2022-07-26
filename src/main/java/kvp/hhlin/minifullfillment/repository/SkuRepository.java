package kvp.hhlin.minifullfillment.repository;

import kvp.hhlin.minifullfillment.domain.Sku;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

public interface SkuRepository extends JpaRepository<Sku, Long> {



}
