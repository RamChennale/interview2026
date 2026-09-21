package com.selenium.A1_seleniumInterviewEx.selenium26.base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestBase {

    public static WebDriver driver;

    @BeforeTest
    public void setUp() {
           driver =  DriverManager.initDriver();
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }

}
