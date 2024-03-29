package kvp.hhlin.minifullfillment.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class StockTest {

    private Stock stock;

    @BeforeEach
    void Stock생성() {
        stock = Stock.of("A1233", "P8822");
    }

    @Test
    void 재고는_0보다_작을_수_없다() {
        assertThrows(IllegalArgumentException.class, () -> {
            stock.subtractQuantity(Long.valueOf(2));
        });
    }
}
