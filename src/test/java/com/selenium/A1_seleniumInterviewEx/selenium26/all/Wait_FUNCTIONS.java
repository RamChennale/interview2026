package com.selenium.A1_seleniumInterviewEx.selenium26.all;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.function.Function;

public class Wait_FUNCTIONS {
    public static void main(String[] args){

        ChromeOptions options = new ChromeOptions();
        String browserName =   options.getBrowserName();
        WebDriver driver = new ChromeDriver(options);
        driver.navigate().to("https://www.selenium.dev");
        System.out.println("Title  - "+driver.getTitle());
        //System.out.println("  - "+);
        WebElement element = driver.findElement(By.id("1"));

        // wait FUNCTIONS

        //1. implicitlyWait - global wait applied to driver session on the DOM
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //2. explicit wait to locator / condition
        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
        webDriverWait.until(ExpectedConditions.visibilityOf(element));
        webDriverWait.until(ExpectedConditions.elementToBeClickable(element));

        //3.Fluent Wait-Applies to a specific element, more customizable | Like explicit wait, but you can set **polling frequency** and ignore specific exceptions
        Wait<WebDriver> wait = new FluentWait<>(driver).
                withTimeout(Duration.ofSeconds(30)).
                pollingEvery(Duration.ofSeconds(10)).ignoring(NoSuchElementException.class);
        //WebElement element = fluentWait.until(d -> d.findElement(By.id("submit")));

        //Ex-1
        // Custom condition: keep polling until a row count stabilizes,
        // not just until a single element appears - useful for lists
        // that stream in over multiple AJAX pages.
        WebElement lastRow = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver d) {
                List<WebElement> rows = d.findElements(By.cssSelector("table#results tr"));
                if (rows.size() >= 10) {
                    return rows.get(rows.size() - 1);
                }
                return null; // FluentWait treats null as "condition not met, keep polling"
            }
        });

        //Ex-2
        WebElement element1 = wait.until(new Function<WebDriver, WebElement>() {
            @Override
            public WebElement apply(WebDriver webDriver) {
                return webDriver.findElement(By.id("1"));
            }
        });



    }
}
