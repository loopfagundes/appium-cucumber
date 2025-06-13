package dev.codex.interactions.appLogin;

import dev.codex.factory.loginFactory.LoginFactory;
import dev.codex.pages.appLogin.LoginPage;
import dev.codex.widgets.Element;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class LoginInteraction extends LoginPage {
    
    private static final int TIME_OUT = 10;
    private final Element element;

    public LoginInteraction(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(TIME_OUT)), this);
        element = new Element(driver);
    }

    public void preencherDadosDoUsuarioPadraoValidos() {
        element.setText(usuarioLoginField, LoginFactory.padraoUsuario().getUsuario());
        element.setText(senhaLoginField, LoginFactory.padraoUsuario().getSenha());
    }

    public void preencherDadosDoUsuarioBugValidos() {
        element.setText(usuarioLoginField, LoginFactory.bugUsuario().getUsuario());
        element.setText(senhaLoginField, LoginFactory.bugUsuario().getSenha());
    }

    public void clickLogin() {
        element.click(loginButton);
    }
}