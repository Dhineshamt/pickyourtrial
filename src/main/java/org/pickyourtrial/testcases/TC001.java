package org.pickyourtrial.testcases;

import org.pickyourtrial.pages.SearchPage;
import org.pickyourtrial.wrappers.PickYourTrailWrappers;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TC001 extends PickYourTrailWrappers{
	
	@BeforeClass
	public void setData(){
		browserName = "chrome";
		testCaseName = "Search";
		testDescription = "Search";
		category = "smoke";
		authors = "Dhinesh";
		dataSheetName = "TC001";
		
	}
	
	@Test(dataProvider = "fetchData", groups = "smoke")
	public void search(String country, String interest, String nights, String city, String name, String email, String mobileNumber){
		new SearchPage(driver,test)
		.searchCity(country)
		.selectInterest(interest)
		.chooseNext()
		.selectnights(nights)
		.addCities(city)
		.createItinerary()
		.clickTalkToExpertButton()
		.enterYourName(name)
		.enterEmail(email)
		.enterMobileNumber(mobileNumber)
		.clickRequestCallBack();
	}

}
