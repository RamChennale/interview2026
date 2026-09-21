package com.selenium.A1_seleniumInterviewEx.webElementFunc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WebElement_AvailabilityCheck  {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        WebDriverWait webDriverWait = new WebDriverWait(driver,Duration.ofSeconds(5));

        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

        WebElement useName ;
        WebElement useName1 = driver.findElement(By.id("user-name"));


        //element is Present, Displayed, Enabled or Selected

        /*An expectation for checking that an element is present on the DOM of a page. This does not necessarily mean that the element is visible.
        Params:
        locator – used to find the element
        Returns:
        the WebElement once it is located
*/
        useName  = webDriverWait.until(ExpectedConditions.presenceOfElementLocated(By.id("user-name")));
        if(useName.isDisplayed())
            System.out.println("useName.isDisplayed()");

        if(useName.isEnabled())
            System.out.println("useName.isEnabled()");

        if(useName.isSelected())
            System.out.println("useName.isSelected()");

        useName = webDriverWait.until(ExpectedConditions.elementToBeClickable(By.id("user-name"))); //
        useName = webDriverWait.until(ExpectedConditions.elementToBeClickable(useName1)); // WebElement
        useName = webDriverWait.until(ExpectedConditions.visibilityOf(useName1));

        driver.quit();
    }


}
