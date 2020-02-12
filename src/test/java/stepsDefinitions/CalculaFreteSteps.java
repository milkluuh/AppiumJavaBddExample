package stepsDefinitions;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import pages.CalculosSalvosScreen;
import pages.OrigemDestinoScreen;

public class CalculaFreteSteps {

    private OrigemDestinoScreen origemDestinoScreen = new OrigemDestinoScreen();
    private CalculosSalvosScreen calculosSalvosScreen = new CalculosSalvosScreen();

    @Dado("que o usuario abre o app dos correios")
    public void que_o_usuario_abre_o_app_dos_correios() {
    }

    @Dado("clica no botao novo calculo")
    public void clica_no_botao_novo_calculo() {
        origemDestinoScreen.clickNovoCalculoButton();
        origemDestinoScreen.validateScreenCharged();
    }

    @Dado("digita o cep no campo cep de origem")
    public void digita_o_cep_no_campo_cep_de_origem() {
        origemDestinoScreen.inputDataOnCepDeOrigem();
    }

    @Dado("digita o cep no campo cep de destino")
    public void digita_o_cep_no_campo_cep_de_destino() {
        origemDestinoScreen.inputDataOnCepDeDestino();
    }

    @Quando("clica no botao proximo passo")
    public void clica_no_botao_proximo_passo() {
        origemDestinoScreen.clickProximoPassoButton();
    }

    @Entao("o App exibe a tela de calculos salvos")
    public void o_App_exibe_a_tela_de_calculos_salvos() {
        calculosSalvosScreen.validateScreenCharged();
    }
}
