package hooks;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.extension. AfterEachCallback;
import org.junit.jupiter.api.extension. BeforeEachCallback;
import org.junit.jupiter.api.extension.ExtensionContext;

public class WebHooks implements AfterEachCallback, BeforeEachCallback {
    @Override
    public void afterEach(ExtensionContext extensionContext) throws Exception {
        Selenide.closeWebDriver();
    }

    @Override
    public void beforeEach(ExtensionContext extensionContext) throws Exception {
        Configuration.browserSize = String.valueOf(true);

    }
}
