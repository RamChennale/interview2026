package com.selenium.A1_seleniumInterviewEx.selenium26.autoIt_fileUpload;

import com.selenium.A1_seleniumInterviewEx.selenium26.base.TestBase;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.io.IOException;

public class AutoITForWindPopUp extends TestBase {

    @Test
    public void autoITForWindPopUp() throws IOException {
        driver.get("C:\\at-practice-26\\selenium-api-interview-26\\src\\test\\java\\com\\selenium\\A1_seleniumInterviewEx\\selenium26\\autoIt_fileUpload\\fileBrowsing.html");
        driver.findElement(By.xpath("//input[@id=1]")).click();
        Runtime.getRuntime().exec("C:\\Users\\ramchennale\\git\\projects\\selenium\\src\\com\\qa\\autoIt\\FileUploadScript.exe");
         }

}
