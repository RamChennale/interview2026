package com.selenium.A1_seleniumInterviewEx.selenium26.ExpectedConditionsClass;

import com.selenium.A1_seleniumInterviewEx.selenium26.base.TestBase;
import com.selenium.A1_seleniumInterviewEx.selenium26.util.WaitUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class ElementToBeClickable_ExpectedConditions extends TestBase {

    @Test(enabled = true)
    public void elementToBeClickable(){
        driver.get("http://the-internet.herokuapp.com/checkboxes");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        boolean element = wait.until(ExpectedConditions.elementToBeSelected(driver.findElement(By.xpath("//div[@class='row']//input[2]"))));
         //WaitUtil.waitUntileClickable(element); element.click();
        System.out.println("Attribute available: ? " + element);
    }

}
