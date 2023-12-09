package com.basic.ShareDataStepDef;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/com/basic/ShareDataFeatureFile/ShareData.feature"},
		glue= {"com/basic/ShareDataStepDef"},
		plugin= {"pretty",
				 "html:target/cucumber1-htmlreport.html",
				 "json:target/curumber1-report10.json",
		}
		)
public class ShareDataTest {

}

//not working 