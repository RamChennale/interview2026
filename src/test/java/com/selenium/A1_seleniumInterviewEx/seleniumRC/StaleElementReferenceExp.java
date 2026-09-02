package com.selenium.A1_seleniumInterviewEx;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class StaleElementReferenceExp {
    public static void main(String[] args ) {

        String url = "https://www.google.com/";
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(20));


        // driver.get(url); // returns void,part of WebDriver
        WebDriver.Navigation navigation = driver.navigate(); // returns Navigation interface to track history
        //navigation.back(); navigation.forward(); navigation.refresh();
        navigation.to(url);
        driver.manage().window().maximize();

        //1- first way
        WebElement element = webDriverWait.until(ExpectedConditions.presenceOfElementLocated((By.id("1"))));
        element.click();

        //2-way
        WebElement element2;
        try {
            element2 = driver.findElement((By.id("1")));
        } catch (StaleElementReferenceException e) {
            // Retry locating and clicking the element
            element2 = driver.findElement((By.id("1")));
            System.out.println(e.getMessage());

        }
        //3-way
        // Refresh the page before locating the element
        driver.navigate().refresh();
        // Locate and click the element
        WebElement element3 = driver.findElement(By.id("1"));


    }
}
