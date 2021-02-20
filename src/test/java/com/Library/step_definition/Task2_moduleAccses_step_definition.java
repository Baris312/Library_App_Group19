package com.Library.step_definition;

import com.Library.Pages.LoginPage;
import com.Library.utilities.BrowserUtil;
import com.Library.utilities.ConfigurationReader;
import com.Library.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class Task2_moduleAccses_step_definition
    {

        LoginPage lib = new LoginPage();


        @Given("user is on the login page")
        public void userIsOnTheLoginPage()
            {
               Driver.getDriver().get(ConfigurationReader.getProperty("Lib-19URL"));
            }


        @When("user enter {string} and {string}")
        public void userEnterAnd(String userEmail, String Password)
            {
                lib.login(userEmail,Password);
            }








        @When("Librarian enter {string} and {string}")
        public void librarianEnterAnd(String LibEmail, String LibPasword)
            {
                LibEmail =ConfigurationReader.getProperty("lib14_userName");
                LibPasword = ConfigurationReader.getProperty("lib14_password");
               lib.userEmail.sendKeys(LibEmail);
               lib.userPassword.sendKeys(LibPasword, Keys.ENTER);

            }




        @Then("the user should see following modules")
        public void the_user_should_see_following_modules(List<String> linkList)
        {
            BrowserUtil.wait(2);

            ArrayList<WebElement> elements = new ArrayList<>(Driver.getDriver().findElements(By.xpath("//span[@class='title']")));

            for(int i = 0; i < elements.size(); i++)
            {
                Assert.assertEquals(elements.get(i).getText(), linkList.get(i));

            }

            Driver.closeDriver();

        }

    }
