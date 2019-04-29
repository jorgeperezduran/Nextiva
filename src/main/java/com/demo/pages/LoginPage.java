package com.demo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private WebDriver driver;
    private By loginButton = By.cssSelector("#welcome-page > p:nth-child(4) > button");


    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public WelcomePage openWelcomePage(){
        driver.findElement(loginButton).click();
        return new WelcomePage(driver);
    }



}
