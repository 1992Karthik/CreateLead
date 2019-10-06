package com.leafBot.pages;

import com.leafBot.selenium.api.base.SeleniumBase;

//import projectBase.ProjectSpecificMethods;

public class MyLeadsPage extends SeleniumBase
{
	public CreateLeadPage clickCreateLead()
	{
		click(locateElement("link","Create Lead"));
		//driver.findElementByLinkText("Create Lead").click();
		return new CreateLeadPage();
	}

}
