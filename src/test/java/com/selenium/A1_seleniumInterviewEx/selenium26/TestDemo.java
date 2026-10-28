package com.selenium.A1_seleniumInterviewEx.selenium26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestDemo {

    WebDriver driver;
    WebDriverWait wait;

    @BeforeTest(enabled = false)
    public void setUp(){
        driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://www.saucedemo.com/");
        //driver.manage().window().minimize();
    }
    @Test(priority = 1, enabled = false)
    public void testDemo(){
        WebElement un =  driver.findElement(By.id("user-name"));
        un.sendKeys("standard_user");

        WebElement pwd =  driver.findElement(By.id("password"));
        pwd.sendKeys("secret_sauce");

        WebElement login =  driver.findElement(By.id("login-button"));
        login.click();
        driver.manage().window().minimize();
    }

    @AfterTest(enabled = false)
    public void afterTestDemo(){
        driver.quit();
    }

    @Test(priority = 2, enabled = false)
    public void reverseArray(){
        int [] arr = {1,2,3,4,5};
        System.out.println("Array length for 5 elements : " + arr.length);
        //System.out.println("Before rev : " + arr[]));

        for (int i =arr.length-1; i>=0; i--){
            System.out.print("" + arr[i] + ", ");
        }
    }

    @Test(priority = 3, enabled = true)
    public void stringImmutabilityCheck(){

        String name = "Ram";
        name.concat("chennale");
        System.out.println("After concat String name : " + name);

        System.out.println("");

        StringBuffer stringBuffer = new StringBuffer("Ram");
        stringBuffer.append("chennale");
        System.out.println("After concat  : " + stringBuffer);

    }

}
