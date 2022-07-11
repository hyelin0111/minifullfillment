package kvp.hhlin.minifullfillment.domain;

public enum CenterStatus {
    READY("오픈 준비중"),
    OPEN("운영중"),
    CLOSED("폐점");

    private final String status;

    private CenterStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}