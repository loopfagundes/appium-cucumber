package dev.codex.pages.appCheckout;

import dev.codex.utils.WaitElement;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;

public class CheckoutPage {

    private final WaitElement waitElement;

    public CheckoutPage(AppiumDriver driver) {
        waitElement = new WaitElement(driver);
    }

    public WebElement firstNameField() {
        return waitElement.toBeClickable(new AppiumBy.ByAccessibilityId("test-First Name"));
    }

    public WebElement lastNameField() {
        return waitElement.toBeClickable(new AppiumBy.ByAccessibilityId("test-Last Name"));
    }

    public WebElement postalCodeField() {
        return waitElement.toBeClickable(new AppiumBy.ByAccessibilityId("test-Zip/Postal Code"));
    }

    public WebElement continueCheckoutButton() {
        return waitElement.toBeClickable(new AppiumBy.ByAccessibilityId("test-CONTINUE"));
    }

    public WebElement quantidadeItemNoCheckoutLabel() {
        return waitElement.visibilityOf(new AppiumBy.ByAndroidUIAutomator("new UiSelector().text(\"1\").instance(1)"));
    }

    public WebElement nomeDoItemNoCheckoutLabel() {
        return waitElement.visibilityOf(new AppiumBy.ByAndroidUIAutomator("new UiSelector().text(\"Sauce Labs Backpack\")"));
    }

    public WebElement valorDoItemNoCheckout() {
        return waitElement.visibilityOf(new AppiumBy.ByAndroidUIAutomator("new UiSelector().text(\"$29.99\")"));
    }

    public WebElement valorTaxaNoCheckoutLabel() {
        return waitElement.visibilityOf(new AppiumBy.ByAndroidUIAutomator("new UiSelector().text(\"Tax: $2.40\")"));
    }

    public WebElement valorFinalNoCheckoutLabel() {
        return waitElement.visibilityOf(new AppiumBy.ByAndroidUIAutomator("new UiSelector().text(\"Total: $32.39\")"));
    }

    public WebElement finishButton() {
        return waitElement.toBeClickable(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))" +
                        ".scrollIntoView(new UiSelector().description(\"test-FINISH\"))"));
    }
}