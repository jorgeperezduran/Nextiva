package com.demo.libraries;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
    public WebDriver driver;

    public WebDriver getDriver(){
        return driver;
    }
    public void setupDriver(){
        System.setProperty("webdriver.chrome.driver","C:/NextivaDemo/Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    public void launchUrl(String url){
        driver.get(url);
    }

    public void closeDriver(){
        driver.quit();
    }
}
