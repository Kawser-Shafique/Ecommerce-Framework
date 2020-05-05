package com.ecommerce.testrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features = {"Features"},
		glue = {"com.ecommerce.steps"},
		tags = {"@CartContent,@loginTest,@QuickFind"}
		
		
		)
public class TestRunner extends AbstractTestNGCucumberTests {

}
