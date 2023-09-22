package steps;

import com.codeborne.selenide.Condition;
import elements.CreatingTaskPageElements;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.sleep;

public class CreatingTaskPageSteps extends CreatingTaskPageElements {
    public static void creatingNewTask() {
        createButton.shouldBe(Condition.visible).click();
    }

    public static void checkOpenWindowCreatingTask() {
        Assertions.assertEquals(checkCreateButton.shouldBe(Condition.visible).getText(), "Создание задачи");
    }

    public static void typeTaskBug(String typeTaskName) {
        typeTask.shouldBe(Condition.visible).doubleClick().sendKeys(Keys.DELETE);
        typeTask.shouldBe(Condition.visible).sendKeys(typeTaskName);
        typeTask.shouldBe(Condition.visible).sendKeys(Keys.ENTER);
    }

    public static void createSubject(String subject) {
        formSubject.shouldBe(Condition.visible).sendKeys(subject);
    }

    public static void creatingDescription(String description) {
        formDescription.shouldBe(Condition.visible).setValue(description);
    }

    public static void selectInVersions1() {
        formVersion1.shouldBe(Condition.visible).click();
    }

    public static void createPriorityHighest(String priorityName) {
        priority.shouldBe(Condition.visible).doubleClick().sendKeys(Keys.DELETE);
        priority.shouldBe(Condition.visible).sendKeys(priorityName);
        priority.shouldBe(Condition.visible).sendKeys(Keys.ENTER);
    }

    public static void createMark(String markValue) {
        mark.shouldBe(Condition.visible).doubleClick().setValue(markValue);
        mark.shouldBe(Condition.visible).pressEnter();
    }

    public static void createEnvironment(String environment) {
        formEnvironment.shouldBe(Condition.visible).sendKeys(environment);
    }

    public static void selectAffectedVersions2() {
        affectedVersions2.shouldBe(Condition.visible).click();
    }

    public static void selectAppointMe() {
        appointMeButton.shouldBe(Condition.visible).click();
    }

    public static void clickCreateTask() {
        buttonCreateTask.shouldBe(Condition.visible).click();
    }
}
