package com.housecallpro.pro.pom.pages;

import com.housecallpro.pro.utils.Generators;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class NewJobPage {

    private final By NEW_CUSTOMER_BUTTON = By.xpath("//span[text()='+ New customer']");
    private final By FIRST_NAME_FIELD = By.cssSelector("input[id='customer-dialog-first-name']");
    private final By MOBILE_NUMBER_FIELD = By.cssSelector("[name='mobile_number']");

    public NewJobPage clickNewCustomerButton() {
        $(NEW_CUSTOMER_BUTTON).click();
        return this;
    }

    public NewJobPage createCustomer() {
        setCustomerFirstName(Generators.randomFirstName());
        return this;
    }

    private void setCustomerFirstName(String firstName) {
        $(FIRST_NAME_FIELD).click();
        $(FIRST_NAME_FIELD).sendKeys(firstName);
    }

}
