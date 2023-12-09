package com.basic.MultiStepDef;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
//		dryRun = true,
		features = {"src/test/resources/com/basic/MultiFeatureFile/"},
		glue= {"com/basic/MultiStepDef"},
		plugin= {"pretty",
				 "html:target/cucumber1-htmlreport.html",
				 "json:target/curumber1-report5.json",
		}
		)
public class MultiTest {

}

//working fine