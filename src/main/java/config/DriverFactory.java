package config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {

    //ThreadLocal variable
    private static ThreadLocal<WebDriver> tDriver = new ThreadLocal<>();

    public static void initDriver(String Browser)
    {
        if(Browser.equalsIgnoreCase("chrome"))
        {
            tDriver.set(new ChromeDriver());
        }
        if(Browser.equalsIgnoreCase("edge"))
        {
            tDriver.set(new EdgeDriver());
        }
        if(Browser.equalsIgnoreCase("firefox"))
        {
            tDriver.set(new FirefoxDriver());
        }
    }

    public static WebDriver getDriver()
    {
        return tDriver.get();
    }

    public static void quitDriver()
    {
        tDriver.get().quit();
        tDriver.remove();
    }
}
