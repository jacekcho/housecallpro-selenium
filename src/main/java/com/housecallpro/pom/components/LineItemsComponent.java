package com.housecallpro.pom.components;

import com.housecallpro.utils.Generators;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LineItemsComponent {

    private final By ITEM_NAME = By.cssSelector("input[id='item-name']");

    public LineItemsComponent addLineItem() {
        $(ITEM_NAME).setValue(Generators.randomItem());
        return this;
    }
}
