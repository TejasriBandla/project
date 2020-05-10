package com.capgemini.pageclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.capgemini.base.Generic;

public class Order extends Generic {
	@FindBy(xpath = "//span[@data-reactid=\"684\"]")
	WebElement bag;
	@FindBy(xpath = "//div[@class=\"button-base-button \"]")
	WebElement plcordr;
	@FindBy(xpath = "//div[@class=\"button-base-button addressDesktop-base-continueBtn\"]")
	WebElement address;
	@FindBy(xpath = "//div[@id=\"wallet\"]")
	WebElement paymentmethod;
	@FindBy(xpath = "//div[@class=\"sprite-wallet-paytm paymentSubOption-base-image\"]")
	WebElement radio1;
	@FindBy(xpath = "//button[@class=\"payNowForm-base-action   \"]")
	WebElement paynow;

	public Order(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void bag() {
		bag.click();
	}

	public void placeOrder() {
		plcordr.click();
	}

	public void address() {
		address.click();
	}

	public void choosePayment() {
		paymentmethod.click();
	}

	public void paytm() {
		radio1.click();
	}

	public void completePayment() {
		paynow.click();
	}

}
