package com.Library.Pages;

import com.Library.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public  class Librarian_User_page extends ShowRecordPage
    {

        public Librarian_User_page()
            {
                PageFactory.initElements(Driver.getDriver(),this);
            }

        @FindBy(xpath = "//*[@id=\"users\"]/div[1]/div[1]/span/a")
        public WebElement addUserLink;

        @FindBy(name = "full_name")
        public WebElement  fullNameBox;

        @FindBy(name = "password")
        public WebElement  passwordBox;

        @FindBy(name = "email")
        public WebElement   emailBox;

        @FindBy(id = "address")
        public WebElement  addressBox;


        @FindBy(xpath = "//*[@id=\"add_user_form\"]/div[2]/button[1]")
        public WebElement  cancelBox;

        @FindBy(xpath = "//div[2]/button[2]")
        public WebElement  saveLink;

        @FindBy(xpath = "//*[@id=\"tbl_users\"]/tbody/tr[2]/td[1]/a")
        public WebElement  editUserLink;

        @FindBy(xpath = "//*[@id=\"toast-container\"]")
        public WebElement  updatedAlert;




    }
