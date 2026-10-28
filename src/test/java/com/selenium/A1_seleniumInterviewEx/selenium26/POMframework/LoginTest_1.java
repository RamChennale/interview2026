package com.selenium.A1_seleniumInterviewEx.selenium26.POMframework;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest_1 extends TestBase_1 {

    private static final String URL =
            "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";

    @Test
    public void validLoginShouldOpenDashboard() {
        driver.get(URL);
        LoginPage_1 loginPage = new LoginPage_1(driver);
        loginPage.login("Admin", "admin123");
        Assert.assertTrue(loginPage.isLoginSuccessful(), "Dashboard was not displayed after login");
    }

    @Test
    public void invalidLoginShouldShowError() {
        driver.get(URL);
        LoginPage_1 loginPage = new LoginPage_1(driver);
        loginPage.login("wrongUser", "wrongPass");
        Assert.assertEquals(loginPage.getErrorMessage(), "Invalid credentials");
    }
}