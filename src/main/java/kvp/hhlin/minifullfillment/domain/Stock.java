package kvp.hhlin.minifullfillment.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Stock {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String centerId;

    private String skuId;

    private Long quantity;

    public Stock() {
    }

    private Stock(String centerId, String skuId) {
        this.centerId = centerId;
        this.skuId = skuId;
        this.quantity = 0L;
    }

    public static Stock of(String centerId, String skuId) {
        return new Stock(centerId, skuId);
    }

    private boolean isValidQuantity() {
        return this.quantity >= 0L;
    }

    private void validateStatus() {
        if (!isValidQuantity()) {
            throw new IllegalArgumentException("재고는 0보다 작을 수 없습니다.");
        }
    }

    public void addQuantity(Long quantity) {
        this.quantity += quantity;
    }

    public void subtractQuantity(Long quantity) {
        this.quantity -= quantity;
        validateStatus();
    }

}