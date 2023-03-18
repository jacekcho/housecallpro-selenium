package com.housecallpro;

import com.housecallpro.pom.components.LineItemsComponent;
import com.housecallpro.pom.pages.HouseCallProLoginPage;
import com.housecallpro.pom.pages.NewJobPage;
import org.testng.annotations.Test;

public class HouseCallProTest {

    @Test
    public void shouldAddNewJob() {
        // given
        new HouseCallProLoginPage()
                .open()
                .loginUser()
                .clickButtonNew()
                .clickButtonJob();

        // when
        new NewJobPage().clickNewCustomerButton().createNewCustomer();
        new LineItemsComponent().addLineItem();

        // then
    }

}
