package dev.codex.pages.appCarrinho;

import dev.codex.helpers.WaitElement;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;

public class CarrinhoPage {
    private final WaitElement waitElement;

    public CarrinhoPage(AppiumDriver driver) {
        waitElement = new WaitElement(driver);
    }

    public WebElement validarQuantidadeDoItemLabel() {
        return waitElement.visibilityOf(new AppiumBy.ByAndroidUIAutomator("new UiSelector().text(\"1\").instance(1)"));
    }

    public WebElement validarNomeDoItemLabel() {
        return waitElement.visibilityOf(new AppiumBy.ByAndroidUIAutomator("new UiSelector().text(\"Sauce Labs Backpack\")"));
    }

    public WebElement valorDoItemLabel() {
        return waitElement.visibilityOf(new AppiumBy.ByAndroidUIAutomator("new UiSelector().text(\"$29.99\")"));
    }

    public WebElement checkoutButton() {
        return waitElement.toBeClickable(new AppiumBy.ByAccessibilityId("test-CHECKOUT"));
    }
}