$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./Features/Login.feature");
formatter.feature({
  "line": 1,
  "name": "Login",
  "description": "",
  "id": "login",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Login Functionality",
  "description": "",
  "id": "login;login-functionality",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "user navigates to the website \"https://www.javatpoint.com\"",
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "\"https://www.javatpoint.com\"",
      "offset": 30
    }
  ],
  "location": "steps.user_navigates_to_the_website(String)"
});
formatter.result({
  "duration": 1288942400,
  "status": "passed"
});
});