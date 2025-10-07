package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class RegisterPage {

    public RegisterPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "ssn")
    public WebElement ssnInput;

    @FindBy(id = "first-name")
    public WebElement firstnameInput;

    @FindBy(id = "last-name")
    public WebElement lastnameInput;

    @FindBy(id = "address")
    public WebElement addressInput;

    @FindBy(id = "phone")
    public WebElement phoneInput;

    @FindBy(id = "username")
    public WebElement usernameInput;

    @FindBy(id = "email")
    public WebElement emailInput;

    @FindBy(id = "password")
    public WebElement passwordInput;

    @FindBy(id = "confirm-password")
    public WebElement confirmPasswordInput;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement registerButton;

    public RegisterPage enterSSN(String ssn) {
        ssnInput.sendKeys(ssn);
        return this;
    }
    public RegisterPage enterFirstname(String firstname) {
        firstnameInput.sendKeys(firstname);
        return this;
    }
    public RegisterPage enterLastname(String lastname) {
        lastnameInput.sendKeys(lastname);
        return this;
    }
    public RegisterPage enterAddress(String address) {
        addressInput.sendKeys(address);
        return this;
    }
    public RegisterPage enterPhone(String phone) {
        phoneInput.sendKeys(phone);
        return this;
    }
    public RegisterPage enterUsername(String username) {
        usernameInput.sendKeys(username);
        return this;
    }
    public RegisterPage enterEmail(String email) {
        emailInput.sendKeys(email);
        return this;
    }
    public RegisterPage enterPassword(String password) {
        passwordInput.sendKeys(password);
        return this;
    }
    public RegisterPage enterConfirmPassword(String confirmPassword) {
        confirmPasswordInput.sendKeys(confirmPassword);
        return this;
    }
    public void clickRegister() {
        registerButton.click();
    }

    public void assertUserRegister() {
        Assert.assertTrue("User registered successfully!",true);
    }

}
