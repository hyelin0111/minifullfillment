package kvp.hhlin.minifullfillment.service;

import kvp.hhlin.minifullfillment.domain.Sku;
import kvp.hhlin.minifullfillment.repository.SkuRepository;
import org.springframework.stereotype.Service;

@Service
public class SkuService {

    private final SkuRepository skuRepository;

    public SkuService(SkuRepository skuRepository) {
        this.skuRepository = skuRepository;
    }

    public void save(String code, String name) {
        skuRepository.save(new Sku(code, name));
    }
}
