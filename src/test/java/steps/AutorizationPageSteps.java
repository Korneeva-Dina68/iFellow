package steps;

import com.codeborne.selenide.Condition;
import elements.AutorizationPageElements;

public class AutorizationPageSteps extends AutorizationPageElements {
    public static void autorization(String login, String passwordUser) {
        userName.sendKeys(login);
        password.sendKeys(passwordUser);
        enter.click();
    }
    public static void checkAutorization() {
        userOptions.shouldBe(Condition.visible);
    }
}
