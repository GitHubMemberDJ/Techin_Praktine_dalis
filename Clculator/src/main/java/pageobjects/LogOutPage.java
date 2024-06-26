package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogOutPage extends BaseObjectPage{


    // locate Logout link
    @FindBy(xpath = "//a[@onclick='document.forms['logoutForm'].submit()']")
    private WebElement logOut;




    //    Constructor to initialize elements______________
    public LogOutPage(WebDriver driver){super(driver);}
    //    ________________________________________________




    //  Method to click Logout link
    public void clickLogOut(){logOut.click();}


}
