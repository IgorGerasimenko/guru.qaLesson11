import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;


@Tag("fakeTests")
public class DisabledFakeTest {

    @Test
    @Disabled("причина: так надо")
    void failTest1() {
        Assertions.assertTrue(false);
    }

    @Test
    @Disabled("причина: так надо")
    void failTest2() {
        Assertions.assertTrue(false);
    }

    @Test
    @Disabled("причина: так надо")
    void failTest3() {
        Assertions.assertTrue(false);
    }

    @Test
    @Disabled("причина: так надо")
    void failTest4() {
        Assertions.assertTrue(false);
    }

}
