package com.housecallpro.pom.pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;

public class DashboardPage {

    private final By NEW_BUTTON = By.xpath("//span[text()='New']");
    private final By JOB_BUTTON = By.xpath("//li[text()='Job']");

    public DashboardPage clickNewButton() {
        $(NEW_BUTTON).shouldBe(Condition.visible, Duration.ofSeconds(10)).click();
        return this;
    }

    public NewJobPage clickJobButton() {
        $(JOB_BUTTON).click();
        return new NewJobPage();
    }

}
