package com.selenium.A1_seleniumInterviewEx;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.List;
import java.util.Set;

public class Driver_fun_get {

    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();
        WebDriver.Navigation navigation =  driver.navigate();
        navigation.to("https://www.selenium.dev");

        System.out.println("Title  - "+driver.getTitle());
        //System.out.println("  - "+);

        // FUNCTIONS     driver_navigate_FUNCTIONS

        driver.manage();

        //driver.quit();

        //driver.get("https://www.selenium.dev");

        driver.navigate();

        driver.switchTo();

        String windowID =    driver.getWindowHandle();

        Set<String> windowListID = driver.getWindowHandles();

        String getTitle =  driver.getTitle();
        WebElement element = driver.findElement(By.id("1"));


        List<WebElement> webElementList = driver.findElements(By.id("1"));

        driver.close();

        String getCurrentUrl = driver.getCurrentUrl();

        String getPageSource = driver.getPageSource();

    }

}
