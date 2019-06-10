package com.cg.hotelbooking.bean;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HotelBokking {
	@FindBy(how=How.ID,id="txtFirstName")
	WebElement firstElement;
	@FindBy(how=How.XPATH,xpath="//*[@id=\"txtLastName\"]")
	WebElement lastName;
	@FindBy(how=How.NAME,name="Email")
	WebElement email;
	@FindBy(how=How.XPATH,xpath="//*[@id=\"txtPhone\"]")
	WebElement mobileNo;
	@FindBy(how=How.XPATH,xpath="/html/body/div/div/form/table/tbody/tr[7]/td[2]/select")
	WebElement city;
	@FindBy(how=How.XPATH,xpath="/html/body/div/div/form/table/tbody/tr[8]/td[2]/select")
	WebElement state;
	@FindBy(how=How.XPATH,xpath="//*[@id=\"btnPayment\"]")
	WebElement button;

	public void clickButton() {
		button.click();
	}

	public void setFirstElement(String firstName) {
		this.firstElement.sendKeys(firstName);
	}

	public void setLastName(String last) {
		this.lastName.sendKeys(last);
	}

	public void setEmail(String email) {
		this.email.clear();
		this.email.sendKeys(email);
	}

	public void setMobileNo(String contactNo) {
		this.mobileNo.clear();
		this.mobileNo.sendKeys(contactNo);
	}

	public void setCity(String hotelcity) {
		this.city.sendKeys(hotelcity);
	}

	public void setState(String hotelState) {
		this.state.sendKeys(hotelState);
	}

	
	
}
