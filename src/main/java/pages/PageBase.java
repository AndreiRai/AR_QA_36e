package pages;
import org.openqa.selenium.WebDriver;
 import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public abstract class PageBase {
    WebDriver driver;
    public static Logger logger = LoggerFactory.getLogger(PageBase.class);

    public PageBase(WebDriver driver) {
        this.driver = driver;
    }


    public void click(WebElement element) {
        element.click();
    }

    public void type(WebElement element, String text) {
        if (text != null) {
            click(element);
            element.clear();
            element.sendKeys(text);
        }
    }
}