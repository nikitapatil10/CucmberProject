package com.basic.DataDrivenStepDef;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/com/basic/DataDrivenFeatureFile/DataDriven.feature"},
		glue= {"com/basic/DataDrivenStepDef"},
		plugin= {"pretty",
				 "html:target/cucumber1-htmlreport.html",
				 "json:target/curumber1-report2.json",
		}
		)
public class DataDrivenTest {

}

//working fine