package cydeo.pages;

import cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;


public class HomePage extends BasePage {

    @FindBy(xpath = "//h1/span[@class='h1y']")
    public WebElement header1Text;

    @FindBy(xpath = "//h2/span[@class='h2']")
    public WebElement header2Text;

    @FindBy(css = "ul.list-group a")
    public List<WebElement> allLinks;

    @FindBy(linkText = "A/B Testing")
    private WebElement aBTestingLink;

    @FindBy(linkText = "Checkboxes")
    private WebElement checkboxesLink;

    @FindBy(linkText = "Form Authentication")
    private WebElement formAuthenticationLink;

    // Add more WebElements as needed...


    public void clickLink(String text) {
        Driver.getDriver().findElement(By.linkText(text)).click();
    }





}
