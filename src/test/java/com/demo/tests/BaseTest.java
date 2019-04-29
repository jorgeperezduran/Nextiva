package com.demo.tests;

import com.demo.libraries.Browser;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseTest extends Browser {
    @BeforeSuite
    public void setupSuite(){
        setupDriver();
    }

    @BeforeMethod
    public void beforeMethod(){
        launchUrl("http://testapp.galenframework.com/");
    }

    @AfterMethod
    public void afterMethod(){
        closeDriver();
    }
}
