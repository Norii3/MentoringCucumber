package stepdefinitions;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.*;
import pages.FormPage;
import pages.loginPage;

public class negativeLoginStepDefs {

    loginPage loginPage;
    @When("user enters username {string}")
    public void user_enters_username(String username) {
        loginPage = new loginPage();
        loginPage.enterUsername(username);
    }
    @When("user enters password {string}")
    public void user_enters_password(String password) {
        loginPage = new loginPage();
        loginPage.enterPassword(password);
    }
    @When("user click login button")
    public void user_click_login_button() {
        loginPage = new loginPage();
        loginPage.clickLogin();
        loginPage.assertEmptyUsername();
        loginPage.assertEmptyPassword();
        loginPage.assertAlertMessage();
    }
}
