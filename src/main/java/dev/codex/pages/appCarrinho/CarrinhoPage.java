package dev.codex.pages.appCarrinho;

import io.appium.java_client.pagefactory.AndroidFindBy;

import org.openqa.selenium.WebElement;

public class CarrinhoPage {
   
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"1\").instance(1)")
    public WebElement validarQuantidadeDoItemLabel;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Sauce Labs Backpack\")")
    public WebElement validarNomeDoItemLabel;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"$29.99\")")
    public WebElement valorDoItemLabel;

    @AndroidFindBy(accessibility = "test-CHECKOUT")
    public WebElement checkoutButton;
}