package kvp.hhlin.minifullfillment.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class SkuTest {

    private Sku sku;

    @BeforeEach
    void Sku생성() {
        sku = new Sku("s123", "초콜릿");
    }

    @Test
    void Sku는_빈값이_아닌_코드값을_가진다() {
        assertNotNull(sku.getCode());

        assertThrows(IllegalArgumentException.class, () -> {
            sku = new Sku("", "초콜릿");
        });
    }

    @Test
    void Sku는_빈값이_아닌_이름을_가진다() {
        assertNotNull(sku.getName());

        assertThrows(IllegalArgumentException.class, () -> {
            sku = new Sku("s123", "");
        });
    }

    @Test
    void 이름은_최대_20자이다() {
        sku = new Sku("s123", "01234567890123456789");
        assertTrue(sku.getName().length() == 20);

        assertThrows(IllegalArgumentException.class, () -> {
            sku = new Sku("s123", "012345678901234567890");
        });
    }

    @Test
    void 바코드를_등록할_수_있다() {
        sku.addBarcode(Barcode.of("111", "01010000"));
        assertTrue(sku.getBarcode().size() == 1);
    }

    @Test
    void Sku의_초기상태는_런칭_예정이다() {
        assertTrue(sku.getStatus().equals(SkuStatus.READY));
    }
}
