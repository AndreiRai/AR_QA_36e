package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactsPage extends PageBase{

    public ContactsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//button[@class=\"btn btn-outline-warning text-white\"  and @xpath=\"2\"]")
    WebElement logOutButton;
    @FindBy(xpath = "//select[@id='langSelect']")
    WebElement selectLang;
    @FindBy(xpath = "//a[@class='nav-link' and @xpath=\"1\"]")
    WebElement contacts;

    public LoginPage logout(){
        click(logOutButton);
        return new LoginPage(driver);
    }

    public WebElement getContacts() {
        return contacts;
    }

     public static String getContactPage (String lang) {
        logger.info("language spicefide"+lang);
         String contactWord = null;
         if (lang.equals("English")) {
             contactWord = "Contacts";
         } else if (lang.equals("Russian")) {
             contactWord = "Контакты";
         } else if (lang.equals("German")) {
             contactWord = "Kontacte";
         } else if (lang.equals("Ukranian")) {
             contactWord = "Контакти";
         } else
             throw new RuntimeException("language non supported:" + lang);
return contactWord;
     }
     public ContactsPage selectLanguage(String lang){
        click(selectLang);
        WebElement language = driver.findElement(By.xpath( "//option [contains(text(),'"+lang+"')]"));
        click(language);
        return this;
    }
}
