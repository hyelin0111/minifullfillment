package kvp.hhlin.minifullfillment.domain;

public enum SkuStatus {
    READY("런칭 예정"),
    FOR_SALE("판매중"),
    STOP("판매 중지");

    private final String status;

    private SkuStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}
