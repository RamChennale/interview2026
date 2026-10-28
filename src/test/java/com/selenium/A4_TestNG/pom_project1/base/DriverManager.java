package com.selenium.A4_TestNG.pom_project1.base;

import org.openqa.selenium.WebDriver;

public class DriverManager {
    private static final ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public static void setDriver(WebDriver d) { driver.set(d); }
    public static WebDriver getDriver()       { return driver.get(); }
    public static void unload()               { driver.remove(); }
}