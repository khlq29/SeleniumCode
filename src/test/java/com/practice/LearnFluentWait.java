package com.practice;


import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;


public class LearnFluentWait {

		@Test
		
		public void tc44() throws InterruptedException {
			 WebDriver driver = new ChromeDriver();
			 driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
			 driver.manage().window().maximize();
			 driver.manage().deleteAllCookies();
			 Thread.sleep(2000);
			 driver.findElement(By.xpath("//*[@id=\"start\"]/button")).click();
			 
			 //Fluent wait
			 Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver).withTimeout(30, TimeUnit.SECONDS).pollingEvery(1, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
			 Thread.sleep(2000);
			 WebElement content = fluentWait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				return driver.findElement(By.xpath("//h4[text()='Hello World']"));
			}
			});
			 
			 System.out.println(content.getText());
		
			
		}
	
	}

