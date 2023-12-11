package com.practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.genericUtils.BaseClass;

import objectRepositoryPages.HomePage;
import objectRepositoryPages.ResultsPage;

public class SammobileFirmwareCheck extends BaseClass {

	@Test
	
	public void tc() throws InterruptedException{
		
		wLib.waitUntillPageLoad(driver);
		
		
		HomePage hmpg = new HomePage(driver);
		
		hmpg.getFirmwareSrch().click();
		
		ResultsPage rspg = new ResultsPage(driver);
			
		rspg.getClkFirmSrchBar().click();
		rspg.getClkFirmSrchBar().sendKeys("G991B");
		
		driver.findElement(By.xpath("//*[@id=\"firmware-model-search-dropdown\"]")).click();		
		driver.findElement(By.xpath("//*[@id=\"firmware-model-search\"]")).click();
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//*[@id=\"autocompleteBS-list-content\"]/div")).click();
		driver.findElement(By.xpath("//*[@id=\"firmware-search-submit\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"SM-G991B-tab\"]")).click();
		Thread.sleep(4000);
		
		JavascriptExecutor scroll = (JavascriptExecutor)driver;
		
		scroll.executeScript("window.scrollBy(0,800)");
	
		Thread.sleep(10000);
				
		
		
	}
}
