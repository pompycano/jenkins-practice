package cydeo.steps;

import cydeo.pages.CheckboxesPage;
import io.cucumber.java.en.Then;

public class CheckboxesLinkSteps {

    CheckboxesPage checkboxesPage = new CheckboxesPage();

    @Then("user should see the first checkbox")
    public void user_should_see_the_first_checkbox() {
        assert checkboxesPage.checkbox1.isDisplayed();
    }
    @Then("user should see the second checkbox")
    public void user_should_see_the_second_checkbox() {
        assert checkboxesPage.checkbox2.isDisplayed();
    }
    @Then("the first checkbox should be enabled")
    public void the_first_checkbox_should_be_enabled() {
        assert checkboxesPage.checkbox1.isEnabled();
    }

    @Then("the second checkbox should be enabled")
    public void the_second_checkbox_should_be_enabled() {
        assert checkboxesPage.checkbox2.isEnabled();
    }

    @Then("the first checkbox should be unchecked")
    public void the_first_checkbox_should_be_unchecked() {
        assert !checkboxesPage.checkbox1.isSelected();
    }

    @Then("the second checkbox should be checked")
    public void the_second_checkbox_should_be_checked() {
        assert checkboxesPage.checkbox2.isSelected();
    }

}
