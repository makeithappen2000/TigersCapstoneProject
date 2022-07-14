package step.definition;

import core.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.HomePageObj;
import utilities.Utils;

public class HomePageStepDef extends Base{

	HomePageObj HomePage = new HomePageObj();
	
	
	//Scenario 1
		@When("User click on Currency")
		public void user_click_on_currency() {
			HomePage.ClickOnCurrency();
		   mylogger.info("Currency tab was clicked successfully!");
		}
		@And("User Chose Euro from dropdown")
		public void user_chose_euro_from_dropdown() {
		  HomePage.ChooseEuro();
	      mylogger.info("Euro currency was selected successfully!");
			
		}
		@Then("currency value should change to Euro")
		public void currency_value_should_change_to_euro() {
		 HomePage.ChangesOfCurrencyTab();
		 mylogger.info("Currency tab was changed to Euro Successfully!");
		 Utils.TakeScreenShotForThisStep();
		}
		
		//Scenario 2
		@When("User click on shopping cart")
		public void user_click_on_shopping_cart() {
		   HomePage.ClickOnShoopingCart();
		   mylogger.info("Shopping cart was clicked successfully!");
		}
		@Then("{string} message should display")
		public void message_should_display(String message) {
			HomePage.ValidateShoppingCartMessage();
		    mylogger.info("Shopping cart Messaged was verified successfully!");
		    Utils.TakeScreenShotForThisStep();
		}
}
