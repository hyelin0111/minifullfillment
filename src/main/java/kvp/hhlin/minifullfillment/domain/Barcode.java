package kvp.hhlin.minifullfillment.domain;

public class Barcode {

    private static final int MAX_NAME_LENGTH = 20;

    private String code;

    private boolean isValidLength(String code) {
        return code.length() <= MAX_NAME_LENGTH;
    }

    private boolean isEmpty(String code) {
        return code.trim().length() == 0 || code.isEmpty() || code.isBlank();
    }

    public void isValidCode(String code) {
        if (!isValidLength(code) || isEmpty(code)) {
            throw new IllegalArgumentException("바코드는 빈 값일 수 없고 최대 20자입니다.");
        }
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
