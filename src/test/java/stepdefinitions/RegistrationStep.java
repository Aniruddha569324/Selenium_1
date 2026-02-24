package stepdefinitions;

import Pages.LoginPage;
import Pages.RegisterPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import utils.CommonUtils;
import utils.TestContext;

public class RegistrationStep {

    LoginPage lp = new LoginPage();
    RegisterPage rp = new RegisterPage();

    @Given("I am on the registration page")
    public void i_am_on_the_registration_page() {
        lp.clickNewUser();
        boolean registerationPagePresence = rp.VerifyRegistrationPage();
        Assert.assertTrue(registerationPagePresence, "Verify user is on registration screen");

    }

    @When("I submit the registration form")
    public void i_submit_the_registration_form() throws InterruptedException {
        rp.clickRegister();
        String AlertText = rp.getAlertText();
        Assert.assertEquals("User Registered Successfully.",AlertText, "Verify user registration successful");
    }

    @When("I enter valid registration details")
    public void i_enter_valid_registration_details() {
        String FirstName = CommonUtils.generateFirstName();
        String LastName = CommonUtils.generateLastName();
        String UserName = CommonUtils.generateUserName();
        String Password = CommonUtils.generatePassword();
        rp.enterFirstName(FirstName);
        rp.enterLastName(LastName);
        rp.enterUserName(UserName);
        TestContext.set("UserNameValue",UserName);
        rp.enterPassword(Password);
    }
}
