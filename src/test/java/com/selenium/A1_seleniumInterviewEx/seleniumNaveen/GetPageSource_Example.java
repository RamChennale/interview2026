package com.selenium.A1_seleniumInterviewEx.seleniumNaveen;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/*

Test Failure Diagnostics: When automated tests fail or a page crashes, saving the HTML source to a local file
        (alongside a screenshot) helps developers analyze the exact state of the application's layout at the exact
        moment of failure

1. Capturing Stale Elements During Fast RefreshesOn highly dynamic dashboards (like crypto trackers,
live sports feeds, or stock tickers), data updates multiple times per second. If Selenium tries to find an element,
wait for it, and then click it, the element often becomes "stale" or disappears, throwing an error.
Pulling the page source captures a frozen visual state of that millisecond, allowing for error-free parsing


2.   Automated CI/CD Triage and Bug ArtifactsWhen automated tests run inside headless Docker containers on a remote
        Jenkins or GitHub Actions server, you cannot physically see what went wrong when a test fails. If an assertion fails,
        the framework is programmed to instantly capture a screenshot and dump the driver.page_source into an artifact folder.
         Developers can download that HTML file locally, open it in a browser, inspect the layout, and
         figure out exactly why the backend failed to render an element.

*/


import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.charset.StandardCharsets;

public class GetPageSource_Example {
    public static void main(String[] args)throws IOException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        //File file =  new File("PageSource.txt");

        String pageSource = driver.getPageSource();
        System.out.println("Page source : "+ pageSource);

        // 1. Fetch the source code string
        String htmlSource = driver.getPageSource();

        // 2. Define the path and write the file using UTF-8 encoding
        String filePath = "debug_page_source.html";
        Files.write(Paths.get(filePath), htmlSource.getBytes(StandardCharsets.UTF_8));

        System.out.println("Page source successfully saved to: " + filePath);



        driver.quit();
    }

}
