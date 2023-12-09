package com.basic.MultiStepDef;



import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
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

public class GoogleStepDefinition {

	
	WebDriver driver;
	@Given("User need to be on google")
	public void User_need_to_be_on_google () throws InterruptedException{
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
	}
	@When("^User enters selenium in textfield$")
	public void User_enters_selenium_in_textfield() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.id("APjFqb")).sendKeys("selenium");
	}
	
	

	
	@Then("^click on search button$")
	public void click_on_search_button() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.id("APjFqb")).sendKeys(Keys.ENTER);
		
		driver.quit();
	}
	
}