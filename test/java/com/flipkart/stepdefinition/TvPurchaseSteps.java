package com.flipkart.stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.flipkart.resources.Commonactions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TvPurchaseSteps extends Commonactions{
	
	static String phname;
	

	
	@When("user search tv")
	public void user_search_tv() {
		
		phname="SAMSUNG tv";
		
		 WebElement search = driver.findElement(By.name("q"));
		   search.sendKeys(phname,Keys.ENTER);
		
		
	    
	}

	@When("user click on the tv name")
	public void user_click_on_the_tv_name() {
	    
		String[] s = phname.split(" ");
		
		WebElement mobileName = driver.findElement(By.xpath("(//div[contains(text(),'"+s[0]+"')])[2]"));   
		   mobileName.click();
		
	}

}
