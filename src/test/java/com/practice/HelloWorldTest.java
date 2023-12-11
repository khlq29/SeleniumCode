package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HelloWorldTest {
	
	@Test()
	public void Tc0() {
		//setup browser
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		//launch browser
		WebDriver driver = new ChromeDriver();
		//navigate to the url
		driver.get("https://facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("khaliq123");
		
		driver.close();
	
	}

}
