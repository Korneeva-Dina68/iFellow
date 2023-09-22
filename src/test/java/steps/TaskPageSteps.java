package steps;

import com.codeborne.selenide.Condition;
import elements.TaskPageElements;
import org.junit.jupiter.api.Assertions;

public class TaskPageSteps extends TaskPageElements {
    public static void goTask() {
        projects.shouldBe(Condition.visible).click();
    }

    public static void checkGoTask() {
        Assertions.assertEquals(openTask.shouldBe(Condition.visible).getText(), "Открытые задачи");
    }

    public static void quantityTask() {
        System.out.println("Общее количество задач: " + quantityTask.shouldBe(Condition.visible).text().substring(5));
    }
}
