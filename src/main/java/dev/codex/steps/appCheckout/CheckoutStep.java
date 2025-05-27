package dev.codex.steps.appCheckout;

import dev.codex.drivers.DriverFactory;
import dev.codex.helpers.ScreenshotHelper;
import dev.codex.interactions.appCheckout.CheckoutInteraction;
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
    public void redirecionado_tela_checkout_information() {
        helper.takeScreenshot("Tela de Checkout Information");
    }

    @Entao("Preencho os dados validos nos campos de Checkout")
    public void preencho_dados_validos_checkout() {
        checkoutInteraction.preencharDadosValidosNoCheckout();
    }

    @Entao("Clico o botao continue")
    public void clico_continue() {
        checkoutInteraction.clickNoContinue();
    }

    @Entao("Sou redirecionado para tela de Checkout: Overview")
    public void redirecionado_tela_checkout_overview() {
        helper.takeScreenshot("Tela de Checkout Overview");
    }

    @Entao("Verifico quantidade do item")
    public void verificar_quantidade_item() {
        checkoutInteraction.validarQuantidadeItemNoCheckout();
    }

    @Entao("Verifico o nome do item")
    public void verificar_nome_item() {
        checkoutInteraction.validarONomeDoItemNoCheckout();
    }

    @Entao("Verifico o valor do item")
    public void verificar_valor_item() {
        checkoutInteraction.validarValorDoItemNoCheckout();
    }

    @Entao("Verifico valor do taxa")
    public void verificar_valor_taxa() {
        checkoutInteraction.validarValorTaxaNoCheckout();
    }

    @Entao("Verifico valor final")
    public void verificar_valor_final() {
        checkoutInteraction.validarValorFinalNoCheckout();
    }

    @Entao("Clico no finish para realizar a compra")
    public void clica_finish() {
        checkoutInteraction.clickNoFinish();
    }

    @Entao("Verifico a mensagem de finalizar a compra")
    public void verificar_mensagem() {
        checkoutInteraction.mensagemFinalizaACompra();
        helper.takeScreenshot("Tela de Checkout Complete");
    }

    @Entao("Clico o icone tres listras no topo")
    public void clica_icone_no_topo() {
        checkoutInteraction.clickTresListras();
    }

    @Entao("Clico no logout para sair da conta")
    public void logout_usuario() {
        checkoutInteraction.clickLogout();
    }

    @Entao("Encerro a sessão")
    public void encerro_a_sessao() {
        DriverFactory.quitDriver();
    }
}