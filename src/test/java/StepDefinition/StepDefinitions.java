package StepDefinition;

import io.cucumber.java.ru.Дано;
import io.cucumber.java.ru.И;
import io.cucumber.java.ru.Когда;
import io.cucumber.java.ru.Тогда;
import steps.*;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;


public class StepDefinitions {
    @Дано("Открыта базовая страница сайта")
    public void BasePageOpen() {
        open("https://edujira.ifellow.ru/");
        getWebDriver().manage().window().maximize();
    }

    @Когда("Пользователь вводит логин {string}, пароль {string} и нажимает Войти")
    public void autorization(String arg0, String arg1) {
        AutorizationPageSteps.autorization(arg0, arg1);
    }

    @Тогда("Отображается кнопка Выйти в меню пользовательского интерфейса")
    public void checkAutorization() {
        AutorizationPageSteps.checkAutorization();
    }

    @Когда("Пользователь нажимает кнопку Проекты и выбирает из списка Тест")
    public void goTestProject() {
        MainPageSteps.goTestProject();
    }

    @Тогда("Открывается страница Задачи")
    public void checkGoTestProject() {
        MainPageSteps.checkGoTestProject();
    }

    @Когда("Пользователь нажимает в боковом меню Задачи")
    public void goTask() {
        TaskPageSteps.goTask();
    }

    @Тогда("Открывается страница с Открытыми задачами")
    public void checkGoTask() {
        TaskPageSteps.checkGoTask();
    }

    @И("На странице указано количество задач")
    public void quantityTask() {
        TaskPageSteps.quantityTask();
    }

    @Когда("Пользователь вводит в поисковую строку TestSelenium и выбирает первый из выпавшего списка TestSelenium")
    public void goTestSelenium() {
        TestSeleniumPageSteps.goTestSelenium();
    }

    @Тогда("Открывается страница с задачей TestSelenium")
    public void checkTestSeleniumPage() {
        TestSeleniumPageSteps.checkTestSeleniumPage();
    }

    @И("На странице указаны статус и привязка версии")
    public void statusAndVersion() {
        TestSeleniumPageSteps.statusAndVersion();
    }

    @Когда("Пользователь нажимает кнопку Создать")
    public void creatingNewTask() {
        CreatingTaskPageSteps.creatingNewTask();
    }

    @Тогда("Открывается окно для создания новой задачи")
    public void checkOpenWindowCreatingTask() {
        CreatingTaskPageSteps.checkOpenWindowCreatingTask();
    }

    @Когда("Пользователь указывает тип задачи {string}")
    public void typeTaskBug(String arg0) {
        CreatingTaskPageSteps.typeTaskBug(arg0);
    }

    @И("Пользователь указывает название темы {string}")
    public void createSubject(String arg0) {
        CreatingTaskPageSteps.createSubject(arg0);
    }

    @И("Пользователь заполняет описание {string}")
    public void creatingDescription(String arg0) {
        CreatingTaskPageSteps.creatingDescription(arg0);
    }

    @И("Пользователь выбирает версию в пункте Исправить в версиях")
    public void selectInVersions1() {
        CreatingTaskPageSteps.selectInVersions1();
    }

    @И("Пользователь выбирает {string}")
    public void createPriorityHighest(String arg0) {
        CreatingTaskPageSteps.createPriorityHighest(arg0);
    }

    @И("Пользователь указывает метку {string}")
    public void createMark(String arg0) {
        CreatingTaskPageSteps.createMark(arg0);
    }

    @И("Пользователь заполняет окружение {string}")
    public void createEnvironment(String arg0) {
        CreatingTaskPageSteps.createEnvironment(arg0);
    }


    @И("Пользователь выбирает версию в пункте Затронуты версии")
    public void selectAffectedVersions2() {
        CreatingTaskPageSteps.selectAffectedVersions2();
    }

    @И("Пользователь нажимает Назначить меня исполнителем")
    public void selectAppointMe() {
        CreatingTaskPageSteps.selectAppointMe();
    }

    @И("Пользователь нажимает на кнопку Создать")
    public void clickCreateTask() {
        CreatingTaskPageSteps.clickCreateTask();
    }

    @Когда("Пользователь нажимает кнопку Задачи в шапке страницы")
    public void clickTaskHeaderblok() {
        ReportedByMePageSteps.clickTaskHeaderblok();
    }

    @И("Пользователь выбирает из списка пункт Сообщенные мной")
    public void clickReportedByMe() {
        ReportedByMePageSteps.clickReportedByMe();
    }

    @Тогда("Открывается страница с открытой последней задачей, сообщенной пользователем")
    public void checkReportedByMePage() {
        ReportedByMePageSteps.checkReportedByMePage();
    }

    @Когда("Пользователь нажимает кнопку В работе")
    public void clickAtWork() {
        ReportedByMePageSteps.clickAtWork();
    }

    @Тогда("Статус задачи переходит в статус В работе")
    public void checkStatusAtWork() {
        ReportedByMePageSteps.checkStatusAtWork();
    }

    @Когда("Пользователь нажимает на кнопку Бизнес-процесс")
    public void clickButtonBusinessProcess() {
        ReportedByMePageSteps.clickButtonBusinessProcess();
    }

    @И("Пользователь выбирает из списка Выполнено")
    public void clickButtonDone() {
        ReportedByMePageSteps.clickButtonDone();
    }

    @Тогда("Статус задачи переходит в статус Готово")
    public void checkStatusDone() {
        ReportedByMePageSteps.checkStatusDone();
    }
}
