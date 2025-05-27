package dev.codex.steps.appCarrinho;

import dev.codex.drivers.DriverFactory;
import dev.codex.interactions.appCarrinho.CarrinhoInteraction;
import dev.codex.utils.ScreenshotUtils;
import io.appium.java_client.AppiumDriver;
import io.cucumber.java.pt.Entao;

public class CarrinhoStep {

    private final CarrinhoInteraction carrinhoInteraction;
    private final ScreenshotUtils utils;

    public CarrinhoStep() {
        AppiumDriver driver = DriverFactory.getDriver();
        carrinhoInteraction = new CarrinhoInteraction(driver);
        utils = new ScreenshotUtils(driver);
    }

    @Entao("Sou redirecionado para tela de Seu Carrinho")
    public void redirecionado_tela_checkout() {
       utils.takeScreenshot("Tela de Carrinho");
    }

    @Entao("Valido quantidade do item no carrinho")
    public void valido_quantidade_item() {
        carrinhoInteraction.validarQuantidadeItemCarrinho();
    }

    @Entao("Valido o nome do item no carrinho")
    public void valido_nome_item() {
        carrinhoInteraction.validarONomeItem();
    }

    @Entao("Valido o valor do item no carrinho")
    public void valido_valor_item() {
        carrinhoInteraction.validarValorDoItem();
    }

    @Entao("Clico o botao checkout")
    public void clico_checkout() {
        carrinhoInteraction.clickNoCheckout();
    }
}