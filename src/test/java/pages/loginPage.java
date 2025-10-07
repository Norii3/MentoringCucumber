package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import utilities.ReusableMethods;

import static org.junit.Assert.assertEquals;

public class loginPage {

    public loginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "username")
    public WebElement usernameInput;

    @FindBy(id = "password")
    public WebElement passwordInput;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement loginButton;

    public loginPage enterUsername(String username){
        usernameInput.sendKeys(username);
        return this;
    }

    public loginPage enterPassword(String password) {
        passwordInput.sendKeys(password);
        return this;
    }

    public void clickLogin() {
        loginButton.click();
    }

    public loginPage assertEmptyUsername(){
        assertEquals("Please fill out this field.", ReusableMethods.getValidationMessage(usernameInput));
        return this;
    }

    public loginPage assertEmptyPassword(){
        assertEquals("Please fill out this field.",ReusableMethods.getValidationMessage(usernameInput));
        return this;
    }
    public void assertAlertMessage() {
        Assert.assertEquals("Incorrect username or password",Driver.getDriver().switchTo().alert().getText());
    }
}
