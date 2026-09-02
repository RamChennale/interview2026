package com.selenium.A1.selenum4Features;
import com.selenium.utils.DriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.chrome.ChromeOptions;

import javax.print.DocFlavor;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

public class RemoteWebDriver_SeleniumGrid {
        public static void main(String[] args) {
            try {
                // Define browser options
                ChromeOptions options = new ChromeOptions();
                ChromeOptions options1 = new ChromeOptions();

                // cmd to start selenium GRID
                System.out.println("java -jar selenium-server-4.47.0.jar hub");

                // Point to the Hub URL
                URL gridUrl = URI.create("http://localhost:4444").toURL();
    URI.create("http://localhost:4444").toURL();

                // Create RemoteWebDriver instance
                WebDriver driver = new RemoteWebDriver(gridUrl, options);

                // Execute test steps
                driver.get("https://google.com");
                System.out.println("Page title is: " + driver.getTitle());

                // Close session
                driver.quit();
            } catch (Exception e) {
                e.printStackTrace();
            }


            UsingDesiredCapabilities();
        }

        public static void UsingDesiredCapabilities()  {

            try{
            WebDriverManager.chromedriver().setup();
            URL url = URI.create("http://localhost:4444").toURL();
            DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
            desiredCapabilities.setPlatform(Platform.WIN11);
            desiredCapabilities.setBrowserName("chrome");
            WebDriver driver = new RemoteWebDriver(url, desiredCapabilities);
            driver.get("https://google.com");
            System.out.println("Page title is: " + driver.getTitle());

            // Close session
            driver.quit();
        } catch (MalformedURLException e) {
             e.getMessage();
            }
    }
        }



