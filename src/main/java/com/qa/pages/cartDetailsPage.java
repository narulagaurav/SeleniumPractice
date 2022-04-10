package com.qa.pages;

import com.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class cartDetailsPage extends TestBase {

    @FindBy(xpath="//button[@id='checkout']")
    WebElement  checkOut;

    @FindBy(xpath="//span[text()='Your Cart']")
    WebElement pageName;


    public cartDetailsPage()
    {
        PageFactory.initElements(driver,this);
    }

    public void checkoutBtn()
    {
        checkOut.click();
    }

    public String validateCartDetailsTitle()
    {
        return driver.getTitle();
    }

    public boolean validateCartPageName()
    {
        return pageName.isDisplayed();

    }

}
