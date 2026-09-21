package com.selenium.A1_seleniumInterviewEx.selenium26.fileOperations;

import com.selenium.A1_seleniumInterviewEx.selenium26.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.util.UUID;
public class DowloadFile extends TestBase {

    @Test
    public void download() throws InterruptedException{
        File folder = new File(UUID.randomUUID().toString());
        folder.mkdir();;
        driver.get("http://the-internet.herokuapp.com/download");
        driver.findElement(By.xpath("//a[normalize-space()='arquivo_teste.txt']")).click();

        //
        Thread.sleep(4000);
        File listOffiles[]= folder.listFiles();
        for(File file: listOffiles) {
            //dowloaded file not empty
            Assert.assertTrue(file.length()>0);
        }

        //Directory is not empty
        //Assert.assertTrue(listOffiles.length>0);//or
        System.out.println("After DWN listOffiles.length  : "+listOffiles.length);
        if(listOffiles.length!=0)
            System.out.println("File downloaded");
        else
            System.out.println("No file downloaded");
    }


    public void headlesBrowserTest() {
        ChromeOptions chromeOptions = new ChromeOptions();
        //first way
        //chromeOptions.setHeadless(true);// working fine

        //second way
        chromeOptions.addArguments("--headless"); //working fine
        chromeOptions.addArguments("window-size=1920,1080");

        driver = new ChromeDriver(chromeOptions);

    }
    }
