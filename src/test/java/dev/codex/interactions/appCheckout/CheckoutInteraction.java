package dev.codex.interactions.appCheckout;

import dev.codex.pages.appCheckout.CheckoutPage;
import dev.codex.widgets.Element;
import io.appium.java_client.AppiumDriver;

public class CheckoutInteraction {

    private final CheckoutPage page;
    private final Element element;

    public CheckoutInteraction(AppiumDriver driver) {
        page = new CheckoutPage(driver);
        element = new Element();
    }

    public void preencharDadosValidosNoCheckout() {
        element.setText("Ricardo", page.firstNameField());
        element.setText("Costa", page.lastNameField());
        element.setText("9111000", page.postalCodeField());
    }

    public void clickNoContinue() {
        element.click(page.continueCheckoutButton());
    }

    public void validarQuantidadeItemNoCheckout() {
        element.assertTextEquals("1", page.quantidadeItemNoCheckoutLabel());
    }

    public void validarONomeDoItemNoCheckout() {
        element.assertTextEquals("Sauce Labs Backpack", page.nomeDoItemNoCheckoutLabel());
    }

    public void validarValorDoItemNoCheckout() {
        element.assertTextEquals("$29.99", page.valorDoItemNoCheckout());
    }

    public void validarValorTaxaNoCheckout() {
        element.assertTextEquals("Tax: $2.40", page.valorTaxaNoCheckoutLabel());
    }

    public void validarValorFinalNoCheckout() {
        element.assertTextEquals("Total: $32.39", page.valorFinalNoCheckoutLabel());
    }

    public void clickNoFinish() {
        element.click(page.finishButton());
    }

    public void mensagemFinalizaACompra() {
        element.assertTextEquals("THANK YOU FOR YOU ORDER", page.mensagemFinalizarLabel());
    }

    public void clickTresListras() {
        element.click(page.iconeTresListraButton());
    }

    public void clickLogout() {
        element.click(page.logoutButton());
    }
}