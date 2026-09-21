package com.selenium.A1_seleniumInterviewEx.selenium26.base;

import org.testng.annotations.Test;

public class TestDemo extends TestBase{

    @Test
    public void Test1(){
            driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }
}
