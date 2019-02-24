package com.briteerp.step_definitions;

import com.briteerp.pages.HomePage;
import com.briteerp.pages.PosCategories;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.ui.Select;

public class createCategorySD {

    @When("the user clicks on the Create button")
    public void the_user_clicks_on_the_Create_button() {
        PosCategories posCategories= new PosCategories();
        posCategories.createButton.click();
    }

    @Then("the user enter a valid name of the new category")
    public void the_user_enter_a_valid_name_of_the_new_category() {
        PosCategories posCategories= new PosCategories();
        posCategories.fullName.sendKeys("random_type");
    }

    @Then("the user clicks save button")
    public void the_user_clicks_save_button() {
        PosCategories posCategories= new PosCategories();
        posCategories.saveButton.click();
    }

    @Then("the user select a valid parent category from the dropdown box")
    public void the_user_select_a_valid_parent_category_from_the_dropdown_box() {
        PosCategories posCategories = new PosCategories();
        Select select= new Select(posCategories.types);
        select.selectByValue("1");
        posCategories.saveButton.click();
    }

}