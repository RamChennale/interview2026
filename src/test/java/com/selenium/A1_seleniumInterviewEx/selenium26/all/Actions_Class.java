package com.selenium.A1_seleniumInterviewEx.selenium26.all;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class Actions_Class extends BaseTest_ThreadLocal{

    public static void maiin(String[] args){

        Actions actions = new Actions(getDriver());
        WebElement element = getDriver().findElement(By.id("1"));
        WebElement src = getDriver().findElement(By.id("1"));
        WebElement dest = getDriver().findElement(By.id("1"));

        actions.click();
        actions.build().perform();

        actions.clickAndHold(element).moveToElement(element);

        actions.contextClick().click(); //right click
        actions.contextClick(element).click();

        actions.doubleClick().click();

        actions.dragAndDrop(element,element);

        actions.pause(Duration.ofSeconds(10));

        actions.dragAndDrop(src, dest);
        actions.moveToElement(element).click();

    }

}
