package com.selenium.A1_seleniumInterviewEx.webDriverFunc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.bidi.module.Network;
import org.openqa.selenium.bidi.browsingcontext.BrowsingContext;
import org.openqa.selenium.bidi.browsingcontext.ReadinessState;

import java.util.concurrent.atomic.AtomicInteger;


public class BiDi_NetworkLoggingExample {

        public static void main(String[] args) {
            ChromeOptions options = new ChromeOptions();
            options.setCapability("webSocketUrl", true);

 //           options.setCapability("webSicketUrl", true);

            WebDriver driver = new ChromeDriver(options);
            Network network = new Network(driver);

            AtomicInteger failedRequests = new AtomicInteger(0);

            // Listen for every response the browser receives
            network.onResponseCompleted(responseDetails -> {
                String url = responseDetails.getResponseData().getUrl();
                int status = responseDetails.getResponseData().getStatus();

                System.out.printf("[%d] %s%n", status, url);

                if (status >= 400) {
                    failedRequests.incrementAndGet();
                    System.out.println("  ⚠ Failed request detected: " + url);
                }
            });

            // Optionally listen for requests before they're sent (e.g. to check headers/payload)
            network.onBeforeRequestSent(request -> {
                System.out.println("Request sent: " + request.getRequest().getMethod()
                        + " " + request.getRequest().getUrl());
            });

            BrowsingContext context = new BrowsingContext(driver, driver.getWindowHandle());
            context.navigate("https://www.tutorialspoint.com/selenium/selenium_webdriver_browsing_context.htm", ReadinessState.COMPLETE);

            // Run through your test flow — clicks, form submits, etc.
            driver.findElement(org.openqa.selenium.By.id("load-widgets")).click();

            // Assert no API calls failed during the flow
            if (failedRequests.get() > 0) {
                throw new AssertionError(failedRequests.get() + " network requests failed during test");
            }

            driver.quit();
        }

}
