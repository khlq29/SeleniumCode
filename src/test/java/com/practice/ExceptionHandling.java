package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import junit.framework.Assert;

@Listeners(TestListener.class)
public class ExceptionHandling {
	@Test (priority = 1) 
	//to determine which test case shoul run first
	// priority 0 , 1 , 2 ....etc
	public void tc() throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,400)");
		try {
			//below are two test cases to check
			//exception handling
			
			//1.below will throw exception
			//driver.findElement(By.name("fake")).click();
			
			//2./below will not throw exception
			driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[2]")).click();
		}catch (Exception e) {
			System.out.println("element not found");
			System.out.println("hello for c");
			
			//throw(e);
			
			
		}finally {
			driver.close();
			System.out.println("hello for f");
		}
		System.out.println("hello for normal");
	}
	
	@Test(priority = 0)
	public void TestToFail()
	{
		System.out.println("this method is to test fail");
		Assert.assertTrue(false);
	}

}
