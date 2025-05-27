package dev.codex.pages.appProduto;

import dev.codex.helpers.WaitElement;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;

public class ProdutoPage {
    private final WaitElement waitElement;

    public ProdutoPage(AppiumDriver driver) {
        this.waitElement = new WaitElement(driver);
    }

    public WebElement validarONomeDoItemLabel() {
        return waitElement.visibilityOf(new AppiumBy.ByAndroidUIAutomator("new UiSelector().text(\"Sauce Labs Backpack\")"));
    }

    public WebElement adicionarAoCarrinhoButton() {
        return waitElement.toBeClickable(new AppiumBy.ByAndroidUIAutomator("new UiSelector().description(\"test-ADD TO CART\").instance(0)"));
    }

    public WebElement quantidadeDoItemNoIconeDoCarrinho() {
        return waitElement.visibilityOf(new AppiumBy.ByAndroidUIAutomator("new UiSelector().text(\"1\")"));
    }

    public WebElement carrinhoIconeButton() {
        return waitElement.toBeClickable(new AppiumBy.ByAndroidUIAutomator("new UiSelector().className(\"android.widget.ImageView\").instance(3)"));
    }
}