package com.Library.Pages;

import com.Library.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public abstract class Bookcatogeries
    {

        public Bookcatogeries()
            {
                PageFactory.initElements(Driver.getDriver(),this);
            }




    }
