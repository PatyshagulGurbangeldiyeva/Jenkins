$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/ModifyPersonalDetail.feature");
formatter.feature({
  "name": "Modify personal Detail",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is logged with valid admin credentials",
  "keyword": "Given "
});
formatter.match({
  "location": "com.hrms.steps.LoginSteps.user_is_logged_with_valid_admin_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "admin user is successfully logged in",
  "keyword": "When "
});
formatter.match({
  "location": "com.hrms.steps.LoginSteps.admin_user_is_successfully_logged_in()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "admin navigates to Employee Information page",
  "keyword": "And "
});
formatter.match({
  "location": "com.hrms.steps.ModifyPersonalDetail.admin_navigates_to_Employee_Information_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Modify personal Detail by id",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@testId"
    }
  ]
});
formatter.step({
  "name": "admin searches employee by id \"10774\"",
  "keyword": "Given "
});
formatter.match({
  "location": "com.hrms.steps.ModifyPersonalDetail.admin_searches_employee_by_id(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "admin selects employee from the list",
  "keyword": "And "
});
formatter.match({
  "location": "com.hrms.steps.ModifyPersonalDetail.admin_select_employee_from_the_list()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//table[@id\u003d\u0027resultTable\u0027]//td[3]/a\"}\n  (Session info: chrome\u003d84.0.4147.89)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027Vepas-MBP\u0027, ip: \u00272605:6000:1523:a9:ed21:62c:b0b1:cf7e%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.15.5\u0027, java.version: \u00271.8.0_241\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 84.0.4147.89, chrome: {chromedriverVersion: 84.0.4147.30 (48b3e868b4cc0..., userDataDir: /var/folders/mk/c534q5k50qb...}, goog:chromeOptions: {debuggerAddress: localhost:50688}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: MAC, platformName: MAC, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: 3a7554223c37fde39473967e57f4fe86\n*** Element info: {Using\u003dxpath, value\u003d//table[@id\u003d\u0027resultTable\u0027]//td[3]/a}\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\n\tat com.sun.proxy.$Proxy18.click(Unknown Source)\n\tat com.hrms.steps.ModifyPersonalDetail.admin_select_employee_from_the_list(ModifyPersonalDetail.java:38)\n\tat ✽.admin selects employee from the list(file:///Users/vepagurbangeldiyev/eclipse-workspace/Jenkins/src/test/resources/features/ModifyPersonalDetail.feature:21)\n",
  "status": "failed"
});
formatter.step({
  "name": "admin navigates to Personal Details page and click to Edit",
  "keyword": "And "
});
formatter.match({
  "location": "com.hrms.steps.ModifyPersonalDetail.admin_navigate_to_Personal_Deatils_page_and_click_to_Edit()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "admin adds new information and save",
  "keyword": "When "
});
formatter.match({
  "location": "com.hrms.steps.ModifyPersonalDetail.admin_adds_new_information_and_save(io.cucumber.datatable.DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png", "Modify personal Detail by id");
formatter.after({
  "status": "passed"
});
});