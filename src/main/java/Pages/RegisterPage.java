package Pages;

import config.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonUtils;
import utils.SyncUtils;

public class RegisterPage {

    SyncUtils su = new SyncUtils();

    @FindBy(id = "firstname")
    private WebElement firstName;

    @FindBy(id = "lastname")
    private WebElement lastName;

    @FindBy(id = "userName")
    private WebElement userName;

    @FindBy(id = "password")
    private WebElement password;

    @FindBy(id = "register")
    private WebElement btnRegister;

    @FindBy(xpath = "//h4[text()='Register to Book Store']")
    private WebElement registrationHeader;

    public RegisterPage()
    {
        PageFactory.initElements(DriverFactory.getDriver(), this);
    }

    public void enterFirstName(String fName)
    {
        firstName.sendKeys(fName);
    }

    public void enterLastName(String lName)
    {
        lastName.sendKeys(lName);
    }

    public void enterUserName(String uName)
    {
        userName.sendKeys(uName);
    }

    public void enterPassword(String pass)
    {
        password.sendKeys(pass);
    }

    public boolean VerifyRegistrationPage()
    {
        su.WaitUtilVisibilityOfElements(registrationHeader);
        return registrationHeader.isDisplayed();
    }

    public void clickRegister()
    {
        su.WaitUtilElementIsClickable(btnRegister);
        btnRegister.click();
    }

    public String getAlertText()
    {
        su.WaitUtilAlertIsPresent();
        return DriverFactory.getDriver().switchTo().alert().getText();
    }

    public static void SwitchToAlert()
    {
        DriverFactory.getDriver().switchTo().alert();
    }
}
