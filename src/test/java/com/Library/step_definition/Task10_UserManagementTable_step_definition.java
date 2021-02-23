package com.Library.step_definition;

import com.Library.Pages.LoginPage;
import com.Library.utilities.BrowserUtil;
import com.Library.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;

public class Task10_UserManagementTable_step_definition
    {
        LoginPage Librarian = new LoginPage();

        @Then("the user should  see the following column names:")
        public void the_user_should_see_the_following_column_names(List<String > TitleSelection)
       {

            System.out.println( "option = "  +TitleSelection);
            List<String> titles= new ArrayList<>();

            for (int i=0;i< Librarian.headerSelection.size();i++)
                {
                    titles.add(Librarian.headerSelection.get(i).getText());

                }


                BrowserUtil.wait(1);
                System.out.println("titles = " + titles);
                Assert.assertEquals("list are not equal",TitleSelection,titles);


               Driver.closeDriver();
        }


    }

    
