package com.selenium.A1_seleniumInterviewEx.seleniumGrid;

import com.selenium.A1_seleniumInterviewEx.DockerSeleniumGrid.SeleniumDockerGridBaseClass;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class SeleniumGridLoginTest extends SeleniumGridBaseClass {

    @Test
    public void verifyLogin() {
            login();

    }

    public void login() {
        getDriver().findElement(By.name("username")).sendKeys("Admin");
        getDriver().findElement(By.name("password")).sendKeys("admin123");;
         getDriver().findElement(By.xpath("//button[@type='submit']")).click();
    }

}
