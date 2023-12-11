package com.practice;
import java.util.concurrent.TimeUnit; 
import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test; 

public class IsSelectedMethodEx 
{ 
	@Test
public  void t() throws InterruptedException { 
  WebDriver driver = new ChromeDriver(); 
  String URL = "https://selenium08.blogspot.com/2019/07/check-box-and-radio-buttons.html"; 
  driver.get(URL); 
  
  driver.manage().window().maximize(); driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
  WebElement red = driver.findElement(By.xpath("//input[@name='color' and @value='red']")); 

// Check if it is enabled before selecting it. 
   if(red.isEnabled()) { 
      System.out.println("Red checkbox is enabled. Return: " +red.isEnabled()); 

// Since check box is enabled. Therefore, click it. 
      red.click(); 

// Now check that it is selected or not. 
    if(red.isSelected()) { 
        System.out.println("Red checkbox is selected. Return: " +red.isSelected()); 
     } 
     else { 
        System.out.println("Red checkbox is not selected. Return: " +red.isSelected()); 
     } 
    } 
   else { 
      System.out.println("Red checkbox is not enabled. Return: " +red.isEnabled()); 
    } 
// Find XPath for radio button Opera. 
     WebElement opera=driver.findElement(By.xpath("//input[@name='browser' and @value='Opera']")); 

// Check radio button opera is selected or not. 
     if(opera.isSelected()) { 
          System.out.println("Radio button opera is selected. Return: " +opera.isSelected()); 
   } 
   else { 
      System.out.println("Radio button opera is not selected. Return: " +opera.isSelected()); 
   } 
  driver.close(); 
 } 
}