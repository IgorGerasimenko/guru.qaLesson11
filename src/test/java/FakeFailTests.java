import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("fakeTests")
public class FakeFailTests {

    @Test
    void failTest1() {
        Assertions.assertTrue(false);
    }

    @Test
    void failTest2() {
        Assertions.assertTrue(false);
    }

    @Test
    void failTest3() {
        Assertions.assertTrue(false);
    }

    @Test
    void failTest4() {
        Assertions.assertTrue(false);
    }

    @Test
    void failTest5() {
        Assertions.assertTrue(false);
    }

}
