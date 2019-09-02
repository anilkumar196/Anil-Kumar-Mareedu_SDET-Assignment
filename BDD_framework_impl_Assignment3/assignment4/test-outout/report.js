$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/Josnika/eclipse-workspace/assignment4/src/test/java/com/Features/OHRMlogin.feature");
formatter.feature({
  "line": 1,
  "name": "OrangeHRM application login test",
  "description": "",
  "id": "orangehrm-application-login-test",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "orange HRM login test",
  "description": "",
  "id": "orangehrm-application-login-test;orange-hrm-login-test",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "web browser is initialized",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user enters correct username and password",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user should be successfully login to HRM home page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.web_browser_is_initialized()"
});
formatter.result({
  "duration": 8867490076,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_enters_correct_username_and_password()"
});
formatter.result({
  "duration": 2071104884,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_should_be_successfully_login_to_HRM_home_page()"
});
formatter.result({
  "duration": 89341478,
  "status": "passed"
});
});