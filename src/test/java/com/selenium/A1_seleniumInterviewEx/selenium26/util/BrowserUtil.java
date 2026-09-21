package com.selenium.A1_seleniumInterviewEx.selenium26.util;

import com.selenium.A1_seleniumInterviewEx.selenium26.base.TestBase;

public class BrowserUtil extends TestBase {

    public static void maximizeBrowser(){
        driver.manage().window().maximize();
    }

    public static void minimizeBrowser(){
        driver.manage().window().minimize();
    }

}
