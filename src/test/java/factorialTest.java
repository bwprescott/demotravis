
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class factorialTest {
    @Test
    void success(){
        assertEquals(6, factorial.factorials(3));
    }

    //@Test
    //void failure() {
    //    assertEquals(6, factorial.factorials(4));
    //}
}
