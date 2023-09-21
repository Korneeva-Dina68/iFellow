package steps;

import elements.ReportedByMePageElements;
import org.junit.jupiter.api.Assertions;

import static com.codeborne.selenide.Selenide.sleep;


public class ReportedByMePageSteps extends ReportedByMePageElements {
    public static void clickTaskHeaderblok() {
        taskHeaderblok.click();
    }

    public static void clickReportedByMe() {
        reportedByMe.click();
    }

    public static void checkReportedByMePage() {
        Assertions.assertEquals(reportedByMeText.getText(), "Сообщенные мной");
    }

    public static void clickAtWork() {
        atWork.click();
        sleep(2000);
    }

    public static void checkStatusAtWork() {
        Assertions.assertEquals("В РАБОТЕ", status.getText());
    }

    public static void clickButtonBusinessProcess() {
        businessProcess.click();
        sleep(2000);
    }

    public static void clickButtonDone() {
        doneButton.click();
        sleep(2000);
    }

    public static void checkStatusDone() {
        Assertions.assertEquals("ГОТОВО", status.getText());
    }
}
