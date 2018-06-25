package org.pickyourtrial.pages;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.pickyourtrial.wrappers.PickYourTrailWrappers;

import com.relevantcodes.extentreports.ExtentTest;

public class ItineraryInterestPage extends PickYourTrailWrappers{
	
	public ItineraryInterestPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;
		
		if(!verifyTitle("Customize your itinerary | Pickyourtrail")){
			reportStep("This is not Itinerary page","FAIL");
		}
	}
	
	public ItineraryInterestPage selectInterest(String interest){
		if(interest.contains("Leisure")){
			clickByXpath("//div[@class='block-radius category-option-block cursor-pointer margin-top-20 transition-2s leisureandnature']");
		}		
		return this;
	}
	
	public ItineraryDaysPage chooseNext(){
		clickById("pdg-choose-duration-cta");		
		return new ItineraryDaysPage(driver,test);
	}
	

}
