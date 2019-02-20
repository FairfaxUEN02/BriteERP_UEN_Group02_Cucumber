package com.briteerp.step_definitions;

import com.briteerp.pages.PosReportingOrder;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class reportingViewSD {

    PosReportingOrder posReportingOrder = new PosReportingOrder();

    @When("the user clicks the graph view preference")
    public void the_user_clicks_the_graph_view_preference() {
        posReportingOrder.graphElement.click();
    }

    @Then("the system should display the graph view")
    public void the_system_should_display_the_graph_view() {
        Assert.assertTrue(posReportingOrder.graphImageElement.isDisplayed());
    }

    @When("the user clicks the pivot view preference")
    public void the_user_clicks_the_pivot_view_preference() {
        posReportingOrder.pivotElement.click();
    }

    @Then("the system should display the pivot view")
    public void the_system_should_display_the_pivot_view() {
        Assert.assertTrue(posReportingOrder.pivotElement.isDisplayed());
    }
}
