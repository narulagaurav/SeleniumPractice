package com.qa.testcases;


import com.qa.base.TestBase;
import com.qa.pages.productDetailsPage;
import com.qa.pages.LoginPage;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import  com.qa.pages.LoginPage.*;

import java.io.IOException;

public class LoginTest extends TestBase {
    LoginPage loginPage;
    productDetailsPage productsPage;


    public LoginTest(){
        super();
    }

    @BeforeMethod
    public void setUp()
    {
        initialization();
        loginPage = new LoginPage();
    }

    @Test(priority = 2)
    public  void loginTest() throws IOException {
        productsPage= loginPage.login(prop.getProperty("username"), prop.getProperty("password"));

    }

    @Test(priority = 1)
    public void loginPageTitle()
    {
        String title=loginPage.validateLoginTitle();
        Assert.assertEquals(title,"Swag Labs");
    }

    @AfterMethod
    public void tearDown()
    {
        driver.quit();
    }
}
