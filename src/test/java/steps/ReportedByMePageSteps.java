package steps;

import com.codeborne.selenide.Condition;
import elements.ReportedByMePageElements;
import org.junit.jupiter.api.Assertions;

import static com.codeborne.selenide.Selenide.sleep;


public class ReportedByMePageSteps extends ReportedByMePageElements {
    public static void clickTaskHeaderblok() {
        taskHeaderblok.shouldBe(Condition.visible).click();
    }

    public static void clickReportedByMe() {
        reportedByMe.shouldBe(Condition.visible).click();
    }

    public static void checkReportedByMePage() {
        Assertions.assertEquals(reportedByMeText.shouldBe(Condition.visible).getText(), "Сообщенные мной");
    }

    public static void clickAtWork() {
        atWork.shouldBe(Condition.visible).click();
        sleep(2000);
    }

    public static void checkStatusAtWork() {
        Assertions.assertEquals("В РАБОТЕ", status.shouldBe(Condition.visible).getText());
    }

    public static void clickButtonBusinessProcess() {
        businessProcess.shouldBe(Condition.visible).click();
        sleep(2000);
    }

    public static void clickButtonDone() {
        doneButton.shouldBe(Condition.visible).click();
        sleep(2000);
    }

    public static void checkStatusDone() {
        Assertions.assertEquals("ГОТОВО", status.shouldBe(Condition.visible).getText());
    }
}
