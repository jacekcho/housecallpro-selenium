package com.housecallpro.utils;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.apache.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.FileWriter;

import static com.codeborne.selenide.WebDriverRunner.source;

public class TestBase {

    private final static Logger LOGGER = Logger.getLogger(TestBase.class);

    @BeforeClass
    public void setUp(ITestContext context) {
        setUpSelenideTestReports(context);
    }

    @AfterMethod
    public void tearDown(ITestResult result) throws Exception {
        if (!result.isSuccess()) {
            LOGGER.info(String.format("Failed test: %s Test evidence in: %s", result.getName(), Configuration.reportsFolder));
            Selenide.screenshot(result.getName());
            savePageSource(result.getName());
        }
    }

    private void setUpSelenideTestReports(ITestContext context) {
        Configuration.reportsFolder = setReportsFolder(context);
        Configuration.screenshots = false;
        Configuration.savePageSource = false;
    }

    private void savePageSource(String fileName) throws Exception {
        File file = new File(String.format("%s/%s.html", Configuration.reportsFolder, fileName));
        FileWriter writer = new FileWriter(file, true);
        writer.write(source());
        writer.close();
    }

    private static String setReportsFolder(ITestContext context) {
        return String.format("build/test-reports/%s", context.getStartDate().getTime());
    }

}
