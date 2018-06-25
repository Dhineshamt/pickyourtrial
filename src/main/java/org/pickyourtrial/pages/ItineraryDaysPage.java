package org.pickyourtrial.pages;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.pickyourtrial.wrappers.PickYourTrailWrappers;

import com.relevantcodes.extentreports.ExtentTest;

public class ItineraryDaysPage extends PickYourTrailWrappers{
	
	public ItineraryDaysPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;
		
		if(!verifyTitle("Customize your itinerary | Pickyourtrail")){
			reportStep("This is not Itinerary page","FAIL");
		}
	}

	public AddCitiesPage selectnights(String nights){
		int totalNights = Integer.parseInt(nights);
		System.out.println(totalNights);
		
		if(totalNights >= 14 && totalNights <= 19){
			clickByXpath("//div[@class='pdg-season-icons oj_duration_3']");
		}		
		return new AddCitiesPage(driver, test);
	}
	
	
}
