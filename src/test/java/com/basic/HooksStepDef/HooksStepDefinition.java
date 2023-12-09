package com.basic.HooksStepDef;




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

public class HooksStepDefinition {

	WebDriver driver = null; 
	
	@Before()
	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
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
	

	@Then("^User checks first \"([^\"]*)\" name is present$")
	public void USer_checks_first_name_is_present(String username) throws InterruptedException {
		Thread.sleep(2000);
		String name = driver.findElement(By.xpath("//form[@id='reg']/div/div/div/div/div/input")).getAttribute("value");
//		System.out.println(name);
		Assert.assertEquals(username, name);
		
	}
	
	@And("^User enters user \"([^\"]*)\" surname$")
	public void User_enters_user_surname(String usersurname) throws InterruptedException {
		driver.findElement(By.xpath("//form[@id='reg']/div/div/div/div[2]/div/div/input")).sendKeys(usersurname);
		Thread.sleep(1000);
	}
	
	
	
	@Then("User mobile field should be blank")
	public void User_mobile_field_should_be_blank() {
		String mobile = driver.findElement(By.xpath("//form[@id='reg']/div/div[2]/div/div/input")).getAttribute("value");
		Assert.assertEquals("", mobile);
	}
	
	@Then("^User checks user Surname \"([^\"]*)\" is present$")
	public void User_checks_user_Surname_is_present(String surname) {
		String surnamevalue = driver.findElement(By.xpath("//form[@id='reg']/div/div/div/div[2]/div/div/input")).getAttribute("value");
		Assert.assertEquals(surname, surnamevalue);
	}
	
//	@Then("Close the browser")
//	public void Close_the_browser() {
//		driver.quit();
//	}
	
	@After()
	public void closeBrowser() {
		driver.quit();
		driver = null;
	}
	
}
