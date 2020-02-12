package pages;

import core.CommonsBasePage;
import io.appium.java_client.MobileBy;

public class OrigemDestinoScreen extends CommonsBasePage {

    public void clickNovoCalculoButton(){
        clickField(MobileBy.id("br.com.correios.calculaprecoprazo:id/textview_texto"));
    }

    public void validateScreenCharged() {
        validateElementAppeared(MobileBy.id("br.com.correios.calculaprecoprazo:id/txt_cep_ori"));
        validateElementAppeared(MobileBy.id("br.com.correios.calculaprecoprazo:id/txt_cep_dest"));
        validateElementAppeared(MobileBy.id("br.com.correios.calculaprecoprazo:id/lbl_mensagem_ori_dest"));}

    public void inputDataOnCepDeOrigem() {
        clickAndFillField(MobileBy.id("br.com.correios.calculaprecoprazo:id/txt_cep_ori"),"06150040");
    }

    public void inputDataOnCepDeDestino() {
        clickAndFillField(MobileBy.id("br.com.correios.calculaprecoprazo:id/txt_cep_dest"),"06150010");
    }

    public void clickProximoPassoButton(){
        clickField(MobileBy.id("br.com.correios.calculaprecoprazo:id/button_prox"));

    }
}