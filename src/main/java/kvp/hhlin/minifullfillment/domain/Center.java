package kvp.hhlin.minifullfillment.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Center {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private CenterStatus status;

    public Center() {

    }
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