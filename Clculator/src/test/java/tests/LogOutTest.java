package tests;

import org.junit.jupiter.api.Test;
import pageobjects.CrateNewAccountPage;
import pageobjects.LogOutPage;
import pageobjects.MainPage;

public class LogOutTest extends BaseTestPage{

    //    call the method from MainPageObject
    MainPage mainPage;
    CrateNewAccountPage crateNewAccountPage;
    LogOutPage logOutPage;


    @Test
    void setLogOut(){


        //    initialization
        mainPage = new MainPage(driver);
        crateNewAccountPage = new CrateNewAccountPage(driver);
        logOutPage = new LogOutPage(driver);



        //     tests

        logOutPage.clickLogOut();

    }


}
