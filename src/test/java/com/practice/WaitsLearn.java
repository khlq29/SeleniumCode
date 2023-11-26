package com.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class WaitsLearn {
@Test
	
	public static void main() throws InterruptedException {
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.facebook.com/");
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 
		 //give
		 driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 
		 WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
		 WebElement password = driver.findElement(By.xpath("//input[@name='pass']"));
		 WebElement fp = driver.findElement(By.xpath("//div[@class='_6ltj']"));
		 //or
		 //WebElement fp = driver.findElement(By.xpath("//a[contains(@href,'recover')]"));
		 sendKeys(driver,email,10,"khaliq anwar");
		 sendKeys(driver,password,20,"1234pass");
		 clickOn(driver,fp,30);
		 
		 //can overrite implicit wait
		 //it will take the new value
		 driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		 
		 //do not use both types of wiats in one program
		 //implicit is global wait which is executed first
		 //followed by explicit wait
		 
	}
public static void sendKeys(WebDriver driver1,WebElement element, int timeout,String value ) {
	//explicit wait
	new WebDriverWait(driver1, timeout).until(ExpectedConditions.visibilityOf(element));
	element.sendKeys(value);
}
public static void clickOn(WebDriver driver1,WebElement element, int timeout) {
	//explicit wait
	new WebDriverWait(driver1, timeout).until(ExpectedConditions.elementToBeClickable(element));
	element.click();
}
}
