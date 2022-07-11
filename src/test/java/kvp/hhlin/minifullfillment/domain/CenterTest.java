package kvp.hhlin.minifullfillment.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CenterTest {

    private Center center;

    @BeforeEach
    void Center생성() {
        center = new Center("a1234", "김포점");
    }

    @Test
    void Center의_초기상태는_오픈_준비중이다() {
        assertTrue(center.getStatus().equals("오픈 준비중"));
    }
}
