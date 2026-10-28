package com.selenium.A4_TestNG.pom_project1.tests;

import com.selenium.A4_TestNG.pom_project1.base.TestBase;
import com.selenium.A4_TestNG.pom_project1.pages.DashboardPage;
import com.selenium.A4_TestNG.pom_project1.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {

    @Test(description = "Valid login lands on dashboard")
    public void validLogin() {
        LoginPage login = new LoginPage();
        DashboardPage dash = login.login("Admin", "admin123");
        Assert.assertTrue(dash.isLoaded());
    }

    @Test(description = "Invalid login shows an error")
    public void invalidLogin() {
        LoginPage login = new LoginPage();
        login.login("Admin", "wrong");
        Assert.assertEquals(login.getErrorMessage(), "Invalid credentials@@@@@@");
    }

    @Test(description = "Empty username shows required error")
    public void emptyUsername() {
        LoginPage login = new LoginPage();
        login.enterPassword("admin123").clickLogin();
        Assert.assertEquals(login.getRequiredFieldError(), "Required");
    }

    @Test(description = "Logout returns to login page")
    public void logoutFlow() {
        DashboardPage dash = new LoginPage().login("Admin", "admin123");
        LoginPage login = dash.logout();
        Assert.assertTrue(login.isLoginPageDisplayed());
    }
}