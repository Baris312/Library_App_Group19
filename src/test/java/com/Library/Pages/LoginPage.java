package com.Library.Pages;

import com.Library.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage
    {


        public LoginPage()
       {
            PageFactory.initElements(Driver.getDriver(),this);
        }


        @FindBy(xpath = "//*[@id=\"menu_item\"]/li[1]/a/span[1]")
        public WebElement LoginBookTitle;

        @FindBy(id = "inputEmail")
        public WebElement userEmail;
        @FindBy(id = "inputPassword")
        public WebElement userPassword;


        public void login(String userName,String Password)
        {
            userEmail.sendKeys(userName);
            userPassword.sendKeys(Password, Keys.ENTER);
        }







    }
