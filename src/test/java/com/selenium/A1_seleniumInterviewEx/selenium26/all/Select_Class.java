package com.selenium.A1_seleniumInterviewEx.selenium26.all;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class Select_Class extends  BaseTest_ThreadLocal{
    @Test
    public void test(){
        Alert alert =  getDriver().switchTo().alert();
        WebElement element = getDriver().findElement(By.id("1"));
        Select select =new Select(element);
        select.selectByValue("INDIA");
        select.selectByIndex(1);
        select.selectByVisibleText("India");

        select.deselectAll();

        List<WebElement>  webElements =  select.getAllSelectedOptions();
        List<WebElement>  allOptions =   select.getOptions();
        element =  select.getFirstSelectedOption();

        select.deselectByValue("value");
        select.deselectByIndex(1);
        select.deselectByVisibleText("text");
        select.deselectAll();
    }
}
