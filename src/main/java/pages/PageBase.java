package pages;
import org.openqa.selenium.WebDriver;
 import org.openqa.selenium.WebElement;


public abstract class PageBase {
    WebDriver driver;


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