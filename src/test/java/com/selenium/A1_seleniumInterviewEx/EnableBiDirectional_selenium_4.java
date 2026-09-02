package com.selenium.A1_seleniumInterviewEx;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.bidi.log.ConsoleLogEntry;
import org.openqa.selenium.bidi.module.LogInspector;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.NetworkInterceptor;
import org.openqa.selenium.remote.http.Contents;
import org.openqa.selenium.remote.http.HttpResponse;
import org.openqa.selenium.remote.http.Route;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.logging.HasLogEvents;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/*WebDriver BiDi keeps the standardization of WebDriver and adds the event streaming of CDP.
It runs over a WebSocket, supports subscriptions to event types,
and is being implemented natively by browser vendors as a W3C specification.
The result is the best of both worlds: a cross-browser, standardized, bidirectional protocol.

* */

public class EnableBiDirectional_selenium_4 {

    public static void main(String[] args) {


        ChromeOptions options = new ChromeOptions();
        // Ask the browser to expose a BiDi WebSocket endpoint
        options.setCapability("webSocketUrl", true);
        // Selenium 4.x convenience equivalent:
        options.enableBiDi();

        WebDriver driver = new ChromeDriver(options);
        try {
            driver.get("https://www.selenium.dev");
            System.out.println("BiDi session active: " + driver.getTitle());

            // Capturing Console Logs With BiDi
            LogInspector logInspector = new LogInspector(driver);
            List<ConsoleLogEntry> entries = new CopyOnWriteArrayList<>();

            logInspector.onConsoleEntry(entries::add);

            // trigger logs in the app under test, then assert
            for (ConsoleLogEntry entry : entries) {
                System.out.println(entry.getLevel() + ": " + entry.getText());
                JavascriptExecutor javascriptExecutor = (JavascriptExecutor)driver;

            }

        } finally {
            driver.quit();
        }

        //1. Network Interception
// 1. Define the interception rule (Route)
        Route interceptorRule = Route.matching(req -> req.getUri().contains("analytics"))
                .to(() -> req -> new HttpResponse()
                        .setStatus(200)
                        .setContent(Contents.asJson("{\"status\":\"mocked\"}")));

// 2. Start the interceptor
        try (NetworkInterceptor interceptor = new NetworkInterceptor(driver, interceptorRule)) {
            // 3. Navigate to your application
            driver.get("https://example.com");
            // Any request to "analytics" will now return the mocked 200 response
        }


        // 2.Console Logging Interception
// 1. Cast the driver to HasLogEvents
        HasLogEvents logger = (HasLogEvents) driver;

// 2. Register a listener for console events
      /*  logger.onLogEvent(ConsoleEvent.listener(event -> {
            System.out.println("--- Browser Log Caught ---");
            System.out.println("Message: " + event.getMessages());
            System.out.println("Type: " + event.getType()); // e.g., error, warning, info
            System.out.println("Timestamp: " + event.getTimestamp());
        }));*/

// 3. Navigate and trigger logs
        driver.get("https://example.com");

    }
}

