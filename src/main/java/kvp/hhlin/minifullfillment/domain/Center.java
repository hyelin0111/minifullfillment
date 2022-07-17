package kvp.hhlin.minifullfillment.domain;

public class Center {

    private String id;

    private String name;

    private CenterStatus status;

    Center(String id, String name) {
        this.id = id;
        this.name = name;
        this.status = CenterStatus.READY;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public CenterStatus getStatus() {
        return status;
    }
}