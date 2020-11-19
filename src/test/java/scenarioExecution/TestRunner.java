package scenarioExecution;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/main/resources/Feature/login.feature", glue="stepDefinition") 
public class TestRunner {
	

}
