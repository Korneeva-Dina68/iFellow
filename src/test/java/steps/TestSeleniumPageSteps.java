package steps;

import elements.TestSeleniumPageElements;
import org.junit.jupiter.api.Assertions;


public class TestSeleniumPageSteps extends TestSeleniumPageElements {
    public static void goTestSelenium() {
        searchInput.setValue("TestSelenium");
        testSelenium.click();
    }

    public static void checkTestSeleniumPage() {
        Assertions.assertEquals(checkTestSelenium.getText(), "TestSelenium");
    }

    public static void statusAndVersion() {
        String text = status.text();
        String ver = version.text();
        System.out.println("Статус задачи: " + text + ", версия: " + ver);
    }
}
