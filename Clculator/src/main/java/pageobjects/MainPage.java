package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BaseObjectPage {


    // Locate Create new Account
    @FindBy(xpath = "//a[@href='/registruoti']")
    private WebElement linkCreateNewAccount;


    //    Constructor to initialize elements______________
    public MainPage(WebDriver driver) {super(driver);    }
    //    ________________________________________________


    // Method to click on Create new Account link
    public void clickNewAccount() {linkCreateNewAccount.click();}
}