package com.selenium.A1_seleniumInterviewEx.selenium26.exceptions;


import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.function.Supplier;

public class StaleElementReferenceException_1 {
    protected WebDriver driver;
    protected WebDriverWait wait;

    public StaleElementReferenceException_1(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    // Approach 1: re-locate with refreshed wait
    protected void clickWithRefresh(By locator) {
        wait.until(ExpectedConditions.refreshed(
                        ExpectedConditions.elementToBeClickable(locator)))
                .click();
    }

    // Approach 2: retry wrapper
    protected void clickWithRetry(By locator) {
        int attempts = 0;
        while (attempts < 3) {
            try {
                wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
                return;
            } catch (StaleElementReferenceException e) {
                attempts++;
                if (attempts == 3) throw e;
            }
        }
    }

    // Approach 3: generic reusable retry
    protected <T> T retryOnStale(Supplier<T> action) {
        for (int i = 0; i < 3; i++) {
            try {
                return action.get();
            } catch (StaleElementReferenceException e) {
                if (i == 2) throw e;
            }
        }
        return null;
    }
}


/**
 *
 * wait.until(ExpectedConditions.refreshed(
 *                         ExpectedConditions.elementToBeClickable(locator)))
 *                 .click();
 *      refreshed() - explanation
 * Wrapper for a condition, which allows for elements to update by redrawing.
 *
 * <p>This works around the problem of conditions which have two parts: find an element and then
 * check for some condition on it. For these conditions it is possible that an element is located
 * and then subsequently it is redrawn on the client. When this happens a {@link
 * StaleElementReferenceException} is thrown when the second part of the condition is checked.
 *
 * @param condition ExpectedCondition to wrap
 * @param <T> return type of the condition provided
 * @return the result of the provided condition
 */