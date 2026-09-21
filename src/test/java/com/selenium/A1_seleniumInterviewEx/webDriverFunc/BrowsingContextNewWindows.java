package com.selenium.A1_seleniumInterviewEx.webDriverFunc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.bidi.browsingcontext.BrowsingContext;
import org.openqa.selenium.bidi.browsingcontext.NavigationResult;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class BrowsingContextNewWindows {

    public static void main(String[] args) throws InterruptedException {

        // object of ChromeOptions
        ChromeOptions opt = new ChromeOptions();
        opt.setCapability("webSocketUrl", true);

        // Initiate the Webdriver
        WebDriver driver = new ChromeDriver(opt);

        // adding implicit wait of 15 secs
        driver.manage().timeouts().implicitlyWait( Duration.ofSeconds(30));

        // launching a browser and open a URL
        driver.get("https://www.tutorialspoint.com/selenium/practice/check-box.php");
        System.out.println("First getCurrentUrl   : "+driver.getCurrentUrl() );
        System.out.println("First getWindowHandle : "+driver.getWindowHandle() );
        Thread.sleep(3000);
        System.out.println("  ");
        System.out.println("  ");
        // open browsing context in new window
        BrowsingContext bc = new BrowsingContext(driver, WindowType.WINDOW);

        // obtain id of browsing context in new window
        String text = bc.getId();
        System.out.println("Id of browsing context in new window: " + text);

        // navigate to new url in the new window
        NavigationResult i = bc.navigate("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(3000);
        // get new URL opened in the new window
        System.out.println("NEW  getUrlGet URL:                  " + i.getUrl());

        // Quitting browser
        driver.quit();
    }
}