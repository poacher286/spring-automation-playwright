package com.play.springautomation;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration
@CucumberContextConfiguration
@SpringBootTest(classes = SpringAutomationApplication.class)
public abstract class SpringIntegrationTest {

}
