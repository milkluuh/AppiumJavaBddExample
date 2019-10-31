$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("example.feature");
formatter.feature({
  "line": 1,
  "name": "Example of our project structure",
  "description": "\nAs a QA\nI want to share our project structure\nSo Hiptest team can help us",
  "id": "example-of-our-project-structure",
  "keyword": "Feature"
});
formatter.before({
  "duration": 11994547951,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "Validate data",
  "description": "",
  "id": "example-of-our-project-structure;validate-data",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@QA-001"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "user opens the app",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "user inputs data on cep de origem field",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "user inputs data on cep de destino field",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user clicks on proximo passo button",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "the app displays the calculos salvos screen",
  "keyword": "Then "
});
formatter.match({
  "location": "ExampleSteps.user_opens_the_app()"
});
formatter.result({
  "duration": 4738630861,
  "status": "passed"
});
formatter.match({
  "location": "ExampleSteps.user_inputs_data_on_cep_de_origem_field()"
});
formatter.result({
  "duration": 729490432,
  "status": "passed"
});
formatter.match({
  "location": "ExampleSteps.user_inputs_data_on_cep_de_destino_field()"
});
formatter.result({
  "duration": 1063280281,
  "status": "passed"
});
formatter.match({
  "location": "ExampleSteps.user_clicks_on_proximo_passo_button()"
});
formatter.result({
  "duration": 470368693,
  "status": "passed"
});
formatter.match({
  "location": "ExampleSteps.the_app_displays_the_calculos_salvos_screen()"
});
formatter.result({
  "duration": 1480602563,
  "status": "passed"
});
formatter.after({
  "duration": 873480997,
  "status": "passed"
});
});