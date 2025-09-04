package cydeo.steps;

import cydeo.pages.FormAuthenticationPage;
import cydeo.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FormAuthenticationSteps {

    FormAuthenticationPage formAuthenticationPage = new FormAuthenticationPage();

    @When("user enters valid username in the username field")
    public void user_enters_valid_username_in_the_username_field() {
        formAuthenticationPage.enterUsername(System.getenv("USERNAME"));
    }
    @When("user enters valid password in the password field")
    public void user_enters_valid_password_in_the_password_field() {
        formAuthenticationPage.enterPassword(System.getenv("PASSWORD"));
    }
    @When("user clicks the Login button")
    public void user_clicks_the_login_button() {
        formAuthenticationPage.clickLoginButton();
        BrowserUtils.waitFor(2);
    }
    @Then("user logs in successfully")
    public void user_logs_in_successfully() {
        assert formAuthenticationPage.successMessage.isDisplayed();
    }

}
