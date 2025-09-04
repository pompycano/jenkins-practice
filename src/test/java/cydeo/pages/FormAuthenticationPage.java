package cydeo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FormAuthenticationPage extends BasePage{

    @FindBy(xpath = "//input[@name='username']")
    private WebElement usernameInputBox;

    @FindBy(xpath = "//input[@name='password']")
    private WebElement passwordInputBox;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement loginButton;

    @FindBy(xpath = "//div[@id='flash']")
    public WebElement successMessage;

    public void enterUsername(String username){
        usernameInputBox.sendKeys(username);
    }

    public void enterPassword(String password){
        passwordInputBox.sendKeys(password);
    }

    public void clickLoginButton(){
        loginButton.click();
    }

}
