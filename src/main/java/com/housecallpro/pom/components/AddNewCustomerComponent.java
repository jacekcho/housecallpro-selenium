package com.housecallpro.pom.components;

import com.housecallpro.pom.pages.NewJobPage;
import com.housecallpro.utils.Generators;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class AddNewCustomerComponent {

    private final By FIRST_NAME_FIELD = By.cssSelector("input[id='customer-dialog-first-name']");
    private final By LAST_NAME_FIELD = By.cssSelector("input[name='last_name']");
    private final By MOBILE_NUMBER_FIELD = By.cssSelector("[name='mobile_number']");
    private final By EMAIL_FIELD = By.cssSelector("input[name='email']");
    private final By CREATE_CUSTOMER_BUTTON = By.cssSelector("button[type='submit']");

    public NewJobPage createNewCustomer() {
        $(FIRST_NAME_FIELD).sendKeys(Generators.randomFirstName());
        $(LAST_NAME_FIELD).sendKeys(Generators.randomLastName());
        $(MOBILE_NUMBER_FIELD).sendKeys(Generators.randomMobile());
        $(EMAIL_FIELD).sendKeys(Generators.randomEmail());
        $(CREATE_CUSTOMER_BUTTON).click();
        return new NewJobPage();
    }

}
