package com.housecallpro.pom.pages;

import com.codeborne.selenide.Selenide;
import com.housecallpro.utils.PropertiesManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class HouseCallProLoginPage {

    private final By USERNAME_FIELD = By.cssSelector("input[id='email']");
    private final By PASSWORD_FIELD = By.cssSelector("input[id='password']");
    private final By SIGN_IN_BUTTON = By.xpath("//span[text()='Sign in']");

    private final static Logger LOGGER = Logger.getLogger(HouseCallProLoginPage.class);

    public HouseCallProLoginPage open() {
        LOGGER.info("Open Login Page");
        Selenide.open(PropertiesManager.getHousecallproUrl() + "/pro/log_in");
        return this;
    }

    public DashboardPage loginUser() {
        $(USERNAME_FIELD).sendKeys(PropertiesManager.getUserLogin());
        $(PASSWORD_FIELD).sendKeys(PropertiesManager.getUserPassword());
        $(SIGN_IN_BUTTON).click();
        return new DashboardPage();
    }

}
