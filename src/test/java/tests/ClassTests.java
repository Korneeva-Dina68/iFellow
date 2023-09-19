package tests;

import hooks.WebHooks;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.getWebDriverLogs;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static steps.AutorizationPageSteps.autorization;
import static steps.AutorizationPageSteps.checkAutorization;
import static steps.MainPageSteps.checkGoTestProject;
import static steps.MainPageSteps.goTestProject;
import static steps.TaskPageSteps.*;
import static steps.TestSeleniumPageSteps.*;

public class ClassTests extends WebHooks {
    private String login = "AT12";
    private String password = "Qwerty123";

    @Test()
    public void JiraTests() {
        open("https://edujira.ifellow.ru/secure/Dashboard.jspa");
        getWebDriver().manage().window().maximize();
        autorization(login, password);
        checkAutorization();
        goTestProject();
        checkGoTestProject();
        goTask();
        checkGoTask();
        quantityTask();
        testSelenium();
        checkTestPage();
        checkStatucAndVersion();

    }
}
