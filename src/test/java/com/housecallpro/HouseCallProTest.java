package com.housecallpro;

import com.housecallpro.pom.pages.HouseCallProLoginPage;
import org.testng.annotations.Test;

public class HouseCallProTest {

    @Test
    public void shouldAddNewJob() {
        // given
        new HouseCallProLoginPage()
                .open()
                .loginUser()
                .clickNewButton()
                .clickJobButton()
                .clickNewCustomerButton()
                .createNewCustomer();

        // when

        // then
    }

}
