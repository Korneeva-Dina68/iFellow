package steps;

import elements.TaskPageElements;
import org.junit.jupiter.api.Assertions;

public class TaskPageSteps extends TaskPageElements {
    public static void goTask() {
        projects.click();
    }

    public static void checkGoTask() {
        Assertions.assertEquals(openTask.getText(), "Открытые задачи");
    }

    public static void quantityTask() {
        System.out.println("Общее количество задач: " + quantityTask.text().substring(5));
    }
}
