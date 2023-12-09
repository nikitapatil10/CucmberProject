package com.basic.MyFirstFeatureFile;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/com/basic/MyFirstFeatureFileFF/MyFirstFeature2.feature"},
		glue= {"com/basic/MyFirstFeatureFile"},
		plugin= {"pretty",
				 "html:target/cucumber1-htmlreport",
				 "json:target/curumber1-report6.json",
		}
		)
public class MyFirstFeatureTest {

}

//working fine
