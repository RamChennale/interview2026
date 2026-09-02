package com.selenium.A1_seleniumInterviewEx.newORunknowtome;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ShadowDomSearchContextExample {
        public static void main(String[] args) {
            WebDriver driver = new ChromeDriver();
            driver.get("https://example.com");

            // 1. Locate the shadow host element
            WebElement shadowHost = driver.findElement(By.id("shadow-host-id"));

            // 2. Extract the SearchContext using getShadowRoot()
            SearchContext shadowRoot = shadowHost.getShadowRoot();

            // 3. Query the shadow root directly using findElement
            WebElement shadowContent = shadowRoot.findElement(By.cssSelector(".inside-shadow-class"));

            // 4. Interact with the element
            System.out.println("Text inside Shadow DOM: " + shadowContent.getText());

            driver.quit();
        }
    }

