package com.Library.step_definition;

import com.Library.Pages.LoginPage;
import com.Library.utilities.BrowserUtil;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;

public class Task3_AddUser_step_definitions
    {
            LoginPage ad = new LoginPage();


        @Then("Librarians click on UserTitle  link")
        public void librariansClickOnUserTitleLink()
            {
                BrowserUtil.wait(2);

                ad.UserLink.click();
            }


        @Then("Librarians click on Add User link")
        public void librarians_click_on_add_user_link()
         {
            BrowserUtil.wait(2);
            ad.addUserLink.click();
        }
        @Then("Librarians add users with all valid info")
        public void librarians_add_users_with_all_valid_info()
       {
           Faker faker =new Faker();
            BrowserUtil.wait(2);

          ad.fullNameBox.sendKeys( faker.artist().name() );
          ad.passwordBox.sendKeys(faker.phoneNumber().cellPhone());
          ad.emailBox.sendKeys(faker.name()+"@gmail.com");
          ad.addressBox.sendKeys(faker.address().fullAddress());

        }

        @Then("Librarians click on close button")
        public void librarians_click_on_close_button()
        {

            BrowserUtil.wait(3);
          ad.cancelBox.click();
        }

        @Then("Librarians click on Save changes")
        public void librarians_click_on_save_changes()
        {
            BrowserUtil.wait(2);
           ad.saveLink.click();
        }
        @Then("Librarians click on Edit User button")
        public void librarians_click_on_edit_user_button()
        {
            BrowserUtil.wait(3);
            ad.editUserLink.click();
        }



        @Then("Librarians sees the user updated  alert")
        public void librarians_sees_the_user_updated_alert()
        {
           BrowserUtil.waitForVisibility(ad.updatedAlert,3);

        }


    }
