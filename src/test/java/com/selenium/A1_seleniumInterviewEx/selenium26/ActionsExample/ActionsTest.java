package com.selenium.A1_seleniumInterviewEx.selenium26.ActionsExample;

import com.selenium.A1_seleniumInterviewEx.selenium26.base.TestBase;
import com.selenium.A1_seleniumInterviewEx.selenium26.util.WaitUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.time.Duration;

public class ActionsTest extends TestBase {


    @Test(enabled = false)
    public static void actionsMethods(){
        WebElement sourceElement = driver.findElement(By.id("id"));
        WebElement destinationElement = driver.findElement(By.id("id"));
        Actions actions = new Actions(driver);

        actions.click();

        actions.moveToElement(destinationElement);

        actions.pause(Duration.ofSeconds(10));

        actions.click(destinationElement);

        actions.dragAndDrop(sourceElement, destinationElement);

        actions.doubleClick().build().perform();

        actions.contextClick(sourceElement);

        actions.clickAndHold(sourceElement).moveToElement(destinationElement).release().build().perform();
    }

    @Test(enabled = false)
    public void clickAction(){
        driver.get("https://www.saucedemo.com/");
        Actions actions = new Actions(driver);
        WebElement user = driver.findElement(By.id("user-name"));
        WaitUtil.waitUntileClickable(user);
        user.sendKeys("standard_user");

        WebElement password = driver.findElement(By.id("password"));
        WaitUtil.waitUntileClickable(password);
        password.sendKeys("secret_sauce");

        WebElement loginBtn = driver.findElement(By.id("login-button"));
        WaitUtil.waitUntileClickable(loginBtn);
        actions.pause(Duration.ofSeconds(6));
        actions.moveToElement(loginBtn).click();
    }
    @Test(enabled = false)
    public void HoverActionTest(){
        driver.get("https://www.saucedemo.com/");
        Actions actions = new Actions(driver);
        WebElement user = driver.findElement(By.id("user-name"));
        WaitUtil.waitUntileClickable(user);
        user.sendKeys("standard_user");

        WebElement password = driver.findElement(By.id("password"));
        WaitUtil.waitUntileClickable(password);
        password.sendKeys("secret_sauce");

        WebElement loginBtn = driver.findElement(By.id("login-button"));
        WaitUtil.waitUntileClickable(loginBtn);
        loginBtn.click();

        WebElement filterDD = driver.findElement(By.cssSelector(".product_sort_container"));
        WaitUtil.waitUntileClickable(filterDD);
        actions.moveToElement(filterDD).build().perform();

        WebElement optionValue = driver.findElement(By.xpath("//option[@value='lohi']"));
        System.out.println(STR."Sort optionValue : \{optionValue.isDisplayed()}");
        System.out.println(STR."Option Value : \{optionValue.getText()}");
    }

    @Test(enabled = false)
    public void doubleClickAction(){
        driver.get("https://www.saucedemo.com/");
        Actions actions = new Actions(driver);
        WebElement user = driver.findElement(By.id("user-name"));
        WaitUtil.waitUntileClickable(user);
        user.sendKeys("standard_user");

        WebElement password = driver.findElement(By.id("password"));
        WaitUtil.waitUntileClickable(password);
        password.sendKeys("secret_sauce");

        WebElement loginBtn = driver.findElement(By.id("login-button"));
        WaitUtil.waitUntileClickable(loginBtn);

        actions.doubleClick(loginBtn).build().perform();
        String title = driver.getTitle();
        System.out.println(title);

    }

    @Test(enabled = true)
    public void contextClickAction() throws InterruptedException {
        driver.get("https://www.saucedemo.com/");
        Actions actions = new Actions(driver);
        WebElement user = driver.findElement(By.id("user-name"));
        WaitUtil.waitUntileClickable(user);
        actions.contextClick(user).build().perform();
        Thread.sleep(2000);
    }


}
