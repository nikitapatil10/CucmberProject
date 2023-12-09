package com.basic.ParameterizationStepDef;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/com/basic/ParameterizeFeatureFile/parameterize.feature"},
		glue= {"com/basic/ParameterizationStepDef"},
		plugin= {"pretty",
				 "html:target/cucumber1-htmlreport.html",
				 "json:target/curumber1-report7.json",
		}
		)
public class ParameterizedTest {

}

//working fine