package tests;

import hooks.WebHooks;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static steps.AutorizationPageSteps.autorization;
import static steps.AutorizationPageSteps.checkAutorization;

public class ClassTests extends WebHooks {
    private String login = "AT12";
    private String password = "Qwerty123";

    @Test()
    public void JiraTests() {
        open("https://edujira.ifellow.ru/secure/Dashboard.jspa");
        autorization(login, password);
        checkAutorization();
    }
}
