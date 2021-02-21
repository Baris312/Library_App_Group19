package com.Library.step_definition;

import com.Library.Pages.LoginPage;
import com.Library.utilities.BrowserUtil;
import com.Library.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class StudentTable_stpe_definition
    {

        LoginPage student = new LoginPage();
        Select select;

        @Then("the user should see following names")
        public void the_user_should_see_following_names(List<String > categories)

        {
            select = new Select(student.bookCategories);
            List<String> listElements = BrowserUtil.getElementsText(select.getOptions());
            List<String> assertList = new ArrayList<>();
            System.out.println(listElements);

            for (String eachlink : categories)
                {
                    if(listElements.contains((eachlink)));
                    {
                      assertList.add(eachlink);
                    }
                }
            System.out.println("Assert List =  "+assertList);
            Assert.assertEquals(categories,assertList);

            Driver.closeDriver();


        }

    }
