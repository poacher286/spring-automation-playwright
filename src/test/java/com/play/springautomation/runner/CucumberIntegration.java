package com.play.springautomation.runner;

import com.play.springautomation.SpringIntegrationTest;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources",
        glue = "com.play.springautomation",
        plugin = {"pretty"},
        publish = true)
public class CucumberIntegration extends SpringIntegrationTest {
}
