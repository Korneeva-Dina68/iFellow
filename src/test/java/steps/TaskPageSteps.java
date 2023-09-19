package steps;

import com.codeborne.selenide.Condition;
import elements.TaskPageElements;

public class TaskPageSteps extends TaskPageElements {
    public static void goTask() {
        projects.click();
    }
    public static void checkGoTask() {
        openTask.shouldHave(Condition.exactText("Открытые задачи"));
    }
    public static void quantityTask() {
        System.out.println("Общее количество задач: " + quantityTask.text().substring(5));
    }
}
