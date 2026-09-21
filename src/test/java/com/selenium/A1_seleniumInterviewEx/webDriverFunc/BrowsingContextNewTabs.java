package com.selenium.A1_seleniumInterviewEx.webDriverFunc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.bidi.browsingcontext.BrowsingContext;
import org.openqa.selenium.bidi.browsingcontext.NavigationResult;
import org.openqa.selenium.bidi.browsingcontext.ReadinessState;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class BrowsingContextNewTabs {
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
        System.out.println("First Get URL 1:            " + driver.getCurrentUrl());
        System.out.println("First time Window tab ID :  " + driver.getWindowHandle());

Thread.sleep(2000);

        // open browsing context in new tab
        BrowsingContext bc = new BrowsingContext(driver, WindowType.TAB);

        // obtain id of browsing context in new tab
        String text = bc.getId();
        System.out.println("Id of browsing context in new tab: " + text);

        // navigate to new url in the new tab in readiness state
        NavigationResult i = bc.navigate("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login",
                ReadinessState.COMPLETE);
        Thread.sleep(2000);

        // get new URL opened in the new tab
        System.out.println("Get URL: 2  " + i.getUrl());

        // Quitting browser
        driver.quit();
    }
}