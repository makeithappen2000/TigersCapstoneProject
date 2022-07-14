package page.objects;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.Utils;

public class DesktopPageObj extends Base {

	public DesktopPageObj() {
		PageFactory.initElements(driver, this);
	}

	// Scenario 1 loacators
	@FindBy(xpath = "//a[text()='TEST ENVIRONMENT']")
	private  WebElement TestEnviromentText;

	@FindBy(xpath = "//a[text()='Desktops']")
	private WebElement DesktopTab;

	@FindBy(xpath = "//a[text()='Show All Desktops']")
	private WebElement ShowAllDeskTops;

	@FindBy(xpath = "//div[@class='list-group']")
	private static List<WebElement> allPresentItems;

	
	// Scenario 2 loactores at the bottom
	@FindBy(xpath = "//div[3]//div[1]//div[2]//div[2]//button[1]//span[1]")
	private WebElement HPLP3065Item;
	
	@FindBy(xpath = "//input[@id='input-quantity']")
	private WebElement QytField;
	
	@FindBy(xpath = "//button[@id='button-cart']")
	private WebElement AddToCartButton;
	
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement SuccessMessage;
	
	//Scenaroi 3 locators.
	
	@FindBy(xpath = "//div[@class='product-layout product-grid col-lg-4 col-md-4 col-sm-6 col-xs-12'][2]//div[@class='button-group']//span")
	private WebElement CanonEOSAddToCartOptoin;
	
	@FindBy(xpath = "//select[@name='option[226]']//child::option[2]")
	private WebElement ReadColorForCamera;
	
	//scneario 4
	@FindBy(xpath = "//a[text()='Canon EOS 5D Camera']")
	private WebElement CanonCameraText;
	
	@FindBy(xpath = "//a[text()='Write a review']")
	private WebElement WrieAreviewLink;
	
	@FindBy(xpath = "//input[@id='input-name']")
	private WebElement YourNameField;
	
	@FindBy(tagName = "textarea")
	private WebElement YourReviewField;
	
	@FindBy(xpath = "//input[@value='5']")
	private WebElement ratingField;
	
	@FindBy(xpath = "//button[@id='button-review']")
	private WebElement ContinueButton;
	


	

	public void GetTestEnvironmentText(String expected) {
		Utils.highlightelement(TestEnviromentText);
		Utils.waitfor(1000);
		String Actual = TestEnviromentText.getText();
		Assert.assertEquals(expected, Actual);
		
	}

	public void clickOnDesktopTab() {
		Utils.highlightelement(DesktopTab);
		Utils.waitfor(1000);
		DesktopTab.click();
	}

	public void ClickONShowAllDesk() {
		Utils.highlightelement(ShowAllDeskTops);
		Utils.waitfor(1000);
		ShowAllDeskTops.click();
	}

	public void AreAllElementsPresent() {

		List<WebElement> elements = allPresentItems;
		for (WebElement myelement : elements) {
			Assert.assertTrue(myelement.isDisplayed());
		}

	}
	
	//Scneario 2 methods
	public void AddToCartOptoinForHPL() {
	    Utils.highlightelement(HPLP3065Item);
		Utils.waitfor(1000);
		HPLP3065Item.click();
	}
	
	public void SelectQyt(String Qyt) {
	   Utils.highlightelement(QytField);
	   Utils.waitfor(1000);
	   QytField.clear();//because number 1 is alread enterd.
	   QytField.sendKeys(Qyt);
	}
	
	public void ClickOnAddToCart() {
		Utils.highlightelement(AddToCartButton);
		Utils.waitfor(1000);
		AddToCartButton.click();
	}
	
	public boolean ValidateSuccessMessage() {
		Utils.highlightelement(SuccessMessage);
		Utils.waitfor(1000);
		if(SuccessMessage.isDisplayed()) {
			return true;
		}else {
			return false;
		}
	}
	
	//Scenario 3 methods
	
	public void AddToCartOptionForCamera() {
		Utils.highlightelement(CanonEOSAddToCartOptoin);
		Utils.waitfor(1000);
		CanonEOSAddToCartOptoin.click();
	}
	
	public void SelectReadColor() {
		Utils.highlightelement(ReadColorForCamera);
		Utils.waitfor(1000);
		ReadColorForCamera.click();
	}
	
	//scenario 4 methods
	public void ClickOnCanonEOS5DItem() {
		Utils.highlightelement(CanonCameraText);
		Utils.waitfor(1000);
		CanonCameraText.click();
	}
	
	public void clickOnWrieAreviewLink() {
		Utils.highlightelement(WrieAreviewLink);
		Utils.waitfor(1000);
		WrieAreviewLink.click();
	}
	
	public void EnterYourName(String name) {
		Utils.highlightelement(YourNameField);
		Utils.waitfor(1000);
		YourNameField.sendKeys(name);
	}
	
	public void EnterYourReview(String review) {
		Utils.highlightelement(YourReviewField);
		Utils.waitfor(1000);
		YourReviewField.sendKeys(review);
	}
	
	public void ClickOnRating(String ratring) {
		Utils.highlightelement(ratingField);
		Utils.waitfor(1000);
		Utils.clickWithJSE(ratingField);
	}
	
	public void ClcikOnContinueButton() {
		Utils.highlightelement(ContinueButton);
		Utils.waitfor(1000);
		ContinueButton.click();
	}
}
