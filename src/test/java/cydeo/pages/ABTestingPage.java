package cydeo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ABTestingPage extends BasePage{

    @FindBy(xpath = "//div[@class='example']/h3")
    public WebElement headerText;

    @FindBy(xpath = "//div[@class='example']/p")
    public WebElement paragraphText;


}
