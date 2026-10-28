package com.selenium.A1_seleniumInterviewEx.selenium26.POMframework;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase_1 {

    protected WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = DriverManager_1.initDriver();
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        DriverManager_1.quitDriver();
    }
}