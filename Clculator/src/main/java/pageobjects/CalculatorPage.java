package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CalculatorPage extends BaseObjectPage{


    // locate input firstNumber
    @FindBy(xpath = "//input[@id='sk1']")
    private WebElement inputFirstNumber;

    //  locate input secondNumber
    @FindBy(xpath = "//input[@id='sk2']")
    private WebElement inputSecondNumber;

    //    locate calculator value
    @FindBy(xpath = "//option[@value='+']")
    private WebElement plusValue;



    //  locate calculate button
    @FindBy(xpath = "//input[@type='submit']")
    private WebElement calculateButton;



    //    Constructor to initialize elements______________
    public CalculatorPage(WebDriver driver){super(driver);}
    //    ________________________________________________




    //  Method to clear FirstNumber field
    public  void clearFirstNumber(){inputFirstNumber.clear();}

    //  Method to type FirstNumber
    public  void typeFirstNumber(String password){inputFirstNumber.sendKeys(password);}



    //  Method to clear Second number field
    public  void clearSecondNumber(){inputFirstNumber.clear();}


    //  Method to type SecondNumber
    public  void typeSecondNumber(String password){inputSecondNumber.sendKeys(password);}



    //   Method  to select value plus
    public void selectPlusValue(){plusValue.click();}


    //  Method to select calculate button
    public void selectCalculateButton(){calculateButton.click();}

}
