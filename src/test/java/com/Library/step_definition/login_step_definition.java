package com.Library.step_definition;

import com.Library.Pages.LoginPage;
import com.Library.utilities.BrowserUtil;
import com.Library.utilities.ConfigurationReader;
import com.Library.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class login_step_definition
    {

        LoginPage lib = new LoginPage();

        @Given("user on login page")
        public void user_on_login_page() {
            Driver.getDriver().get(ConfigurationReader.getProperty("Lib-19URL"));
        }



        @When("user enter {string} and  {string}")
        public void userEnterAnd(String userEmail, String Password)
            {
                lib.login(userEmail,Password);
            }




        @Then("user see  {string} and {string}")
        public void user_see_and(String role  , String page)
        {
            BrowserUtil.wait(2);

           if (role.equalsIgnoreCase("student"))
               {
                   Assert.assertEquals(page,lib.LoginBookTitle.getText());
               }
            if (role.equals("librarian"))
             {
                 Assert.assertEquals(page,lib.LoginDashBoardTitle.getText());
             }

            Driver.closeDriver();
        }


          @Then("user Logout from homePage")
        public void user_logout_from_home_page() {
            BrowserUtil.wait(1);
            lib.userTitle.click();

            BrowserUtil.waitForVisibility(lib.LogOutLink,3);

            lib.LogOutLink.click();
            Driver.closeDriver();

        }



    }
