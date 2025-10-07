package stepdefinitions;

import io.cucumber.java.en.*;
import pages.ArithmeticPage;
import utilities.Driver;

public class ArithmeticStepDefinitions {

    ArithmeticPage arithmeticPage;

    @Given("user is on the arithmetic page")
    public void user_is_on_the_arithmetic_page() {
        Driver.getDriver().get("https://web2.0calc.com/");
    }
    @When("user enter nine")
    public void user_enter_nine() {
        arithmeticPage = new ArithmeticPage();
        arithmeticPage.enterNumNine();
    }
    @When("user enter plus")
    public void user_enter_plus() {
        arithmeticPage = new ArithmeticPage();
        arithmeticPage.enterbtnPlus();
    }
    @When("user enter three")
    public void user_enter_three() {
        arithmeticPage = new ArithmeticPage();
        arithmeticPage.enterNumThree();
    }
    @When("uesr enter equals")
    public void uesr_enter_equals() {
        arithmeticPage = new ArithmeticPage();
        arithmeticPage.enterbtnCalc();
    }
    @Then("the result should be twelve")
    public void the_result_should_be_twelve() {
        arithmeticPage = new ArithmeticPage();
        arithmeticPage.assertResult();
    }

    @When("user enter minus")
    public void user_enter_minus() {
        arithmeticPage = new ArithmeticPage();
        arithmeticPage.enterbtnMinus();
    }
    @Then("the result should be negative six")
    public void the_result_should_be_negative_six() {
        arithmeticPage = new ArithmeticPage();
        arithmeticPage.assertResult();
    }

    @When("user enter divide")
    public void user_enter_divide() {
        arithmeticPage = new ArithmeticPage();
        arithmeticPage.enterbtnDiv();
    }
    @When("user enter zero")
    public void user_enter_zero() {
        arithmeticPage = new ArithmeticPage();
        arithmeticPage.enterNumZero();
    }
    @Then("the result it error case")
    public void the_result_it_error_case() {
        arithmeticPage = new ArithmeticPage();
        arithmeticPage.assertErrorCase();
    }
}
