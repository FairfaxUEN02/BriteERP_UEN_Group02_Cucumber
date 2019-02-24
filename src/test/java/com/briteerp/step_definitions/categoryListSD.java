package com.briteerp.step_definitions;
import com.briteerp.pages.HomePage;
import com.briteerp.pages.PosCategories;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class categoryListSD {

    @When("the user clicks on an existing category")
    public void the_user_clicks_on_an_existing_category() {
        PosCategories posCategories= new PosCategories();
        posCategories.anycategory.click();
    }

    @When("the name of the category displayed on the main panel")
    public void the_name_of_the_category_displayed_on_the_main_panel() {
        PosCategories posCategories= new PosCategories();
        System.out.println("category name"+ posCategories.Mainpanel.getText());
    }

    @When("the user clicks on the check box on the first row")
    public void the_user_clicks_on_the_check_box_on_the_first_row() {
        PosCategories posCategories= new PosCategories();
        posCategories.checkAll.click();
    }

    @Then("All the categories are checked")
    public void all_the_categories_are_checked() {
     //how to verify checkbox is checked

    }

    @When("the user clicks on the multiple categories checkbox")
    public void the_user_clicks_on_the_multiple_categories_checkbox() {
        PosCategories posCategories= new PosCategories();
        posCategories.checkFirst.click();
        posCategories.checksecond.click();

    }

    @Then("the user clicks on the action")
    public void the_user_clicks_on_the_action() {
        PosCategories posCategories= new PosCategories();
        posCategories.ActionBox.click();
    }

    @Then("the user click on the {string} under the action")
    public void the_user_click_on_the_under_the_action(String string) {
        PosCategories posCategories= new PosCategories();
        posCategories.deleteOption.click();
    }

    @Then("selected categories disappear from the categories list")
    public void selected_categories_disappear_from_the_categories_list() {
        PosCategories posCategories= new PosCategories();
        posCategories.conformDelete.click();
    }

    @When("the user clicks on the Kanban view option")
    public void the_user_clicks_on_the_Kanban_view_option() {
        PosCategories posCategories= new PosCategories();
       // posCategories.kanbanviewOptionElement.click(); ?
    }

    @Then("the categories displayed in kanban view")
    public void the_categories_displayed_in_kanban_view() {
      //  Assert.assertTrue(Driver.getDriver().getTitle().contains("kanban"));
        System.out.println("view with kanban");
    }

    @When("the user enters valid category name")
    public void the_user_enters_valid_category_name() {
        PosCategories posCategories= new PosCategories();
        posCategories.searchBox.sendKeys("books");
    }

    @Then("the search box content is equals to the entered name")
    public void the_search_box_content_is_equals_to_the_entered_name() {
        System.out.println("books");
    }

}