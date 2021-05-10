package com.play.springautomation;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = SpringAutomationApplication.class)
public class SpringIntegrationTest {

}
