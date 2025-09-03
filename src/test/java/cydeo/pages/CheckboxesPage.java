package cydeo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckboxesPage extends BasePage  {

    @FindBy(css = "input[id='box1']")
    public WebElement checkbox1;

    @FindBy(css = "input[id='box2']")
    public WebElement checkbox2;

}
