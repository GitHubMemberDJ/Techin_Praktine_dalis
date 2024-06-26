package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CrateNewAccountPage extends BaseObjectPage{

    //    1. locate Username
    @FindBy(xpath = "//input[@id='username']")
    private WebElement inputUserName;

    //    2. locate password
    @FindBy(xpath = "//input[@id='password']")
    private WebElement inputPassword;

    //    3. locate password confirm
    @FindBy(xpath = "//input[@id='passwordConfirm']")
    private WebElement inputPasswordConfirm;

    //     4. locate submit button
    @FindBy(xpath = "//button[@type='submit']")
    private  WebElement clickSubmit;



    //    Constructor to initialize elements______________
    public CrateNewAccountPage(WebDriver driver){super(driver);}
    //    ________________________________________________




    //    Method to type username
    public void typeUserName(String name){inputUserName.sendKeys(name);}

    //    Method to type password
    public  void typePassword(String password){inputPassword.sendKeys(password);}

    //    Method to type password2
    public void typePasswordConfirmation(String password2){inputPasswordConfirm.sendKeys(password2);}

    //    Method to click Submit button
    public void clickSubmitButton(){clickSubmit.click();}

}
