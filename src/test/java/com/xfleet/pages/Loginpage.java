package com.xfleet.pages;

import com.xfleet.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {

    public Loginpage() {


        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(id = "prependedInput")
    public WebElement loginusername;

    @FindBy(id= "prependedInput2")
    public WebElement loginpassword;

    @FindBy(id= "_submit")
    public WebElement clickbutton;

    @FindBy (xpath= "//div[.='Invalid user name or password.']")
    public WebElement invalidCredentialAlert;


    @FindBy(xpath = "//a[.='Forgot your password?']")
    public WebElement forgotPasswordButton;

    @FindBy(xpath = "//h2[.='Forgot Password']")
    public WebElement forgotPasswordHeader;


    @FindBy(xpath= "//span[@class='custom-checkbox__text']")
    public WebElement rememberMeLink;

  @FindBy(xpath= "//span[@class='custom-checkbox__icon']" )
     public WebElement rememberMeCheckbox;

      @FindBy(id="remember_me")
      public WebElement rememberMeCheckbox2;


   // @FindBy(xpath="//input[@type='checkbox']")
      //   public WebElement rememberMeCheckbox2;

        @FindBy (xpath = "//h2[@class=\"title\"]")
        public WebElement LoginPageHeader;


}
