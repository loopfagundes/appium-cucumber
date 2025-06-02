package dev.codex.interactions.appCarrinho;

import java.time.Duration;

import org.openqa.selenium.support.PageFactory;

import dev.codex.pages.appCarrinho.CarrinhoPage;
import dev.codex.widgets.Element;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class CarrinhoInteraction extends CarrinhoPage {

    private static final int TIME_OUT = 10;
    private final Element element;

    public CarrinhoInteraction(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(TIME_OUT)), this);
        element = new Element(driver);
    }

    public void validarQuantidadeItemCarrinho() {
        element.assertTextEquals("1", validarQuantidadeDoItemLabel);
    }

    public void validarONomeItem() {
        element.assertTextEquals("Sauce Labs Backpack", validarNomeDoItemLabel);
    }

    public void validarValorDoItem() {
        element.assertTextEquals("$29.99", valorDoItemLabel);
    }

    public void clickNoCheckout() {
        element.click(checkoutButton);
    }
}