package com.selenium.A1_seleniumInterviewEx;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.time.Duration;

public class BaseTest_ThreadLocal {

     // 1. Declare the ThreadLocal WebDriver container
        private static final ThreadLocal<WebDriver> driverThreadLocal = new ThreadLocal<>();

        //@BeforeMethod
        @BeforeSuite
        public void setUp() {
            // 2. Initialize a new ChromeDriver instance for the current thread
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();

            //new code
            //PageFactory.initElements(driver, this);

            // 3. Store the instance inside the ThreadLocal container
            driverThreadLocal.set(driver);
            System.out.println(" STARTED  @BeforeSuite ");
        }

        // 4. Create a public getter to access the driver instance safely
        public static WebDriver getDriver() {
            return driverThreadLocal.get();
        }

        //@AfterMethod
        @AfterSuite
        public void tearDown() {
            // 5. Retrieve the thread-specific driver instance and close it
            if (getDriver() != null) {
                getDriver().quit();
            }
            // 6. Prevent memory leaks by removing the reference from the current thread
            System.out.println(" ENDED  @AfterSuite ");
            driverThreadLocal.remove();
        }


    }

