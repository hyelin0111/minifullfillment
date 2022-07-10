package kvp.hhlin.minifullfillment.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class SkuTest {

    private Sku sku;

    @BeforeEach
    void Sku생성() {
        sku = new Sku();
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
}
