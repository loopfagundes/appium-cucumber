package dev.codex.interactions.appCheckout;

import java.time.Duration;
import dev.codex.helpers.SwipeHelper;
import org.openqa.selenium.support.PageFactory;
import dev.codex.factory.dataFactory.DataFactory;
import dev.codex.pages.appCheckout.CheckoutPage;
import dev.codex.widgets.Element;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class CheckoutInteraction extends CheckoutPage {

    private static final int TIME_OUT = 10;
    private final Element element;
    private final SwipeHelper swipe;

    public CheckoutInteraction(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(TIME_OUT)), this);
        element = new Element(driver);
        swipe = new SwipeHelper(driver);
    }

    public void preencharDadosValidosNoCheckout() {
        element.setText(nomeUsuarioCheckoutField, DataFactory.dataDto().getNome());
        element.setText(sobrenomeUsuarioCheckoutField, DataFactory.dataDto().getSobrenome());
        element.setText(cepCheckoutField, DataFactory.dataDto().getCep());
    }

    public void clickNoContinue() {
        element.click(continueCheckoutButton);
    }

    public void validarQuantidadeItemNoCheckout() {
        element.assertTextEquals("1", quantidadeItemNoCheckoutLabel);
    }

    public void validarONomeDoItemNoCheckout() {
        element.assertTextEquals("Sauce Labs Backpack", nomeDoItemNoCheckoutLabel);
    }

    public void validarValorDoItemNoCheckout() {
        element.assertTextEquals("$29.99", valorDoItemNoCheckoutLabel);
    }

    public void validarValorTaxaNoCheckout() {
        element.assertTextEquals("Tax: $2.40", valorDoTaxaNoCheckoutLabel);
    }

    public void validarValorFinalNoCheckout() {
        element.assertTextEquals("Total: $32.39", valorFinalNoCheckoutLabel);
    }

    public void clickNoFinish() {
        swipe.swipeToElement(finalizarButton);
        element.click(finalizarButton);
    }

    public void mensagemFinalizaACompra() {
        element.assertTextEquals("THANK YOU FOR YOU ORDER", mensagemFinalizarLabel);
    }

    public void clickTresListras() {
        element.click(iconeTresListraButton);
    }

    public void clickLogout() {
        element.click(logoutButton);
    }
}