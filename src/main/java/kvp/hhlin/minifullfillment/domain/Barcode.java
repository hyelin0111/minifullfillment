package kvp.hhlin.minifullfillment.domain;

public class Barcode {

    private static final int MAX_NAME_LENGTH = 20;

    private String skuCode;

    private String barcode;

    private Barcode(String skuCode, String barcode) {
        validateCode(barcode);
        this.skuCode = skuCode;
        this.barcode = barcode;
    }

    public static Barcode of(String skuCode, String barcode) {
        return new Barcode(skuCode, barcode);
    }

    private void validateCode(String barcode) {
        if (!isValidLength(barcode) || barcode.isBlank()) {
            throw new IllegalArgumentException("바코드는 빈 값일 수 없고 최대 20자입니다.");
        }
    }

    private boolean isValidLength(String barcode) {
        return barcode.length() <= MAX_NAME_LENGTH;
    }

    public String getBarcode() {
        return barcode;
    }
}
