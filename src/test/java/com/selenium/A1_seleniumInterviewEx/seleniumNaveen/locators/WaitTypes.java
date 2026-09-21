package com.selenium.A1_seleniumInterviewEx.seleniumNaveen.locators;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

public class WaitTypes {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();

        // Implicit Wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

        //we can also use Explicit Wait
        WebDriverWait  webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("AJAX")));
/*
        visibilityOfElementLocated – element is present and visible
        elementToBeClickable – element is visible and enabled
        presenceOfElementLocated – element exists in DOM (not necessarily visible)
        invisibilityOfElementLocated – useful for waiting until a loading spinner disappears
        textToBePresentInElement – wait for specific text to load
        stalenessOf – wait for an old element to be replaced (e.g., after a page/section refresh)
        numberOfElementsToBeMoreThan – wait for a dynamic list to populate*/


        // Fluent Wait here for specific elements if needed

        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(10))
                        .pollingEvery(Duration.ofSeconds(2))
                                .ignoring(NoSuchElementException.class);

           WebElement element =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ID")));

           Wait<WebDriver> wait1 = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class);
           WebElement element1 = wait1.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("id"))));

           //ja
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor)driver;

        driver.quit();
    }




    public static ExpectedCondition<Boolean> attributeContains(WebElement element, String attribute, String value) {
        return driver -> element.getAttribute(attribute).contains(value);
    }

    public static ExpectedCondition<Boolean> attributeContains1(WebElement element, String attribute, String value) {
        return new ExpectedCondition<Boolean>() {
            @Override
            public Boolean apply(WebDriver driver) {
                String actualAttributeValue = element.getAttribute(attribute);
                return actualAttributeValue.contains(value);
            }
        };
    }



}
