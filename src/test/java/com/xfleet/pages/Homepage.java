package com.xfleet.pages;

import com.xfleet.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {

    public Homepage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//h1[@class='oro-subtitle']")
    public WebElement homepageHeader;

    @FindBy (xpath = "//a[@class='app-logo']")
    public WebElement title;


    @FindBy  (id="user-menu")                       //(xpath= "//a[@href=javascript: void(0);]")
    public WebElement usernameInProfile;


   // @FindBy (xpath = "//li[@class=\'dropdown user-menu-dropdown\']")
   // public WebElement dropdownmenu;

    @FindBy (xpath = "//li//a[@class='dropdown-toggle']")
    public WebElement dropdownmenu;


    @FindBy (xpath = "//a[@class=\"no-hash\"]")
    public WebElement LogoutButton;



}
