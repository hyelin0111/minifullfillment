package kvp.hhlin.minifullfillment.domain;

import java.util.HashSet;
import java.util.Set;

public class Sku {

    private static final int MAX_NAME_LENGTH = 20;

    private String code;

    private String name;

    private String status;

    private Set<Barcode> barcode;

    Sku(String code, String name) {
        this.code = code;
        this.name = name;
        this.status = SkuStatus.valueOf("READY").getStatus();
        this.barcode = new HashSet<>();
    }

    private boolean isValidLength(String name) {
        return name.length() <= MAX_NAME_LENGTH;
    }

    private boolean isEmpty(String value) {
        return value.trim().length() == 0 || value.isEmpty() || value.isBlank();
    }

    public void isValidName(String name) {
        if (!isValidLength(name) || isEmpty(name)) {
            throw new IllegalArgumentException("이름은 빈 값일 수 없고 최대 20자입니다.");
        }
    }

    public void isValidCode(String code) {
        if (isEmpty(code)) {
            throw new IllegalArgumentException("코드는 빈 값일 수 없습니다.");
        }
    }

    public void addBarcode(String barcode) {
        this.barcode.add(Barcode.of(barcode));
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Set<Barcode> getBarcode() {
        return barcode;
    }

    public void setBarcode(Set<Barcode> barcode) {
        this.barcode = barcode;
    }
}
