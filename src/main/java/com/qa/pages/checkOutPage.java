package com.qa.pages;

import com.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class checkOutPage extends TestBase {


    @FindBy(xpath="//input[@id='first-name']")
    WebElement firstName;

    @FindBy(xpath="//input[@id='last-name']")
    WebElement lastName;

    @FindBy(xpath="//input[@id='postal-code']")
    WebElement zipCode;

    @FindBy(xpath="//span[text()='Checkout: Your Information']")
    WebElement checkoutTitle;

    @FindBy(xpath="//input[@id='continue']")
    WebElement continueBtn;

    @FindBy(xpath="//button[@id='finish']")
    WebElement finishBtn;


    public checkOutPage()

    {
        PageFactory.initElements(driver,this);
    }

    public boolean checkOutPageTitle()
    {
        return checkoutTitle.isDisplayed();
    }

    public void continueBtnClick()
    {

        firstName.sendKeys(("Gaurav"));
        lastName.sendKeys("abc");
        zipCode.sendKeys("141001");
        continueBtn.click();
    }

    public void finishBtnClick()
    {
        finishBtn.click();
    }

}
