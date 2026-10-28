package com.selenium.A4_TestNG.pom_project1.pages;


import com.selenium.A4_TestNG.pom_project1.base.BasePage;
import org.openqa.selenium.By;

public class DashboardPage extends BasePage {

    private final By dashboardHeader = By.cssSelector(".oxd-topbar-header-breadcrumb h6");
    private final By userDropdown    = By.cssSelector(".oxd-userdropdown-tab");
    private final By logoutLink      = By.linkText("Logout");

    public boolean isLoaded() {
        return isDisplayed(dashboardHeader)
                && getText(dashboardHeader).equals("Dashboard");
    }

    public String getHeaderText() {
        return getText(dashboardHeader);
    }

    public LoginPage logout() {
        click(userDropdown);
        click(logoutLink);
        return new LoginPage();
    }
}