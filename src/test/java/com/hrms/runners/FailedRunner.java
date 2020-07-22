package com.hrms.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions (
		features = "@target/failed.txt",   //go to target folder and get failed.txt file
		glue="com/hrms/steps", 
		monochrome = true
		,plugin= {
				"pretty"//prints gherkin steps in console
			//	,"html:target/cucumber-default-report",//create basic html report in specified location
				
		}
		)




public class FailedRunner { // in fail runner we are specifying which Feature we need to execute
	

}
