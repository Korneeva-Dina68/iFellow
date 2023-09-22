package steps;

import com.codeborne.selenide.Condition;
import elements.TestSeleniumPageElements;
import org.junit.jupiter.api.Assertions;


public class TestSeleniumPageSteps extends TestSeleniumPageElements {
    public static void goTestSelenium() {
        searchInput.shouldBe(Condition.visible).setValue("TestSelenium");
        testSelenium.shouldBe(Condition.visible).click();
    }

    public static void checkTestSeleniumPage() {
        Assertions.assertEquals(checkTestSelenium.shouldBe(Condition.visible).getText(), "TestSelenium");
    }

    public static void statusAndVersion() {
        String text = status.shouldBe(Condition.visible).text();
        String ver = version.shouldBe(Condition.visible).text();
        System.out.println("Статус задачи: " + text + ", версия: " + ver);
    }
}
