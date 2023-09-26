package elements;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class TaskPageElements {
    public static SelenideElement projects = $x("//li[@class='aui-nav-selected']");
    public static SelenideElement openTask = $x("//span[text()='Открытые задачи']");
    public static SelenideElement quantityTask = $x("//div[@class='showing']//span");
}
