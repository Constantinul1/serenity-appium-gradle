package tests;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import steps.ConfigSteps;

@RunWith(SerenityRunner.class)
public class SomeTest {

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @Steps
    ConfigSteps configSteps;

    @Test
    public void someTest() {
        configSteps.clickOnDebugButton();
        configSteps.setEnv("DEV04");
    }

}
