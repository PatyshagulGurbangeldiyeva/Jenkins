package com.hrms.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)// we want to run execute our code in cucumber

//we can specify path to the feature files and step definitions reporting format
@CucumberOptions (
		features="src/test/resources/features/", // we can specify direct or all features--> /Login.feature
		glue="com/hrms/steps", // implementations of feature
		dryRun=true, // it is scanning all the features and gherckin and java steps and provides implementation for these steps
					// if set to true no actual execution will happen
					// if change to false
		monochrome=true // makes out put readble/understaning
		,strict=true
		,tags="@regression" // will run the scenarious that have these tags
		,plugin= { // generating html report
				
				"pretty", // prints gherkin steps in console
				"html:target/cucumber-default-report" // creats basic html  report in specified location
		}
		
		)

//after you done run jUnitTest---> right click/run/jUnit


public class RegressionRunner {

}
