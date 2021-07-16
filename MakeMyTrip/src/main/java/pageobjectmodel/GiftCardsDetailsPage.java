package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.Baseclass;
import utilities.ReusableMethods;

public class GiftCardsDetailsPage extends Baseclass {

	public GiftCardsDetailsPage(WebDriver driver, WebElement element) {
		super(driver, element);
	}

	static By email = By.xpath("//li[contains(text(),'E-Mail')]");
	static By recipientName = By.name("name");
	static By senderName = By.name("senderName");
	static By recipientNumber = By.name("mobileNo");
	static By senderNumber = By.name("senderMobileNo"); 
	static By recipientEmail = By.name("emailId");
	static By senderEmail = By.name("senderEmailId");
	static By giftMessage = By.name("giftMessage");
	static By buynowButtton = By.xpath("//button[contains(text(),'BUY NOW')]");
	static By senderNameErrorMessage = By.xpath("//*[@id=\"deliveredSection\"]/div/div/div/div[2]/div[1]/p");
	static By recipientNameErrorMessage = By.xpath("//*[@id=\"deliveredSection\"]/div/div/div/div[1]/div/div[1]/p ");
	static By senderMobileErrorMessage = By.xpath("//*[@id=\"deliveredSection\"]/div/div/div/div[2]/div[2]/div[2]/p");
	static By recipientMobileErrorMessage = By.xpath("//*[@id=\"deliveredSection\"]/div/div/div/div[1]/div/div[2]/div[2]/p");
	static By senderMailErrorMessage = By.xpath("//*[@id=\"deliveredSection\"]/div/div/div/div[2]/div[3]/p");
	static By recipientMailErrorMessage = By.xpath("//*[@id=\"deliveredSection\"]/div/div/div/div[1]/div/div[3]/p");
	
	public static WebElement senderNameBox() {
		return driver.findElement(senderName);
	}
	public static WebElement receiverEmailBox() {
		return driver.findElement(recipientName);
	}
	public static WebElement senderEmailBox() {
		return driver.findElement(senderEmail);
	}
	
	public static WebElement recipientEmailBox() {
		return driver.findElement(recipientEmail);
	}
	
	public static WebElement senderMobileTextBox() {
		return driver.findElement(senderNumber);
	}
	
	public static WebElement recipientMobileTextBox() {
		return driver.findElement(recipientNumber);
	}
	
	public static void selectEmail() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(email));
		driver.findElement(email).click();
	}

	public static void enterSenderDetails(String name,String phone,String email) {
		
		driver.findElement(senderName).sendKeys(name);
		driver.findElement(senderNumber).sendKeys(phone);
		driver.findElement(senderEmail).sendKeys(email);
	}
	
	public static void enterRecipientDetails(String name,String phone,String email) {
		driver.findElement(recipientName).sendKeys(name);
		driver.findElement(recipientNumber).sendKeys(phone);
		driver.findElement(recipientEmail).sendKeys(email);
	}
	
	public static void addMessage(String message) {
		driver.findElement(giftMessage).sendKeys(message);
	}
	
	public static void clickBuyNow() {
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(buynowButtton));
		driver.findElement(buynowButtton).click();
	}
	public static String printRecipientMailErrorMessage() {
		String errorText = driver.findElement(recipientMailErrorMessage).getText();
		return errorText;
	}
	public static String printSenderMailErrorMessage() {
		String errorText = driver.findElement(senderMailErrorMessage).getText();
		return errorText;
	}
	public static String printRecipientMobileErrorMessage() {
		String errorText = driver.findElement(recipientMobileErrorMessage).getText();
		return errorText;
	}
	public static String printRecipientNameErrorMessage() {
		String errorText = driver.findElement(recipientNameErrorMessage).getText();
		return errorText;
	}
	public static String printSenderNameErrorMessage() {
		String errorText = driver.findElement(senderNameErrorMessage).getText();
		return errorText;
	}
	
	public static String printSenderMobileErrorMessage() {
		String errorText = driver.findElement(senderMobileErrorMessage).getText();
		return errorText;
	}
}
