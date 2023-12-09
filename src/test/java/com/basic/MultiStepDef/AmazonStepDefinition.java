package com.basic.MultiStepDef;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
//import junit.framework.Assert;
import org.openqa.selenium.Keys;
public class AmazonStepDefinition {

	WebDriver driver;
	JavascriptExecutor js = (JavascriptExecutor) driver;
	@Given("User need to be on amazon")
	public void User_need_to_be_on_amazon () throws InterruptedException{
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.quit();
	}
	
	
	


}
