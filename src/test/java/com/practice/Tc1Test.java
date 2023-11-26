package com.practice;

import java.util.List;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


import com.genericUtils.BaseClass;

import objectRepositoryPages.HomePage;
import objectRepositoryPages.LoginPage;
import objectRepositoryPages.ResultsPage;


public class Tc1Test extends BaseClass {
	@Test()
	public void Tc1() throws Throwable {

		wLib.waitUntillPageLoad(driver);
		
	
		HomePage hmpg = new HomePage(driver);
		
		hmpg.getSearchBar().sendKeys(fLib.getPropertyKeyValue("mytext"));
		hmpg.getSearchBtn().click();
		Thread.sleep(1000);
		
		ResultsPage rspg = new ResultsPage(driver);
		
		rspg.getMSIChkBx().click();
		
		Thread.sleep(1000);
		
		rspg.getLogIn().click();
		
		LoginPage lpg = new LoginPage(driver);
		
		lpg.getEmailBtn().sendKeys("abc@gmail.com");
		lpg.clickContinueBtn();
		
	  driver.findElement(By.xpath("//*[@id=\"ap_password\"]")).sendKeys(eLib.getExelData("Data", 0, 7)); 
		  
		  String at = driver.getTitle(); String et = "Amazon Sign In";
		  System.out.println(at); if(at.equals(et))
		  System.out.println("Test Successful"); else
		  System.out.println("Test failed");
		  
		  driver.navigate().to("https://www.amazon.com");
		  
		 // driver.findElement(By.id("twotabsearchtextbox")).sendKeys(eLib.getExelData("Data", 0, 8));
		  Thread.sleep(3000);
		  driver.findElement(By.id("nav-search-submit-button")).click();
		  Thread.sleep(5000); driver.findElement(By.linkText("msi")).click();
		  
		  driver.navigate().back();
		  
		 
		driver.quit();
	}

}
