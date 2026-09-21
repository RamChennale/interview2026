package com.selenium.A1_seleniumInterviewEx.selenium26.all;

import com.selenium.A1_seleniumInterviewEx.selenium26.base.TestBase;
import com.selenium.A1_seleniumInterviewEx.selenium26.util.WaitUtil;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Set;

import static org.hamcrest.MatcherAssert.assertThat;

public class Window_FUNCTION extends TestBase {

    @Test
    public void windowHandleTest() throws InterruptedException {

        System.out.println("Parent on    :  orangehrmlive :");
        System.out.println("Child on     :  saucedemo     :");
        // Window-1
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        String parentWind = driver.getWindowHandle();
        System.out.println("parent Wind     : "+parentWind);
        Thread.sleep(2000);

        // window-2
        // driver.switchTo().newWindow(WindowType.TAB);  // should open new TAB in within same browser WINDOW
        driver.switchTo().newWindow(WindowType.WINDOW);  // should open new WINDOW separate NEW browser instance

        driver.get("https://www.saucedemo.com/");
        String childWind = driver.getWindowHandle();
        System.out.println("child  Wind     : "+childWind);
        Thread.sleep(2000);

        // Ensure there are two windows open (Parent  window + child tab)
        int nunOfWindows = driver.getWindowHandles().size();
        System.out.println("Num of windows opened : " + nunOfWindows);

        Set<String> allWindowHandles = driver.getWindowHandles();

        for (String windowHandle : allWindowHandles) {
            if (!windowHandle.equals(parentWind)) {
                // Switch to child Wind saucedemo login window
                driver.switchTo().window(windowHandle);
                System.out.println("switched To Child Window id is : "+windowHandle);

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

                Thread.sleep(4000);
                // Assuming you have a wait to handle loading and next steps, you would perform further login steps here
                break;
            }
        }

        Thread.sleep(4000);
        driver.switchTo().window(parentWind);
        System.out.println("Switched to parent Window id "+ parentWind);
        WebElement puser = driver.findElement(By.xpath("//input[@placeholder='Username']"));
        WaitUtil.waitUntileClickable(puser);
        puser.sendKeys("Admin");
        Thread.sleep(2000);

        WebElement ppassword = driver.findElement(By.xpath("//input[@placeholder='Password']"));
        WaitUtil.waitUntileClickable(ppassword);
        ppassword.sendKeys("admin123");
        Thread.sleep(2000);

        WebElement ploginBtn = driver.findElement(By.xpath("//button[normalize-space()='Login']"));
        WaitUtil.waitUntileClickable(ploginBtn);
        ploginBtn.click();
        Thread.sleep(2000);

        System.out.println("Switched back to Parent Window");

        /*

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

        */

    }
    }
