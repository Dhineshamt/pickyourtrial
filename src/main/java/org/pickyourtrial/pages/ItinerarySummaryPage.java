package org.pickyourtrial.pages;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.pickyourtrial.wrappers.PickYourTrailWrappers;

import com.relevantcodes.extentreports.ExtentTest;

public class ItinerarySummaryPage extends PickYourTrailWrappers{

	public ItinerarySummaryPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;		
		if(!verifyTitle("Itinerary | Pickyourtrail")){
			reportStep("This is not Itinerary page","FAIL");
		}
	}
	
	public TalkToExpertPage clickTalkToExpertButton(){
		clickByXpath("//div[@class='btn btn-primary tracker-talk-expert']");		
		return new TalkToExpertPage(driver, test);
	}
	

	
}
