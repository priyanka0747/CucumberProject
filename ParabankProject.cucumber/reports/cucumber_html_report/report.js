$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/resources/feature/para.feature");
formatter.feature({
  "line": 2,
  "name": "ParaBank Website",
  "description": "",
  "id": "parabank-website",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Registration\u0026Login_Feature"
    }
  ]
});
formatter.scenario({
  "line": 6,
  "name": "Validate the Registration functionality",
  "description": "",
  "id": "parabank-website;validate-the-registration-functionality",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@tc_01"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "the user launch the chrome application",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "the user open the Parabank Registration page",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "user gives the details and submits the registration",
  "keyword": "Then "
});
formatter.match({
  "location": "ParaRegisterChrome.the_user_launch_the_chrome_application()"
});
formatter.result({
  "duration": 14512510100,
  "status": "passed"
});
formatter.match({
  "location": "ParaRegisterChrome.the_user_open_the_Parabank_Registration_page()"
});
formatter.result({
  "duration": 12422313000,
  "status": "passed"
});
formatter.match({
  "location": "ParaRegisterChrome.user_gives_the_details_and_submits_the_registration()"
});
formatter.result({
  "duration": 89622857700,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Validate the login functionality",
  "description": "",
  "id": "parabank-website;validate-the-login-functionality",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 13,
      "name": "@tc_02"
    }
  ]
});
formatter.step({
  "line": 16,
  "name": "the user launch the chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "the user open the Parabankpage",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "enter username and password then login",
  "keyword": "Then "
});
formatter.match({
  "location": "ParaLoginChrome.the_user_launch_the_chrome_browser()"
});
formatter.result({
  "duration": 10568337800,
  "status": "passed"
});
formatter.match({
  "location": "ParaLoginChrome.the_user_open_the_Parabankpage()"
});
formatter.result({
  "duration": 8860819400,
  "status": "passed"
});
formatter.match({
  "location": "ParaLoginChrome.enter_username_and_password_then_login()"
});
formatter.result({
  "duration": 42050116100,
  "status": "passed"
});
formatter.scenario({
  "line": 22,
  "name": "Validate the bill pay  functionality",
  "description": "",
  "id": "parabank-website;validate-the-bill-pay--functionality",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 21,
      "name": "@tc_03"
    }
  ]
});
formatter.step({
  "line": 24,
  "name": "the user launch the chrome",
  "keyword": "Given "
});
formatter.step({
  "line": 25,
  "name": "the user open the Parabank Login Page",
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "the user login to the account",
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "the user fills the details of the bill pay",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "submit the bill pay",
  "keyword": "And "
});
formatter.match({
  "location": "ParaBillpayChrome.the_user_launch_the_chrome()"
});
formatter.result({
  "duration": 8090805700,
  "status": "passed"
});
formatter.match({
  "location": "ParaBillpayChrome.the_user_open_the_Parabank_Login_Page()"
});
formatter.result({
  "duration": 11548996500,
  "status": "passed"
});
formatter.match({
  "location": "ParaBillpayChrome.the_user_login_to_the_account()"
});
formatter.result({
  "duration": 8808449600,
  "status": "passed"
});
formatter.match({
  "location": "ParaBillpayChrome.the_user_fills_the_details_of_the_bill_pay()"
});
formatter.result({
  "duration": 4750259500,
  "status": "passed"
});
formatter.match({
  "location": "ParaBillpayChrome.submit_the_bill_pay()"
});
formatter.result({
  "duration": 3660218500,
  "status": "passed"
});
formatter.scenario({
  "line": 31,
  "name": "Validate the CustomerCare Message",
  "description": "",
  "id": "parabank-website;validate-the-customercare-message",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 30,
      "name": "@tc_04"
    }
  ]
});
formatter.step({
  "line": 33,
  "name": "the user launchs the chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 34,
  "name": "the user open the Parabank HomePage",
  "keyword": "When "
});
formatter.step({
  "line": 35,
  "name": "the user opens the msg and fill the details",
  "keyword": "Then "
});
formatter.step({
  "line": 36,
  "name": "send the message to customer care",
  "keyword": "And "
});
formatter.match({
  "location": "ParaMrssagetocustomerChrome.the_user_launchs_the_chrome_browser()"
});
formatter.result({
  "duration": 10442689700,
  "status": "passed"
});
formatter.match({
  "location": "ParaMrssagetocustomerChrome.the_user_open_the_Parabank_HomePage()"
});
formatter.result({
  "duration": 10613211600,
  "status": "passed"
});
formatter.match({
  "location": "ParaMrssagetocustomerChrome.the_user_opens_the_msg_and_fill_the_details()"
});
formatter.result({
  "duration": 4853068000,
  "status": "passed"
});
formatter.match({
  "location": "ParaMrssagetocustomerChrome.send_the_message_to_customer_care()"
});
formatter.result({
  "duration": 5116871600,
  "status": "passed"
});
formatter.scenario({
  "line": 39,
  "name": "Validate the submission details of AdminPage",
  "description": "",
  "id": "parabank-website;validate-the-submission-details-of-adminpage",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 38,
      "name": "@tc_05"
    }
  ]
});
formatter.step({
  "line": 41,
  "name": "the user launch the chromebrowser",
  "keyword": "Given "
});
formatter.step({
  "line": 42,
  "name": "the user open the Parabank Homepage",
  "keyword": "When "
});
formatter.step({
  "line": 43,
  "name": "the user select the Admin Page",
  "keyword": "Then "
});
formatter.step({
  "line": 44,
  "name": "the user submits the Administration Page",
  "keyword": "And "
});
formatter.match({
  "location": "ParaAdminChrome.the_user_launch_the_chromebrowser()"
});
formatter.result({
  "duration": 10318295800,
  "status": "passed"
});
formatter.match({
  "location": "ParaAdminChrome.the_user_open_the_Parabank_Homepage()"
});
formatter.result({
  "duration": 12480273200,
  "status": "passed"
});
formatter.match({
  "location": "ParaAdminChrome.the_user_select_the_Admin_Page()"
});
formatter.result({
  "duration": 1265553200,
  "status": "passed"
});
formatter.match({
  "location": "ParaAdminChrome.the_user_submits_the_Administration_Page()"
});
formatter.result({
  "duration": 4455454800,
  "status": "passed"
});
});