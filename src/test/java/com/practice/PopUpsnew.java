package com.practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.genericUtils.BaseClass;

public class PopUpsnew extends BaseClass {
	@Test
	public void tc() throws InterruptedException, AWTException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://nxtgenaiacademy.com/alertandpopup/");
		Thread.sleep(3000);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/div[1]/div/section[3]/div/div[1]/div/div/div/center/button")).click();
		Thread.sleep(3000);
		
		Alert alert = driver.switchTo().alert();
		String alertMessage= driver.switchTo().alert().getText();
		System.out.println(alertMessage);
		Thread.sleep(3000);
		alert.accept();
		
		driver.findElement(By.name("confirmalertbox")).click();
		String alertMessage1= driver.switchTo().alert().getText();
		System.out.println(alertMessage1);
		alert.dismiss();
		Thread.sleep(3000);
		
		driver.findElement(By.name("confirmalertbox")).click();
		String alertMessage2= driver.switchTo().alert().getText();
		System.out.println(alertMessage2);
		alert.accept();
		Thread.sleep(3000);
		
		driver.findElement(By.name("promptalertbox1234")).click();
		String alertMessage3= driver.switchTo().alert().getText();
		System.out.println(alertMessage3);
		alert.sendKeys("Yes");
		Thread.sleep(3000);
		alert.accept();
		Thread.sleep(3000);
		
		driver.findElement(By.name("promptalertbox1234")).click();
		String alertMessage4= driver.switchTo().alert().getText();
		System.out.println(alertMessage4);
		alert.sendKeys("no");
		Thread.sleep(3000);
		alert.accept();
		Thread.sleep(2000);
		//driver.close();
		
		Robot robot = new Robot();
		robot.mouseMove(400, 5);// x and y to determine where mouse cursor should go
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		Thread.sleep(2000);
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		Thread.sleep(2000);
		

	}


}
