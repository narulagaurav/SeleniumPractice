package com.qa.pages;

import com.qa.Util.TestUtil;
import com.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class productDetailsPage extends TestBase {

    @FindBy(id="add-to-cart-sauce-labs-backpack")
    WebElement addToCart;

    @FindBy(xpath="//span[@class='shopping_cart_badge']")
    WebElement cartIcon;

    public productDetailsPage()
    {
        PageFactory.initElements(driver,this);
    }

    public void addToCartBtn()
    {
        addToCart.click();
        driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
    }

    public void cartIcon()
    {
        cartIcon.click();
    }

    public String validateProductDetailsPageTitle()
    {
        return driver.getTitle();
    }

}
