package com.selenium.A1_seleniumInterviewEx.selenium26.util;

import com.selenium.A1_seleniumInterviewEx.selenium26.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitUtil extends TestBase {

    static WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10));;

    public static void waitUntileClickable(WebElement element){
        webDriverWait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public static void waitElementToPresent(By element){
        webDriverWait.until(ExpectedConditions.presenceOfElementLocated(element) );
    }

    public static void waitForAlert(){
        webDriverWait.until(ExpectedConditions.alertIsPresent());
    }



}
