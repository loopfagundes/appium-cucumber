package dev.codex.pages.appLogin;

import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class LoginPage {

    @AndroidFindBy(accessibility = "test-Username")
    public WebElement usuarioLoginField;

    @AndroidFindBy(accessibility = "test-Password")
    public WebElement senhaLoginField;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"LOGIN\")")
    public WebElement loginButton;
}