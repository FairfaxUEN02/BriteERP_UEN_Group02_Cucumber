package com.briteerp.step_definitions;

import com.briteerp.pages.HomePage;
import com.briteerp.pages.PosReportingOrder;
import com.briteerp.utilities.BrowserUtils;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class reportingChartsSD {


    PosReportingOrder posReportingOrder = new PosReportingOrder();


    @Then("user clicks on Orders under the Reporting")
    public void user_clicks_on_Orders_under_the_Reporting() {
        HomePage homePage = new HomePage();
        homePage.reportingOrdersElement.click();
    }


    @When("user clicks Bar Chart")
    public void user_clicks_Bar_Chart() {
        posReportingOrder.barChart.click();
    }

    @Then("verify that the Bar Chart displayed")
    public void verify_that_the_Bar_Chart_displayed() {
        Assert.assertTrue(posReportingOrder.barChartImageElement.isDisplayed());
    }

    @When("user clicks Line Chart")
    public void user_clicks_Line_Chart() {
        posReportingOrder.lineChart.click();
    }

    @Then("verify that the Line Chart displayed")
    public void verify_that_the_Line_Chart_displayed() {
        Assert.assertTrue(posReportingOrder.lineChartImageElement.isDisplayed());
    }

    @When("user clicks Pie Chart")
    public void user_clicks_Pie_Chart() {
        posReportingOrder.pieChart.click();
    }

    @Then("verify that the Error Message has displayed")
    public void verify_that_the_Error_Message_has_displayed() {
        Assert.assertTrue(posReportingOrder.pieChartErrorMessage.isDisplayed());
    }
}
