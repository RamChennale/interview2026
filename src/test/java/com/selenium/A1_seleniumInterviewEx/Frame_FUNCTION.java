package com.selenium.A1_seleniumInterviewEx;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Frame_FUNCTION extends BaseTest_ThreadLocal{

    @Test
    public void test() {
        WebElement element = getDriver().findElement(By.id("1"));
        Alert alert = getDriver().switchTo().alert();
        Select select =new Select(element);

           WebDriver driver = getDriver().switchTo().frame(1);
           driver.switchTo().frame("NameORid");
           driver.switchTo().frame(element);
           driver.switchTo().parentFrame();
           driver.switchTo().defaultContent();
    }
    }
