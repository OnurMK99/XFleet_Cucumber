package com.xfleet.step_definitions;

import com.xfleet.pages.Loginpage;
import com.xfleet.pages.Homepage;
import com.xfleet.utilities.BrowserUtils;
import com.xfleet.utilities.ConfigurationReader;
import com.xfleet.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginFunction {

    Loginpage loginpage= new Loginpage();
    Homepage homepage= new Homepage();




    @Given("User is on XFleet Login page")
    public void user_is_on_x_fleet_login_page() {
       // Driver.getDriver().get(" https://qa.xfleetsolutions.com/user/login");
        Driver.getDriver().get(ConfigurationReader.getProperty("web.site"));

    }

// AC 1
    @When("user enters username {string}")
    public void user_enters_username(String string) {
        loginpage.loginusername.sendKeys(string);
    }
    @When("user enters password {string}")
    public void user_enters_password(String string) {
        loginpage.loginpassword.sendKeys(string);
    }
    @When("user clicks the login button")
    public void user_clicks_the_login_button() {
       BrowserUtils.sleep(2);
        loginpage.clickbutton.click();
    }
    @Then("user sees {string}")
    public void user_sees(String string) {
      //  Assert.assertTrue(homepage.homepageHeader.isDisplayed());
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOf(homepage.homepageHeader));
        Assert.assertTrue(homepage.homepageHeader.getText().equals(string));
    }


    // Acceptance Criteria 2
    @Then("user sees the alert of {string}")
    public void userSeesTheAlertOf(String InvalidCredential) {

        Assert.assertTrue(loginpage.invalidCredentialAlert.getText().equals(InvalidCredential));
    }


    // AC 3
    @Then("user sees the message of {string}")
    public void user_sees_the_message_of(String validationMessage) {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        BrowserUtils.sleep(3);
        String message = (String) js.executeScript("return arguments[0].validationMessage;", loginpage.loginpassword);
        System.out.println("message = " + message);

    }


    // AC 4
    @When("user clicks the Forgot your password? button")
    public void userClicksTheForgotYourPasswordButton() {
        loginpage.forgotPasswordButton.click();
    }

    @Then("user lands on the {string} page")
    public void userLandsOnThePage(String forgotPasswordHeader) {
        Assert.assertTrue(loginpage.forgotPasswordHeader.getText().equals(forgotPasswordHeader));
    }



    // AC 5
    @When("user sees the Remember Me link on the login page")
    public void userSeesTheRememberMeLinkOnTheLoginPage() {
        Assert.assertTrue(loginpage.rememberMeLink.isDisplayed());

    }


    @Then("user can click the Remember Me checkbox")
    public void userCanClickTheRememberMeCheckbox() {

        loginpage.rememberMeCheckbox.click();
        BrowserUtils.sleep(2);
        Assert.assertTrue(loginpage.rememberMeCheckbox2.isSelected());
    }

    // AC 6
    @When("user enters password")
    public void userEntersPassword() {
        loginpage.loginpassword.sendKeys("UserUser123");
    }


    @Then("user can see the password in bullet signs")
    public void userCanSeeThePasswordInBulletSigns() {
        Assert.assertTrue(loginpage.loginpassword.getAttribute("type").equals("password"));

    }


    //   Faker faker= new Faker();
    WebDriverWait wait;

    //AC 7
    @When("user enters username")
    public void userEntersUsername() {
        // loginpage.loginusername.sendKeys(faker.bothify);
        loginpage.loginusername.sendKeys("user1");
        loginpage.loginusername.sendKeys(Keys.ENTER);
    }
    @Then("user can pass through to the password box")
    public void userCanPassThroughToThePasswordBox() {
        Assert.assertTrue(loginpage.loginpassword.isEnabled());

    }
    @And("user enters the password")
    public void userEntersThePassword() {
        loginpage.loginpassword.sendKeys("UserUser123");
        BrowserUtils.sleep(2);
        loginpage.loginpassword.sendKeys(Keys.ENTER);

    }
    @Then("user can  click the login button")
    public void userCanClickTheLoginButton() {
        //Assert.assertTrue(loginpage.loginpassword.sendKeys(Keys.ENTER) );
        BrowserUtils.sleep(3);
        // wait =new WebDriverWait(Driver.getDriver(),30);
        // wait.until(ExpectedConditions.visibilityOf(loginpage.clickbutton));
        Assert.assertTrue(homepage.title.isDisplayed());

    }

    // AC 8
    @Then("user sees {string} in the profile menu")
    public void userSeesInTheProfileMenu(String name) {
        BrowserUtils.sleep(15);
        wait = new WebDriverWait(Driver.getDriver(), 60);

        wait.until(ExpectedConditions.visibilityOf(homepage.usernameInProfile));
        Assert.assertTrue(homepage.usernameInProfile.getText().equals(name));
    }












}
