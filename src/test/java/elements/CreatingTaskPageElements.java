package elements;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class CreatingTaskPageElements {
    public static SelenideElement createButton = $x("//li[@id='create-menu']");
    public static SelenideElement checkCreateButton = $x("//h2[text()='Создание задачи']");
    public static SelenideElement typeTask = $x("//input[@id='issuetype-field']");
    public static SelenideElement formSubject = $x("//input[@id='summary']");
    public static SelenideElement formDescription = $x("//textarea[@id='description']");
    public static SelenideElement formVersion1 = $x("//option[@value='10000']");
    public static SelenideElement priority = $x("//input[@id='priority-field']");
    public static SelenideElement mark = $x("//div[@id='labels-multi-select']//textarea");
    public static SelenideElement formEnvironment = $x("//textarea[@id='environment']");
    public static SelenideElement affectedVersions2 = $x("//select[@id='versions']//option[@value='10001']");
    public static SelenideElement appointMeButton = $x("//button[text()='Назначить меня']");
    public static SelenideElement buttonCreateTask = $x("//input[@name='Edit']");

}
