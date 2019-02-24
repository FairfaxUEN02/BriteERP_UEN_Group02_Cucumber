package com.briteerp.pages;

import com.briteerp.utilities.Driver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HomePage {
    public HomePage() {
        PageFactory.initElements(Driver.getDriver(),
                this);
    }


    @FindBy(xpath = "//div[@class='oe_secondary_menu_section active']//span[@class='oe_menu_text'][contains(text(),'Dashboard')]")
    public WebElement dashBoardElement;

    @FindBy(xpath = "(//a[@class='oe_menu_leaf'])[8]")
    public WebElement ordersOrdersElement;

    @FindBy(xpath = "(//a[@class='oe_menu_leaf'])[9]")
    public WebElement ordersSessionsElement;

    @FindBy(xpath = "/html/body/div[1]/div[1]/div[1]/div[6]/ul[2]/li[1]/a/span")
    public WebElement catalogProductsElement;

    @FindBy(xpath = "(//a[@class='oe_menu_leaf'])[11]")
    public WebElement catalogPriceListElement;

    @FindBy(xpath = "(//a[@class='oe_menu_leaf'])[12]")
    public WebElement reportingOrdersElement;

    @FindBy(xpath = "(//a[@class='oe_menu_leaf'])[13]")
    public WebElement reportingSalesDetailsElement;

    @FindBy(xpath = "(//a[@class='oe_menu_leaf'])[14]")
    public WebElement configPosElement;

    @FindBy(xpath = "//span[contains(text(),'PoS Categories')]")
    public WebElement POSCategoriesElement;

    @FindBy(xpath = "//a[@href='/web#menu_id=484&action=']")
    public WebElement pointOfSaleElement;


    @FindBy(xpath = "//div[@class='o_mail_chat_sidebar']")
    public WebElement sideBarElement;

    @FindBy(xpath  ="/html/body/div[1]/div[1]/div[1]/div[6]/ul[4]/li[2]/a")
    public WebElement productButton;

    public String currentTitle = "Point of Sale - Odoo";


}
