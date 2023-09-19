package hooks;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.extension. AfterEachCallback;
import org.junit.jupiter.api.extension. BeforeEachCallback;
import org.junit.jupiter.api.extension.ExtensionContext;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class WebHooks implements AfterEachCallback, BeforeEachCallback {
    @Override
    public void afterEach(ExtensionContext extensionContext) throws Exception {
        Selenide.closeWebDriver();
    }

    @Override
    public void beforeEach(ExtensionContext extensionContext) throws Exception {
        open("https://edujira.ifellow.ru/secure/Dashboard.jspa");
        getWebDriver().manage().window().maximize();
    }
}
