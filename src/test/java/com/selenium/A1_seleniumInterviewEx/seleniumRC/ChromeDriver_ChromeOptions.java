package com.selenium.A1_seleniumInterviewEx;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeDriver_ChromeOptions {

    public static void main(String[] args) {

        ChromeOptions options = new ChromeOptions();
        options.enableBiDi();
        String browserName = options.getBrowserName();

        String browserVersion = options.getBrowserVersion();

        options.addArguments("--start-maximized");
        options.addArguments("--disable-notifications");
        options.addArguments("--headless=new");


        WebDriver driver = new ChromeDriver(options);

        driver.navigate().to("https://www.selenium.dev");
        System.out.println("Title  - " + driver.getTitle());

        //System.out.println("  - "+);

        System.out.println(" browserName - " + browserName);

        System.out.println(" browserVersion - " + browserVersion);

    }
}
