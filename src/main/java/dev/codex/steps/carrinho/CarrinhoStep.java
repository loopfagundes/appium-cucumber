package dev.codex.steps.carrinho;

import dev.codex.drivers.DriverFactory;
import dev.codex.helpers.ScreenshotHelper;
import dev.codex.interactions.carrinho.CarrinhoInteraction;
import io.appium.java_client.AppiumDriver;
import io.cucumber.java.pt.Entao;

public class CarrinhoStep {

    private final CarrinhoInteraction carrinhoInteraction;
    private final ScreenshotHelper helper;

    public CarrinhoStep() {
        AppiumDriver driver = DriverFactory.getDriver();
        carrinhoInteraction = new CarrinhoInteraction(driver);
        helper = new ScreenshotHelper(driver);
    }

    @Entao("Sou redirecionado para tela de Seu Carrinho")
    public void redirecionadoTelaCheckout() {
       helper.takeScreenshot("Tela de Carrinho");
    }

    @Entao("Valido quantidade do item no carrinho")
    public void validoQuantidadeItem() {
        carrinhoInteraction.validarQuantidadeItemCarrinho();
    }

    @Entao("Valido o nome do item no carrinho")
    public void validoNomeItem() {
        carrinhoInteraction.validarONomeItem();
    }

    @Entao("Valido o valor do item no carrinho")
    public void validoValorItem() {
        carrinhoInteraction.validarValorDoItem();
    }

    @Entao("Clico o botao checkout")
    public void clicoBotaoCheckout() {
        carrinhoInteraction.clickNoCheckout();
    }
}