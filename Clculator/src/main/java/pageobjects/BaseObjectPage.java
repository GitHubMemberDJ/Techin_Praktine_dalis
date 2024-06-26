package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


    //    this class inherit all page object
    public class BaseObjectPage{

        protected WebDriver driver;

        public BaseObjectPage(WebDriver driver){
            this.driver = driver;
            PageFactory.initElements(driver, this);
    }
}

