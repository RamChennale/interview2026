package com.selenium.A1_seleniumInterviewEx.selenium26.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;


public class DriverManager {

    static ThreadLocal<WebDriver> driverThreadLocal = new ThreadLocal<>();
    static WebDriver driver;

    public static WebDriver initDriver() {
        WebDriverManager.chromedriver().setup();

        /* options.setExperimentalOption("prefs", prefs); is used to inject custom user profile configurations into the Google Chrome browser session*/

        ChromeOptions options = new ChromeOptions();
        // Disable the password manager and data breach popup
        Map<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("credentials_enable_service", false);
        prefs.put("profile.password_manager_enabled", false);
        prefs.put("download.default_directory", "\"C:\\Users\\Ram_chennale\\Downloads\"");
        options.setExperimentalOption("prefs", prefs);


        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driverThreadLocal.set(driver);
        return driver;
        /*WebDriver getDriver () {
            driverThreadLocal.set(driver);
            return driver;
        }*/
    }
}
