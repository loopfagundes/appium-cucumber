package dev.codex.tools;

import dev.codex.drivers.DriverFactory;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.AfterAll;

public class GlobalHooks {

    @BeforeAll
    public static void startDriver() {
        DriverFactory.getDriver();
    }

    @AfterAll
    public static void quitDriver() {
        DriverFactory.quitDriver();
    }
}