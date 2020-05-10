package com.capgemini.pageclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.capgemini.base.Generic;

public class ItemSelct extends Generic {
	@FindBy(xpath = "//div//a[@data-group=\"essentials\"]")
	WebElement essentials;
	@FindBy(xpath = "//div//a[@data-reactid=\"621\"]")
	WebElement bbycre;
	@FindBy(xpath = "//img[@src=\"https://assets.myntassets.com/dpr_2,q_60,w_210,c_limit,fl_progressive/assets/images/10390371/2019/11/6/20492af2-e448-4be4-8669-640ad3ff0c611573043863112-Sebamed-Baby-Powder-400g-6221573043862676-1.jpg\" ]")
	WebElement babypwder;
@FindBy(xpath = "//span[@class=\"product-actionsButton product-addToBag\"]")
WebElement addbag;
public ItemSelct(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public void selectProduct() throws InterruptedException {
	Actions action2=new Actions(driver);
	Thread.sleep(1000);
	action2.moveToElement(essentials).perform();
	bbycre.click();
}
public void addToBag() {
	Actions action2=new Actions(driver);
action2.moveToElement(babypwder).perform();
addbag.click();
}
}
