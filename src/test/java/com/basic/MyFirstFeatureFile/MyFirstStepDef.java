package com.basic.MyFirstFeatureFile;



import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
//import junit.framework.Assert;

public class MyFirstStepDef {

	WebDriver driver;
	
	@Given("^User need to be on Facebook login page$")
	public void User_need_to_be_on_Facebook_login_page() throws InterruptedException{
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='_6ltg']/a")).click();
	}
	@When("^User enters user first name$")
	public void User_enters_user_first_name() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//form[@id='reg']/div/div/div/div/div/input")).sendKeys("Neena");
	}
	
	@Then("^USer checks first name is present$")
	public void USer_checks_first_name_is_present() throws InterruptedException {
		Thread.sleep(2000);
		String name = driver.findElement(By.xpath("//form[@id='reg']/div/div/div/div/div/input")).getAttribute("value");
		Assert.assertEquals("Neena", name);
		driver.quit();
	}
}
