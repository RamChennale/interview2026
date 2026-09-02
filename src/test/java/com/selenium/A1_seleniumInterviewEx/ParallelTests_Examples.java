package com.selenium.A1_seleniumInterviewEx;
import org.testng.annotations.Test;
public class ParallelTests_Examples  extends BaseTest_ThreadLocal{

        @Test
        public void launchApplicationOne() {
            // Use getDriver() to launch the application
            getDriver().get("https://www.google.com");
            System.out.println("Thread 1 Title: " + getDriver().getTitle());
        }

        @Test
        public void launchApplicationTwo() {
            // A separate thread will open this URL simultaneously without interference
            getDriver().get("https://www.bing.com");
            System.out.println("Thread 2 Title: " + getDriver().getTitle());
        }
    }


