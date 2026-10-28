package com.selenium.A1_seleniumInterviewEx.selenium26.waitUtil;

import com.selenium.A1_seleniumInterviewEx.selenium26.base.TestBase;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

import java.time.Duration;

public class WaitUtils extends TestBase {

    private static final int DefaultTimeOut = 30;

    public WaitUtils() {
        // no-arg constructor, needed by TestNG, we need to add no-arg constructor explicitly, if adding arg constructor in a class

    }

    public WaitUtils(WebDriver driver){
        TestBase.driver = driver;
    }

    @Test
    public void testWait() {
        driver.get("https://www.google.com/");
        WebElement search = waitForClickable(By.id("ti6dpd"));
        search.sendKeys("selenium");
        search.click();
    }

    public WebElement waitForClickable(By locator){

        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(DefaultTimeOut))
                .pollingEvery(Duration.ofMillis(200))
                .ignoring(NoSuchElementException.class)
                .ignoring(StaleElementReferenceException.class);
        return wait.until(ExpectedConditions.elementToBeClickable(locator));

































    }

}
