package com.basic.BackgroundStepDef;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/com/basic/BackgroundFeatureFile/Background.feature"},
		glue= {"com/basic/BackgroundStepDef"},
		plugin= {"pretty",
				 "html:target/cucumber1-htmlreport.html",
				 "json:target/curumber1-report1.json",
		}
		)
public class BackgroundTest {

}

//working fine
