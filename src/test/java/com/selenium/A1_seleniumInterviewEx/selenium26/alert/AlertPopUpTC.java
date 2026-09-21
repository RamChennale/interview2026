package com.selenium.A1_seleniumInterviewEx.selenium26.alert;

import com.selenium.A1_seleniumInterviewEx.selenium26.base.TestBase;
import com.selenium.A1_seleniumInterviewEx.selenium26.util.BrowserUtil;
import com.selenium.A1_seleniumInterviewEx.selenium26.util.WaitUtil;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertPopUpTC extends TestBase {

    Alert alert;

    @Test(enabled = false)
    public void alertAccept() {
        driver.get("https://demoqa.com/alerts");
        BrowserUtil.maximizeBrowser();
        WebElement alertElement = driver.findElement(By.cssSelector("#alertButton"));
        WaitUtil.waitUntileClickable(alertElement);
        alertElement.click();

        alert = driver.switchTo().alert();
        alert.accept();
    }

    @Test(enabled = false)
    public void cancelAlert()  {
        driver.get("https://demoqa.com/alerts");
        BrowserUtil.maximizeBrowser();

        WebElement alertElement = driver.findElement(By.id("confirmButton"));
        WaitUtil.waitUntileClickable(alertElement);
        alertElement.click();

        alert = driver.switchTo().alert();
        alert.dismiss();
        System.out.println("Alert cancelled");
    }

    @Test(enabled = false)
    public void waitForAlertClick() {
        driver.get("https://demoqa.com/alerts");
        BrowserUtil.maximizeBrowser();

        WebElement alertElement = driver.findElement(By.id("timerAlertButton"));
        WaitUtil.waitUntileClickable(alertElement);
        alertElement.click();

        WaitUtil.waitForAlert();
        alert = driver.switchTo().alert();
        alert.accept();
        System.out.println("Waited to appear alert and accepted");
    }

    @Test(enabled = true)
    public void sendInputOnAlert() {
        driver.get("https://demoqa.com/alerts");
        BrowserUtil.maximizeBrowser();

        WebElement alertElement = driver.findElement(By.id("promtButton"));
        WaitUtil.waitUntileClickable(alertElement);
        alertElement.click();

        alert = driver.switchTo().alert();
        alert.sendKeys("Ram");

        alert.accept();
        System.out.println("Waited to appear alert send message in alert prompt");
    }
}
