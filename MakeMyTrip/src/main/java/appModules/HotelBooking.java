package appModules;

import java.text.ParseException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pageobjectmodel.HotelBookingPage;
import pageobjectmodel.LandingPage;
import utilities.Baseclass;

public class HotelBooking extends Baseclass {

	public HotelBooking(WebDriver driver, WebElement element) {
		super(driver, element);
	}
	public static void execution() {
		LandingPage.clickHotelLink();
		try {
			HotelBookingPage.fillCity();
			HotelBookingPage.selectCheckInDate();
			HotelBookingPage.selectCheckOutDate();
			HotelBookingPage.showGuestCount();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

	/*************** To check the website of the url **************/
	public static String websiteCheck() {
		return driver.getTitle();
	}

	/*************** To check the hotel element **************/
	public static boolean hotelElement() {
		WebElement icon = LandingPage.hotelLink();
		boolean check = false;
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		if (icon.isDisplayed() && icon.isEnabled()) {
			check = true;
		}
		return check;
	}

	/**************** To enter valid input ************/
	public static boolean validInputsTest() {
		LandingPage.clickHotelLink();
		try {
			HotelBookingPage.fillCity();
			HotelBookingPage.selectCheckInDate();
			HotelBookingPage.selectCheckOutDate();
			HotelBookingPage.showGuestCount();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return true;
	}

	/*************** To check non mandatory fields **************/
	public static boolean nonMandatoryFieldCheck() {
		LandingPage.clickHotelLink();
		HotelBookingPage.fillCity();
		HotelBookingPage.travellingReason();
		HotelBookingPage.workOption();
		return true;
	}
}
