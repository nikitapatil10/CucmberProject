package com.basic.ShareDataStepDef;




import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ShareDataStepDefinition {

	WebDriver driver; 
	
	public ShareDataStepDefinition(SharedClass share)
	{
		driver = share.setupDriver();
	}
	
	@Given("User need to be on Facebook login page")
	public void User_need_to_be_on_Facebook_login_page() throws InterruptedException{
		
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='_6ltg']/a")).click();
	}
	@When("^User enters user \"([^\"]*)\" first name$")
	public void User_enters_user_first_name(String username) throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//form[@id='reg']/div/div/div/div/div/input")).sendKeys(username);
	}
	
}
