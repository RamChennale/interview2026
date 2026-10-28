package com.selenium.A1_seleniumInterviewEx.selenium26.crossBrowser;
/*
Add the Test in TestNG.xml
<class name="com.selenium.A1_seleniumInterviewEx.selenium26.crossBrowser.CrossBrowserHeadlessDriverFactory"/>

For CI (headless):
C:\at-practice-26\selenium-api-interview-26> mvn test -Dheadless=false
mvn test -Dheadless=true
mvn test -Dheadless=false
*/


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;


public class CrossBrowserHeadlessDriverFactory {

    private static final ThreadLocal<WebDriver> webDriverThreadLocal = new ThreadLocal<>();

    public static WebDriver createDriver(String browser, boolean headless) {
        WebDriver driver;

        if (browser.equalsIgnoreCase("chrome")) {
            ChromeOptions chromeOptions = new ChromeOptions();
            if (headless) chromeOptions.addArguments("--headless=new", "--window-size=1920,1080");
            if (System.getProperty("docker") != null)
                chromeOptions.addArguments("--no-sandbox", "--disable-dev-shm-usage");

            driver = new ChromeDriver(chromeOptions);
        } else if (browser.equalsIgnoreCase("firefox")) {

            FirefoxOptions o = new FirefoxOptions();
            if (headless) o.addArguments("-headless", "--width=1920", "--height=1080");


            driver = new FirefoxDriver(o);
        } else if (browser.equalsIgnoreCase("edge")) {
            EdgeOptions o = new EdgeOptions();
            if (headless) o.addArguments("--headless=new", "--window-size=1920,1080");

            driver = new EdgeDriver(o);
        } else {
            throw new IllegalArgumentException("Unsupported browser: " + browser);
        }
        if (!headless) driver.manage().window().maximize();
        return driver;
    }

    //approach-1
    @DataProvider(name = "browsers")
    public Object[][] browsers() {
        boolean headless = Boolean.parseBoolean(System.getProperty("headless", "false"));
        return new Object[][] { {"chrome", headless}, {"firefox",headless}, {"edge",headless} };
    }

    @Test(dataProvider = "browsers")
    public void testCrossBrowser(String browser, boolean headless){
        WebDriver driver = createDriver(browser, headless);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username"))).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement(By.cssSelector("button[type='submit']")).click();

        String heading = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.cssSelector("h6.oxd-topbar-header-breadcrumb-module"))).getText();
        Assert.assertTrue(heading.contains("Dashboard"),
                "Expected 'Dashboard' heading but found: " + heading);

        driver.quit();
    }
}


/*Your code already runs headed by default. System.getProperty("headless", "false") returns false when the property isn’t set, so no headless arguments are added and the browsers open visibly.

How to run headed

From IntelliJ (clicking the green run icon):

Run it with no VM options. If you previously added -Dheadless=true in Run → Edit Configurations → VM options, remove it, or change it to -Dheadless=false.

From Maven:

bash
mvn test -Dheadless=false
# or simply
mvn test

For CI (headless):

bash
mvn test -Dheadless=true*/