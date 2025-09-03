package cydeo.steps;

import cydeo.pages.HomePage;
import cydeo.utilities.BrowserUtils;
import cydeo.utilities.ConfigurationReader;
import cydeo.utilities.Driver;
import io.cucumber.java.en.Given;

public class CommonSteps {

    HomePage homePage = new HomePage();

    @Given("user is on the home page")
    public void i_am_on_the_home_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        BrowserUtils.waitFor(2);
    }

    @Given("user clicked the {string} link")
    public void user_clicked_the_link(String string) {
        homePage.clickLink(string);
    }

}
