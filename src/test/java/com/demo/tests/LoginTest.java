package com.demo.tests;

import com.demo.pages.LoginPage;
import com.demo.pages.MyNotesPage;
import com.demo.pages.WelcomePage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{
    WelcomePage p;
    LoginPage l;
    MyNotesPage n;
    //private WebDriver driver;

    @Test
    public void LoginHappyPath(){
        l = new LoginPage(driver);
        p = l.openWelcomePage();
        p.enterUsername("testuser@example.com");
        p.enterPassword("test123");
        n = p.clickLoginAndReturnNotesPage();
        Assert.assertTrue(n.findMyNotes());
    }

    @Test
    public void LoginError(){
        l = new LoginPage(driver);
        p = l.openWelcomePage();
        p.enterUsername("testuser@example.com");
        p.enterPassword("test124");
        p.clickLoginButton();
        Assert.assertEquals(p.findLoginError(),"The username or password are incorrect");
    }
}
