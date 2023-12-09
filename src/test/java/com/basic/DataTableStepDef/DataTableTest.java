package com.basic.DataTableStepDef;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/com/basic/DataTableFeatureFile/DataTable.feature"},
		glue= {"com/basic/DataTableStepDef"},
		plugin= {"pretty",
				 "html:target/cucumber1-htmlreport.html",
				 "json:target/curumber1-report3.json"}
//		dryRun = true
		)
public class DataTableTest {

}


//working fine
