package cydeo.steps;

import cydeo.pages.ABTestingPage;
import cydeo.utilities.BrowserUtils;
import cydeo.utilities.Driver;
import io.cucumber.java.en.Then;

public class ABTestingSteps {

    ABTestingPage abTestingPage = new ABTestingPage();

    @Then("the url should end with {string}")
    public void the_url_should_end_with(String string) {
        assert Driver.getDriver().getCurrentUrl().endsWith(string);
    }

    @Then("user should see page title as {string}")
    public void user_should_see_page_title_as(String string) {
       assert Driver.getDriver().getTitle().endsWith(string);
    }

    @Then("user should see header text of A\\/B testing page")
    public void user_should_see_header_text_of_a_b_testing_page() {
        assert abTestingPage.headerText.isDisplayed();
    }
    @Then("user should see paragraph text of A\\/B testing page")
    public void user_should_see_paragraph_text_of_a_b_testing_page() {
        assert abTestingPage.paragraphText.isDisplayed();
    }


}
