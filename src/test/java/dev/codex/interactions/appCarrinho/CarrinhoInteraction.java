package dev.codex.interactions.appCarrinho;

import dev.codex.pages.appCarrinho.CarrinhoPage;
import dev.codex.widgets.Element;
import io.appium.java_client.AppiumDriver;

public class CarrinhoInteraction {

    private final CarrinhoPage page;
    private final Element element;

    public CarrinhoInteraction(AppiumDriver driver) {
        page = new CarrinhoPage(driver);
        element = new Element();
    }

    public void validarQuantidadeItemCarrinho() {
        element.assertTextEquals("1", page.validarQuantidadeDoItemLabel());
    }

    public void validarONomeItem() {
        element.assertTextEquals("Sauce Labs Backpack", page.validarNomeDoItemLabel());
    }

    public void validarValorDoItem() {
        element.assertTextEquals("$29.99", page.valorDoItemLabel());
    }

    public void clickNoCheckout() {
        element.click(page.checkoutButton());
    }
}