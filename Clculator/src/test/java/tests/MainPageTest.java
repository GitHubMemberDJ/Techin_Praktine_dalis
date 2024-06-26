package tests;

import org.junit.jupiter.api.Test;
import pageobjects.MainPage;

public class MainPageTest extends BaseTestPage{

//    call the method from MainPageObject
    MainPage mainPage;

    @Test
    void testMainPage(){


        //    initialization
        mainPage = new MainPage(driver);

        //    tests
        mainPage.clickNewAccount();

    }
}
