package com.selenium.A1_seleniumInterviewEx.selenium26.POMframework;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;
import java.time.Duration;

public class BasePage_1 {

    protected final WebDriver driver;
    protected final WebDriverWait wait;

    public BasePage_1(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    protected WebElement waitVisible(By locator) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    protected WebElement waitClickable(By locator) {
        return wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    protected void enterInput(By locator, String text) {
        for (int attempt = 1; attempt <= 3; attempt++) {
            try {
                WebElement element = waitVisible(locator);
                element.clear();
                element.sendKeys(text);
                return;
            } catch (StaleElementReferenceException e) {
                if (attempt == 3) {
                    throw e;
                }
            }
        }
    }

    protected void click(By locator) {
        for (int attempt = 1; attempt <= 3; attempt++) {
            try {
                waitClickable(locator).click();
                return;
            } catch (StaleElementReferenceException e) {
                if (attempt == 3) {
                    throw e;
                }
            }
        }

    }

    protected String getText(By locator) {
        return waitVisible(locator).getText();
    }
}