package steps;

import elements.AutorizationPageElements;
import org.junit.jupiter.api.Assertions;

import static com.codeborne.selenide.Selenide.sleep;


public class AutorizationPageSteps extends AutorizationPageElements {
    public static void autorization(String login, String passwordUser) {
        userName.sendKeys(login);
        password.sendKeys(passwordUser);
        buttonEnter.click();
        sleep(2000);
    }

    public static void checkAutorization(String login) {
        userOptions.click();
        sleep(2000);
        Assertions.assertEquals(exit.getText(), "Выйти");
    }
}
