package step.definition;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import core.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import page.objects.DesktopPageObj;
import utilities.Utils;

public class DesktopPageStepDef extends Base{

	DesktopPageObj desktopPage = new DesktopPageObj();
	
	//scenario 1
	@Given("User is on Retail website")
	public void user_is_on_retail_website() {
		desktopPage.GetTestEnvironmentText("TEST ENVIRONMENT");
		mylogger.info("Retail page was verified successfully!");
	}

	@When("User click on Desktops tab")
	public void user_click_on_desktops_tab() {
		desktopPage.clickOnDesktopTab();
	    mylogger.info("Desktop Tab was clicked successfully!");
	}

	@And("User click on Show all desktops")
	public void user_click_on_show_all_desktops() {
		desktopPage.ClickONShowAllDesk();
		mylogger.info("Show All Desktop was verified successfully!");
	}

	@Then("User should see all items are present in Desktop page")
	public void user_should_see_all_items_are_present_in_desktop_page() {
		desktopPage.AreAllElementsPresent();
		mylogger.info("All items are present in DeskTop page!");
		Utils.waitfor(2000);
		Utils.TakeScreenShotForThisStep();
	}
	
	
	//Scenario 2
	@When("User click ADD TO CART option on HP LP3065 item")
	public void user_click_add_to_cart_option_on_hp_lp3065_item() {
	    desktopPage.AddToCartOptoinForHPL();
	    mylogger.info("ADD TO CART option for HP LP3065 was clicked successfully!");
	}

	@When("User select quantity {string}")
	public void user_select_quantity(String qytNumber) {
	   desktopPage.SelectQyt(qytNumber);
	   mylogger.info("Desired quantity was entered successfully!");
	}

	@When("User click add to Cart button")
	public void user_click_add_to_cart_button() {
	   desktopPage.ClickOnAddToCart();
	   mylogger.info("Add To Cart button was clicked successfully!");
	}

	@Then("User should see a message {string}")
	public void user_should_see_a_message(String successmessage) {
	    desktopPage.ValidateSuccessMessage();
	    mylogger.info("Success message was verified successfully!");
	    Utils.waitfor(2000);
	    Utils.TakeScreenShotForThisStep();
	}
	
	//scenario 3
	@When("User click  ADD TO CART option on Canon EOS 5D item")
	public void user_click_add_to_cart_option_on_canon_eos_5d_item() {
	   desktopPage.AddToCartOptionForCamera();
	   mylogger.info("Add TO CART optoin for Canon EOS 5D was clicked successfully!");
	}

	@When("User select color from dropdown Red")
	public void user_select_color_from_dropdown_red() {
	   desktopPage.SelectReadColor();
	   mylogger.info("Red color was clicked from the dropdown!");
	   Utils.waitfor(2000);
	   Utils.TakeScreenShotForThisStep();
	}
	
	//scenario 4
	@When("User click on Canon EOS 5D item")
	public void user_click_on_canon_eos_5d_item() {
	 desktopPage.ClickOnCanonEOS5DItem();
	 mylogger.info("Canon EOS 5D item was clicked successfully!");
	}

	@When("User click on write a review link")
	public void user_click_on_write_a_review_link() {
	    desktopPage.clickOnWrieAreviewLink();
	    mylogger.info("Write a review link was clicked successfully!");
	}

	@When("user fill the review information with below information")
	public void user_fill_the_review_information_with_below_information(DataTable dataTable) {
	  
		List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
		desktopPage.EnterYourName(data.get(0).get("yourname"));
		desktopPage.EnterYourReview(data.get(0).get("yourReview"));
		desktopPage.ClickOnRating(data.get(0).get("Rating"));
		mylogger.info("Required information for writing a review was completed successfully!");
		Utils.TakeScreenShotForThisStep();
	}

	@When("User click on Continue button")
	public void user_click_on_continue_button() {
	  desktopPage.ClcikOnContinueButton();
	  mylogger.info("Continue button was clicked successfully!");
	}
	  @Then("User should see a message with {string}")
	  public void user_should_see_a_message_with(String messageSuccess) {
	     desktopPage.ValidateSuccessMessage();
	     mylogger.info("Success message was verified successfully!");
	     Utils.TakeScreenShotForThisStep();
	  }
	  
		
	}

