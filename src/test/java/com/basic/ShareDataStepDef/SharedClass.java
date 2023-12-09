package com.basic.ShareDataStepDef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SharedClass {

	
	WebDriver driver;
	
//	@Before()
	public WebDriver setupDriver() {
		if(driver == null)
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		return driver;
	}
	
//	@After()
	public void closeBrowser() {
		driver.quit();
		driver = null;
	}
}
