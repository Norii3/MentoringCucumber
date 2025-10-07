package stepdefinitions;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.FormPage;
import pages.RegisterPage;
import pages.SignInPage;

public class UserRegisterStepDefs {

    RegisterPage registerPage;
    @When("user enters ssn {string}")
    public void user_enters_ssn(String ssn) {
        registerPage = new RegisterPage();
        registerPage.enterSSN(ssn);
    }
    @When("user enters First name {string}")
    public void user_enters_first_name(String firstname) {
        registerPage = new RegisterPage();
        registerPage.enterFirstname(firstname);
    }

    @When("user enters Last name {string}")
    public void user_enters_last_name(String lastname) {
        registerPage = new RegisterPage();
        registerPage.enterLastname(lastname);
    }
    @When("user enters address {string}")
    public void user_enters_address(String address) {
        registerPage = new RegisterPage();
        registerPage.enterAddress(address);
    }
    @And("user enters phone number {string}")
    public void userEntersPhoneNumber(String phoneNumber) {
        registerPage = new RegisterPage();
        registerPage.enterPhone(phoneNumber);
    }
    @When("user enters Username {string}")
    public void user_enters_username(String username) {
        registerPage = new RegisterPage();
        registerPage.enterUsername(username);
    }
    @When("user enters email {string}")
    public void user_enters_email(String email) {
        registerPage = new RegisterPage();
        registerPage.enterEmail(email);
    }
    @When("user enters Password {string}")
    public void user_enters_password(String password) {
        registerPage = new RegisterPage();
        registerPage.enterPassword(password);
    }
    @When("user enters New Password Confirmation {string}")
    public void user_enters_new_password_confirmation(String passwordConfirmation) {
        registerPage = new RegisterPage();
        registerPage.enterConfirmPassword(passwordConfirmation);
    }
    @When("user click Register button")
    public void user_click_register_button() {
        registerPage = new RegisterPage();
        registerPage.clickRegister();
    }


    @Then("verify each registration is successful")
    public void verifyEachRegistrationIsSuccessful() {
        registerPage = new RegisterPage();
        registerPage.assertUserRegister();
    }
}
