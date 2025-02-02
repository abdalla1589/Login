package tests;

import base.HooksHandler;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;

import java.time.Duration;

public class StepDef{
    private WebDriver driver = HooksHandler.driver;
    protected LoginPage loginPage;

    @Given("Website is opened")
    public void websiteIsOpened()
    {
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/log");
        loginPage=new LoginPage(driver);
    }

    @When("User login with {string} and {string}")
    public void user_login_with_and(String username, String password){
        loginPage.setUserName(username);
        loginPage.setPassword(password);
    }
    @Then("User click on login button")
    public void user_click_on_login_button() {
        loginPage.clickLoginButton();
    }


}
