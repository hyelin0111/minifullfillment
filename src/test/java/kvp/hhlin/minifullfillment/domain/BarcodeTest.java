package kvp.hhlin.minifullfillment.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BarcodeTest {

    private Barcode barcode;

    @BeforeEach
    void Barcode생성() {
        barcode = Barcode.of("111", "01234567890123456789");
    }

    @Test
    void Barcode는_빈값이_아니다() {
        assertNotNull(barcode.getBarcode());

        assertThrows(IllegalArgumentException.class, () -> {
            barcode = Barcode.of("111", "");
        });
    }

    @Test
    void Barcode는_최대_20자이다() {
        assertTrue(barcode.getBarcode().length() == 20);

        assertThrows(IllegalArgumentException.class, () -> {
            barcode = Barcode.of("111", "012345678901234567890");
        });
    }
}
