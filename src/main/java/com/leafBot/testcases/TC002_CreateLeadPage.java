package com.leafBot.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leafBot.pages.LoginPage;
import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class TC002_CreateLeadPage extends ProjectSpecificMethods{
	@BeforeTest
	public void setData() 
	{
		excelFileName="createlead";
		testcaseName="Create Lead";
		testcaseDec = "Login and create a new lead";
		author="Sowmiya";
		category="smoke";
	}

	@Test(dataProvider="fetchData")
	public void createNewLead(String userName, String password,String firstName, String lastName, String companyName) 
	{
		new LoginPage()
		.enterUsername(userName)
		.enterPassword(password)
		.clickLogin()
		.clickCRMSFALink()
		.clickLeads()
		.clickCreateLead()
		.enterFirstName(firstName)
		.enterLastName(lastName)
		.enterCompanyName(companyName)
		.clickCreateLeadButton()
		.getFirstName();
}
}
		
		
		
		
		
		
		
		/*LoginPage lp = new LoginPage();
		lp.enterUsername();
		lp.enterPassword();
		lp.clickLogin();
		
		HomePage hp = new HomePage();
		hp.clickLogout();*/

	
	
	
	
	
	
	
	
	

