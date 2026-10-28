package com.selenium.A1_seleniumInterviewEx.selenium26.autoDropdown;

import com.selenium.A1_seleniumInterviewEx.selenium26.POMframework.TestBase_1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class AutoDropDownSearch extends TestBase_1 {

    @Test
    public void testAutoDropDownSearch() throws InterruptedException {
        driver.get("https://www.google.com/");
        driver.findElement(By.id("ti6dpd")).sendKeys("selenium");
        Thread.sleep(2000);
        List<WebElement>  listWebElement = driver.findElements(By.xpath("//ul[@role=\"listbox\"]//li"));
        for (int i=0; i<listWebElement.size(); i++){
            if(listWebElement.get(i).getText().equalsIgnoreCase("selenium")){
                Thread.sleep(2000);
                listWebElement.get(i).click();
                Thread.sleep(5000);
                System.out.println(listWebElement.get(i).getText());
            }
        }


    }
}
