package dev.codex.interactions.appProduto;

import dev.codex.pages.appProduto.ProdutoPage;
import dev.codex.widgets.Element;
import io.appium.java_client.AppiumDriver;

public class ProdutoInteraction {

    private final ProdutoPage page;
    private final Element element;

    public ProdutoInteraction(AppiumDriver driver) {
        page = new ProdutoPage(driver);
        element = new Element();
    }

    public void validarONomeDoItem() {
        element.assertTextEquals("Sauce Labs Backpack", page.validarONomeDoItemLabel());
    }

    public void selecionarUmItem() {
        element.click(page.adicionarAoCarrinhoButton());
    }

    public void validarQuantidadeItemNoIconeDoCarrinho() {
        element.assertTextEquals("1", page.quantidadeDoItemNoIconeDoCarrinho());
    }

    public void clickNoCarrinho() {
        element.click(page.carrinhoIconeButton());
    }
}