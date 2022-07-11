package kvp.hhlin.minifullfillment.domain;

public class Center {

    private String code;

    private String name;

    private String status;

    Center(String code, String name) {
        this.code = code;
        this.name = name;
        this.status = CenterStatus.valueOf("READY").getStatus();
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
}