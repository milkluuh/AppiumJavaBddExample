$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/example.feature");
formatter.feature({
  "name": "Example of our project structure",
  "description": "  As a QA\n  I want to share our project structure\n  So Hiptest team can help us",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Validate data",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@QA-001"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user opens the app",
  "keyword": "Given "
});
formatter.match({
  "location": "ExampleSteps.user_opens_the_app()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user inputs data on cep de origem field",
  "keyword": "When "
});
formatter.match({
  "location": "ExampleSteps.user_inputs_data_on_cep_de_origem_field()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user inputs data on cep de destino field",
  "keyword": "And "
});
formatter.match({
  "location": "ExampleSteps.user_inputs_data_on_cep_de_destino_field()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on proximo passo button",
  "keyword": "And "
});
formatter.match({
  "location": "ExampleSteps.user_clicks_on_proximo_passo_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the app displays the calculos salvos screen",
  "keyword": "Then "
});
formatter.match({
  "location": "ExampleSteps.the_app_displays_the_calculos_salvos_screen()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});