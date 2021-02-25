package com.Library.step_definition;

import com.Library.Pages.LoginPage;
import com.Library.utilities.BrowserUtil;
import com.Library.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Task7_bookcategories_step_definition
    {

        LoginPage student = new LoginPage();

        @When("student click on Book Categories")
        public void student_click_on_book_categories() {

            student.bookCategories.click();

        }



        @Then("user sees All options")
        public void user_sees_all_options(List<String > categories)
            {
               // BrowserUtil.wait(1);

           Select select = new Select(student.bookCategories);
            List<String> listElements = BrowserUtil.getElementsText(select.getOptions());
          //  List<String> assertList = new ArrayList<>();


                Assert.assertEquals( "list are not equal", categories,listElements);

                Driver.closeDriver();
        }

    }
