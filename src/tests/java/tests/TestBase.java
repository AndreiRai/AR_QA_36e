
package tests;
        ​
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
​
import java.util.concurrent.TimeUnit;
​
public abstract class TestBase {
    WebDriver driver;
​
    @BeforeMethod
    public void init(){
        System.setProperty("webdriver.chrome.driver", "/Users/albertnurgaliev/Downloads/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://contacts-app.tobbymarshall815.vercel.app/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
​
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}