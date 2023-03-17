package com.housecallpro.pro.pom.pages;

import com.codeborne.selenide.Selenide;
import com.housecallpro.pro.utils.PropertiesManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {

    private final By USERNAME_FIELD = By.cssSelector("input[id='email']");
    private final By PASSWORD_FIELD = By.cssSelector("input[id='password']");
    private final By SIGN_IN_BUTTON = By.xpath("//span[text()='Sign in']");

    private final static Logger LOGGER = Logger.getLogger(LoginPage.class);

    public LoginPage open() {
        LOGGER.info("Open Login Page");
        Selenide.open(PropertiesManager.getHousecallproUrl());
        return this;
    }

    public DashboardPage loginUser() {
        $(USERNAME_FIELD).sendKeys(PropertiesManager.getUserLogin());
        $(PASSWORD_FIELD).sendKeys(PropertiesManager.getUserPassword());
        $(SIGN_IN_BUTTON).click();
        return new DashboardPage();
    }

}
