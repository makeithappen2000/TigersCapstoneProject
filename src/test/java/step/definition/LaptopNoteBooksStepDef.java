package step.definition;

import core.Base;
import io.cucumber.java.en.*;
import page.objects.LaptopNoteBooksPageObj;
import utilities.Utils;

public class LaptopNoteBooksStepDef extends Base{

	LaptopNoteBooksPageObj laptop = new LaptopNoteBooksPageObj();
	
	//methods for scenario 1
	@When("user click on Laptop & NoteBook tab")
	public void user_click_on_laptop_note_book_tab() {
	    laptop.ClickOnLaptopAndNoteBookTab();
	    mylogger.info("LapTop & NoteBook tab was clicked successfully!");
	}

	@When("user click on Show all Laptop & NoteBook option")
	public void user_click_on_show_all_laptop_note_book_option() {
	   laptop.ClickOnShowallLaptop();
	   mylogger.info("Show all Laptop & NoteBook tab was clicked successfully!");
	}

	@When("user click on MacBook item")
	public void user_click_on_mac_book_item() {
	    laptop.ClickOnMacBookItem();
	    mylogger.info("MacBook item was clicked successfully!");
	}

	@When("user click add to Cart button")
	public void user_click_add_to_cart_button() {
	    laptop.ClickOnAddToCartbutton();
	    mylogger.info("ADD TO CART button was clicked successfully!");
	}

	@Then("user should see item\\(s){double} showed to the cart")
	public void user_should_see_item_s_showed_to_the_cart(Double double1) {
	    laptop.ValidateMacBookPriceIs600();
	}

	@Then("user click on cart option")
	public void user_click_on_cart_option() {
	    laptop.ClickOnItemOptoin();
	    mylogger.info("Cart option was clicked!");
	}

	@Then("user click on red X button to remove the item from cart")
	public void user_click_on_red_x_button_to_remove_the_item_from_cart() {
	    laptop.ClickOnRemoveIcon();
	    mylogger.info("Red X button was clicked successfully!");
	}

	@Then("item should be removed and cart show {int} item\\(s)")
	public void item_should_be_removed_and_cart_show_item_s(Integer int1) {
	    laptop.ValidteMacBookPricIs0eAfterRemoving();
	    mylogger.info("Item is removed and Cart shows 0 price!");
	    Utils.TakeScreenShotForThisStep();
	}

	//methods for scenario 2
	@When("user click on product comparison icon on {string}")
	public void user_click_on_product_comparison_icon_on(String Macbook) {
	   laptop.ClicOnMacBookcomparisonicon();
	   mylogger.info("comparison Icon for MackBook was clicked successfully!");
	}

	@When("user clicks on the product comparison icon named {string}")
	public void user_clicks_on_the_product_comparison_icon_named(String MacbookAir) {
	    laptop.clickOnMacBookAircomparisonIcon();
	    mylogger.info("Comparison icon for MacBook Air was clicked successfully!");
	}

	@Then("user click on Product comparison link")
	public void user_click_on_product_comparison_link() {
	    laptop.ClickOnProductComparisonLinkForMacAir();
	    mylogger.info("Product comparison link for macbook air was clicked successfully!");
	}

	@Then("user should see Product comparison Chart")
	public void user_should_see_product_comparison_chart() {
	    laptop.ValidateChartComparison();
	    Utils.waitfor(2000);
	    mylogger.info("Product comparison Chart was verified successfully!");
	    Utils.TakeScreenShotForThisStep();
	}

	//Methods for scenario 3
	@When("user click on heart icon to add {string} laptop to wish list")
	public void user_click_on_heart_icon_to_add_laptop_to_wish_list(String string) {
	   laptop.ClickOnSonyVAIOHeratIcon();
	   mylogger.info("Heart Icon for Sony VaIO was clicked successfully!");
		
	}

	@Then("User should get a message {string}")
	public void user_should_get_a_message(String string) {
	    laptop.ValidateLoginMessage();
	    mylogger.info("Login message was verified successfully!");
	}

	//methods for scenario 4
	@When("user click on {string} item")
	public void user_click_on_item(String string) {
	   laptop.ClickOnMacBookProItem();
	   mylogger.info("MacBook pro item was clicked successfully!");
	}

	@Then("user should see {string} price tag is present on UI.")
	public void user_should_see_price_tag_is_present_on_ui(String string) {
	    laptop.ValidateThePriceOfMacBookProis2000();
	    mylogger.info("Price of MacBook pro was verified successfully!");
	}

}
