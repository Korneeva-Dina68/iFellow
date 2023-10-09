package elements;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class TaskPageElements {
    public static SelenideElement projects = $x("//li[@class='aui-nav-selected']").as("Кнопка Задачи в боковом меню");
    public static SelenideElement openTask = $x("//span[text()='Открытые задачи']").as("Текст");
    public static SelenideElement quantityTask = $x("//div[@class='showing']//span").as("Количество задач");
}
