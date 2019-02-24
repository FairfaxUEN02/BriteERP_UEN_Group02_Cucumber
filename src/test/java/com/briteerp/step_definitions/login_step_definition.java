package com.briteerp.step_definitions;

import com.briteerp.pages.DataBasePage;
import com.briteerp.pages.HomePage;
import com.briteerp.pages.LoginPage;
import com.briteerp.utilities.ConfigurationReader;
import com.briteerp.utilities.Driver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class login_step_definition {
    @Given("user on the data base page")
    public void user_on_the_data_base_page() {
       Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @Then("user selects the data base")
    public void user_selects_the_data_base() {
        DataBasePage dataBasePage = new DataBasePage();
        dataBasePage.selectEnvironment();

    }

    @Then("user logs in using {string} and {string}")
    public void user_logs_in_using_and(String email, String password) {
       LoginPage loginPage = new LoginPage();
       loginPage.login(ConfigurationReader.getProperty("email"),ConfigurationReader.getProperty("password"));

    }

    @When("the user clicks on Point of Sale")
    public void the_user_clicks_on_Point_of_Sale() {
        HomePage homePage = new HomePage();
        homePage.pointOfSaleElement.click();
    }

}
