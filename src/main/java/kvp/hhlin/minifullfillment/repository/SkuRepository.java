package kvp.hhlin.minifullfillment.repository;

import kvp.hhlin.minifullfillment.domain.Sku;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class SkuRepository {

    private List<Sku> skus = new ArrayList<>();

    public void save(Sku sku) {
        skus.add(sku);
    }

    public List<Sku> getSkus() {
        return skus;
    }

}
