package StepDefinition;

import io.cucumber.java.ru.Дано;
import io.cucumber.java.ru.И;
import io.cucumber.java.ru.Когда;
import io.cucumber.java.ru.Тогда;
import io.qameta.allure.Step;
import steps.*;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;


public class StepDefinitions {
    @Step("Открыть сайт")
    @Дано("Открыта базовая страница сайта")
    public void BasePageOpen() {
        open("https://edujira.ifellow.ru/");
        getWebDriver().manage().window().maximize();
    }

    @Step("Ввести логин {string} и пароль {string} и нажать Войти")
    @Когда("Пользователь вводит логин {string}, пароль {string} и нажимает Войти")
    public void autorization(String arg0, String arg1) {
        AutorizationPageSteps.autorization(arg0, arg1);
    }

    @Step("Проверить, что прошла авторизация")
    @Тогда("Отображается кнопка Выйти в меню пользовательского интерфейса")
    public void checkAutorization() {
        AutorizationPageSteps.checkAutorization();
    }

    @Step("Выбрать Тест из меню Проекты")
    @Когда("Пользователь нажимает кнопку Проекты и выбирает из списка Тест")
    public void goTestProject() {
        MainPageSteps.goTestProject();
    }

    @Step("Проверить, что открылась страница Задачи")
    @Тогда("Открывается страница Задачи")
    public void checkGoTestProject() {
        MainPageSteps.checkGoTestProject();
    }

    @Step("Нажать на Задачи в боковом меню")
    @Когда("Пользователь нажимает в боковом меню Задачи")
    public void goTask() {
        TaskPageSteps.goTask();
    }

    @Step("Проверить, что открылась страница с Открытыми задачами")
    @Тогда("Открывается страница с Открытыми задачами")
    public void checkGoTask() {
        TaskPageSteps.checkGoTask();
    }

    @Step("Проверить общее количество заведенных задач в проекте ")
    @И("На странице указано количество задач")
    public void quantityTask() {
        TaskPageSteps.quantityTask();
    }

    @Step("В поисковой строке ввести и выбрать TestSelenium")
    @Когда("Пользователь вводит в поисковую строку TestSelenium и выбирает первый из выпавшего списка TestSelenium")
    public void goTestSelenium() {
        TestSeleniumPageSteps.goTestSelenium();
    }

    @Step("Проверить, что открылась страница с задачей TestSelenium")
    @Тогда("Открывается страница с задачей TestSelenium")
    public void checkTestSeleniumPage() {
        TestSeleniumPageSteps.checkTestSeleniumPage();
    }

    @Step("Проверить статус задачи и привязку в затронутой версии")
    @И("На странице указаны статус и привязка версии")
    public void statusAndVersion() {
        TestSeleniumPageSteps.statusAndVersion();
    }

    @Step("Нажать кнопку Создать для создания новой задачи")
    @Когда("Пользователь нажимает кнопку Создать")
    public void creatingNewTask() {
        CreatingTaskPageSteps.creatingNewTask();
    }

    @Step("Проверить, что открылось окно для создания новой задачи")
    @Тогда("Открывается окно для создания новой задачи")
    public void checkOpenWindowCreatingTask() {
        CreatingTaskPageSteps.checkOpenWindowCreatingTask();
    }

    @Step("Указать тип задачи {string}")
    @Когда("Пользователь указывает тип задачи {string}")
    public void typeTaskBug(String arg0) {
        CreatingTaskPageSteps.typeTaskBug(arg0);
    }

    @Step("Указать название темы {string}")
    @И("Пользователь указывает название темы {string}")
    public void createSubject(String arg0) {
        CreatingTaskPageSteps.createSubject(arg0);
    }

    @Step("Заполнить описание {string}")
    @И("Пользователь заполняет описание {string}")
    public void creatingDescription(String arg0) {
        CreatingTaskPageSteps.creatingDescription(arg0);
    }

    @Step("Выбрать версию в пункте Исправить в версиях")
    @И("Пользователь выбирает версию в пункте Исправить в версиях")
    public void selectInVersions1() {
        CreatingTaskPageSteps.selectInVersions1();
    }

    @Step("Выбрать {string}")
    @И("Пользователь выбирает {string}")
    public void createPriorityHighest(String arg0) {
        CreatingTaskPageSteps.createPriorityHighest(arg0);
    }

    @Step("Указать метку {string}")
    @И("Пользователь указывает метку {string}")
    public void createMark(String arg0) {
        CreatingTaskPageSteps.createMark(arg0);
    }

    @Step("Заполнить окружение {string}")
    @И("Пользователь заполняет окружение {string}")
    public void createEnvironment(String arg0) {
        CreatingTaskPageSteps.createEnvironment(arg0);
    }

    @Step("Выбрать версию в пункте Затронуты версии")
    @И("Пользователь выбирает версию в пункте Затронуты версии")
    public void selectAffectedVersions2() {
        CreatingTaskPageSteps.selectAffectedVersions2();
    }

    @Step("Нажать Назначить меня исполнителем")
    @И("Пользователь нажимает Назначить меня исполнителем")
    public void selectAppointMe() {
        CreatingTaskPageSteps.selectAppointMe();
    }

    @Step("Нажать на кнопку Создать")
    @И("Пользователь нажимает на кнопку Создать")
    public void clickCreateTask() {
        CreatingTaskPageSteps.clickCreateTask();
    }

    @Step("Нажать кнопку Задачи в шапке страницы")
    @Когда("Пользователь нажимает кнопку Задачи в шапке страницы")
    public void clickTaskHeaderblok() {
        ReportedByMePageSteps.clickTaskHeaderblok();
    }

    @Step("Выбрать из списка пункт Сообщенные мной")
    @И("Пользователь выбирает из списка пункт Сообщенные мной")
    public void clickReportedByMe() {
        ReportedByMePageSteps.clickReportedByMe();
    }

    @Step("Проверить, что открылась страница с открытой последней задачей, сообщенной пользователем")
    @Тогда("Открывается страница с открытой последней задачей, сообщенной пользователем")
    public void checkReportedByMePage() {
        ReportedByMePageSteps.checkReportedByMePage();
    }

    @Step("Нажать кнопку В работе")
    @Когда("Пользователь нажимает кнопку В работе")
    public void clickAtWork() {
        ReportedByMePageSteps.clickAtWork();
    }

    @Step("Проверить, что статус задачи В работе")
    @Тогда("Статус задачи переходит в статус В работе")
    public void checkStatusAtWork() {
        ReportedByMePageSteps.checkStatusAtWork();
    }

    @Step("Нажать на кнопку Бизнес-процесс")
    @Когда("Пользователь нажимает на кнопку Бизнес-процесс")
    public void clickButtonBusinessProcess() {
        ReportedByMePageSteps.clickButtonBusinessProcess();
    }

    @Step("Выбрать из списка Выполнено")
    @И("Пользователь выбирает из списка Выполнено")
    public void clickButtonDone() {
        ReportedByMePageSteps.clickButtonDone();
    }

    @Step("Проверить, что статус задачи Готово")
    @Тогда("Статус задачи переходит в статус Готово")
    public void checkStatusDone() {
        ReportedByMePageSteps.checkStatusDone();
    }
}
