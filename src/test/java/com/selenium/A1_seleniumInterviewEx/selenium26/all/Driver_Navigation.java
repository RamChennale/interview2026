package com.selenium.A1_seleniumInterviewEx.selenium26.all;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class Driver_Navigation {

    public static void main(String[] args) {

        ChromeOptions options = new ChromeOptions();
        String browserName =   options.getBrowserName();
        WebDriver driver = new ChromeDriver(options);
        WebDriver.Navigation navigation =  driver.navigate();
        navigation.to("https://www.selenium.dev");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();

        System.out.println("Title  - "+driver.getTitle());
        //System.out.println("  - "+);

        // FUNCTIONS     driver_navigate_FUNCTIONS

        navigation.back();

        navigation.refresh();

        navigation.forward();


        driver.quit();
    }

}
