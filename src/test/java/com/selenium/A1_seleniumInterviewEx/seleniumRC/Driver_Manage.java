package com.selenium.A1_seleniumInterviewEx;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class Driver_Manage {


    public static void main(String[] args) throws InterruptedException {

        ChromeOptions options = new ChromeOptions();
        String browserName =   options.getBrowserName();
        String browserVersion =   options.getBrowserVersion();

        WebDriver driver = new ChromeDriver(options);
        driver.navigate().to("https://www.selenium.dev");
        System.out.println("Title  - "+driver.getTitle()+browserName+ "  : "+browserVersion) ;
        //System.out.println("  - "+);

        driver.manage().timeouts();
        driver.manage().deleteAllCookies();
        driver.manage().window();
        Cookie cookie = new  Cookie(browserName, browserVersion);
        driver.manage().deleteCookie(cookie);
        driver.manage().deleteAllCookies();

        //driver.manage().window()  -----
        driver.manage().window().maximize();
        driver.manage().window().fullscreen();
        Point point = driver.manage().window().getPosition();
        driver.manage().window().minimize();
        boolean isEquals= driver.manage().window().equals(browserName);
        Dimension dimension =  driver.manage().window().getSize();


        driver.manage().deleteAllCookies();

        //driver.manage().timeouts(). -- TIMEOUT FOR THE SESSION
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(10));
        Duration duration= driver.manage().timeouts().getImplicitWaitTimeout();
        duration.wait(1000);

    }
}
