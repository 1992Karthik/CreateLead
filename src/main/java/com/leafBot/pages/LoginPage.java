package com.leafBot.pages;

import com.leafBot.selenium.api.base.SeleniumBase;

public class LoginPage extends SeleniumBase {
	public LoginPage enterUsername(String username) {
		clearAndType(locateElement("id", "username"), username);
		return this;
	}

	public LoginPage enterPassword(String password) {
		clearAndType(locateElement("id", "password"), password);
		return this;
	}

	public HomePage clickLogin() {
		click(locateElement("class","decorativeSubmit"));
		return new HomePage();
	}
}
