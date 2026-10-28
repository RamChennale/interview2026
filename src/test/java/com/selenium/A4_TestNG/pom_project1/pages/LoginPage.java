package com.selenium.A4_TestNG.pom_project1.pages;


import com.selenium.A4_TestNG.pom_project1.base.BasePage;
import org.openqa.selenium.By;

public class LoginPage extends BasePage {

    // Locators (no PageFactory, plain By)
    private final By usernameInput = By.name("username");
    private final By passwordInput = By.name("password");
    private final By loginButton   = By.cssSelector("button[type='submit']@@");
    private final By errorMessage  = By.cssSelector(".oxd-alert-content-text");
    private final By fieldError    = By.cssSelector(".oxd-input-field-error-message");

    // Low-level actions
    public LoginPage enterUsername(String username) {
        type(usernameInput, username);
        return this;
    }

    public LoginPage enterPassword(String password) {
        type(passwordInput, password);
        return this;
    }

    public void clickLogin() {
        click(loginButton);
    }

    // Business action used by tests: login.login("Admin", "wrong")
    public DashboardPage login(String username, String password) {
        enterUsername(username);
        enterPassword(password);
        clickLogin();
        return new DashboardPage();
    }

    // Verification helpers (return data, no assertions here)
    public String getErrorMessage() {
        return getText(errorMessage);        // "Invalid credentials"
    }

    public boolean isErrorDisplayed() {
        return isDisplayed(errorMessage);
    }

    public String getRequiredFieldError() {
        return getText(fieldError);          // "Required"
    }

    public boolean isLoginPageDisplayed() {
        return isDisplayed(loginButton);
    }
}