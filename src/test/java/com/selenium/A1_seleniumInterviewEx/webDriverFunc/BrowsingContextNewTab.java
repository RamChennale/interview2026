package com.selenium.A1_seleniumInterviewEx.webDriverFunc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.bidi.browsingcontext.BrowsingContext;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class BrowsingContextNewTab {
    public static void main(String[] args) throws InterruptedException {

        // object of ChromeOptions
        ChromeOptions opt = new ChromeOptions();
        opt.setCapability("webSocketUrl", true);

        // Initiate the Webdriver
        WebDriver driver = new ChromeDriver(opt);

        // adding implicit wait of 15 secs
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // launching a browser and open a URL
        driver.get("https://www.tutorialspoint.com/selenium/practice/check-box.php");

        // get window handle id
        String windowID = driver.getWindowHandle();

        // open browsing context in new tab/window
        BrowsingContext bc = new BrowsingContext(driver, windowID);

        // obtain id of browsing context in new tab/window
        String text = bc.getId();
        System.out.println("Id of browsing context in new tab/window: " + text);

        // Quitting browser
        driver.quit();
    }
}