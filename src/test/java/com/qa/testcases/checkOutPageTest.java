package com.qa.testcases;

import com.qa.Util.TestUtil;
import com.qa.base.TestBase;
import com.qa.pages.LoginPage;
import com.qa.pages.cartDetailsPage;
import com.qa.pages.checkOutPage;
import com.qa.pages.productDetailsPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class checkOutPageTest extends TestBase {
    LoginPage loginPage;
    productDetailsPage productsPage;
    cartDetailsPage cartPage;
    checkOutPage checkoutPage;

    public checkOutPageTest()
    {
        super();
    }
    @BeforeMethod
    public void setUp() throws IOException {
        initialization();
        loginPage = new LoginPage();
        productsPage = new productDetailsPage();
        cartPage = new cartDetailsPage();
        checkoutPage = new checkOutPage();
        productsPage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));

    }

    @Test(priority = 2)
    public void continueBtnClick()
    {
        productsPage.addToCartBtn();
        driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);
        productsPage.cartIcon();
        driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);
        productsPage.validateProductDetailsPageTitle();
        cartPage.checkoutBtn();
        driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);
        checkoutPage.continueBtnClick();
        driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);
        checkoutPage.finishBtnClick();

    }

    @Test(priority = 1)

    public void checkoutPageTitle()
    {
        productsPage.addToCartBtn();
        driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
        productsPage.cartIcon();
        driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);
        cartPage.checkoutBtn();
        driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);
        checkoutPage.checkOutPageTitle();
        driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);
        Assert.assertTrue(checkoutPage.checkOutPageTitle());
    }
    @AfterMethod
    public void tearDown()
    {
       // driver.quit();
    }

}
