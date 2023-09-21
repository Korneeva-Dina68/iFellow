package steps;

import elements.CreatingTaskPageElements;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.sleep;

public class CreatingTaskPageSteps extends CreatingTaskPageElements {
    public static void creatingNewTask() {
        createButton.click();
    }

    public static void checkOpenWindowCreatingTask() {
        Assertions.assertEquals(checkCreateButton.getText(), "Создание задачи");
    }

    public static void typeTaskBug() {
        typeTask.doubleClick().sendKeys(Keys.DELETE);
        typeTask.click();
        sleep(2000);
        typeTask.sendKeys(Keys.ARROW_DOWN);
        typeTask.sendKeys(Keys.ARROW_DOWN);
        typeTask.sendKeys(Keys.ENTER);
    }

    public static void createSubject(String subject) {
        formSubject.sendKeys(subject);
    }

    public static void creatingDescription(String description) {
        formDescription.setValue(description);
    }

    public static void selectInVersions1() {
        formVersion1.click();
    }

    public static void createPriorityHighest() {
        priority.doubleClick().sendKeys(Keys.DELETE);
        priority.click();
        sleep(2000);
        priority.sendKeys(Keys.ARROW_DOWN);
        priority.sendKeys(Keys.UP);
        priority.sendKeys(Keys.ENTER);
    }

    public static void createMark(String markValue) {
        mark.doubleClick().setValue(markValue);
        mark.pressEnter();
    }

    public static void createEnvironment(String environment) {
        formEnvironment.sendKeys(environment);
    }

    public static void selectAffectedVersions2() {
        affectedVersions2.click();
    }

    public static void selectAppointMe() {
        appointMeButton.click();
    }

    public static void clickCreateTask() {
        buttonCreateTask.click();
    }
}
