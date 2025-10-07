package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import utilities.ReusableMethods;

import static org.junit.Assert.assertEquals;

public class SignInPage {

    public SignInPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "username")
    public WebElement usernameInput;

    @FindBy(id = "password")
    public WebElement passwordInput;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement signInButton;

    public SignInPage enterUsername(String username){
        usernameInput.sendKeys(username);
        return this;
    }

    public SignInPage enterPassword(String password) {
        passwordInput.sendKeys(password);
        return this;
    }

    public void clickSignIn() {
        signInButton.click();
    }

    public SignInPage assertEmptyUsername(){
        assertEquals("Please fill out this field.",ReusableMethods.getValidationMessage(usernameInput));
        return this;
    }

    public SignInPage assertEmptyPassword(){
        assertEquals("Please fill out this field.",ReusableMethods.getValidationMessage(usernameInput));
        return this;
    }

}
