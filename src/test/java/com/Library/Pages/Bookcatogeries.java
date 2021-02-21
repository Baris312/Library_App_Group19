package com.Library.Pages;

import com.Library.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public abstract class Bookcatogeries
    {

        public Bookcatogeries()
            {
                PageFactory.initElements(Driver.getDriver(),this);
            }


        @FindBy(xpath = "//*[@id=\"borrowed_list\"]/thead")
        public List<WebElement> BorrowingBookHeader;

    }
