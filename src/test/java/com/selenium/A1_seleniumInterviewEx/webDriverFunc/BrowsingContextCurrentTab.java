package com.selenium.A1_seleniumInterviewEx.webDriverFunc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.bidi.browsingcontext.BrowsingContext;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class BrowsingContextCurrentTab {
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
        System.out.println("Current tab/window by getWindowHandle:  " + driver.getWindowHandle());
        Thread.sleep(2000);

        // get window handle id
        String windowID = driver.getWindowHandle();

        // open browsing context in new tab/window
        BrowsingContext bc = new BrowsingContext(driver, windowID);

        // obtain id of browsing context in new tab/window
        String text = bc.getId();
        System.out.println("Id of browsing context in new tab/window: " + text);
        System.out.println(" getCurrentUrl : " + driver.getCurrentUrl());

        // Quitting browser
        driver.quit();
    }
}