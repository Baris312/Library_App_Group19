package com.Library.step_definition;

import com.Library.Pages.LoginPage;
import com.Library.utilities.BrowserUtil;
import com.Library.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Task9_UserVerification_step_definition
    {

         LoginPage librarian = new LoginPage();
         Select select;

        @Then("Librarians click on User Group dropdown")
        public void librarians_click_on_user_group_dropdown() {
            BrowserUtil.wait(1);
            librarian.userGroupLink.click();
        }
        @Then("user should see the following options:")
        public void user_should_see_the_following_options(List<String > options) {

            select= new Select( librarian.userGroupLink);
            List<String> userOptions = BrowserUtil.getElementsText(select.getOptions());

//            System.out.println("userOptions = " + userOptions);
//            System.out.println("options = " + options);

            BrowserUtil.wait(2);
            Assert.assertEquals("List are not equal",options,userOptions);
            Driver.closeDriver();

        }


        @And("the user click Status dopdown")
        public void theUserClickStatusDopdown()
            {
                librarian.userStatusLink.click();
            }

        @Then("the user should see the following options:")
        public void theUserShouldSeeTheFollowingOptions(List<String > options)
            {
                select= new Select( librarian.userStatusLink);
                List<String> userOptions = BrowserUtil.getElementsText(select.getOptions());

                System.out.println("userOptions = " + userOptions);
                System.out.println("options = " + options);

                BrowserUtil.wait(2);
                Assert.assertEquals("List are not equal",options,userOptions);
                Driver.closeDriver();


            }
    }
