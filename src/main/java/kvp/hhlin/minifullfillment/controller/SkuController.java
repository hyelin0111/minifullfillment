package kvp.hhlin.minifullfillment.controller;

import kvp.hhlin.minifullfillment.domain.Sku;
import kvp.hhlin.minifullfillment.dto.SkuCreateRequest;
import kvp.hhlin.minifullfillment.repository.SkuRepository;
import kvp.hhlin.minifullfillment.service.SkuService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/skus")
@RestController
public class SkuController {

    private final SkuService skuService;
    private final SkuRepository skuRepository;

    public SkuController(SkuService skuService, SkuRepository skuRepository) {
        this.skuService = skuService;
        this.skuRepository = skuRepository;
    }

    @PostMapping
    public void save(@RequestBody SkuCreateRequest skuCreateRequest) {
        skuService.save(skuCreateRequest.getCode(), skuCreateRequest.getName());
    }

    @GetMapping
    public List<Sku> findAll() {
        return skuRepository.findAll();
    }
}
