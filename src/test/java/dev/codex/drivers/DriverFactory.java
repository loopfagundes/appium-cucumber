package dev.codex.drivers;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Paths;

public class DriverFactory {

    private static final String DIR_APK = "src/test/resources/apps/TestApp.apk";
    private static AppiumDriver driver;

    public static AppiumDriver getDriver() {
        if (driver == null) {
            try {
                startDriver();
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
        return driver;
    }

    private static void startDriver() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("appium:platformName", "Android");
        caps.setCapability("appium:automationName", "UiAutomator2");
        caps.setCapability("appium:platformVersion", "16");
        caps.setCapability("appium:deviceName", "Android Emulator");
        caps.setCapability("appium:appPackage", "com.swaglabsmobileapp");
        caps.setCapability("appium:appActivity", "com.swaglabsmobileapp.SplashActivity");
        caps.setCapability("appium:appWaitActivity", "*");
        caps.setCapability("appium:app", Paths.get(System.getProperty("user.dir"), DIR_APK).toString());

        driver = new AndroidDriver(new URL("http://localhost:4723"), caps);
    }


    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}