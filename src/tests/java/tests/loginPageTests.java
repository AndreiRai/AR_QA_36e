package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ContactsPage;
import pages.LoginPage;

public class loginPageTests extends TestBase{

    @Test
    public void loginPositiveTest(){
        LoginPage myLoginPage = new LoginPage(driver);
        ContactsPage contactsPage = myLoginPage.login("test@gmail.com", "test@gmail.com");
        Assert.assertEquals(contactsPage.getContacts().getText(), "Contacts");

    }

}