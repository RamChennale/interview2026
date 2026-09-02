package com.selenium.A1_seleniumInterviewEx;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Alert_FUNCTION extends BaseTest_ThreadLocal{

    @Test
    public void test(){
        Alert alert =  getDriver().switchTo().alert();
        WebElement element = getDriver().findElement(By.id("1"));
         String test= alert.getText();
         alert.sendKeys("user");
         alert.accept();
         alert.dismiss();
    }
}
