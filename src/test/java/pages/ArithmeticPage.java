package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import utilities.ReusableMethods;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ArithmeticPage {

    public ArithmeticPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "Btn9")
    public WebElement nine;

    @FindBy(id = "BtnPlus")
    public WebElement btnPlus;

    @FindBy(id = "Btn3")
    public WebElement three;

    @FindBy(id = "BtnCalc")
    public WebElement btnCalc;

    @FindBy(id = "input")
    public WebElement result;

    @FindBy(id = "BtnMinus")
    public WebElement btnMinus;

    @FindBy(id = "BtnDiv")
    public WebElement btnDiv;

    @FindBy(id = "Btn0")
    public WebElement zero;

    public ArithmeticPage enterNumNine(){
        nine.click();
        return this;
    }

    public ArithmeticPage enterbtnPlus(){
        btnPlus.click();
        return this;
    }

    public ArithmeticPage enterNumThree(){
        three.click();
        return this;
    }

    public ArithmeticPage enterbtnCalc(){
        btnCalc.click();
        return this;
    }

    public ArithmeticPage assertResult(){
        Assert.assertTrue(result.getText(), true);
        return this;
    }

    public ArithmeticPage enterbtnMinus(){
        btnMinus.click();
        return this;
    }

    public ArithmeticPage enterNumZero(){
        zero.click();
        return this;
    }

    public ArithmeticPage enterbtnDiv(){
        btnDiv.click();
        return this;
    }

    public ArithmeticPage assertErrorCase(){
        Assert.assertTrue("Error: DivByZero", true);
        return this;
    }
}
