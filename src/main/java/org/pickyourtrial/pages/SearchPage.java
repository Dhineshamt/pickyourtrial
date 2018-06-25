package org.pickyourtrial.pages;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.pickyourtrial.wrappers.PickYourTrailWrappers;

import com.relevantcodes.extentreports.ExtentTest;

public class SearchPage extends PickYourTrailWrappers{
	
	public SearchPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;
		
		if(!verifyTitle("💬1 - Customized Holiday Packages, Honeymoon & Vacation Packages - Pickyourtrail.com")){
			reportStep("This is not Search Page", "FAIL");
		}
	}
	
	public ItineraryInterestPage searchCity(String cityName){
		enterById("landing-destination-search",cityName);
		searchById("landing-destination-search");
		return new ItineraryInterestPage(driver, test);
	}
	
	
	
	

}
