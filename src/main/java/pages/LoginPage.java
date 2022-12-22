package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static java.lang.Thread.sleep;

public class LoginPage extends PageBase{

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id="defaultRegisterFormEmail")
    WebElement userName;

    @FindBy(xpath = "//input[@placeholder=\"Password\"]")
    WebElement password;

    @FindBy(xpath = "//button[@type=\"submit\"]")
    WebElement loginButton;

    public ContactsPage login(String uName, String pass) {
        sleep();
        type(userName, uName);
        type(password, pass);
        click(loginButton);
        sleep();
        return new ContactsPage(driver);
    }

    private void sleep() {
    }

    public LoginPage loginNegative(String uName, String pass) {
        type(userName, uName);
        type(password, pass);
        click(loginButton);
        return this;
    }

}

