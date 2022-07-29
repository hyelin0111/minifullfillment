package kvp.hhlin.minifullfillment.service;

import kvp.hhlin.minifullfillment.domain.Barcode;
import kvp.hhlin.minifullfillment.repository.BarcodeRepository;
import org.springframework.stereotype.Service;

@Service
public class BarcodeService {

    private final BarcodeRepository barcodeRepository;

    public BarcodeService(BarcodeRepository barcodeRepository) {
        this.barcodeRepository = barcodeRepository;
    }

    public void save(String skuCode, String barcode) {
        barcodeRepository.save(Barcode.of(skuCode, barcode));
    }
}