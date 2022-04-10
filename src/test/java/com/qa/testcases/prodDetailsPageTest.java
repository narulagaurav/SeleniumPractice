package com.qa.testcases;

import com.qa.base.TestBase;
import com.qa.pages.LoginPage;
import com.qa.pages.cartDetailsPage;
import com.qa.pages.productDetailsPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class prodDetailsPageTest extends TestBase {

    LoginPage loginPage;
    productDetailsPage productsPage ;

    public prodDetailsPageTest()
    {
        super();
    }

    @BeforeMethod
    public void setUp() throws IOException {
        initialization();
        loginPage = new LoginPage();
        productsPage = new productDetailsPage();
        productsPage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
    }

    @Test(priority = 1)
    public void addToCartBtnClick()
    {
        productsPage.addToCartBtn();
        productsPage.cartIcon();
    }

    @Test(priority = 2)
    public void validateTitle()
    {
        String title=productsPage.validateProductDetailsPageTitle();
        Assert.assertEquals(title,"");
    }

}
