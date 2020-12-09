package pages;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.webdriver.WebDriverFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

import java.time.Duration;

import static io.appium.java_client.touch.WaitOptions.waitOptions;

public class BasePage extends PageObject {

  public void clickButton(String id) {
    By by = MobileBy.AccessibilityId(id);
    clickButton(by);
  }

  public void clickButton(By by) {
    MobileElement button = getDriver().findElement(by);
    button.click();
  }

}
