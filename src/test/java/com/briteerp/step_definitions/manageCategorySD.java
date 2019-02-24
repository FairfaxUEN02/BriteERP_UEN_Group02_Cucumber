package com.briteerp.step_definitions;

import com.briteerp.pages.HomePage;
import com.briteerp.pages.PosCategories;
import com.briteerp.utilities.BrowserUtils;
import com.briteerp.utilities.Driver;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class manageCategorySD {
    @Then("the user clicks on products")
    public void the_user_clicks_on_products() {
        HomePage homePage= new HomePage();
        homePage.productButton.click();
    }

    @Then("the user click on Pos Categories")
    public void the_user_click_on_Pos_Categories() {
        HomePage homePage= new HomePage();
        homePage.POSCategoriesElement.click();
    }

    @Then("the user clicks on any category")
    public void the_user_clicks_on_any_category() {
      PosCategories posCategories= new PosCategories();
      posCategories.anycategory.click();
    }

    @When("the user clicks on the Attachments")
    public void the_user_clicks_on_the_Attachments() {
        BrowserUtils.wait(3);
        PosCategories posCategories= new PosCategories();
        posCategories.AddAttachment.click();
    }

    @Then("the user clicks on the Add under the Attachments")
    public void the_user_clicks_on_the_Add_under_the_Attachments() {
        BrowserUtils.wait(2);
        PosCategories posCategories= new PosCategories();
        posCategories.AddbuttonforAttach.click();
    }

    @Then("user clicks on the valid file to open")
    public void user_clicks_on_the_valid_file_to_open() {
        System.out.println("selecting file from local");
    }

    @When("the user clicks on the edit")
    public void the_user_clicks_on_the_edit() {
        PosCategories posCategories= new PosCategories();
        posCategories.editButton.click();

    }

    @Then("the user select the type from the dropdown box")
    public void the_user_select_the_type_from_the_dropdown_box() {
        BrowserUtils.wait(3);
       PosCategories posCategories= new PosCategories();
       posCategories.dropdownforType.click();
       posCategories.typeOne.click();

    }

    @Then("the user clicks on Save")
    public void the_user_clicks_on_Save() {
        BrowserUtils.wait(3);
        PosCategories posCategories= new PosCategories();
        posCategories.saveButton.click();
        BrowserUtils.wait(3);
    }


}
