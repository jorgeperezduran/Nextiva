package com.demo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WelcomePage {
    private WebDriver driver;

    private By userName = By.name("login.username");
    private By password = By.name("login.password");
    private By loginButton = By.cssSelector("#login-page > p:nth-child(5) > button.btn.btn-lg.btn-primary.button-login");
    private By loginError = By.id("login-error-message");

    public WelcomePage(WebDriver driver){
        this.driver = driver;
    }

    public void enterUsername(String user){
        driver.findElement(userName).sendKeys(user);
    }

    public void enterPassword(String pass){
        driver.findElement(password).sendKeys(pass);
    }

    public void clickLoginButton(){
        driver.findElement(loginButton).click();
    }
    public MyNotesPage clickLoginAndReturnNotesPage(){
        driver.findElement(loginButton).click();
        return new MyNotesPage(driver);
    }

    public String findLoginError(){
        WebElement n = driver.findElement(loginError);
        return n.getText();
    }

}
