package tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



//    this class inherit all tests
    public class BaseTestPage{
    protected WebDriver driver;

    @BeforeEach
    void setup(){
        driver = new ChromeDriver();
        driver.get("http://localhost:8080/prisijungti");
    }

    @AfterEach
    void tearDown(){
//        driver.quit();
    }
}

