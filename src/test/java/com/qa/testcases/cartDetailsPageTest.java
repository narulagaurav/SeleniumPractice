package com.qa.testcases;

import com.qa.base.TestBase;
import com.qa.pages.LoginPage;
import com.qa.pages.cartDetailsPage;
import com.qa.pages.productDetailsPage;
import com.sun.source.tree.AssertTree;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class cartDetailsPageTest extends TestBase {

    LoginPage loginPage;
    productDetailsPage productsPage;
    cartDetailsPage cartPage;

    public cartDetailsPageTest()
    {
        super();
    }

    @BeforeMethod
    public void setUp() throws IOException {
        initialization();
        loginPage = new LoginPage();
        productsPage = new productDetailsPage();
        cartPage = new cartDetailsPage();
        productsPage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));

    }

    @Test(priority = 2)
    public void checkoutBtnClick()
    {
        productsPage.addToCartBtn();
        productsPage.cartIcon();
        productsPage.validateProductDetailsPageTitle();
        cartPage.checkoutBtn();
    }

    @Test(priority = 1)
    public void validateDetailsPageTitle()
    {
        productsPage.addToCartBtn();
        String title=cartPage.validateCartDetailsTitle();
        Assert.assertEquals(title,"Swag Labs");
    }

    @Test(priority = 3)
    public void validateCartPageNameTest()
    {
        productsPage.addToCartBtn();
        productsPage.cartIcon();
        Assert.assertTrue(cartPage.validateCartPageName());
    }

    @AfterMethod
    public void tearDown()
    {
     driver.quit();
    }

}
