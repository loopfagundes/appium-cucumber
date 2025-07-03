package dev.codex.steps.checkout;

import dev.codex.drivers.DriverFactory;
import dev.codex.helpers.ScreenshotHelper;
import dev.codex.interactions.checkout.CheckoutInteraction;
import io.appium.java_client.AppiumDriver;
import io.cucumber.java.pt.Entao;

public class CheckoutStep {

    private final CheckoutInteraction checkoutInteraction;
    private final ScreenshotHelper helper;

    public CheckoutStep() {
        AppiumDriver driver = DriverFactory.getDriver();
        checkoutInteraction = new CheckoutInteraction(driver);
        helper = new ScreenshotHelper(driver);
    }

    @Entao("Sou redirecionado para tela de Checkout: Information")
    public void redirecionadoTelaCheckoutInformation() {
        helper.takeScreenshot("Tela de Checkout Information");
    }

    @Entao("Preencho os dados validos nos campos de Checkout")
    public void preenchoDadosValidosCheckout() {
        checkoutInteraction.preencharDadosValidosNoCheckout();
    }

    @Entao("Clico o botao continue")
    public void clicoBotaoContinue() {
        checkoutInteraction.clickNoContinue();
    }

    @Entao("Sou redirecionado para tela de Checkout: Overview")
    public void redirecionadoTelaCheckoutOverview() {
        helper.takeScreenshot("Tela de Checkout Overview");
    }

    @Entao("Verifico quantidade do item")
    public void verificarQuantidadeItem() {
        checkoutInteraction.validarQuantidadeItemNoCheckout();
    }

    @Entao("Verifico o nome do item")
    public void verificarNomeItem() {
        checkoutInteraction.validarONomeDoItemNoCheckout();
    }

    @Entao("Verifico o valor do item")
    public void verificarValorItem() {
        checkoutInteraction.validarValorDoItemNoCheckout();
    }

    @Entao("Verifico valor do taxa")
    public void verificarValorTaxa() {
        checkoutInteraction.validarValorTaxaNoCheckout();
    }

    @Entao("Verifico valor final")
    public void verificarValorFinal() {
        checkoutInteraction.validarValorFinalNoCheckout();
    }

    @Entao("Clico no finish para realizar a compra")
    public void clicaBotaoFinish() {
        checkoutInteraction.clickNoFinish();
    }

    @Entao("Verifico a mensagem de finalizar a compra")
    public void verificarMensagem() {
        checkoutInteraction.mensagemFinalizaACompra();
        helper.takeScreenshot("Tela de Checkout Complete");
    }

    @Entao("Clico o icone tres listras no topo")
    public void clicaIconeNoTopo() {
        checkoutInteraction.clickTresListras();
    }

    @Entao("Clico no logout para sair da conta")
    public void logoutUsuario() {
        checkoutInteraction.clickLogout();
    }
}