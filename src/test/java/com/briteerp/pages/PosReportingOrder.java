package com.briteerp.pages;

import com.briteerp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class PosReportingOrder {


    public PosReportingOrder() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//button[@class='btn btn-icon fa fa-lg fa-bar-chart o_cp_switch_graph active']")
    public WebElement graphElement;

    @FindBy(xpath = "//button[@class='btn btn-icon fa fa-lg fa-table o_cp_switch_pivot']")
    public WebElement pivotElement;

    @FindBy(xpath = "//div[@class='o_graph']")
    public WebElement graphImageElement;

    @FindBy(xpath = "//div[@class='o_view_manager_content']")
    public WebElement pivotImageElement;

    @FindBy(xpath = "//button[@class='btn btn-default fa fa-bar-chart-o o_graph_button active']")
    public WebElement barChart;


    @FindBy(xpath = "//*[@class='nvd3 nv-wrap nv-multiBarWithLegend']")
    public WebElement barChartImageElement;


    @FindBy(xpath = "//button[@class='btn btn-default fa fa-line-chart o_graph_button']")
    public WebElement lineChart;


    @FindBy(xpath = "//*[@class='nvd3 nv-wrap nv-lineChart']")
    public WebElement lineChartImageElement;


    @FindBy(xpath = "//button[@class='btn btn-default fa fa-pie-chart o_graph_button']")
    public WebElement pieChart;


    @FindBy(xpath = "(//div[@class='oe_view_nocontent']/p)[2]")
    public WebElement pieChartErrorMessage;


    @FindBy(xpath = "btn btn-default fa fa-expand o_pivot_flip_button")
    public WebElement flipAxis;


    @FindBy(xpath = "(//*[@class='o_pivot_measure_row text-muted hidden-xs'])[6]")
    public WebElement flipAxisImageElement;


    @FindBy(xpath = "(//*[@class='btn-group btn-group-sm'])[1]")
    public WebElement measureTable;

    @FindBy(xpath = "//ul[@class='dropdown-menu o_graph_measures_list']/li")
    public List<WebElement> graphMeasureTable;

    @FindBy(xpath = "//*[@class='nv-legend-text']")
    public WebElement measureOptionText;

    @FindBy(xpath = "//button[@class='btn btn-primary btn-sm dropdown-toggle']")
    public WebElement measureTable2;

    @FindBy(xpath = "//ul[@class='dropdown-menu o_pivot_measures_list']/li")
    public List<WebElement> pivotMeasureTable;

    @FindBy(xpath = "//button[@class='btn btn-default fa fa-download o_pivot_download']")
    public WebElement downloadButton;

}
