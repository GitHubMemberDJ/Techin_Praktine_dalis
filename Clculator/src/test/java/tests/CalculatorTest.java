package tests;

import org.checkerframework.checker.units.qual.C;
import org.junit.jupiter.api.Test;
import pageobjects.*;

public class CalculatorTest extends BaseTestPage{


    //    call the method from MainPageObject
    MainPage mainPage;
    CrateNewAccountPage crateNewAccountPage;
    LogOutPage logOutPage;
    LogInPage logInPage;
    CalculatorPage calculatorPage;



    @Test
    void setCalculator(){
        //    initialization
        mainPage = new MainPage(driver);
        crateNewAccountPage = new CrateNewAccountPage(driver);
        logOutPage = new LogOutPage(driver);
        logInPage = new LogInPage(driver);
        calculatorPage = new CalculatorPage(driver);



        //      tests
        calculatorPage.clearFirstNumber();
        calculatorPage.typeFirstNumber("12");
        calculatorPage.clearSecondNumber();
        calculatorPage.typeSecondNumber("8");
        calculatorPage.selectPlusValue();
        calculatorPage.selectCalculateButton();



    }
}
