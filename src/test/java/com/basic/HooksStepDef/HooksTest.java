package com.basic.HooksStepDef;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/com/basic/HooksFeatureFile/Hooks.feature"},
		glue= {"com/basic/HooksStepDef"},
		plugin= {"pretty",
				 "html:target/cucumber1-htmlreport.html",
				 "json:target/curumber1-report9.json",
		}
		)
public class HooksTest {

}

//working fine