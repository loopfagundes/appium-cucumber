package dev.codex.drivers;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Paths;
import java.util.Map;

public class DriverFactory {

    private static AppiumDriver driver;

    public static AppiumDriver getDriver() {
        if (driver == null) {
            try {
                startDriver();
            } catch (IOException e) {
                throw new RuntimeException("Erro ao iniciar o driver Appium", e);
            }
        }
        return driver;
    }

    private static void startDriver() throws IOException {
        DesiredCapabilities caps = new DesiredCapabilities();
        loadCapabilitiesFromJson(caps);
        driver = new AndroidDriver(new URL("http://localhost:4723"), caps);
    }

    private static void loadCapabilitiesFromJson(DesiredCapabilities caps) throws IOException {
        ObjectMapper mapper = new ObjectMapper();

        Map<String, Object> capabilities = mapper.readValue(getCapabilitiesFile(), new TypeReference<>() {}
        );

        capabilities.forEach((key, value) -> {
            if (key.equalsIgnoreCase("app")) {
                String appPath = Paths.get(System.getProperty("user.dir"), value.toString()).toString();
                caps.setCapability("appium:" + key, appPath);
            } else {
                caps.setCapability("appium:" + key, value);
            }
        });
    }

    private static File getCapabilitiesFile() {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        URL resource = classLoader.getResource("capabilities.json");
        if (resource == null) {
            throw new IllegalArgumentException("Arquivo capabilities.json não encontrado em src/main/resources.");
        }
        return new File(resource.getFile());
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}