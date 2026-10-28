package com.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPageWithoutPageFactory {

        private WebDriver driver;
        private WebDriverWait wait;

        private By usernameField = By.id("username");
        private By passwordField = By.id("password");
        private By loginButton = By.id("loginBtn");

        public LoginPageWithoutPageFactory(WebDriver driver) {
            this.driver = driver;
            this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        }

        public void login(String user, String pass) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(usernameField))
                    .sendKeys(user);
            driver.findElement(passwordField).sendKeys(pass);
            driver.findElement(loginButton).click();
        }
    }

