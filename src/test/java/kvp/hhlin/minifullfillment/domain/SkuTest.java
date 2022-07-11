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
        sku.setCode("");
        assertThrows(IllegalArgumentException.class, () -> {
            sku.isValidCode(sku.getCode());
        });

        sku.setCode("1234");
        assertNotNull(sku.getCode());
    }

    @Test
    void Sku는_빈값이_아닌_이름을_가진다() {
        sku.setName("");
        assertThrows(IllegalArgumentException.class, () -> {
            sku.isValidName(sku.getName());
        });

        sku.setName("1234");
        assertNotNull(sku.getName());
    }

    @Test
    void 이름은_최대_20자이다() {
        sku.setName("01234567890123456789");
        assertTrue(sku.getName().length() <= 20);

        sku.setName("012345678901234567890");
        assertThrows(IllegalArgumentException.class, () -> {
            sku.isValidName(sku.getName());
        });
    }

    @Test
    void 바코드를_등록할_수_있다() {
        sku.addBarcode("00110011");
        assertTrue(sku.getBarcode().size() == 1);
    }

    @Test
    void Sku의_초기상태는_런칭_예정이다() {
        assertTrue(sku.getStatus().equals("런칭 예정"));
    }
}
