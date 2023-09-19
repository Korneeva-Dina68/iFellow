package steps;

import com.codeborne.selenide.Condition;
import elements.MainPageElements;

public class MainPageSteps extends MainPageElements {
    public static void goTestProject() {
        projects.click();
        testProjects.click();
    }
    public static void checkGoTestProject () {
        task.shouldBe(Condition.visible);
    }
}
