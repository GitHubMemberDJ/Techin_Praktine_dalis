package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogInPage extends BaseObjectPage{


    //   locate login Username field
    @FindBy(xpath = "//input[@name='username']")
    private WebElement inputLoginUserName;

    //  locate login Password field
    @FindBy(xpath = "//input[@name='password']")
    private WebElement inputLoginPassword;

    //  locate
    @FindBy(xpath = "//button[@class='btn btn-lg btn-primary btn-block']")
    private WebElement clickLoginButton;


    //    Constructor to initialize elements______________
    public LogInPage(WebDriver driver){super(driver);}
    //    ________________________________________________



    //    Method to type username for Login
    public void typeLoginUserName(String name){inputLoginUserName.sendKeys(name);}

    //    Method to type password for Login
    public void typeLoginPassword(String name){inputLoginPassword.sendKeys();}

    //    Method to click Login button
    public void  clickLoginButton(){clickLoginButton.click();}

}
