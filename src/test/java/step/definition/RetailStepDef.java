package step.definition;

import java.util.List;
import java.util.Map;

import core.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import page.objects.RetailPageObj;
import utilities.Utils;

public class RetailStepDef extends Base {

	RetailPageObj Retail = new RetailPageObj();

	// Background methods
	@When("User click on MyAccount")
	public void user_click_on_my_account() {
    Retail.ClickOnMyAccountTab();
    mylogger.info("MyAccount Tab was clicked successfully!");
	}

	@When("User click on Login")
	public void user_click_on_login() {
		Retail.ClickOnLogInLink();
		mylogger.info("Login link was clicked successfully!");
     
	}

	@When("User enter username {string} and password {string}")
	public void user_enter_username_and_password(String user, String password) {
		Retail.EnterUserNameAndPassword(user, password);
		mylogger.info("Username and Password was entered successfully!");

	}

	@When("User click on Login button")
	public void user_click_on_login_button() {
    
		Retail.ClickOnLoginButton();
		mylogger.info("Login button was clicked successfully!");
	}

	@Then("User should be logged in to MyAccount dashboard")
	public void user_should_be_logged_in_to_my_account_dashboard() {
		Retail.ValidteMyAccountDashBoard();
		mylogger.info("MyAccount DashBoard was verified successfully!");
		Utils.TakeScreenShotForThisStep();
		
	}

	// Scenario 1 methods
	@When("User click on {string} link")
	public void user_click_on_link(String string) {
     
		Retail.ClickOnAffiliateAccountLink();
     mylogger.info("Affiliate link was clicked!");
	}

	@When("User fill affiliate form with below information")
	public void user_fill_affiliate_form_with_below_information(DataTable dataTable) {

		List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
		Retail.EnterCompanyName(data.get(0).get("company"));
		Retail.EnterWebSiteName(data.get(0).get("website"));
		Retail.EnterTaxId(data.get(0).get("taxID"));
		Retail.ClickOnChequePaymentMethod(data.get(0).get("paymentMethod"));
		Retail.EnterChequePayeeName(data.get(0).get("ChequePayeeName"));
		mylogger.info("Affiliate account was filled-out successfully!");
		Utils.TakeScreenShotForThisStep();
		
	}

	@When("User check on About us check box")
	public void user_check_on_about_us_check_box() {
 
		Retail.ClickOnAboutUsCheckBox();
		mylogger.info("Check box was clicked!");
	}

	@When("User click on continue button")
	public void user_click_on_continue_button() {
		Retail.ClickOnContinueButton();
		mylogger.info("Continue button was clicked successfully!");
	}

	@Then("User should see a success message")
	public void user_should_see_a_success_message() {
		Retail.ValidateThessuccessMessage();
		mylogger.info("Success message was verified!");
		Utils.TakeScreenShotForThisStep();
	}

	// Methods for scenario 2
	@When("User click on the {string} link")
	public void user_click_on_the_link(String string) {
     
		Retail.ClickOnEditYourAffiliateLink();
		mylogger.info("Edit Your Affiliate Link was clicked successfully!");
	}

	@When("user click on Bank Transfer radio button")
	public void user_click_on_bank_transfer_radio_button() {

		Retail.ClickOnBankTransferButton();
		mylogger.info("Bank Transfer radio button was clicked successfully!");
	}

	@When("User fill Bank information with below information")
	public void user_fill_bank_information_with_below_information(DataTable dataTable) {

		List<Map<String, String>> data1 = dataTable.asMaps(String.class, String.class);
		Retail.EnterBankName(data1.get(0).get("bankName"));
		Retail.EnterABAnumber(data1.get(0).get("abaNumber"));
		Retail.EnterSwiftCode(data1.get(0).get("swiftCode"));
		Retail.EnterAccountName(data1.get(0).get("accountName"));
		Retail.EnterAccountNumber(data1.get(0).get("accountNumber"));
		mylogger.info("Bank information was filled-out successfully!");
		Utils.TakeScreenShotForThisStep();
		
	}

	//Scenario 3 methods
	@When("User click on what says {string} link")
	public void user_click_on_that_is_link(String AccountInformatoin) {
		Retail.ClickOnEdityouraccountinformation();
		mylogger.info("Edit Your Account Information was clicked successfully!");
		
	}

	@When("User modify below information")
	public void user_modify_below_information(io.cucumber.datatable.DataTable dataTable) {
	
		List<Map<String, String>> data2 = dataTable.asMaps(String.class, String.class);
		
		Retail.EnterFirstName(data2.get(0).get("firstname"));
		Retail.EnterLastName(data2.get(0).get("lastName"));
		Retail.EnterEmail(data2.get(0).get("email"));
		Retail.EnterTelephone(data2.get(0).get("telephone"));
		mylogger.info("Account information was verfied!");
	}
	
	@Then("User should see the message {string}")
	public void user_should_see_the_message(String string) {
	   Retail.ValidateDispalyedMessage();
	   mylogger.info("Message was verified successfully!");
	   Utils.TakeScreenShotForThisStep();
	}
}
