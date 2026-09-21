package com.selenium.A1_seleniumInterviewEx.selenium26.all;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class A_TestClass {

    public static void main(String[] args){

        ChromeOptions options = new ChromeOptions();
        String browserName =   options.getBrowserName();
        WebDriver driver = new ChromeDriver(options);
        driver.navigate().to("https://www.selenium.dev");
        System.out.println("Title  - "+driver.getTitle());
        //System.out.println("  - "+);

        // FUNCTIONS



    }
}
