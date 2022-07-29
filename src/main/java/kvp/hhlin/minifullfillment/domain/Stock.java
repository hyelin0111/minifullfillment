package kvp.hhlin.minifullfillment.domain;

public class Stock {

    private String centerId;

    private String skuCode;

    private Long quantity;

    private Stock(String centerId, String skuCode) {
        this.centerId = centerId;
        this.skuCode = skuCode;
        this.quantity = 0L;
    }

    public static Stock of(String centerId, String skuCode) {
        return new Stock(centerId, skuCode);
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