package tests;

import org.junit.jupiter.api.Test;
import pageobjects.CrateNewAccountPage;
import pageobjects.MainPage;

public class CreateNewAccountTest extends BaseTestPage{

    //    call the method from MainPageObject
    MainPage mainPage;
    CrateNewAccountPage crateNewAccountPage;

    @Test
    void setCreateNewAccount(){

        //    initialization
        mainPage = new MainPage(driver);
        crateNewAccountPage = new CrateNewAccountPage(driver);


        //    tests
        crateNewAccountPage.typeUserName("Monika");
        crateNewAccountPage.typePassword("Monika555");
        crateNewAccountPage.typePasswordConfirmation("Monika555");
        crateNewAccountPage.clickSubmitButton();

    }
}
