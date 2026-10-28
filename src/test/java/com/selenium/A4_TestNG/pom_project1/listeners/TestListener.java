package com.selenium.A4_TestNG.pom_project1.listeners;

import com.aventstack.extentreports.ExtentTest;
import com.selenium.A4_TestNG.pom_project1.utils.ExtentManager;
import com.selenium.A4_TestNG.pom_project1.utils.ScreenshotUtil;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.*;

public class TestListener implements ITestListener, ISuiteListener {

    private static final Logger log = LogManager.getLogger(TestListener.class);

    @Override
    public void onStart(ISuite suite) {
        log.info("Suite started: {}", suite.getName());
    }

    @Override
    public void onTestStart(ITestResult result) {
        String name = result.getMethod().getMethodName();
        log.info("STARTED: {}", name);
        ExtentTest t = ExtentManager.getExtent()
                .createTest(name, result.getMethod().getDescription());
        ExtentManager.setTest(t);
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        log.info("PASSED: {}", result.getName());
        ExtentManager.getTest().pass("Test passed");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        String name = result.getName();
        log.error("FAILED: {}", name, result.getThrowable());

        String shot = ScreenshotUtil.capture(name);
        ExtentManager.getTest().fail(result.getThrowable());
        if (shot != null) {
            ExtentManager.getTest().addScreenCaptureFromPath(shot);
        }
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        log.warn("SKIPPED: {}", result.getName());
        ExtentManager.getTest().skip(result.getThrowable());
    }

    @Override
    public void onFinish(ITestContext context) {
        ExtentManager.getExtent().flush();   // writes the HTML report
        log.info("Finished: {}", context.getName());
    }
}