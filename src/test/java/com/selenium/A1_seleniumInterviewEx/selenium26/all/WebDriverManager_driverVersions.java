package com.selenium.A1_seleniumInterviewEx.selenium26.all;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class WebDriverManager_driverVersions {

    @Test
    public void openGoogle() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");
        driver.manage().window().maximize();
    }

    @AfterTest
    public void tearDown(){
        WebDriverManager.getInstance().quit();
    }

}
