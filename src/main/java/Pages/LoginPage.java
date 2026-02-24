package Pages;

import config.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.yaml.snakeyaml.scanner.Constant;
import utils.SyncUtils;

public class LoginPage {

    SyncUtils su = new SyncUtils();

    @FindBy(id = "userName")
    private WebElement username;

    @FindBy(xpath = "//input[@type='password']")
    private WebElement password;

    @FindBy(id = "newUser")
    private WebElement newUser;

    @FindBy(id = "login")
    private WebElement login;

    @FindBy(xpath = "//h1[text()='Login']")
    private WebElement loginHeader;
    final String xpathss = ".mr-2.text-danger";
    @FindBy(css = xpathss)
    private WebElement errorMessage;

    public LoginPage()
    {
        PageFactory.initElements(DriverFactory.getDriver(), this);
    }

    public boolean verifyLoginPage()
    {
        su.WaitUtilVisibilityOfElements(loginHeader);
        return loginHeader.isDisplayed();
    }

    public void enterUsername(String user)
    {
        su.WaitUtilVisibilityOfElements(username);
        username.sendKeys(user);
    }

    public void enterPassword(String pass)
    {
        password.sendKeys(pass);
    }

    public void clickLogin()
    {
        login.click();
    }

    public void clickNewUser()
    {
        newUser.click();
    }
}
