package com.housecallpro.pom.pages;

import com.housecallpro.pom.components.AddNewCustomerComponent;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class NewJobPage {

    private final By NEW_CUSTOMER_BUTTON = By.xpath("//span[text()='+ New customer']");

    public AddNewCustomerComponent clickNewCustomerButton() {
        $(NEW_CUSTOMER_BUTTON).click();
        return new AddNewCustomerComponent();
    }

}
