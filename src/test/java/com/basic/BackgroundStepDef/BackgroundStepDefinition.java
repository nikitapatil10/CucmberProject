package com.basic.BackgroundStepDef;



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

public class BackgroundStepDefinition {

	WebDriver driver;
	JavascriptExecutor js = (JavascriptExecutor) driver;
	@Given("User need to be on Facebook login page")
	public void User_need_to_be_on_Facebook_login_page() throws InterruptedException{
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
//		WebElement button = driver.findElement(By.xpath("//button[@class='_42ft _4jy0 _al65 _4jy3 _4jy1 selected _51sy']"));
//		js. executeScript("arguments[0]. scrollIntoView();",button );
//		button.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='_6ltg']/a")).click();
	}
	@When("^User enters user first name$")
	public void User_enters_user_first_name() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//form[@id='reg']/div/div/div/div/div/input")).sendKeys("Neena");
	}
	
	@And("User enters user surname")
	public void User_enters_user_surname() throws InterruptedException {
		driver.findElement(By.xpath("//form[@id='reg']/div/div/div/div[2]/div/div/input")).sendKeys("Mhatre");
		Thread.sleep(1000);
	}
	
	
	
	@Then("User mobile field should be blank")
	public void User_mobile_field_should_be_blank() {
		String mobile = driver.findElement(By.xpath("//form[@id='reg']/div/div[2]/div/div/input")).getAttribute("value");
		Assert.assertEquals("", mobile);
	}
	
	@Then("Close the browser")
	public void Close_the_browser() {
		driver.quit();
	}
	
	@Then("^User checks first name is present$")
	public void USer_checks_first_name_is_present() throws InterruptedException {
		Thread.sleep(2000);
		String name = driver.findElement(By.xpath("//form[@id='reg']/div/div/div/div/div/input")).getAttribute("value");
		Assert.assertEquals("Neena", name);
		
	}
}
