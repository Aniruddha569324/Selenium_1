package utils;

import config.DriverFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class SyncUtils {

    WebDriverWait wait = new WebDriverWait(DriverFactory.getDriver(), Duration.ofSeconds(10));
    public void WaitUtilVisibilityOfElements(WebElement element)
    {
        wait.until(ExpectedConditions.visibilityOfAllElements(element));
    }

    public void WaitUtilElementIsClickable(WebElement element)
    {
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void WaitUtilAlertIsPresent()
    {
        wait.until(ExpectedConditions.alertIsPresent());
    }
}
