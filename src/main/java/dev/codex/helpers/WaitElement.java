package dev.codex.helpers;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitElement {
    private final AppiumDriver driver;

    public WaitElement(AppiumDriver _driver) {
        driver = _driver;
    }

    public WebElement visibilityOf(By by) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    public WebElement toBeClickable(By by) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        WebElement waitElement = visibilityOf(by);
        return wait.until(ExpectedConditions.elementToBeClickable(waitElement));
    }
}
