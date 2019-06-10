package com.cg.hotelbooking.stepdef;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.cg.hotelbooking.bean.HotelBokking;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HotelBookingStepDef {
	
	HotelBokking hotelBean;
	String title;
	WebDriver driver;
	@Before
	public void init() {
		System.setProperty("webdriver.chrome.driver","mydriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		hotelBean=new HotelBokking();
		PageFactory.initElements(driver,hotelBean);
		
	}
	@After
	public void finish() throws Exception {
		Thread.sleep(5000);
		driver.quit();
	}
	
	@Given("^HotelBooking page for validation$")
	public void hotelbooking_page_for_validation() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	driver.get("file:///D:/Practice/Angular2/HotelBookingWithSelinium/Webpage/hotelbooking.html");
	}
	@When("^checking title of hotel booking$")
	public void checking_title_of_hotel_booking() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    title=driver.getTitle();
	}

	@Then("^check title is Hotel Booking$")
	public void check_title_is_Hotel_Booking() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    String expected="Hotel Booking";
	    String actual=title;
	    assertEquals(expected, actual);
	}

	@When("^Enter Submit without entering firstname$")
	public void enter_Submit_without_entering_firstname() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    hotelBean.clickButton();
	    Thread.sleep(1000);
	}

	@Then("^Get Alert with 'Please fill the First Name'$")
	public void get_Alert_with_Please_fill_the_First_Name() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String actual=driver.switchTo().alert().getText();
		String expected="Please fill the First Name";
		assertEquals(expected, actual);
	   
	}

	@When("^Enter Submit without entering lastname$")
	public void enter_Submit_without_entering_lastname() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.switchTo().alert().dismiss();
		hotelBean.setFirstElement("aaaaa");
		hotelBean.clickButton();
	    Thread.sleep(1000);
	    
	}

	@Then("^Get Alert with 'Please fill the Last Name'$")
	public void get_Alert_with_Please_fill_the_Last_Name() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String actual=driver.switchTo().alert().getText();
		String expected="Please fill the Last Name";
		assertEquals(expected, actual);
	}

	@When("^Enter Submit without entering email$")
	public void enter_Submit_without_entering_email() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.switchTo().alert().dismiss();
		
		hotelBean.setLastName("bbbbb");
		hotelBean.clickButton();
	    Thread.sleep(1000);
	    
	}

	@Then("^Get Alert with 'Please fill the Email'$")
	public void get_Alert_with_Please_fill_the_Email() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String actual=driver.switchTo().alert().getText();
		String expected="Please fill the Email";
		assertEquals(expected, actual);
	}

	@When("^Enter Submit with invalid  email$")
	public void enter_Submit_with_invalid_email() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.switchTo().alert().dismiss();
		hotelBean.setEmail("aa");
		hotelBean.clickButton();
	    Thread.sleep(1000);
	    
	}

	@Then("^Get Alert with 'Please enter valid Email Id\\.'$")
	public void get_Alert_with_Please_enter_valid_Email_Id() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String actual=driver.switchTo().alert().getText();
		String expected="Please enter valid Email Id.";
		assertEquals(expected, actual);
	}
	

	@When("^Enter Submit without entering mobile number$")
	public void enter_Submit_without_entering_mobile_number() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.switchTo().alert().dismiss();
        
		hotelBean.setEmail("aa@gmail.com");
		hotelBean.clickButton();
	    Thread.sleep(1000);
	}

	@Then("^Get Alert with 'Please fill the Mobile No\\.'$")
	public void get_Alert_with_Please_fill_the_Mobile_No() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String actual=driver.switchTo().alert().getText();
		String expected="Please fill the Mobile No.";
		assertEquals(expected, actual);
	}

	@When("^Enter Submit with invalid  mobile number$")
	public void enter_Submit_with_invalid_mobile_number() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.switchTo().alert().dismiss();
	
		hotelBean.setMobileNo("11111");
		hotelBean.clickButton();
	    Thread.sleep(1000);
	}

	@Then("^Get Alert with 'Please enter valid Contact no\\.'$")
	public void get_Alert_with_Please_enter_valid_Contact_no() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String actual=driver.switchTo().alert().getText();
		String expected="Please enter valid Contact no.";
		assertEquals(expected, actual);
	}
	
	@When("^Enter Submit selecting City$")
	public void enter_Submit_selecting_City() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.switchTo().alert().dismiss();
		hotelBean.setMobileNo("7876123421");
		hotelBean.clickButton();
	    Thread.sleep(1000);
	}

	@Then("^Get Alert with Please select city$")
	public void get_Alert_with_Please_select_city() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String actual=driver.switchTo().alert().getText();
		String expected="Please select city";
		assertEquals(expected, actual);
	}
	

	@When("^Enter Submit selecting state$")
	public void enter_Submit_selecting_state() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.switchTo().alert().dismiss();
		hotelBean.setCity("Chennai");
		hotelBean.clickButton();
	    Thread.sleep(1000);
	}

	@Then("^Get Alert with Please select state$")
	public void get_Alert_with_Please_select_state() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String actual=driver.switchTo().alert().getText();
		String expected="Please select state";
		assertEquals(expected, actual);
	}




}
