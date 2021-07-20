package pageobjectmodel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.Baseclass;

public class CabBookingPriceDetailsPage extends Baseclass {

	public CabBookingPriceDetailsPage(WebDriver driver, WebElement element) {
		super(driver, element);
	}

	static By suv = By.xpath("//label[contains(text(),'SUV')]");
	static By carname = By.xpath("//div[@class='cabImage']/parent::div/div[2]/descendant::span[1]");
	static By carprice = By.xpath("//div[@class='cabImage']/parent::div/div[3]/descendant::p[1]");

	public static By suvclickable() {
		return suv;
	}
	/************* To check the suv name *************/
	public static String textCheckSuv() {
		return driver.findElement(suv).getText();
	}

	/************* To select suv checkbox *************/
	public static void clickSUV() {
		driver.findElement(suv).click();
	}

	/************* To return list of car names *************/
	public static List<WebElement> getCarNames() {
		return driver.findElements(carname);
	}

	/************* To return list of car prices *************/
	public static List<WebElement> getCarPrices() {
		return driver.findElements(carprice);
	}
}
