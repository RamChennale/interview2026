package com.selenium.A1_seleniumInterviewEx.selenium26.ExpectedConditionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class ElementWait {

    public static WebDriver driver;
    public static WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    /*
     * An expectation for checking that an element is present on the DOM of a page.
     * This does not necessarily mean that the element is visible.
     *
     * @Parameters:locator used to find the element
     *
     * @Returns:the WebElement once it is located
     */
    public static WebElement isElementPresentVerify(By locator) {
        return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }

    public static boolean isElementPresentVerifySAME(By locator) {
        List<WebElement> element = driver.findElements(locator);
        return element.size() > 0;
    }

    /*
     * An expectation for checking an element is visible and enabled such that you
     * can click it.
     *
     * @Parameters:locator used to find the element
     *
     * @Returns:the WebElement once it is located and clickable (visible and
     * enabled)
     */
    public static WebElement isElementClickable(By locator) {
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
        return element;
    }

    /*
     * An expectation for checking that an element is present on the DOM of a page
     * and visible.Visibility means that the element is not only displayed but also
     * has a height and width that is greater than 0.
     *
     * @Parameters:locator used to find the element
     *
     * @Returns:the WebElement once it is located and visible
     */

    public static WebElement isElementVisible(By locator) {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        return element;
    }

    public static WebElement isElementVisibleSAME(WebElement elementParam) {
        WebElement element = wait.until(ExpectedConditions.visibilityOf(elementParam));
        return element;
    }

    public static List<WebElement> isElementVisibleSAMEAllEle(List<WebElement> elementsParam) {
        List<WebElement> elements = wait.until(ExpectedConditions.visibilityOfAllElements(elementsParam));
        return elements;
    }

    /*
     * An expectation for checking that an element is either invisible or not
     * present on the DOM.(can be used overlay checking like element will display but will get stale or disappears)
     *
     * @Parameters:locator used to find the element
     *
     * @Returns:true if the element is not displayed or the element doesn't exist or
     * stale element
     */

    public static boolean isElementInVisible(By locator) {
        return wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
    }

    /*
     * Is the element currently enabled or not? This will generally return true for
     * everything but disabled input elements.
     *
     * @Returns:True if the element is enabled, false otherwise.
     */

    public static boolean isElementEnabled(WebElement element) {
        return element.isEnabled();
    }



    /*
     * Is this element displayed or not? This method avoids the problem of having to
     * parse anelement's "style" attribute.
     *
     * @Returns:Whether or not the element is displayed
     *
     * Used to check if the element is displayed or not. It returns false when the element is not present in DOM.
     */

    public static boolean isElementDisplayed(WebElement element) {
        return element.isDisplayed();
    }



    /*
     * An expectation for checking that an element with text is either invisible or
     * not present on theDOM.
     *
     * @Parameters:locator used to find the element text of the element
     *
     * @Returns:true if no such element, stale element or displayed text not equal
     * that provided
     */

    public static boolean isElementInVisibleWithText(By locator) {
        return wait.until(ExpectedConditions.invisibilityOfElementWithText(locator, "Ram"));
    }

}


/*
https://www.seleniumeasy.com/selenium-tutorials/webdriver-wait-examples--DONE
https://www.browserstack.com/guide/expectedconditions-in-selenium
https://www.edureka.co/community/50910/what-is-expectedcondition-in-selenium-webdriver
http://javadox.com/org.seleniumhq.selenium/selenium-support/2.53.0/org/openqa/selenium/support/ui/ExpectedConditions.html
https://github.com/SeleniumHQ/selenium/blob/trunk/java/client/src/org/openqa/selenium/support/ui/ExpectedConditions.java
https://www.softwaretestinghelp.com/selenium-webdriver-waits-selenium-tutorial-15/
https://examples.javacodegeeks.com/enterprise-java/selenium/selenium-expected-condition-example/
https://huddle.eurostarsoftwaretesting.com/how-to-selenium-expected-conditions/
https://www.selenium.dev/selenium/docs/api/dotnet/html/T_OpenQA_Selenium_Support_UI_ExpectedConditions.htm
*/

