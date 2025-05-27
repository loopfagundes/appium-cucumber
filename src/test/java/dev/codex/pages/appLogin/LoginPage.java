package dev.codex.pages.appLogin;

import dev.codex.utils.WaitElement;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private final WaitElement waitElement;

    public LoginPage(AppiumDriver driver) {
        waitElement = new WaitElement(driver);
    }

    public WebElement usernameLoginField() {
        return waitElement.toBeClickable(new AppiumBy.ByAccessibilityId("test-Username"));
    }

    public WebElement passwordLoginField() {
        return waitElement.toBeClickable(new AppiumBy.ByAccessibilityId("test-Password"));
    }

    public WebElement loginButton() {
        return waitElement.toBeClickable(new AppiumBy.ByAndroidUIAutomator("new UiSelector().text(\"LOGIN\")"));
    }
}