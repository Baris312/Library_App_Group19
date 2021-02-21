package com.Library.Pages;

import com.Library.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public abstract class ShowRecordPage
    {

        public ShowRecordPage()
            {
                PageFactory.initElements(Driver.getDriver(),this);
            }


        @FindBy(xpath = "//*[@id=\"tbl_users_length\"]/label/select")
        public WebElement showRecordDropdown;


        @FindBy(xpath = "//th")
        public List<WebElement> tableHeaders;

        @FindBy(linkText = "Users")
        public WebElement userLink;




    }
