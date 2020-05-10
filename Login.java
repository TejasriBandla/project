package com.capgemini.pageclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.capgemini.base.Generic;

public class Login extends Generic {
	@FindBy(id = "mobileNumberPass")
	WebElement uclr;
	@FindBy(xpath = "//input[@id=\"mobileNumberPass\"]")
	WebElement email;
	@FindBy(xpath = "//input[@type=\"password\"]")
	WebElement pwd;
	@FindBy(xpath = "//button[@class=\"btn primary  lg block submitButton\"]")
	WebElement login;

	public Login(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void clearData() {
		uclr.clear();
	}
	public void login(String mail, String password) {
		email.sendKeys(mail);
		pwd.sendKeys(password);
	}

	public void clickLogin() {
		login.click();

	}
}
