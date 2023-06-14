package hwSteps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import hwTest.BlazeDemo;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import utills.Constants;

public class StepTicketPurchase {

	WebDriver driver;
	BlazeDemo demo;
	@Given("User inputs Navigates to {string}")
	public void user_inputs_navigates_to(String url) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		Constants.driver = new ChromeDriver();
		Thread.sleep(2000);
		Constants.driver.manage().window().maximize();
		Constants.driver.get(url);
		Thread.sleep(2000);
		
		demo = new BlazeDemo();
	}


	@When("User inputes FirstName and lastName {string}")
	public void user_inputes_first_name_and_last_name(String FirstAndLastName) {
		demo.enterFirstAndLastName(FirstAndLastName);
	}

	@When("User inputs Address {string}")
	public void user_inputs_address(String Address) {
		demo.enterAddress(Address);
	}

	@When("User inputs City {string}")
	public void user_inputs_city(String City) {
		demo.enterCity(City);
	}

	@When("User inputs State {string}")
	public void user_inputs_state(String State) {
		demo.enterState(State);
	}

	@When("User inputs ZipCode {string}")
	public void user_inputs_zip_code(String ZipCode) {
		demo.enterZipCode(ZipCode);
	}

	@When("User Selects Card Type {string}")
	public void user_selects_card_type(String CardType) {
		demo.Cardtype(CardType);
	}

	@When("User inputs Credit Card Number {string}")
	public void user_inputs_credit_card_number(String CreditCardNumber) {
		demo.creditCard(CreditCardNumber);
	}

	@When("User inputs Month {string}")
	public void user_inputs_month(String Month) {
		demo.EnterTheCarMonth(Month);
	}

	@When("User inputs year {string}")
	public void user_inputs_year(String year) {
		demo.EnterYear(year);
	}

	@When("User inputs Name on Card {string}")
	public void user_inputs_name_on_card(String NameOnCard) {
		demo.nameOnCard(NameOnCard);
	}

	@When("User Clicks the Remeber Me button")
	public void user_clicks_the_remeber_me_button() {
		demo.remberMe();
	}

	@When("User Clicks the Purchase Flight button")
	public void user_clicks_the_purchase_flight_button() {
		demo.purchaseBtn();
	}

	@Then("System outputs message {string}")
	public void system_outputs_message(String message) throws InterruptedException {
		demo.messageRetrieve();
		Thread.sleep(3000);
		Constants.driver.quit();
	}

}
