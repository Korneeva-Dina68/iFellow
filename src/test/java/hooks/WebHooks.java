package hooks;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class WebHooks {

    @AfterEach
    void tearDown() {
        Selenide.closeWebDriver();
    }

    @BeforeEach
    void setUp() {
        open("https://edujira.ifellow.ru/secure/Dashboard.jspa");
        getWebDriver().manage().window().maximize();
    }
}
