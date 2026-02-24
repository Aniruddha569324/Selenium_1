package hooks;

import config.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import utils.PropertiesUtils;

import java.io.IOException;
import java.sql.Driver;

public class ApplicationHooks {

    @Before("@UI")
    public void setup() throws IOException {
        String browser = System.getProperty("browser");
        System.out.println("Browser value is: " + browser);
        if (browser == null) {
            browser = "chrome"; // default
        }
        DriverFactory.initDriver(browser);
        DriverFactory.getDriver().manage().window().setPosition(new Point(0, -1080));
        DriverFactory.getDriver().get(PropertiesUtils.getProperty("appURL"));
        DriverFactory.getDriver().manage().window().maximize();
    }

    @After("@UI")
    public void tearDown()
    {
        DriverFactory.quitDriver();
    }
}
