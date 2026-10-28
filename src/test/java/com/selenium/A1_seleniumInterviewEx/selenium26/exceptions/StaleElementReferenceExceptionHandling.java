package com.selenium.A1_seleniumInterviewEx.selenium26.exceptions;

/*    Handle `StaleElementReferenceException` in a framework used by 50+ testers?
 **Answer:** Build a retry wrapper around element actions rather than asking every author to handle it individually.

 */

import com.selenium.A1_seleniumInterviewEx.selenium26.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class StaleElementReferenceExceptionHandling extends TestBase {


    @Test
    public void testStaleElementReferenceExceptionHandling() {
        driver.get("https://www.google.com/");
        By search = By.id("ti6dpd");
        driver.findElement(search).sendKeys("Selenium");
        // driver.close(); if no active driver throws -> org.openqa.selenium.NoSuchSessionException: invalid session id
        clickWithRetry(search);

    }

    public void clickWithRetry(By locator) {
        int attempts = 0;
        while (attempts < 3) {
            try {
                driver.findElement(locator).click();
                return;
            } catch (StaleElementReferenceException e) {
                attempts++;
            }
        }
        throw new FrameworkException("Element still stale after 3 retries: " + locator);
    }

    public void clickWithRetryExpMessage(By locator) {
        StaleElementReferenceException lastException = null;
        for (int attempt = 1; attempt <= 3; attempt++) {
            try {
                driver.findElement(locator).click();
                return;
            } catch (StaleElementReferenceException e) {
                lastException = e;
            }
        }
        throw new FrameworkException("Element still stale after 3 retries: " + locator, lastException);
    }

}
