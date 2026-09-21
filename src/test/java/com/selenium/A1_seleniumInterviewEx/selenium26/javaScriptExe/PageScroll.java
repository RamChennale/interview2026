package com.selenium.A1_seleniumInterviewEx.selenium26.javaScriptExe;

import com.selenium.A1_seleniumInterviewEx.selenium26.base.TestBase;
import com.selenium.A1_seleniumInterviewEx.selenium26.util.WaitUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class PageScroll extends TestBase {

    @Test
    public void pageScroll() throws InterruptedException {

        driver.get("https://www.saucedemo.com/");

        WebElement user = driver.findElement(By.id("user-name"));
        WaitUtil.waitUntileClickable(user);
        user.sendKeys("standard_user");
        Thread.sleep(2000);

        WebElement password = driver.findElement(By.id("password"));
        WaitUtil.waitUntileClickable(password);
        password.sendKeys("secret_sauce");
        Thread.sleep(2000);

        WebElement loginBtn = driver.findElement(By.id("login-button"));
        WaitUtil.waitUntileClickable(loginBtn);
        loginBtn.click();

        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,400)","");
        WebElement footer = driver.findElement(By.xpath("//a[normalize-space()='LinkedIn']"));
        Thread.sleep(2000);
        js.executeScript("arguments[0].click()",footer);
        Thread.sleep(2000);
    }
}
