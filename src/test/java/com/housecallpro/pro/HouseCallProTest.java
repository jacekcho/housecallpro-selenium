package com.housecallpro.pro;

import com.housecallpro.pro.pom.pages.LoginPage;
import org.testng.annotations.Test;

public class HouseCallProTest {

    @Test
    public void shouldAddNewJob() {
        // given
        new LoginPage()
                .open()
                .loginUser()
                .clickNewButton()
                .clickJobButton()
                .clickNewCustomerButton()
                .createCustomer();

        // when

        // then
    }

}
