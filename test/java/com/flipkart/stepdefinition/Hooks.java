package com.flipkart.stepdefinition;

import com.flipkart.resources.Commonactions;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends Commonactions{
	
	Commonactions ca = new Commonactions();
	
	@Before
	public void beforeScenario() {
		
		System.out.println("before scenario");
		ca.browserLaunch("https://www.flipkart.com/");

	}
	
	@After
	public void afterScenario() {
		
		System.out.println("after scenario");
		driver.quit();

	}

}
