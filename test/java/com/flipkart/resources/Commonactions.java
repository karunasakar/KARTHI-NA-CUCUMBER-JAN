package com.flipkart.resources;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Commonactions {
	
	public static WebDriver driver;
	
	public void browserLaunch(String url) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		options.setExperimentalOption("excludeSwitches",
			     Arrays.asList("disable-popup-blocking"));
//		options.addArguments("--headless");
	    driver = new ChromeDriver(options);
		driver.get(url);
	//	driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

	}
	
	
	public void inserTText(WebElement element,String value) {
	
		element.sendKeys(value);

	}
	
	public void inserTTextenter(WebElement element,String value) {
		
		element.sendKeys(value,Keys.ENTER);

	}
	
	public void button(WebElement element) {
		
		element.click();

	}
	
	public void actionInsertText(String value) {
		
		Actions a = new Actions(driver);
		a.sendKeys(value);

	}

}
