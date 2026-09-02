package com.selenium.A1_seleniumInterviewEx;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ThreadLocal_Parallel_Example {

    // 1. Declare the ThreadLocal WebDriver container
    private static final ThreadLocal<WebDriver> driverThreadLocal = new ThreadLocal<>();

    @BeforeMethod
    public void setUp(){

        // 2. Initialize a new ChromeDriver instance for the current thread
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // 3. Store the instance inside the ThreadLocal container
        driverThreadLocal.set(driver);
    }

    // 4. Create a public getter to access the driver instance safely
    public static WebDriver getDriver() {
        return driverThreadLocal.get();
    }

    @AfterMethod
    public void tearDown() {
        // 5. Retrieve the thread-specific driver instance and close it
        if (getDriver() != null) {
            getDriver().quit();
        }
        // 6. Prevent memory leaks by removing the reference from the current thread
        driverThreadLocal.remove();
    }

    @Test
    public void Test_1() {
        // Use getDriver() to launch the application
        getDriver().get("https://www.google.com");
        System.out.println("Thread 1 Title: " + getDriver().getTitle());
    }

    @Test
    public void Test_2() {
        // Use getDriver() to launch the application
        getDriver().get("https://www.saucedemo.com/");
        System.out.println("Thread 2 Title: " + getDriver().getTitle());
    }

    @Test
    public void Test_3() {
        // Use getDriver() to launch the application
        getDriver().navigate().to("https://www.selenium.dev");
        System.out.println("Thread 3 Title: " + getDriver().getTitle());
    }
        public static void main(String[] args){

        }
    }