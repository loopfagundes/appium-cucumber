package dev.codex.runners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features",
        glue = {"dev.codex.steps", "devs.codex.hooks"},
        plugin = {
                "pretty",
                "html:reports/cucumber.html",
                "json:reports/cucumber.json",
                "junit:reports/cucumber.xml"
        }
)

public class TestRunner {

}