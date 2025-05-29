package dev.codex.interactions.appProduto;

import java.time.Duration;

import org.openqa.selenium.support.PageFactory;

import dev.codex.pages.appProduto.ProdutoPage;
import dev.codex.widgets.Element;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ProdutoInteraction extends ProdutoPage {

    private static final int TIME_OUT = 10;
    private final Element element;

    public ProdutoInteraction(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(TIME_OUT)),this);
        element = new Element();
    }

    public void validarONomeDoItem() {
        element.assertTextEquals("Sauce Labs Backpack", validarONomeDoItemLabel);
    }

    public void selecionarUmItem() {
        element.click(adicionarAoCarrinhoButton);
    }

    public void validarQuantidadeItemNoIconeDoCarrinho() {
        element.assertTextEquals("1", quantidadeDoItemNoIconeDoCarrinho);
    }

    public void clickNoCarrinho() {
        element.click(carrinhoIconeButton);
    }
}