package elements;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class AutorizationPageElements {
    public static SelenideElement userName = $x("//input[@name='os_username']");
    public static SelenideElement password = $x("//input[@name='os_password']");
    public static SelenideElement enter = $x("//input[@value='Войти']");
    public static SelenideElement userOptions = $x("//li[@id='user-options']");
}
