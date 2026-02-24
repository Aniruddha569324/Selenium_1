package stepdefinitions;

import Pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;


public class LoginStep {

    LoginPage lp = new LoginPage();

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        boolean isLoginPageDisplayed = lp.verifyLoginPage();
        Assert.assertTrue(isLoginPageDisplayed, "Verify user is on login screen");
    }

    @When("user enters invalid username and password")
    public void user_enters_invalid_username_and_password() {

    }
    @Then("user should see an error message")
    public void user_should_see_an_error_message() {

    }

    @When("user enters valid username and password")
    public void user_enters_valid_username_and_password() {
        //String Username = (String) TestContext.get("UserNameValue");
        //String password = (String) TestContext.get("PasswordValue");
        lp.enterUsername("Aniruddha1111");
        lp.enterPassword("Password@1");
        lp.clickLogin();
    }
    @Then("user should be logged in successfully")
    public void user_should_be_logged_in_successfully() {



    }

    @When("user leaves username and password fields empty")
    public void user_leaves_username_and_password_fields_empty() {

    }
    @Then("user should see a validation message")
    public void user_should_see_a_validation_message() {

    }

}
