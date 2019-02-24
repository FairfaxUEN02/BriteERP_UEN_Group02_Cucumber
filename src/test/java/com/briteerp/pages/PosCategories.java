package com.briteerp.pages;

import com.briteerp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.xpath.XPath;

public class PosCategories {
    public PosCategories() {

        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "/html/body/div[1]/div[1]/div[1]/div[6]/ul[4]/li[2]/a/span")
    public WebElement Productclick;

    @FindBy(xpath = "/html/body/div[1]/div[1]/div[1]/div[6]/ul[4]/li[2]/ul/li/a/span")
    public WebElement Poscategory;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[2]/div/div/div/table/tbody/tr[1]/td[3]")
    public WebElement anycategory;

    @FindBy (xpath = "/html/body/div[1]/div[2]/div[1]/ol/li[2]")
    public WebElement Mainpanel;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[3]/div[3]/button[1]")
    public WebElement kanbanviewOptionElement;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[2]/div/div/div/table/thead/tr/th[1]/div/input")
    public WebElement checkAll;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[2]/div/div/div/table/tbody/tr[1]/td[1]/div")
    public WebElement checkFirst;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[2]/div/div/div/table/tbody/tr[2]/td[1]/div/input")
    public WebElement checksecond;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[2]/div[2]/div/div[2]/button")
    public WebElement ActionBox;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[2]/div[2]/div/div[2]/ul/li[2]/a")
    public WebElement deleteOption;

    @FindBy(xpath = "/html[1]/body[1]/div[5]/div[1]/div[1]/div[3]/button[1]/span[1]")
    public WebElement conformDelete;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[2]/div[1]/div/button[1] ")
    public WebElement formtoWritenames;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/button[1]")
    public WebElement createButton;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/input[1]")
    public WebElement fullName;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[2]/div[1]/div/div[2]/button[1]")
    public WebElement saveButton;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[2]/div[2]/div/div[3]")
    public WebElement actionButton;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[2]/div[2]/div/div[3]/ul/li[2]/a")
    public WebElement DuplicateButton;

    @FindBy(xpath = "(//*[@class='o_dropdown_toggler_btn btn btn-sm dropdown-toggle'])[2]")
    public WebElement AddAttachment;

    @FindBy(className = "o_input_file")
    public WebElement AddbuttonforAttach;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[2]/div[1]/div/div[1]/button[1]")
    public WebElement editButton;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[2]/div/div/div/div/div/div[1]/div/span[1]")
    public WebElement editPhoto;

    @FindBy(xpath = "//*[@id=\"o_field_input_113\"]")
    public WebElement switchbox;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[2]/div/div/div/div/div/div[2]/table/tbody/tr[2]/td[2]/div/div/span")
    public WebElement types;

    @FindBy (xpath= "/html/body/div[1]/div[2]/div[1]/div[1]/div/input")
    public WebElement searchBox;

    @FindBy (xpath = "/html/body/div[1]/div[2]/div[1]/div[1]/div/div/div[1]/span")
    public WebElement searchElement;

    @FindBy (xpath = "//div[@class='o_form_sheet']//div[@class='o_input_dropdown']/input")
    public  WebElement dropdownforType;

    @FindBy (linkText = "boots")
    public WebElement typeOne;




}
