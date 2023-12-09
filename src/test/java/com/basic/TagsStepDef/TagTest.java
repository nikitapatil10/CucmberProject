package com.basic.TagsStepDef;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		monochrome = true,
		tags= "@Regression",
		features = {"src/test/resources/com/basic/TagsFeatureFile/Tags.feature"},
		glue= {"com/basic/TagsStepDef"},
		plugin= {"pretty","json:target/curumber1-report8.json"}
		)
public class TagTest {

}


//not working 
