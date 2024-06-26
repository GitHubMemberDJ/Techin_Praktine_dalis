package tests;

import org.junit.jupiter.api.Test;
import pageobjects.CrateNewAccountPage;
import pageobjects.LogInPage;
import pageobjects.LogOutPage;
import pageobjects.MainPage;

public class LogInTest extends BaseTestPage{


    //    call the method from MainPageObject
    MainPage mainPage;
    CrateNewAccountPage crateNewAccountPage;
    LogOutPage logOutPage;
    LogInPage logInPage;



    @Test
    void setLogIn(){


        //    initialization
        mainPage = new MainPage(driver);
        crateNewAccountPage = new CrateNewAccountPage(driver);
        logOutPage = new LogOutPage(driver);
        logInPage = new LogInPage(driver);


        //      tests
        logInPage.typeLoginUserName("Monika");
        logInPage.typeLoginPassword("555");
        logInPage.clickLoginButton();




    }

}
