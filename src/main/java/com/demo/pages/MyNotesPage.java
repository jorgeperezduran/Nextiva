package com.demo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyNotesPage {
    private WebDriver driver;
    private By myNotes = By.id("my-notes-page");

    public MyNotesPage(WebDriver driver){
        this.driver = driver;
    }

    public boolean findMyNotes(){
        return driver.findElement(myNotes).isDisplayed();
    }
}
