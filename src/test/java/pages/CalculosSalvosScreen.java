package pages;

import core.CommonsBasePage;
import io.appium.java_client.MobileBy;

public class CalculosSalvosScreen extends CommonsBasePage {

    public void validateScreenCharged(){
        validateElementAppeared(MobileBy.id("br.com.correios.calculaprecoprazo:id/imgCaixa"));
        validateElementAppeared(MobileBy.id("br.com.correios.calculaprecoprazo:id/imgCarta"));
        validateElementAppeared(MobileBy.id("br.com.correios.calculaprecoprazo:id/imgCilindro"));

    }
}
