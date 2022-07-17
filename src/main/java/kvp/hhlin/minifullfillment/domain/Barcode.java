package kvp.hhlin.minifullfillment.domain;

public class Barcode {

    private static final int MAX_NAME_LENGTH = 20;

    private String skucode;

    private String barcode;

    Barcode(String skucode, String barcode) {
        isValidCode(barcode);
        this.skucode = skucode;
        this.barcode = barcode;
    }

    public static Barcode of(String skucode, String barcode) {
        return new Barcode(skucode, barcode);
    }

    private void isValidCode(String barcode) {
        if (!isValidLength(barcode) || barcode.isBlank()) {
            throw new IllegalArgumentException("바코드는 빈 값일 수 없고 최대 20자입니다.");
        }
    }

    private boolean isValidLength(String barcode) {
        return barcode.length() <= MAX_NAME_LENGTH;
    }

    public String getSkucode() {
        return skucode;
    }

    public String getBarcode() {
        return barcode;
    }
}
