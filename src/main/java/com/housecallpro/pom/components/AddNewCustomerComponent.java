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
    private final By ADDRESS_FIELD = By.cssSelector("input[id^='service_addresses']");
    private final By CREATE_CUSTOMER_BUTTON = By.cssSelector("button[type='submit']");

    public NewJobPage createNewCustomer() {
        $(FIRST_NAME_FIELD).setValue(Generators.randomFirstName());
        $(LAST_NAME_FIELD).setValue(Generators.randomLastName());
        $(MOBILE_NUMBER_FIELD).setValue(Generators.randomMobile());
        $(EMAIL_FIELD).setValue(Generators.randomEmail());
        $(ADDRESS_FIELD).setValue(Generators.randomAddress());
        $(CREATE_CUSTOMER_BUTTON).click();
        return new NewJobPage();
    }

}
