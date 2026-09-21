package com.selenium.A1_seleniumInterviewEx.seleniumNaveen.locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LocatorsExample {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
/*
        ID: Locates an element using its unique id attribute. This is the fastest and most reliable locator.

        Name: Finds elements based on their name attribute, which is commonly used in form fields.

        Class Name: Identifies elements using their class attribute. It is useful for targeting groups of styled elements.

        Tag Name: Finds elements by their HTML tag (e.g., <a>, <h1>, <input>).

        Link Text: Matches hyperlinks (<a> tags) by their exact visible text.

        Partial Link Text: Matches hyperlinks by a partial substring of their visible text.

        CSS Selector: Uses CSS rules to target elements. It is highly efficient and faster than XPath in most browsers.

        XPath: Navigates the HTML DOM (Document Object Model) structure to locate elements using paths and attributes


         */

        driver.quit();
    }
}
