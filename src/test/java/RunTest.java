import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import static com.codeborne.selenide.Selenide.open;

public class RunTest {

    @Before
    public void beforeTest() {
        System.out.println("Этот метод выполняется перед каждым тестом");
    }

    @After
    public void afterTest() {
        System.out.println("Этот метод выполняется после каждого теста");
    }

    @Test
    public void triangleTest1() {
        int a = 3;
        int b = 4;
        int c = 6;
        int perimeter = a + b + c;
        Assertions.assertEquals(13, perimeter);
    }

    @Test
    public void triangleTest2() {
        int a = 4;
        int b = 4;
        int c = 6;
        int perimeter = a + b + c;
        Assertions.assertEquals(13, perimeter);
    }
    @Test
    public void main () throws InterruptedException {
        open("https://demoqa.com/automation-practice-form");
        Thread.sleep(3000);
    }
}
