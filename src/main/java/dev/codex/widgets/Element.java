package dev.codex.widgets;

import org.junit.jupiter.api.Assertions;
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
            throw new RuntimeException("[click] Erro na validação do elemento.", e);
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
            throw new RuntimeException("[sendKeys] Erro ao tentar enviar texto para o elemento.", e);
        }
    }

    public void assertTextEquals(String expected, WebElement locator) {
        try {
            if (locator.isDisplayed() && locator.isEnabled()) {
                String actual = locator.getText();
                Assertions.assertEquals(expected, actual);
            } else {
                throw new IllegalStateException("[Assert] Elemento não está visível ou habilitado.");
            }
        } catch (InvalidElementStateException | NoSuchElementException | StaleElementReferenceException | TimeoutException e) {
            throw new RuntimeException("[Assert] Erro na validação do elemento.", e);
        }
    }
}