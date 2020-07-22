package com.hrms.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions (
		features = "src/test/resources/features/SouceDemoLoginWithDataTable", //specify which feature file to run if you will delete the last part 
																		// it will run all the features
				
		glue="com/hrms/steps", //where we can find implementation code for gherkin steps?
					//we specify just package
		dryRun=true, //if set to true it will quickly scan that all gherkin steps have implementation code
					// it will check methods do they have step for them
		monochrome = true // allows us to see output in console in readble format
		,strict=true // 
		//,tags= "@errorMessage"
		,plugin= { // it will help us to run multiple things in a one time. if you want to run more than one you must put in curly brackets {}
				"pretty",//prints gherkin steps in console
				"html:target/cucumber-default-report",//create basic html report in specified location
				"json:target/cucumber.json"
		}
		)

// after you done run jUnitTest---> right click/run/jUnit


public class SingleTestRunner {
	
}
