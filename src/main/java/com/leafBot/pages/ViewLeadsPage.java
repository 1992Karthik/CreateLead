package com.leafBot.pages;

import com.leafBot.selenium.api.base.SeleniumBase;

//import projectBase.ProjectSpecificMethods;

public class ViewLeadsPage extends SeleniumBase
{
	public ViewLeadsPage getFirstName()
	{
		String firstName = getElementText(locateElement("id","viewLead_firstName_sp"));
				//driver.findElementById("viewLead_firstName_sp").getText();
		System.out.println("The first name of the newly created lead is: " + firstName);
		return this;
	}

}
