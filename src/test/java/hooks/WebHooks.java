package hooks;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.junit.Cucumber;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class WebHooks {

    @After
    public void tearDown() {
        Selenide.clearBrowserLocalStorage();
        Selenide.clearBrowserCookies();
        WebDriverRunner.clearBrowserCache();
    }
    @Before
    public void allureSubThreadParallel() {
        String listenerName = "AllureSelenide";
        if (!(SelenideLogger.hasListener(listenerName)))
            SelenideLogger.addListener(listenerName,
                    (new AllureSelenide().screenshots(true).savePageSource(false)));
    }
}
