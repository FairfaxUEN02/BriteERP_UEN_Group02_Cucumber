$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src\\test\\resources\\features\\configPOSedit.feature");
formatter.feature({
  "name": "As a POS Manager I should be able to edit the point of sale on it’s page",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "As a POS Manager I should be able to edit the point of sale on it’s page",
  "description": "\t\tFeature: Config POS edit page\n\n\t\tBackground:",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@BRIT-4211"
    },
    {
      "name": "@wip"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user on the point of sale page",
  "keyword": "Given "
});
formatter.match({
  "location": "edit_ConfigPOS_step.user_on_the_point_of_sale_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks on Point of Sale under Configuration",
  "keyword": "Then "
});
formatter.match({
  "location": "edit_ConfigPOS_step.the_user_clicks_on_Point_of_Sale_under_Configuration()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "user should able to change point of sale status from active to archived",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user on the point of sale page under Configuration",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user clicks on an existing point of sale name",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user clicks Archive button",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "the archived text should display on the page",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "user should able to set point of sale as Bar/Restaurant",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user on the point of sale edit page",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user clicks Is a Bar/Restaurant check box and save",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "the Bar/Restaurant check box should be selected on the page",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "status": "passed"
});
formatter.uri("src\\test\\resources\\features\\login.feature");
formatter.feature({
  "name": "login functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Pos manager login",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user on the data base page",
  "keyword": "Given "
});
formatter.match({
  "location": "login_step_definition.user_on_the_data_base_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user selects the data base",
  "keyword": "Then "
});
formatter.match({
  "location": "login_step_definition.user_selects_the_data_base()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user logs in using \"in_pos_manager@info.com\" and \"KjKtfgrs30\"",
  "keyword": "Then "
});
formatter.match({
  "location": "login_step_definition.user_logs_in_using_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks on Point of Sale",
  "keyword": "When "
});
formatter.match({
  "location": "login_step_definition.the_user_clicks_on_Point_of_Sale()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});