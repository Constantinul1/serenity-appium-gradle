package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import pages.ConfigPage;

public class ConfigSteps extends ScenarioSteps {

    ConfigPage configPage;

    @Step()
    public void clickOnDebugButton() {
        configPage.clickOnDebugButton();
    }

    @Step()
    public void setEnv(String env) {
        configPage.setEnv(env);
    }

}
