package org.pickyourtrial.pages;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.pickyourtrial.wrappers.PickYourTrailWrappers;

import com.relevantcodes.extentreports.ExtentTest;

public class AddCitiesPage extends PickYourTrailWrappers {

	public AddCitiesPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
		
		if(!verifyTitle("Customize your itinerary | Pickyourtrail")){
			reportStep("This is not Itinerary page","FAIL");
		}
	}

	public AddCitiesPage addCities(String city){
		clickByXpath("//h2[text()='Barcelona']");
		return this;
	}
	
	public ItinerarySummaryPage createItinerary(){
		clickById("pdg-create-itinerary");
		
		return new ItinerarySummaryPage(driver, test);
	}
}
