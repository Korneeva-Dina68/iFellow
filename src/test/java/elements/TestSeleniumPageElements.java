package elements;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class TestSeleniumPageElements {
    public static SelenideElement searchInput = $x("//input[@id='quickSearchInput']");
    public static SelenideElement testSelenium = $x("//li[@original-title='TestSelenium'][1]");
    public static SelenideElement checkTestSelenium = $x("//h1[@class='editable-field inactive']");
    public static SelenideElement status = $x("//span[@id='status-val']");
    public static SelenideElement version = $x("//a[@title='Version 2.0 ']");
}
