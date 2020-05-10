package com.capgemini.stepdefs;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import com.capgemini.base.Generic;
import com.capgemini.pageclasses.Login;
import com.capgemini.pageclasses.Order;
import com.capgemini.pageclasses.ItemSelct;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Paymentstep extends Generic {
	Login lgn;
	Order ordr;
	ItemSelct sltn;

	@Given("^open browser$")
	public void open_browser() {
		Generic.browserInitialization();
	}

	@Given("^enter Url$")
	public void enter_Url() {
		Generic.urlLoad();
	}

	@Then("^enter username and password$")
	public void enter_username_and_password() throws EncryptedDocumentException, IOException {
		lgn = new Login(driver);
		lgn.clearData();
		String path = "E:\\parallel project\\endtoend.xlsx";
		String Email = getExcelData(path, "Sheet1", 1, 0);
		String password2 = getExcelData(path, "Sheet1", 1, 1);
		lgn.login(Email, password2);
	}

	@Then("^click on login$")
	public void click_on_login() {
		lgn = new Login(driver);
		lgn.clickLogin();
	}

	@Then("^Select item and filters$")
	public void select_item_and_filters() throws InterruptedException {
		sltn = new ItemSelct(driver);
		sltn.selectProduct();
	}

	@Then("^click on add to bag$")
	public void click_on_add_to_bag() {
		sltn = new ItemSelct(driver);
		sltn.addToBag();
	}

	@Then("^click on bag icon$")
	public void click_on_bag_icon() {
		ordr = new Order(driver);
		ordr.bag();
	}

	@Then("^click on place order$")
	public void click_on_place_order() {
		ordr = new Order(driver);
		ordr.placeOrder();
	}

	@Then("^click on c/ontinue$")
	public void click_on_continue() {
		ordr = new Order(driver);
		ordr.address();
	}

	@Then("^choose payment method as paypal/paytm/wallets$")
	public void choose_payment_method_as_paypal_paytm_wallets() {
		ordr = new Order(driver);
		ordr.choosePayment();
	}

	@Then("^click on paytm$")
	public void click_on_paytm() {
		ordr = new Order(driver);
		ordr.paytm();
	}

	@Then("^click on pay now button$")
	public void click_on_pay_now_button() throws Throwable {
		ordr = new Order(driver);
		ordr.completePayment();
	}

}
