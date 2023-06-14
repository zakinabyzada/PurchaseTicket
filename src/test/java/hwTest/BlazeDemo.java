package hwTest;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utills.Constants;

public class BlazeDemo {

	@FindBy(id = "inputName")
	WebElement NameField;

	@FindBy(id = "address")
	WebElement AddressField;

	@FindBy(id = "city")
	WebElement CityField;

	@FindBy(id = "state")
	WebElement stateField;

	@FindBy(id = "zipCode")
	WebElement zipCodeField;

	@FindBy(id = "cardType")
	WebElement CardTypeField;

	@FindBy(id = "creditCardNumber")
	WebElement creditCardNumberField;

	@FindBy(id = "creditCardMonth")
	WebElement MonthField;

	@FindBy(id = "creditCardYear")
	WebElement yearField;

	@FindBy(id = "nameOnCard")
	WebElement NameOnCardField;

	@FindBy(id = "rememberMe")
	WebElement rememberMeField;

	@FindBy(xpath= "//input[@type='submit']")
	WebElement PurchaseBtnField;

	@FindBy(xpath = "//div[@class='container hero-unit']//h1")
	WebElement message;

	// Class Constructor
	public BlazeDemo() {
		PageFactory.initElements(Constants.driver, this);
	}

	public void enterFirstAndLastName(String FirstName) {
		NameField.sendKeys(FirstName);
	}

	public void enterAddress(String address) {
		AddressField.sendKeys(address);
	}

	public void enterCity(String City) {
		CityField.sendKeys(City);
	}

	public void enterState(String state) {
		stateField.sendKeys(state);
	}

	public void enterZipCode(String zipCode) {
		zipCodeField.sendKeys(zipCode);
	}

	public void Cardtype(String cardType) {
		Select select = new Select(CardTypeField);
		select.selectByVisibleText(cardType);
	}

	public void creditCard(String cardNumber) {
		creditCardNumberField.sendKeys(cardNumber);
	}

	public void EnterTheCarMonth(String cardMonth) {
		MonthField.sendKeys(cardMonth);
	}

	public void EnterYear(String EnterYear) {
		yearField.sendKeys(EnterYear);
	}

	public void nameOnCard(String NameOnCard) {
		NameOnCardField.sendKeys(NameOnCard);
	}

	public void remberMe() {
		rememberMeField.click();
	}

	public void purchaseBtn() {
		PurchaseBtnField.click();
	}

	public void messageRetrieve() {
		
		System.out.println(message.getText());
	}

}
