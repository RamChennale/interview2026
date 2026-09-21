package com.selenium.A1_seleniumInterviewEx.selenium26.ExpectedConditionsClass;

import com.selenium.A1_seleniumInterviewEx.selenium26.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class IsCheckBoxSelected extends TestBase {

    @Test(enabled=true)
    public void elementToBeSelectedUsingByLocator() {
        driver.get("http://the-internet.herokuapp.com/checkboxes");
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
        boolean isSelected	=wait.until(ExpectedConditions.elementToBeSelected(By.xpath("//div[@class='row']//input[2]")));
        if(isSelected) {
            System.out.println("check box is already selected.");
        }else {
            System.out.println("check box is NOT selected.");
        }
    }

}
