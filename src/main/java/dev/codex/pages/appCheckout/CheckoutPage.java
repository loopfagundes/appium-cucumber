package dev.codex.pages.appCheckout;

import io.appium.java_client.pagefactory.AndroidFindBy;

import org.openqa.selenium.WebElement;

public class CheckoutPage {

    @AndroidFindBy(accessibility = "test-First Name")
    public WebElement nomeUsuarioCheckoutField;

    @AndroidFindBy(accessibility = "test-Last Name")
    public WebElement sobrenomeUsuarioCheckoutField;

    @AndroidFindBy(accessibility = "test-Zip/Postal Code")
    public WebElement cepCheckoutField;

    @AndroidFindBy(accessibility = "test-CONTINUE")
    public WebElement continueCheckoutButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"1\").instance(1)")
    public WebElement quantidadeItemNoCheckoutLabel;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Sauce Labs Backpack\")")
    public WebElement nomeDoItemNoCheckoutLabel;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"$29.99\")")
    public WebElement valorDoItemNoCheckoutLabel;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Tax: $2.40\")")
    public WebElement valorDoTaxaNoCheckoutLabel;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Total: $32.39\")")
    public WebElement valorFinalNoCheckoutLabel;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"test-FINISH\")")
    public WebElement finalizarButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"THANK YOU FOR YOU ORDER\")")
    public WebElement mensagemFinalizarLabel;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(1)")
    public WebElement iconeTresListraButton;

    @AndroidFindBy(accessibility = "test-LOGOUT")
    public WebElement logoutButton;
}