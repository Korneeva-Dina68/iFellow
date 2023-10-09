package elements;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class MainPageElements {
    public static SelenideElement projects = $x("//a[@id='browse_link']").as("Кнопка проекты");
    public static SelenideElement testProjects = $x("//li[@id='admin_main_proj_link']").as("Кнопка Тест в проектах");
    public static SelenideElement task = $x("//*[text()='Посмотреть все задачи и фильтры']").as("Текст");
}
