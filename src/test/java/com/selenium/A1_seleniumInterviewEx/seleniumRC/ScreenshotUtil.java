package com.selenium.A1_seleniumInterviewEx;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.io.IOException;

public class ScreenshotUtil {
    public static void main(String[] args) throws IOException {

        ChromeOptions options = new ChromeOptions();
        String browserName =   options.getBrowserName();
        WebDriver driver = new ChromeDriver(options);
        driver.navigate().to("https://www.selenium.dev");
        System.out.println("Title  - "+driver.getTitle());
        //System.out.println("  - "+);

        // screenshot

        TakesScreenshot screenshot = (TakesScreenshot)driver;

        //File file = (FileUtils.copyFile(screenshot.getScreenshotAs(OutputType.FILE), new File(System.getProperty("user.dir")+".png"))));



        TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        String path = System.getProperty("user.dir") + "/screenshots/" + ".png";
        FileUtils.copyFile(source, new File(path));

        JavascriptExecutor javascriptExecutor = (JavascriptExecutor)driver;
        javascriptExecutor.executeScript("arguments[0].click();", args);
        javascriptExecutor.executeScript("window.scrollBy(0, 500)");

        TakesScreenshot screenshot1 = (TakesScreenshot)driver;
        File file1 = screenshot1.getScreenshotAs(OutputType.FILE);
        //String path1 = System.getProperty("user.dir")+"/screenshot/"+".png";
        FileUtils.copyFile(file1, new File(System.getProperty("user.dir")+"/screenshot/"+".png"));



    }
}
