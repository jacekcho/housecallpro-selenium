package com.housecallpro.pom.pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;

public class DashboardPage {

    private final By BUTTON_NEW = By.xpath("//span[text()='New']");
    private final By BUTTON_JOB = By.xpath("//li[text()='Job']");

    public DashboardPage clickButtonNew() {
        $(BUTTON_NEW).shouldBe(Condition.visible, Duration.ofSeconds(10)).click();
        return this;
    }

    public NewJobPage clickButtonJob() {
        $(BUTTON_JOB).click();
        return new NewJobPage();
    }

}
