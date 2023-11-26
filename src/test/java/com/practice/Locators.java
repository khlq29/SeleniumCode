package com.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Locators {
	@Test
	
	public void tc() throws InterruptedException {
WebDriver driver = new ChromeDriver();
		
		driver.get("https://accounts.google.com/v3/signin/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ifkv=ASKXGp24BBX-Zl1LaMaMlXTxvyKGmsYLtFqMsUK4V9bgMzfqVYpbWn8f5IUiownSL-jtHsjZAj0q&rip=1&sacu=1&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin&dsh=S1073894128%3A1700657128123507&theme=glif");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement qwe = driver.findElement(By.id("identifierId"));
		qwe.sendKeys("abc@gmail.com");
		
		//OR
		
		driver.findElement(By.id("identifierId")).sendKeys("qwe@gmail.com");
		
		driver.navigate().to("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("youtube");
		driver.findElement(By.name("btnK")).click();
		Thread.sleep(1000);
		
		
		driver.navigate().to("https://login.yahoo.com/?.src=ym&pspid=1197806870&activity=header-signin&.lang=en-US&.intl=us&.done=https%3A%2F%2Fmail.yahoo.com%2Fd");
		driver.findElement(By.linkText("Forgot username?")).click();
		driver.navigate().back();
		driver.findElement(By.cssSelector("#login-username")).sendKeys("asdfg@yahoo.com");
		driver.findElement(By.cssSelector("#login-signin")).click();
		Thread.sleep(1000);
		
		driver.navigate().to("https://www.youtube.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='search']")).click();
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("s21 one ui 6 update");
		driver.findElement(By.partialLinkText("search")).click();
		
		driver.close();
	}

}
