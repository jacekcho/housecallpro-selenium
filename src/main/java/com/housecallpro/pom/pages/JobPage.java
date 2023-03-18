package com.housecallpro.pom.pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;

public class JobPage {

    private final By JOB_PAGE_CONTAINER = By.cssSelector("div[class='job-details']");
    private final By JOB_ACTIVITY_FEED = By.xpath("//p[contains(text(),'Job created as Invoice')]");

    public JobPage jobPageShouldBeDisplayed() {
        $(JOB_PAGE_CONTAINER).shouldBe(Condition.visible, Duration.ofSeconds(10));
        return this;
    }

    public boolean isJobCreatedInActivityFeed() {
        return $(JOB_ACTIVITY_FEED).isDisplayed();
    }

}
