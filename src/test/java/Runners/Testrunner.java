package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
	    features = "src/test/resources/features", // Path of feature folder
	    glue = "stepdefinations",                // name of the stepdefination package
	    plugin = {"pretty", "html:target/cucumber-reports.html"}
	)
public class Testrunner extends AbstractTestNGCucumberTests {
	  
	
}
