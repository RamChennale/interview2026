package com.selenium.A1_seleniumInterviewEx.selenium26.windowHandles;

import com.selenium.A1_seleniumInterviewEx.selenium26.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Set;

import static com.selenium.A1_seleniumInterviewEx.selenium26.base.DriverManager.wait;

public class MultBrowserTabWindows extends TestBase {

    @Test
    public void MultiBrowserTabWindows(){

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        // 1. Remember the parent (login) tab
        String parentHandle = driver.getWindowHandle();
        System.out.println("Parent WINDOW/TAB : "+parentHandle);

        // 2. Click the "OrangeHRM, Inc" link -> opens a new child tab/window
        wait.until(ExpectedConditions.elementToBeClickable(By.linkText("OrangeHRM, Inc"))).click();

        String childTab = "";

        Set<String> allHandles = driver.getWindowHandles();
        for (String child : allHandles) {
            if (!child.equals(parentHandle)) {
                System.out.println("Child WINDOW/TAB: "+child);
                childTab=child;

                driver.switchTo().window(child);
                break;
            }
        }

        // 5. Close the new child tab if required or can leave and switch back to the parent tab
        //driver.close(); // if child tab Closed throws -> org.openqa.selenium.NoSuchWindowException: no such window
        driver.switchTo().window(parentHandle);

        // 6. Login on the parent tab
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username"))).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement(By.cssSelector("button[type='submit']")).click();

        //switching again to child window and verify the page
         driver.switchTo().window(childTab);

        String navText = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.id("navbarNav"))).getText();
        Assert.assertTrue(navText.contains("Solutions"),
                "Expected 'Solutions' in navbar but found: " + navText);
         
    }

    }


    /* 4. Validate content in the new tab
        String navText = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.id("navbarNav"))).getText();
        Assert.assertTrue(navText.contains("Solutions"),
                "Expected 'Solutions' in navbar but found: " + navText);


        // 7. Verify Dashboard
        String heading = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.cssSelector("h6.oxd-topbar-header-breadcrumb-module"))).getText();
        Assert.assertTrue(heading.contains("Dashboard"),
                "Expected 'Dashboard' heading but found: " + heading);

*/
