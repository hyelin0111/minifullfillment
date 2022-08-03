package kvp.hhlin.minifullfillment.controller;

import kvp.hhlin.minifullfillment.domain.Barcode;
import kvp.hhlin.minifullfillment.dto.BarcodCreateRequest;
import kvp.hhlin.minifullfillment.repository.BarcodeRepository;
import kvp.hhlin.minifullfillment.service.BarcodeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/barcodes")
@RestController
public class BarcodeController {

    private final BarcodeService barcodeService;
    private final BarcodeRepository barcodeRepository;

    public BarcodeController(BarcodeService barcodeService, BarcodeRepository barcodeRepository) {
        this.barcodeService = barcodeService;
        this.barcodeRepository = barcodeRepository;
    }

    @PostMapping
    public void save(@RequestBody BarcodCreateRequest barcodCreateRequest) {
        barcodeService.save(barcodCreateRequest.getSkuCode(), barcodCreateRequest.getBarcode());
    }

    @GetMapping
    public List<Barcode> findAll() {
        return barcodeRepository.findAll();
    }
}
