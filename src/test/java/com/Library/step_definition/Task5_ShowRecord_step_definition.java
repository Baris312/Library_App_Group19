package com.Library.step_definition;

import com.Library.Pages.LoginPage;
import com.Library.utilities.BrowserUtil;
import com.Library.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Task5_ShowRecord_step_definition
    {

       LoginPage userPage= new LoginPage();

        Select select ;


        @Then("show records default value should be {int}")
        public void show_records_default_value_should_be(Integer int1) throws InterruptedException
            {

                BrowserUtil.wait(10);
                select= new Select(userPage.showRecordDropdown);

                String actual =select.getFirstSelectedOption().getText();
                 Assert.assertEquals(""+int1,actual);

            }






           @Then("show records count options")
        public void showRecordsOptions(List<String > options)
            {


                System.out.println("options" + options);
                select = new Select(userPage.showRecordDropdown);
                List<WebElement> listElements = select.getOptions();
                List<String> elementText =    BrowserUtil.getElementsText(listElements);

                Assert.assertEquals(options,elementText);
                Driver.closeDriver();

            }


    }
