package com.selenium.A1_seleniumInterviewEx.selenium26.alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUps {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

        driver.findElement(By.name("proceed")).click(); //click on Go btn

        Alert alert = driver.switchTo().alert();

        System.out.println("Alert text : "+alert.getText());

        String text = alert.getText();

        if (text.equals("Please enter a valid user name")) {
            System.out.println("correct alert generated ");
            alert.accept();
        } else {
            System.out.println("in-correct alert messg");
        }

        alert.accept(); //click on OK btn

        driver.findElement(By.name("proceed")).click(); //click on Go btn
       alert.dismiss(); //click on cancel btn



        Alert alert1 =  driver.switchTo().alert();
        alert1.accept();
        alert1.dismiss();
        String alertText = alert1.getText();
        alert1.sendKeys("text to send");

    }
}
