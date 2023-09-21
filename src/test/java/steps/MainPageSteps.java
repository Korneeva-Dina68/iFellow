package steps;

import elements.MainPageElements;
import org.junit.jupiter.api.Assertions;

public class MainPageSteps extends MainPageElements {
    public static void goTestProject() {
        projects.click();
        projects.click();
        testProjects.click();
    }

    public static void checkGoTestProject() {
        Assertions.assertEquals(task.getText(), "Посмотреть все задачи и фильтры");
    }
}
