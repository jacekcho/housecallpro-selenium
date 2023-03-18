package com.housecallpro.pom.pages;

import com.housecallpro.pom.components.AddNewCustomerComponent;
import com.housecallpro.utils.Generators;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class NewJobPage {

    private final By NEW_CUSTOMER_BUTTON = By.xpath("//span[text()='+ New customer']");
    private final By LINE_ITEM_NAME = By.cssSelector("input[id='item-name']");
    private final By LINE_ITEM_DESCRIPTION = By.cssSelector("[id='description']");
    private final By PRIVATE_NOTES = By.xpath("//p[text()='Private notes']");
    private final By PRIVATE_NOTES_TEXT_FIELD= By.cssSelector("[data-testid='private-notes-textfield']");
    private final By SAVE_JOB_BUTTON = By.cssSelector("[data-testid='createJobContainer__saveBtn']");

    public AddNewCustomerComponent clickNewCustomerButton() {
        $(NEW_CUSTOMER_BUTTON).click();
        return new AddNewCustomerComponent();
    }

    public NewJobPage addLineItem() {
        $(LINE_ITEM_NAME).setValue(Generators.randomItem());
        $(LINE_ITEM_DESCRIPTION).setValue(Generators.randomSentence());
        return this;
    }

    public NewJobPage addPrivateNotes() {
        $(PRIVATE_NOTES).click();
        $(PRIVATE_NOTES_TEXT_FIELD).setValue(Generators.randomSentence());
        return this;
    }

    public JobPage clickSaveJobButton() {
        $(SAVE_JOB_BUTTON).click();
        return new JobPage();
    }

}
