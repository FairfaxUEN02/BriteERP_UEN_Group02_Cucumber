package com.briteerp.step_definitions;

import com.briteerp.pages.ConfigPOSPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import com.briteerp.utilities.Driver;



public class edit_ConfigPOS_step {
    // ====================  Almira   ===============================
    ConfigPOSPage configPOSPage = new ConfigPOSPage();

    @Given("user on the point of sale page")
    public void user_on_the_point_of_sale_page() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Point of Sale"));
    }

    @Then("the user clicks on Point of Sale under Configuration")
    public void the_user_clicks_on_Point_of_Sale_under_Configuration() {

    }

    @Given("user on the point of sale page under Configuration")
    public void user_on_the_point_of_sale_page_under_Configuration() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("user clicks on an existing point of sale name")
    public void user_clicks_on_an_existing_point_of_sale_name() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("user clicks Archive button")
    public void user_clicks_Archive_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("the archived text should display on the page")
    public void the_archived_text_should_display_on_the_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Given("user on the point of sale edit page")
    public void user_on_the_point_of_sale_edit_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("user clicks Is a Bar\\/Restaurant check box and save")
    public void user_clicks_Is_a_Bar_Restaurant_check_box_and_save() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("the Bar\\/Restaurant check box should be selected on the page")
    public void the_Bar_Restaurant_check_box_should_be_selected_on_the_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }


}
