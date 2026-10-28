package com.selenium.A1_seleniumInterviewEx.selenium26.exceptions;

import com.selenium.A1_seleniumInterviewEx.selenium26.POMframework.TestBase_1;
import com.selenium.A4_TestNG.pom_project1.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static com.selenium.A1_seleniumInterviewEx.selenium26.base.DriverManager.wait;

public class ElementClickInterceptedExceptionHandling extends TestBase_1 {

    protected void safeClick(By locator) {
        By overlay = By.cssSelector(".loading-overlay, .modal-backdrop");
        wait.until(ExpectedConditions.invisibilityOfElementLocated(overlay));

        WebElement el = wait.until(ExpectedConditions.elementToBeClickable(locator));
        try {
            el.click();
        } catch (ElementClickInterceptedException e) {
            ((JavascriptExecutor) driver)
                    .executeScript("arguments[0].scrollIntoView({block:'center'});", el);
            wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
        }
    }
}

