package com.selenium.A1_seleniumInterviewEx.selenium26.util;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class ChromeOptions_used {

    @Test(enabled = false)
    public void ChromeOptions_to_Disable(){

        Map<String, Object> pref = new HashMap<>();
        pref.put("credentials_enable_service", false);
        pref.put("profile.password_manager_enabled", false);

        ChromeOptions  options = new ChromeOptions();

        ChromeDriver driver = new ChromeDriver();
    }
}
