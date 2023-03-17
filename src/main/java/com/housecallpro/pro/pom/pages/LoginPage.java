package com.housecallpro.pro.pom.pages;

import com.codeborne.selenide.Selenide;
import com.housecallpro.pro.utils.PropertiesManager;
import org.apache.log4j.Logger;

public class LoginPage {

    private final static Logger LOGGER = Logger.getLogger(LoginPage.class);

    public LoginPage open() {
        LOGGER.info("Open Login Page");
        Selenide.open(PropertiesManager.getHousecallproUrl());
        return this;
    }

}
