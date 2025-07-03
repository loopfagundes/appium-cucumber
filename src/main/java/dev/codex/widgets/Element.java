package dev.codex.widgets;

import org.openqa.selenium.*;

import dev.codex.helpers.WaitElementHelper;
import io.appium.java_client.AppiumDriver;

import java.util.NoSuchElementException;

public class Element {

    private static final int TIME_OUT = 15;
    private final WaitElementHelper wait;

    public Element(AppiumDriver driver) {
        wait = new WaitElementHelper(driver, TIME_OUT);
    }

    public void click(WebElement locator) {
        try {
            if (locator.isDisplayed() && locator.isEnabled()) {
                wait.waitForClickable(locator).click();
            }
        } catch (InvalidElementStateException | NoSuchElementException | StaleElementReferenceException |
                 TimeoutException e) {
            throw new IllegalArgumentException("[click] Erro na validação do elemento.", e);
        }
    }

    public void setText(WebElement locator, String text) {
        try {
            if (locator.isDisplayed() && locator.isEnabled()) {
                locator.sendKeys(text);
            } else {
                throw new IllegalStateException("[sendKeys] Elemento não está visível ou não está habilitado.");
            }
        } catch (InvalidElementStateException | NoSuchElementException | StaleElementReferenceException | TimeoutException e) {
            throw new IllegalArgumentException("[sendKeys] Erro ao tentar enviar texto para o elemento.", e);
        }
    }

    public void assertTextEquals(String expected, WebElement locator) {
        try {
            if (locator.isDisplayed() && locator.isEnabled()) {
                String actual = locator.getText();
                if(!expected.equals(actual)) {
                    throw new IllegalStateException("[Assert] Texto diferente: esperado = " + expected + ", atual = " + actual );
                }
            } else {
                throw new IllegalStateException("[Assert] Elemento não está visível ou habilitado.");
            }
        } catch (InvalidElementStateException | NoSuchElementException | StaleElementReferenceException | TimeoutException e) {
            throw new IllegalArgumentException("[Assert] Erro na validação do elemento.", e);
        }
    }
}