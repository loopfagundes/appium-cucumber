package dev.codex.interactions.appLogin;

import dev.codex.dto.loginDTO.LoginDTO;
import dev.codex.factory.loginFactory.LoginFactory;
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
        element.setText(LoginFactory.loginDto().getUsuario(), page.usernameLoginField());
        element.setText(LoginFactory.loginDto().getSenha(), page.passwordLoginField());
    }

    public void clickLogin() {
        element.click(page.loginButton());
    }
}