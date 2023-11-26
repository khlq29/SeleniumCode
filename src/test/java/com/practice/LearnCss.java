package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LearnCss {
	@Test
	
	public static void main() throws InterruptedException{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		
		driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("s22");
		driver.findElement(By.xpath("//input[@id='gh-btn']")).click();
		js.executeScript("window.scrollBy(0,600)");
		driver.findElement(By.xpath("//*[@id=\"item40488d98cd\"]/div/div[2]/a/div/span")).click();
		
	}

}
