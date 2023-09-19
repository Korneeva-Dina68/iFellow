package steps;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import elements.TestSeleniumPageElements;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.sleep;

public class TestSeleniumPageSteps extends TestSeleniumPageElements {
    public static void testSelenium() {
        searchInput.setValue("TestSelenium");
        testSelenium.click();
    }
    public static void checkTestPage() {
        checkTestSelenium.shouldHave(Condition.exactText("TestSelenium"));
    }
    public static void checkStatusAndVersion() {
        String text = status.text();
        String ver = version.text();
        System.out.println("Статус задачи: " + text + ", версия: " + ver);
    }
}
