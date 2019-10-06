package com.leafBot.pages;

import com.leafBot.selenium.api.base.SeleniumBase;

//import pages.MyHomePage;

public class HomePage extends SeleniumBase{
	public HomePage clickLogout() {
		click(locateElement("class","decorativeSubmit"));
		return new HomePage();
	}

	public MyHomePage clickCRMSFALink() 
	{
		click(locateElement("link","CRM/SFA"));
		return new MyHomePage();
	}
		//driver.findElementByLinkText("CRM/SFA").click();
		//return new MyHomePage();
}
