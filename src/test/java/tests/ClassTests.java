package tests;

import hooks.WebHooks;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static steps.AutorizationPageSteps.autorization;
import static steps.AutorizationPageSteps.checkAutorization;
import static steps.CreatingTaskPageSteps.*;
import static steps.MainPageSteps.checkGoTestProject;
import static steps.MainPageSteps.goTestProject;
import static steps.ReportedByMePageSteps.*;
import static steps.TaskPageSteps.*;
import static steps.TestSeleniumPageSteps.*;

public class ClassTests extends WebHooks {
    String login = "AT12";
    String password = "Qwerty123";
    String markValue = "Авторизация";
    String environment = "Windows 10, Google Chrome Версия 117.0.5938.89";
    String description = "1. Открыть сайт\n2. Ввести валидные данные зарегистрированного пользователя\n3. Нажать кнопку Войти";
    String subject = "Не проходит авторизация зарегистрированного пользователя";

    @Test()
    public void JiraTests() {
        autorization(login, password);
        checkAutorization(login);
        goTestProject();
        checkGoTestProject();
        goTask();
        checkGoTask();
        quantityTask();
        goTestSelenium();
        checkTestSeleniumPage();
        statusAndVersion();
        creatingNewTask();
        checkOpenWindowCreatingTask();
        typeTaskBug();
        createSubject(subject);
        creatingDescription(description);
        selectInVersions1();
        createPriorityHighest();
        createMark(markValue);
        createEnvironment(environment);
        selectAffectedVersions2();
        selectAppointMe();
        clickCreateTask();
        clickTaskHeaderblok();
        clickReportedByMe();
        checkReportedByMePage();
        clickAtWork();
        checkStatusAtWork();
        clickButtonBusinessProcess();
        clickButtonDone();
        checkStatusDone();
    }
}
