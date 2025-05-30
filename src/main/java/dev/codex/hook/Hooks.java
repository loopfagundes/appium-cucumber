package dev.codex.hook;

import dev.codex.drivers.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void setup() {
        DriverFactory.getDriver();
    }

    @After
    public void teardown() {
        //DriverFactory.quitDriver();
    }
}