package dev.codex.steps.login;

import dev.codex.drivers.DriverFactory;
import dev.codex.helpers.ScreenshotHelper;
import dev.codex.interactions.login.LoginInteraction;
import io.appium.java_client.AppiumDriver;
import io.cucumber.java.pt.*;

public class LoginStep {

    private final LoginInteraction loginInteraction;
    private final ScreenshotHelper helper;

    public LoginStep() {
        AppiumDriver driver = DriverFactory.getDriver();
        loginInteraction = new LoginInteraction(driver);
        helper = new ScreenshotHelper(driver);
    }

    @Entao("Eu estou na pagina de Login")
    public void euEstouNaPaginaDeLogin() {
        helper.takeScreenshot("Tela de Login");
    }

    @Entao("Preencho dados pardao do usuario validos nos campos de login")
    public void preenchoDadosValidos() {
        loginInteraction.preencherDadosDoUsuarioPadraoValidos();
    }

    @Entao("Clico no botão de login")
    public void clicoBotaoLogin() {
        loginInteraction.clickLogin();
    }
}