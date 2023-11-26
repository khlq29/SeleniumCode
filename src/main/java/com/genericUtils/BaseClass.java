package com.genericUtils;

import java.sql.SQLException;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;


/**
 * this class contains basic configurations annotations of testng
 * 
 * @author khaliq
 *
 */
public class BaseClass {
	
	 public static WebDriver staticDriver;
	/*Creating the objects */
	 public FileUtility fLib = new FileUtility();
	public ExcelUtility eLib = new ExcelUtility();
	public JavaUtility jLib = new JavaUtility();
	public WebDriverUtility wLib = new WebDriverUtility();
	
	public WebDriver driver=null;
	
	@BeforeSuite(groups= {"smoketest","regression"})
	public void connectDB() throws SQLException 
	{
		//dLib.ConnectionDB();
		System.out.println("====DC Connection succesfull=======");
		
	}
   @Parameters(value = {"browser"})//chrome,firefox
   @BeforeClass(groups= {"smoketest","regression"})
//   public void launchBrowser(@Optional("chrome")String browser) throws Throwable
   public void configBC(@Optional("chrome") String browser) throws Throwable
 //  public void launchBrowser() throws Throwable
   {
	   String BROWSER = fLib.getPropertyKeyValue("browser");
	   System.out.println(BROWSER);
	   String URL = fLib.getPropertyKeyValue("url");
	  if(BROWSER.equalsIgnoreCase("chrome"))
	   {
		   driver = new ChromeDriver();
	   }
	   else if(BROWSER.equalsIgnoreCase("firefox"))
	   {
		  driver = new FirefoxDriver();
		   
	   }
	   else 
	   {
		   driver = new OperaDriver();
	   }
	   staticDriver = driver;
	   System.out.println("browser launch succesfull");
	   System.out.println(URL);
	 
	   driver.get(URL);
	   wLib.Maximise(driver);
	 
	  
   }
   @BeforeMethod(groups= {"smoketest","regression"})
   public void loginToApp() throws Throwable
   {
	  
	System.out.println("Login To Application using username and password if needed or skip this step");
    }
   @AfterMethod(groups= {"smoketest","regression"})
   public void logoutofApp() throws Throwable
   {
	  
	   
	  System.out.println("signout successfull");
   }
   
   @AfterClass(groups= {"smoketest","regression"})
   public void CloseBrowser() {
	   driver.close();
	   System.out.println("browser close successfully");
   }
   @AfterSuite(groups= {"smoketest","regression"})
   public void closeDB() throws SQLException
   {
	   //dLib.closeDB();
	   System.out.println("dm connection close suceessfully ");
   }
}
