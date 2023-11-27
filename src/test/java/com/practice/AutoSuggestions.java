package com.practice;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.genericUtils.BaseClass;

import objectRepositoryPages.HomePage;

public class AutoSuggestions extends BaseClass{
	@Test
	
	public void Tc() throws Throwable{ 
		wLib.waitUntillPageLoad(driver);
		
		HomePage hmpg = new HomePage(driver);
		
		hmpg.getGoogleSearchBtn().sendKeys(fLib.getPropertyKeyValue("mytext"));
		Thread.sleep(2000);
		
		List<WebElement> autosug = new ArrayList<WebElement>();
		
		autosug = hmpg.getAutoSugg();
		
		String et= "15";
		System.out.println("count is -------> " + autosug.size());
		for(WebElement auto : autosug) {
			System.out.println(auto.getText());

			
			if(auto.getText().equals(et))
				System.out.println("yes");
			else
				System.out.println("no");
		    
		}
	}

}
