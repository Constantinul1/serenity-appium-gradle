package pages;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import net.thucydides.core.webdriver.WebDriverFacade;
import org.openqa.selenium.NoSuchElementException;

import java.time.Duration;

import static io.appium.java_client.touch.WaitOptions.waitOptions;

public class ConfigPage extends BasePage {

  public void clickOnDebugButton() {
    clickButton("debugButton");
    waitABit(1000);
  }

  public void setEnv(String env) {
    clickOnDebugButton();
    int attemptsLimit = 2;
    TouchAction touchAction = new TouchAction((MobileDriver) ((WebDriverFacade) getDriver()).getProxiedDriver());
    boolean elementIsDisplayed = false;
    int attemptsCount = 0;
    while (!elementIsDisplayed && attemptsCount++ < attemptsLimit) {
      try {
        elementIsDisplayed = getDriver().findElement(MobileBy.AccessibilityId(env)).isEnabled();
      } catch (NoSuchElementException e) {

      }
      if (elementIsDisplayed) {
        getDriver().findElement(MobileBy.AccessibilityId(env)).click();
        break;
      }
      int startX = (int) ((getDriver().manage().window().getSize().getWidth()) * 0.50);
      int startY = (int) ((getDriver().manage().window().getSize().getHeight()) * 0.80);
      touchAction
              .press(PointOption.point(startX, startY))
              .waitAction(waitOptions(Duration.ofMillis(500)))
              .moveTo(PointOption.point(startX, -200))
              .release()
              .perform();
      waitABit(1000);
    }
  }

}
