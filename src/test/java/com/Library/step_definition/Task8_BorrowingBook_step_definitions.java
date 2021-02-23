package com.Library.step_definition;

import com.Library.Pages.LoginPage;
import com.Library.utilities.BrowserUtil;
import com.Library.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;

public class Task8_BorrowingBook_step_definitions
    {

        LoginPage student = new LoginPage();

        @When("the user click Borrowing Books module")
        public void the_user_click_borrowing_books_module()
        {
           student.BorrowingBookLink.click();
        }
        @Then("the user shoulde see the following column names:")
        public void the_user_shoulde_see_the_following_column_names(List<String > options) {

            BrowserUtil.wait(1);
            System.out.println( "option = "  +options);
             List<String> titles= new ArrayList<>();

             for (int i=0;i< student.BorrowingBookHeader.size();i++)
                {
                    titles.add(student.BorrowingBookHeader.get(i).getText());

                }

                 Assert.assertEquals("list are not equal",options,titles);
            


            Driver.closeDriver();
        }


    }
