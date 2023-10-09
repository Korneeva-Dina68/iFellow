package elements;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class CreatingTaskPageElements {
    public static SelenideElement createButton = $x("//li[@id='create-menu']").as("Кнопка Создать задачу");
    public static SelenideElement checkCreateButton = $x("//h2[text()='Создание задачи']").as("Текст");
    public static SelenideElement typeTask = $x("//input[@id='issuetype-field']").as("Форма Тип");
    public static SelenideElement formSubject = $x("//input[@id='summary']").as("Форма Тема");
    public static SelenideElement formDescription = $x("//textarea[@id='description']").as("Форма Описание");
    public static SelenideElement formVersion1 = $x("//option[@value='10000']").as("Форма Исправить в версиях");
    public static SelenideElement priority = $x("//input[@id='priority-field']").as("Форма Приоритет");
    public static SelenideElement mark = $x("//div[@id='labels-multi-select']//textarea").as("Форма Метки");
    public static SelenideElement formEnvironment = $x("//textarea[@id='environment']").as("Форма Окружение");
    public static SelenideElement affectedVersions2 = $x("//select[@id='versions']//option[@value='10001']").as("Форма Затронуты версии");
    public static SelenideElement appointMeButton = $x("//button[text()='Назначить меня']").as("Форма Исполнитель");
    public static SelenideElement buttonCreateTask = $x("//input[@name='Edit']").as("Кнопка создать");
    public static SelenideElement successfullyCreated = $x("//*[text()=' успешно создан.']").as("Текст");

}
