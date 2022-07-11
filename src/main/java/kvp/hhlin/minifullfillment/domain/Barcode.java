package kvp.hhlin.minifullfillment.domain;

public class Barcode {

    private static final int MAX_NAME_LENGTH = 20;

    private String barcode;

    private boolean isValidLength(String barcode) {
        return barcode.length() <= MAX_NAME_LENGTH;
    }

    private boolean isEmpty(String barcode) {
        return barcode.trim().length() == 0 || barcode.isEmpty() || barcode.isBlank();
    }

    public void isValidCode(String barcode) {
        if (!isValidLength(barcode) || isEmpty(barcode)) {
            throw new IllegalArgumentException("바코드는 빈 값일 수 없고 최대 20자입니다.");
        }
    }

    Barcode(String barcode) {
        this.setBarcode(barcode);
    }

    public static Barcode of(String barcode) {
        return new Barcode(barcode);
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }
}
