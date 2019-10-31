package stepsDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.CalculosSalvosScreen;
import pages.ExampleScreen;

public class ExampleSteps {

    private ExampleScreen exampleScreen = new ExampleScreen();
    private CalculosSalvosScreen calculosSalvosScreen = new CalculosSalvosScreen();

    @Given("^user opens the app$")
    public void user_opens_the_app() {
        exampleScreen.clickNovoCalculoButton();
        exampleScreen.validateScreenCharged();
    }

    @When("^user inputs data on cep de origem field$")
    public void user_inputs_data_on_cep_de_origem_field() {
        exampleScreen.inputDataOnCepDeOrigem();
    }

    @When("^user inputs data on cep de destino field$")
    public void user_inputs_data_on_cep_de_destino_field() {
        exampleScreen.inputDataOnCepDeDestino();
    }

    @When("^user clicks on proximo passo button$")
    public void user_clicks_on_proximo_passo_button() {
        exampleScreen.clickProximoPassoButton();
    }

    @Then("^the app displays the calculos salvos screen$")
    public void the_app_displays_the_calculos_salvos_screen() {
        calculosSalvosScreen.validateScreenCharged();
    }
}
