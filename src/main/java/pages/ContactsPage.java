package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactsPage extends PageBase{

    public ContactsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//button[@class=\"btn btn-outline-warning text-white\"  and @xpath=\"2\"]")
    WebElement logOutButton;

    public LoginPage logout(){
        click(logOutButton);
        return new LoginPage(driver);
    }
}
