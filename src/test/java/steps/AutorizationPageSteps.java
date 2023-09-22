package steps;

import com.codeborne.selenide.Condition;
import elements.AutorizationPageElements;
import org.junit.jupiter.api.Assertions;

import static com.codeborne.selenide.Selenide.sleep;


public class AutorizationPageSteps extends AutorizationPageElements {
    public static void autorization(String login, String passwordUser) {
        userName.shouldBe(Condition.visible).sendKeys(login);
        password.shouldBe(Condition.visible).sendKeys(passwordUser);
        buttonEnter.shouldBe(Condition.visible).click();
        sleep(2000);
    }

    public static void checkAutorization() {
        userOptions.shouldBe(Condition.visible).click();
        sleep(2000);
        Assertions.assertEquals(exit.getText(), "Выйти");
    }
}
