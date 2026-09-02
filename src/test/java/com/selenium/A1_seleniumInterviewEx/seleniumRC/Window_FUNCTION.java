package com.selenium.A1_seleniumInterviewEx;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.Set;

public class Window_FUNCTION extends BaseTest_ThreadLocal{

    @Test
    public void test() {
        WebElement element = getDriver().findElement(By.id("1"));
        Alert alert = getDriver().switchTo().alert();
        Select select =new Select(element);
        WebDriver driver = getDriver().switchTo().frame(1);

        String mainWindowName= driver.getWindowHandle();
        driver.switchTo().window(mainWindowName);

        Set<String> multipleWindows = driver.getWindowHandles();
        for (String window:multipleWindows){
            if (!window.equals(mainWindowName)){
                driver.switchTo().window(window);
                System.out.println("Child Window Title: " + driver.getTitle());
            }
        }
        driver.switchTo().window(mainWindowName);

    }
    }
