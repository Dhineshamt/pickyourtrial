package org.pickyourtrial.pages;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.pickyourtrial.wrappers.PickYourTrailWrappers;

import com.relevantcodes.extentreports.ExtentTest;

public class TalkToExpertPage extends PickYourTrailWrappers{

	public TalkToExpertPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
		
		if(!verifyTitle("Itinerary | Pickyourtrail")){
			reportStep("This is not Itinerary page","FAIL");
		}
	}
	
	public TalkToExpertPage enterYourName(String name){
		enterByName("name", name);
		return this;
	}
	
	public TalkToExpertPage enterMobileNumber(String mobileNumber){
		enterByName("mobileNumber", mobileNumber);
		return this;
	}
	
	public TalkToExpertPage enterEmail(String email){
		enterByName("email", email);
		return this;
	}
	
	public ItinerarySummaryPage clickRequestCallBack(){
		clickByXpath("//button[@class='btn btn-primary btn-block tracker-itinerary-request-call-back']");	
		return new ItinerarySummaryPage(driver, test);
	}

}
