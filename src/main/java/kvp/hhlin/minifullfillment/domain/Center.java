package kvp.hhlin.minifullfillment.domain;

public class Center {

    private Long id;

    private String name;

    private CenterStatus status;

    private Center(String name) {
        this.name = name;
        this.status = CenterStatus.READY;
    }
    public static Center of(String name) {
        return new Center(name);
    }

    public CenterStatus getStatus() {
        return status;
    }
}