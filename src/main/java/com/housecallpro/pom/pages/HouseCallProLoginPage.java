package com.housecallpro.pom.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.housecallpro.utils.PropertiesManager;
import org.openqa.selenium.By;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;

public class HouseCallProLoginPage {

    private final By LOGIN_PAGE_CONTAINER = By.cssSelector("[data-component='ProLoginScreenBootstrap']");
    private final By USERNAME_FIELD = By.cssSelector("input[id='email']");
    private final By PASSWORD_FIELD = By.cssSelector("input[id='password']");
    private final By SIGN_IN_BUTTON = By.xpath("//span[text()='Sign in']");

    public HouseCallProLoginPage open() {
        Selenide.open(PropertiesManager.getHousecallproUrl() + "/pro/log_in");
        $(LOGIN_PAGE_CONTAINER).shouldBe(Condition.visible, Duration.ofSeconds(10));
        return this;
    }

    public DashboardPage loginUser() {
        $(USERNAME_FIELD).setValue(PropertiesManager.getUserLogin());
        $(PASSWORD_FIELD).setValue(PropertiesManager.getUserPassword());
        $(SIGN_IN_BUTTON).click();
        return new DashboardPage();
    }

}
