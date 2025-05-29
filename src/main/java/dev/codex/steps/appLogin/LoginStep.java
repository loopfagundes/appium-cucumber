package dev.codex.steps.appLogin;

import dev.codex.drivers.DriverFactory;
import dev.codex.helpers.ScreenshotHelper;
import dev.codex.interactions.appLogin.LoginInteraction;
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
    public void eu_estou_na_pagina_de_Login() throws InterruptedException {
        helper.takeScreenshot("Tela de Login");
    }

    @Entao("Preencho dados validos nos campos de login")
    public void preencho_no_campo_username() {
        loginInteraction.preencherDadosValidos();
    }

    @Entao("Clico no botão de login")
    public void clico_no_botao_de_login() {
        loginInteraction.clickLogin();
    }
}