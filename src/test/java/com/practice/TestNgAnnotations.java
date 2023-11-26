package com.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class TestNgAnnotations {
	
	public String baseURL = "https://www.edureka.co/";
	public WebDriver driver ;
	
	
	@BeforeTest
	public void launchBrowser() {
		System.out.println("launching chrome");
		driver = new ChromeDriver();
		driver.get(baseURL);
	}
	
	@Test
	public void verifyhomepage() {
		String expectedtitle = "Instructor-led";
		String actualtitle = driver.getTitle();
		
		Assert.assertEquals(expectedtitle, actualtitle);
	}
	
	@AfterTest
	public void closebrowser() {
		driver.close();
	}

}
