package com.housecallpro;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class TestBase {

    @BeforeClass
    public void setUp(ITestContext context) {
        setUpSelenideTestReports(context);
    }

    @AfterMethod
    public void tearDown(ITestResult result) {
        if (!result.isSuccess()) {
            Selenide.screenshot(result.getName());
        }
    }

    private void setUpSelenideTestReports(ITestContext context) {
        Configuration.reportsFolder = String.format("test-reports/%s", context.getStartDate().getTime());
        Configuration.screenshots = false;
        Configuration.savePageSource = false;
    }

}
