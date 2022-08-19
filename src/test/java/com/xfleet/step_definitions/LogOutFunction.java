package com.xfleet.step_definitions;

import com.xfleet.pages.Homepage;
import com.xfleet.pages.Loginpage;
import com.xfleet.utilities.BrowserUtils;
import com.xfleet.utilities.ConfigurationReader;
import com.xfleet.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LogOutFunction {

    Loginpage loginpage= new Loginpage();
    Homepage homepage= new Homepage();
    WebDriverWait wait;


 //   @And("user is on the {string}")
  //  public void userIsOnThe(String string) {
   // }

    @And("user is on  title page")
    public void userIsOnTitlePage() {
        BrowserUtils.sleep(15);
        wait = new WebDriverWait(Driver.getDriver(), 60);
        wait.until(ExpectedConditions.visibilityOf(homepage.title));
        Assert.assertTrue(homepage.title.isDisplayed());

    }


    @And("user clicks Logout Dropdown menu")
    public void user_clicks_logout_dropdown_menu() {
        BrowserUtils.sleep(15);
        wait = new WebDriverWait(Driver.getDriver(), 60);

        wait.until(ExpectedConditions.visibilityOf(homepage.dropdownmenu));

        homepage.dropdownmenu.click();

    }

    @And("user clicks Logout button in the Dropdown menu")
    public void user_clicks_logout_button_in_the_dropdown_menu() {
        homepage.LogoutButton.click();
    }
    @Then("user sees Login Page")
    public void user_sees_login_page() {
        Assert.assertTrue(loginpage.LoginPageHeader.isDisplayed());
    }


    // AC 2
    @When("user clicks the stepback button")
    public void user_clicks_the_stepback_button() {
        Driver.getDriver().navigate().back();

    }

    @Then("user cannot see homepage title")
    public void userCannotSeeHomepageTitle() {
        Assert.assertTrue(loginpage.LoginPageHeader.isDisplayed());
        //Assert.assertFalse(homepage.title.isDisplayed());

    }


    String currentURL= "";

    // AC 3
    @And("user closes the open website tab and tabs")
    public void userClosesTheOpenWebsiteTabAndTabs() {
        // wait.until(ExpectedConditions.visibilityOf(homepage.title));
        //  Driver.getDriver().close();
        currentURL=Driver.getDriver().getCurrentUrl();
        Driver.getDriver().close();
        Driver.setDriver();
    }



    @And("user reenters the website")
    public void userReentersTheWebsite() {
        // BrowserUtils.sleep(3);
        // WebDriverManager.chromedriver().setup();
        //   WebDriver driver2= new ChromeDriver();
        // driver2.get(currentURL);
        // Driver.getDriver().get(ConfigurationReader.getProperty("web.site"));
        Driver.getDriver().get(currentURL);
    }


    @Then("user cannot land on the title page")
    public void userCannotLandOnTheTitlePage() {
        // BrowserUtils.sleep(15);
        //   wait= new WebDriverWait(Driver.getDriver(),60);
        //  wait.until(ExpectedConditions.visibilityOf(homepage.title));

        //  Assert.assertTrue(homepage.title.isDisplayed());
        //Assert.assertTrue(loginpage.LoginPageHeader.isDisplayed());
        Assert.assertNotEquals(currentURL, ConfigurationReader.getProperty("web.site"));
    }









}
