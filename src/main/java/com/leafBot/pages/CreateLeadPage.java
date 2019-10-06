package com.leafBot.pages;

import com.leafBot.selenium.api.base.SeleniumBase;

//import projectBase.ProjectSpecificMethods;

public class CreateLeadPage extends SeleniumBase
{
	public CreateLeadPage enterFirstName(String firstName)
	{
		clearAndType(locateElement("id","createLeadForm_firstName"),firstName);
		//driver.findElementById("createLeadForm_firstName").sendKeys(firstName);
		return this;
	}
	
	public CreateLeadPage enterLastName(String lastName)
	{
		clearAndType(locateElement("id","createLeadForm_lastName"),lastName);
		//driver.findElementById("createLeadForm_lastName").sendKeys(lastName);
		return this;
	}

	public CreateLeadPage enterCompanyName(String companyName)
	{
		clearAndType(locateElement("id","createLeadForm_companyName"),companyName);
		//driver.findElementById("createLeadForm_companyName").sendKeys(companyName);
		return this;
	}
	
	public ViewLeadsPage clickCreateLeadButton()
	{
		click(locateElement("class","smallSubmit"));
		//driver.findElementByClassName("smallSubmit").click();
		return new ViewLeadsPage();
	}
}
