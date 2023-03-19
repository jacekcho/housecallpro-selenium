package com.housecallpro;

import com.housecallpro.pom.pages.HouseCallProLoginPage;
import com.housecallpro.pom.pages.JobPage;
import com.housecallpro.pom.pages.NewJobPage;
import org.testng.annotations.Test;

import static org.fest.assertions.Assertions.assertThat;

public class HouseCallProTest extends TestBase {

    @Test
    public void shouldDisplayNewCreatedJobInTheActivityFeed() {
        // given
        new HouseCallProLoginPage()
                .open()
                .loginUser()
                .navigateToNewJobPage();

        // when
        new NewJobPage()
                .clickNewCustomerButton()
                .createNewCustomer()
                .addLineItem()
                .addPrivateNotes()
                .clickSaveJobButton()
                .jobPageShouldBeDisplayed();

        // then
        assertThat(new JobPage().isJobCreatedInActivityFeed()).isTrue();
    }

}
