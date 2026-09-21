package com.selenium.A1_seleniumInterviewEx.selenium26.javaScriptExe;

import com.selenium.A1_seleniumInterviewEx.selenium26.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class DatePickerSetAttributeJS extends TestBase {

    @Test
    public void datePickerSetAttributeJS() throws Exception {
        driver.get("https://www.spicejet.com/");
        WebElement elementDatePicker = driver.findElement(By.cssSelector("div[class='css-1dbjc4n r-18u37iz'] div[class='css-1dbjc4n r-14lw9ot r-11u4nky r-z2wwpe r-1phboty r-rs99b7 r-1loqt21 r-13awgt0 r-ymttw5 r-5njf8e r-1otgn73'] div[class='css-1dbjc4n'] svg"));
        Thread.sleep(5000);
        elementDatePicker.click();
        datePickerJavaScript(driver, elementDatePicker, "22-03-2020");
        Thread.sleep(2000);
        WebElement datePicked = driver.findElement(By.xpath("//div[normalize-space()='Departure Date']/following-sibling::div[1]"));
        System.out.println("Picked DATE  " +datePicked.getText());

    }

    public static void datePickerJavaScript(WebDriver driver, WebElement element, String dateValue) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].setAttribute('value','" + dateValue + "');", element);

        /*
         * dateValue + "')"::
         * org.openqa.selenium.WebDriverException: unknown error: Runtime.evaluate threw
         * exception: SyntaxError: missing ) after argument list
         */
    }

}
