package dev.codex.pages.appProduto;

import io.appium.java_client.pagefactory.AndroidFindBy;

import org.openqa.selenium.WebElement;

public class ProdutoPage {

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Sauce Labs Backpack\")")
    public WebElement validarONomeDoItemLabel;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"test-ADD TO CART\").instance(0)")
    public WebElement adicionarAoCarrinhoButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"1\")")
    public WebElement quantidadeDoItemNoIconeDoCarrinho;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(3)")
    public WebElement carrinhoIconeButton;
}