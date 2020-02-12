$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/calculaFrete.feature");
formatter.feature({
  "name": "Calcula Frete",
  "description": "    Eu como usuário do app dos correios\n    Desejo saber o frete\n    Para poder ter ciencia sobre o valor",
  "keyword": "Funcionalidade"
});
formatter.scenario({
  "name": "Calcula Frete",
  "description": "",
  "keyword": "Cenário"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "que o usuario abre o app dos correios",
  "keyword": "Dado "
});
formatter.match({
  "location": "CalculaFreteSteps.que_o_usuario_abre_o_app_dos_correios()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clica no botao novo calculo",
  "keyword": "E "
});
formatter.match({
  "location": "CalculaFreteSteps.clica_no_botao_novo_calculo()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "digita o cep no campo cep de origem",
  "keyword": "E "
});
formatter.match({
  "location": "CalculaFreteSteps.digita_o_cep_no_campo_cep_de_origem()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "digita o cep no campo cep de destino",
  "keyword": "E "
});
formatter.match({
  "location": "CalculaFreteSteps.digita_o_cep_no_campo_cep_de_destino()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clica no botao proximo passo",
  "keyword": "Quando "
});
formatter.match({
  "location": "CalculaFreteSteps.clica_no_botao_proximo_passo()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o App exibe a tela de calculos salvos",
  "keyword": "Entao "
});
formatter.match({
  "location": "CalculaFreteSteps.o_App_exibe_a_tela_de_calculos_salvos()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});