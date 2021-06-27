import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

@Tag("fakeTests")
public class FakeSuccessTests {

    @Test
    void successTest1() {
        Assertions.assertTrue(true);
    }

    @Test
    void successTest2() {
        Assertions.assertTrue(true);
    }

    @Test
    void successTest3() {
        Assertions.assertTrue(true);
    }

    @Test
    void successTest4() {
        Assertions.assertTrue(true);
    }

    @Test
    void successTest5() {
        Assertions.assertTrue(true);
    }

    @Test
    void successTest6() {
        Assertions.assertTrue(true);
    }

    @Test
    void successTest7() {
        Assertions.assertTrue(true);
    }

}


