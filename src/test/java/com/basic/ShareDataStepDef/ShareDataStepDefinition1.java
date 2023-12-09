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

public class ShareDataStepDefinition1 {

	WebDriver driver ; 
	
	public ShareDataStepDefinition1(SharedClass share)
	{
		driver = share.setupDriver();
	}
	
	@Then("^User checks first \"([^\"]*)\" name is present$")
	public void USer_checks_first_name_is_present(String username) throws InterruptedException {
		Thread.sleep(2000);
		String name = driver.findElement(By.xpath("//form[@id='reg']/div/div/div/div/div/input")).getAttribute("value");
		Assert.assertEquals(username, name);
		
	}
	
	@And("^User enters user \"([^\"]*)\" surname$")
	public void User_enters_user_surname(String usersurname) throws InterruptedException {
		driver.findElement(By.xpath("//form[@id='reg']/div/div/div/div[2]/div/div/input")).sendKeys(usersurname);
		Thread.sleep(1000);
	}
	
	
	
	@But("User mobile field should be blank")
	public void User_mobile_field_should_be_blank() {
		String mobile = driver.findElement(By.xpath("//form[@id='reg']/div/div[2]/div/div/input")).getAttribute("value");
		Assert.assertEquals("", mobile);
	}
	
	@Then("^User checks user Surname \"([^\"]*)\" is present$")
	public void User_checks_user_Surname_is_present(String surname) {
		String surnamevalue = driver.findElement(By.xpath("//form[@id='reg']/div/div/div/div[2]/div/div/input")).getAttribute("value");
		Assert.assertEquals(surname, surnamevalue);
	}
	
}
