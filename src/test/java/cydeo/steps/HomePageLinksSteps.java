package cydeo.steps;

import cydeo.pages.HomePage;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;

public class HomePageLinksSteps {

    HomePage homePage = new HomePage();

    @Then("user should see exactly {int} links in the ul tag")
    public void user_should_see_exactly_links_in_the_ul_tag(Integer int1) {
       assert homePage.allLinks.size() == 50;
    }

    @Then("each link should be displayed and clickable")
    public void each_link_should_be_displayed_and_clickable() {
        for (WebElement link : homePage.allLinks) {
            assert link.isDisplayed() && link.isEnabled();
        }
    }
}
