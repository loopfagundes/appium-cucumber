package dev.codex.interactions.appLogin;

import dev.codex.pages.appLogin.LoginPage;
import dev.codex.widgets.Element;
import io.appium.java_client.AppiumDriver;

public class LoginInteraction {
    private final LoginPage page;
    private final Element element;

    public LoginInteraction(AppiumDriver driver) {
        page = new LoginPage(driver);
        element = new Element();
    }

    public void preencherDadosValidos() {
        element.setText("standard_user", page.usernameLoginField());
        element.setText("secret_sauce", page.passwordLoginField());
    }

    public void clickLogin() {
        element.click(page.loginButton());
    }
}