
package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public abstract class TestBase {
    WebDriver driver;

    @BeforeMethod
    public void init(){
        System.setProperty("webdriver.chrome.driver", "d:\\User\\Downloads\\chromedriver_win32");
        driver = new ChromeDriver();
        driver.get("http://phonebook.telran-edu.de:8080/user/registration");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @AfterMethod(enabled = false)
    public void tearDown(){
        driver.quit();
    }
}