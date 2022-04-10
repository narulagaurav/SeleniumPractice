package com.qa.pages;




import com.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class LoginPage extends TestBase {
    @FindBy(xpath="//input[@id='user-name']")
    WebElement username;

    @FindBy(xpath="//input[@id='password']")
    WebElement password;

    @FindBy(xpath="//input[@id='login-button']")
    WebElement loginBtn;

    public LoginPage(){

        PageFactory.initElements(driver,this);
    }


    public productDetailsPage login(String un, String pwd) throws IOException {
        username.sendKeys(un);
        //Screenshot.screenshot_element(username);
        password.sendKeys(pwd);
        loginBtn.click();

        return new productDetailsPage();
    }

    public String validateLoginTitle()
    {
        return driver.getTitle();
    }

}
