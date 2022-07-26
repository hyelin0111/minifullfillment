package kvp.hhlin.minifullfillment.domain;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Sku {

    private static final int MAX_NAME_LENGTH = 20;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String code;

    private String name;

    @Enumerated(EnumType.STRING)
    private SkuStatus status;

    @OneToMany
    @JoinColumn(name = "sku_id")
    private Set<Barcode> barcodes;

    public Sku() {
    }

    public Sku(String code, String name) {
        isValidCode(code);
        isValidName(name);
        this.code = code;
        this.name = name;
        this.status = SkuStatus.READY;
        this.barcodes = new HashSet<>();
    }

    public void isValidCode(String code) {
        if (code.isBlank()) {
            throw new IllegalArgumentException("코드는 빈 값일 수 없습니다.");
        }
    }

    public void isValidName(String name) {
        if (!isValidLength(name) || name.isBlank()) {
            throw new IllegalArgumentException("이름은 빈 값일 수 없고 최대 20자입니다.");
        }
    }

    private boolean isValidLength(String name) {
        return name.length() <= MAX_NAME_LENGTH;
    }

    public void addBarcode(Barcode barcode) {
        this.barcodes.add(barcode);
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public SkuStatus getStatus() {
        return status;
    }

    public Set<Barcode> getBarcode() {
        return barcodes;
    }
}
