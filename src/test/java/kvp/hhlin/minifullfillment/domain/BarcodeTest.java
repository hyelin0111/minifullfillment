package kvp.hhlin.minifullfillment.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BarcodeTest {

    private Barcode barcode;

    @BeforeEach
    void Barcode생성() {
        barcode = new Barcode("");
    }

    @Test
    void Barcode는_빈값이_아니다() {
        assertThrows(IllegalArgumentException.class, () -> {
            barcode.isValidCode(barcode.getBarcode());
        });

        barcode.setBarcode("000111010001");
        assertNotNull(barcode.getBarcode());
    }

    @Test
    void Barcode는_최대_20자이다() {
        barcode.setBarcode("01234567890123456789");
        assertTrue(barcode.getBarcode().length() <= 20);

        barcode.setBarcode("012345678901234567890");
        assertThrows(IllegalArgumentException.class, () -> {
            barcode.isValidCode(barcode.getBarcode());
        });
    }
}
