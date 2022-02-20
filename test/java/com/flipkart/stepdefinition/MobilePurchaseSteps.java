package com.flipkart.stepdefinition;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.flipkart.objectrepository.MobilePurchasePage;
import com.flipkart.resources.Commonactions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MobilePurchaseSteps extends Commonactions{
	
	Commonactions ca = new Commonactions();
	
	
	@Given("user launches flipkart application")
	public void user_launches_flipkart_application() {
		
		
		
	    
	}
	
	MobilePurchasePage mp = new MobilePurchasePage();

	@Given("user login by entering valid crendentials")
	public void user_login_by_entering_valid_crendentials() {
		
		  try {
				 
			   
			   mp.getLoginButton().isDisplayed();
			   ca.button(mp.getLoginButton());
			
	    	} catch (Exception e) {
	    		
			System.out.println("pop up is not displayed");
			
	    	}
	    
	}

	@When("user search mobile")
	public void user_search_mobile() {
		
		phname="realme";
		
		
		   
		 ca.inserTTextenter(mp.getSearchBar(), phname);
		   
		   
	    
	}

	@When("user click on the mobile name")
	public void user_click_on_the_mobile_name() {
		
		WebElement mobileName = driver.findElement(By.xpath("(//div[contains(text(),'"+phname+"')])[2]"));   
		  ca.button(mobileName);
	    
	}

	@Then("user click on add to cart")
	public void user_click_on_add_to_cart() {
		
		String parentURL = driver.getWindowHandle();
		   
		   Set<String> childURL = driver.getWindowHandles();
		   for (String child : childURL) {
			   
			   if(!parentURL.equals(child)) {
				   
				   driver.switchTo().window(child);
				   
			   }
			
		
		   }
		   
		   WebElement mobileName2 = driver.findElement(By.xpath("//span[contains(text(),'"+phname+"')]"));
		   String name = mobileName2.getText();
		   System.out.println(name);
		   
		   Assert.assertTrue(mobileName2.isDisplayed());
		  // Assert.assertEquals("realme Narzo 50A (Oxygen Green, 128 GB)  (4 GB RAM)", name);
	    
	}
	
	@When("user search mobile by one dim list")
	public void user_search_mobile_by_one_dim_list(DataTable dataTable) {
		
		List<String> datas = dataTable.asList(String.class);
		
		phname = datas.get(0);
		
		 WebElement search = driver.findElement(By.name("q"));
		  search.sendKeys(datas.get(0),Keys.ENTER);
	    
	}
	
	static String phname;
	
	@When("user search mobile by one dim map")
	public void user_search_mobile_by_one_dim_map(DataTable dataTable) {
		
	 Map<String, String> datas = dataTable.asMap(String.class,String.class);
	 
	  phname = datas.get("sam");
		
		 WebElement search = driver.findElement(By.name("q"));
		  search.sendKeys(datas.get("sam"),Keys.ENTER);
	    
	}
	
	@When("user search mobile {string}")
	public void user_search_mobile(String phone) {
		
		 phname = phone;
			
		 WebElement search = driver.findElement(By.name("q"));
		  search.sendKeys(phone,Keys.ENTER);
	    
	}

}
