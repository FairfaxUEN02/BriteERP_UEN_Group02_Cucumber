package com.briteerp.step_definitions;

import com.briteerp.pages.ConfigPOSPage;
import com.briteerp.pages.HomePage;
import com.briteerp.utilities.BrowserUtils;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import com.briteerp.utilities.Driver;



public class edit_ConfigPOS_step {
    // ====================  Almira   ===============================
    HomePage homePage = new HomePage();
    ConfigPOSPage configPOSPage = new ConfigPOSPage();

    @Given("user on the point of sale page")
    public void user_on_the_point_of_sale_page() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Point of Sale"));
    }

    @Then("the user clicks on Point of Sale under Configuration")
    public void the_user_clicks_on_Point_of_Sale_under_Configuration() {
        homePage.configPosElement.click();
    }

    @Given("user on the point of sale page under Configuration")
    public void user_on_the_point_of_sale_page_under_Configuration() {
        Assert.assertEquals(Driver.getDriver().getTitle(),configPOSPage.ExpectedTitle);
    }

    @When("user clicks on an existing point of sale name")
    public void user_clicks_on_an_existing_point_of_sale_name() {
        configPOSPage.allPOSList.get(configPOSPage.allPOSList.size()-1).click();
    }

    @Then("user clicks Archive button")
    public void user_clicks_Archive_button() {
        configPOSPage.ArchiveElement.click();
    }

    @Then("the archived text should display on the page")
    public void the_archived_text_should_display_on_the_page() {
        Assert.assertEquals(configPOSPage.ArchiveButtonText.getText(),"Active");
    }

    @Then("user clicks Is a Bar\\/Restaurant check box and save")
    public void user_clicks_Is_a_Bar_Restaurant_check_box_and_save() {
        configPOSPage.UnSelect();
        BrowserUtils.wait(2);
        configPOSPage.BarCheckElement.click();
        BrowserUtils.wait(2);
        configPOSPage.POSSaveButton.click();
    }

    @Then("user clicks on edit button")
    public void user_clicks_on_edit_button() {
        configPOSPage.EditElement.click();
    }

    @Then("the Bar\\/Restaurant check box should be selected on the page")
    public void the_Bar_Restaurant_check_box_should_be_selected_on_the_page() {
        Assert.assertTrue(configPOSPage.BarCheckElement.isSelected());
    }

    @Then("user clicks edit button")
    public void user_clicks_edit_button() {
        configPOSPage.EditElement.click();
    }

    @Then("user change the name and click save")
    public void user_change_the_name_and_click_save() {
        configPOSPage.POSinputElement.clear();
        BrowserUtils.wait(2);
        configPOSPage.POSinputElement.sendKeys("Name changed");
        BrowserUtils.wait(2);
        configPOSPage.POSSaveButton.click();
    }

    @Then("the POS name should be displayed with edited name")
    public void the_POS_name_should_be_displayed_with_edited_name() {
        Assert.assertTrue(configPOSPage.NewPOSTitleElement.getText().contains("Name changed"));
    }

    @Then("user clicks Set Start Category checkbox and choose category")
    public void user_clicks_Set_Start_Category_checkbox_and_choose_category() {
        configPOSPage.startCategoryCheckBox.click();
        BrowserUtils.wait(2);
        configPOSPage.startCategoryDropDown.click();
        BrowserUtils.wait(2);
        configPOSPage.CategoryName.click();
    }

    @Then("user clicks save button")
    public void user_click_save_button() {
        configPOSPage.POSSaveButton.click();
        BrowserUtils.wait(3);
    }

    @Then("the edited start Category should be displayed on the page")
    public void the_edited_start_Category_should_be_displayed_on_the_page() {
        Assert.assertEquals(configPOSPage.CatagoryDisplay.getText(),"clothes");
    }

    @Then("user selects operation type and save")
    public void user_selects_operation_type_and_save() {
        configPOSPage.TypeSelectElement.click();
        BrowserUtils.wait(2);
        configPOSPage.CWRtypeLink.click();
        BrowserUtils.wait(2);
        configPOSPage.POSSaveButton.click();
        BrowserUtils.wait(2);
    }

    @Then("the operation type should changed to selected type")
    public void the_operation_type_should_changed_to_selected_type() {
        Assert.assertEquals(configPOSPage.TypeDisplayElement.getText(),"Chicago Warehouse: Receipts");
    }

    @Then("user clicks the Header & Footer checkbox and enter valid credentials")
    public void user_clicks_the_Header_Footer_checkbox_and_enter_valid_credentials() {
        configPOSPage.HeaderFooterCheckBox.click();
        BrowserUtils.wait(2);
        configPOSPage.HeaderTextarea.sendKeys("Welcome to the store");
        configPOSPage.FooterTextarea.sendKeys("Thank you for shopping with us");
    }
}
