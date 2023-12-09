package com.basic.MultipleScenarioStepDef;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/com/basic/MultipleScenarioFeatureFile/MultipleScenario.feature"},
		glue= {"com/basic/MultipleScenarioStepDef"},
		plugin= {"pretty",
				 "html:target/cucumber1-htmlreport.html",
				 "json:target/curumber1-report4.json",
		}
		)
public class MultipleTest{

}


//working fine
