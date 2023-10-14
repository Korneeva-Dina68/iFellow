package tests;

import hooks.WebHooks;
import org.junit.jupiter.api.Test;

import static steps.AutorizationPageSteps.autorization;
import static steps.AutorizationPageSteps.checkAutorization;
import static steps.CreatingTaskPageSteps.*;
import static steps.MainPageSteps.checkGoTestProject;
import static steps.MainPageSteps.goTestProject;
import static steps.ReportedByMePageSteps.*;
import static steps.TaskPageSteps.*;
import static steps.TestSeleniumPageSteps.*;

public class ClassTests extends WebHooks {
    private final String login = "AT12";
    private final String password = "Qwerty123";
    private final String markValue = "Авторизация";
    private final String environment = "Windows 10, Google Chrome Версия 117.0.5938.89";
    private final String description = "1. Открыть сайт\n2. Ввести валидные данные зарегистрированного пользователя\n3. Нажать кнопку Войти";
    private final String subject = "Не проходит авторизация зарегистрированного пользователя";
    private final String typeTask = "Ошибка";
    private final String priorityName = "Highest";

    @Test()
    public void JiraTests() {
        autorization(login, password);
        checkAutorization();
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
        typeTaskBug(typeTask);
        createSubject(subject);
        creatingDescription(description);
        selectInVersions1();
        createPriorityHighest(priorityName);
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