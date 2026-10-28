package com.selenium.A1_seleniumInterviewEx.selenium26.frames;

import com.selenium.A1_seleniumInterviewEx.selenium26.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class FrameOperations extends TestBase {

    @Test
    public void frameHandling(){
        // iframe
        driver.switchTo().frame("paymentFrame");
        driver.findElement(By.id("cardNumber")).sendKeys("4111111111111111");
        driver.switchTo().defaultContent(); //Returns: This driver focused on the top window/first frame.
    }
}
