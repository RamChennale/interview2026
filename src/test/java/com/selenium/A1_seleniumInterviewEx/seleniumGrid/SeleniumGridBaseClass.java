package com.selenium.A1_seleniumInterviewEx.seleniumGrid;

import java.io.FileReader;
import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.time.Duration;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

/**
 * Base class for all tests.
 *  - Reads execution_env (local | remote), grid_url, appURL, headless from config.properties
 *  - Reads os and browser from testng.xml parameters
 *  - Starts a fresh browser before each test and quits it after each test
 *  - ThreadLocal driver => safe for parallel execution
 */
public class SeleniumGridBaseClass {

    private static final ThreadLocal<WebDriver> DRIVER = new ThreadLocal<>();

    public Logger logger;
    public Properties p;

    /** Use this in tests / page objects instead of a shared static driver. */
    public static WebDriver getDriver() {
        return DRIVER.get();
    }

    @BeforeMethod(alwaysRun = true)
    @Parameters({"os", "browser"})
    public void setup(@Optional("windows") String os, @Optional("chrome") String br) throws IOException {

        // 1. Load config.properties
        try (FileReader file = new FileReader("./src/test/resources/seleniumGridConfig.properties")) {
            p = new Properties();
            p.load(file);
        }

        // 2. Log4j2
        logger = LogManager.getLogger(this.getClass());

        String env = p.getProperty("execution_env", "local");
        boolean headless = Boolean.parseBoolean(p.getProperty("headless", "false"));

        WebDriver driver;
        if (env.equalsIgnoreCase("remote")) {
            driver = createRemoteDriver(os, br, headless);
        } else {
            driver = createLocalDriver(br, headless);
        }
        DRIVER.set(driver);

        // 3. Common browser setup
        getDriver().manage().deleteAllCookies();
        getDriver().manage().window().maximize();
        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(
                Long.parseLong(p.getProperty("implicit_wait", "10"))));

        getDriver().get(p.getProperty("appURL"));
        logger.info("Started {} on {} ({})", br, os, env);
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        WebDriver driver = getDriver();
        if (driver != null) {
            driver.quit();
            DRIVER.remove();   // important with ThreadLocal
            logger.info("Browser closed");
        }
    }

    // remote

    private WebDriver createRemoteDriver(String os, String br, boolean headless) throws IOException {

        MutableCapabilities options;

        // browser
        switch (br.toLowerCase()) {
            case "chrome":
                ChromeOptions co = new ChromeOptions();
                if (headless) co.addArguments("--headless=new");
                options = co;
                break;
            case "edge":
                EdgeOptions eo = new EdgeOptions();
                if (headless) eo.addArguments("--headless=new");
                options = eo;
                break;
            case "firefox":
                FirefoxOptions fo = new FirefoxOptions();
                if (headless) fo.addArguments("-headless");
                options = fo;
                break;
            default:
                throw new IllegalArgumentException("No matching browser: " + br);
        }

        // os / platform
        switch (os.toLowerCase()) {
            case "windows":
                options.setCapability(CapabilityType.PLATFORM_NAME, Platform.WINDOWS);
                break;
            case "mac":
                options.setCapability(CapabilityType.PLATFORM_NAME, Platform.MAC);
                break;
            case "linux":
                options.setCapability(CapabilityType.PLATFORM_NAME, Platform.LINUX);
                break;
            default:
                throw new IllegalArgumentException("No matching os: " + os);
        }

        URL gridUrl =  URI.create(p.getProperty("grid_url").trim()).toURL();
        return new RemoteWebDriver(gridUrl, options);
    }

    // local

    private WebDriver createLocalDriver(String br, boolean headless) {
        switch (br.toLowerCase()) {
            case "chrome":
                ChromeOptions co = new ChromeOptions();
                if (headless) co.addArguments("--headless=new");
                return new ChromeDriver(co);
            case "edge":
                EdgeOptions eo = new EdgeOptions();
                if (headless) eo.addArguments("--headless=new");
                return new EdgeDriver(eo);
            case "firefox":
                FirefoxOptions fo = new FirefoxOptions();
                if (headless) fo.addArguments("-headless");
                return new FirefoxDriver(fo);
            default:
                throw new IllegalArgumentException("No matching browser: " + br);
        }
    }
}