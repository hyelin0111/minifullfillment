package kvp.hhlin.minifullfillment.domain;

public class Stock {

    private String centerId;

    private String skuCode;

    private Long quantity;

    Stock(String centerId, String skuCode) {
        this.centerId = centerId;
        this.skuCode = skuCode;
        this.quantity = 0L;
    }

    private boolean isValidQuantity() {
        return this.quantity >= 0L;
    }

    private void isValidStatus() {
        if (!isValidQuantity()) {
            throw new IllegalArgumentException("재고는 0보다 작을 수 없습니다.");
        }
    }

    public void addQuantity(Long quantity) {
        this.quantity += quantity;
    }

    public void subtractQuantity(Long quantity) {
        this.quantity -= quantity;
        isValidStatus();
    }

    public Long getQuantity() {
        return quantity;
    }
}