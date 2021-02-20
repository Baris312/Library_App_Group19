package com.Library.step_definition;

import com.Library.Pages.LoginPage;
import com.Library.utilities.ConfigurationReader;
import com.Library.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login_step_definition
    {

        LoginPage lib = new LoginPage();

        @Given("user on login page")
        public void user_on_login_page() {
            Driver.getDriver().get(ConfigurationReader.getProperty("Lib-19URL"));
        }

        @Then("user see  {string} and {string}")
        public void user_see_and(String userEmail  , String Password) {
           lib.login(userEmail,Password);
        }


        @When("user enter {string} and  {string}")
        public void userEnterAnd(String role, String page)
            {
                System.out.println("role = " + role + "page  "+ page  );
            }
    }
