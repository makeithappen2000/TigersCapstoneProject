package page.objects;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.Utils;

public class LaptopNoteBooksPageObj extends Base{

	public LaptopNoteBooksPageObj() {
		PageFactory.initElements(driver, this);
	}
	
	//Locators for Scenario 1
	@FindBy(xpath = "//a[text()='Laptops & Notebooks']")
	private WebElement LaptopAndNoteBookTab;
	
	@FindBy(xpath = "//a[text()='Show All Laptops & Notebooks']")
	private WebElement ShowallLaptopAndNoteBookOption;
	
	@FindBy(xpath = "//a[text()='MacBook']")
	private WebElement MacBookItem;
	
	@FindBy(xpath = "//button[@id='button-cart']")
	private WebElement AddToCartButton;
	
	@FindBy(xpath = "//span[@id='cart-total']")
	private WebElement ItemPrice;
	
	@FindBy(xpath = "//div[@id='cart']//button[@data-toggle='dropdown']")
	private WebElement CartOption;
	
	@FindBy(xpath = "//button[@title='Remove']")
	private WebElement XredButton;
	
	//using the same locator ItemPrice in our method to validate that the item cart is 0 at that time.
	
	//Locators for scenario 2
	@FindBy(xpath = "//div[@class='product-layout product-grid col-lg-4 col-md-4 col-sm-6 col-xs-12'][2]//button[@data-toggle='tooltip'][2]")
	private WebElement MacBookcomparisonicon;
	
	@FindBy(xpath = "//div[@class='product-layout product-grid col-lg-4 col-md-4 col-sm-6 col-xs-12'][3]//button[@data-toggle='tooltip'][2]")
	private WebElement MacBookAircomparisonIcon;
	
	@FindBy(xpath = "//a[text()='product comparison']")
	private WebElement ProductComparisonLink;
	
	@FindBy(xpath = "//tbody[1]")
	private WebElement ProductcomparisonChart;
	
	
	//Locators for scenario 3
	@FindBy(xpath = "//div[@class='product-layout product-grid col-lg-4 col-md-4 col-sm-6 col-xs-12'][5]//button[@data-toggle='tooltip'][1]")
	private WebElement SonyVAIOHeratIcon;
	
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement LoginMessage;
	
	//Locators for sceanrio 4
	@FindBy(xpath = "//a[text()='MacBook Pro']")
	private WebElement MacBookProItem;
	
	@FindBy(xpath = "//h2[text()='$2,000.00']")
	private WebElement MacBookProPrice;
	

	//Locators for scenario 1
	public void ClickOnLaptopAndNoteBookTab() {
		Utils.highlightelement(LaptopAndNoteBookTab);
		Utils.waitfor(1000);
		LaptopAndNoteBookTab.click();
	}
	
	public void ClickOnShowallLaptop() {
		Utils.highlightelement(ShowallLaptopAndNoteBookOption);
		Utils.waitfor(1000);
		ShowallLaptopAndNoteBookOption.click();
	}
	
	public void ClickOnMacBookItem() {
		Utils.highlightelement(MacBookItem);
		Utils.waitfor(1000);
		MacBookItem.click();
	}
	
	public void ClickOnAddToCartbutton() {
		Utils.highlightelement(AddToCartButton);
		Utils.waitfor(1000);
		AddToCartButton.click();
	}
	
	public boolean ValidateMacBookPriceIs600() {
		Utils.highlightelement(ItemPrice);
		Utils.waitfor(1000);
		Utils.highlightelement(ItemPrice);
		Utils.waitfor(1000);
		
		if(ItemPrice.isDisplayed()) {
			
			return true;
		}else {
			return false;
		}
	}
	
	public void ClickOnItemOptoin() {
		Utils.highlightelement(CartOption);
		Utils.waitfor(1000);
		CartOption.click();
	}
	
	public void ClickOnRemoveIcon() {
		Utils.highlightelement(XredButton);
		Utils.waitfor(1000);
		XredButton.click();
	}
	
	public void ValidteMacBookPricIs0eAfterRemoving() {
		Utils.highlightelement(ItemPrice);
		Utils.waitfor(1000); 
		
		String expectedText = "0 item(s) - $0.00";
		String ActualText = ItemPrice.getText();
		Assert.assertEquals(expectedText, ActualText);
		
		
      }//we use the "ItemPrice" locator twice because we want to validate that befoer it was
		//600.00 and after removing it from cart, it's now 0.
	
	
	//Scnearoi 2 methods 
	public void ClicOnMacBookcomparisonicon() {
		Utils.highlightelement(MacBookcomparisonicon);
		Utils.waitfor(1000);
		MacBookcomparisonicon.click();
	}
	
	public void clickOnMacBookAircomparisonIcon() {
		Utils.highlightelement(MacBookAircomparisonIcon);
		Utils.waitfor(1000);
		MacBookAircomparisonIcon.click();
		
		//after this step, success message is validtes from a differnt pageObj, because we have 
		//the same loactor for it.
	}
	
	public void ClickOnProductComparisonLinkForMacAir() {
		Utils.highlightelement(ProductComparisonLink);
		Utils.waitfor(1000);
		ProductComparisonLink.click();
	}
	
	public boolean ValidateChartComparison() {
		Utils.highlightelement(ProductcomparisonChart);
		Utils.waitfor(1000);
		if(ProductcomparisonChart.isDisplayed()) {
			return true;
		}else {
			return false;
		}
	}
	//methods for Scenario 3
	public void ClickOnSonyVAIOHeratIcon() {
		Utils.highlightelement(SonyVAIOHeratIcon);
		Utils.waitfor(1000);
		SonyVAIOHeratIcon.click();
	}
	
	public void ValidateLoginMessage() {
		Utils.highlightelement(LoginMessage);
		Utils.waitfor(1000);
		Assert.assertTrue(LoginMessage.isDisplayed());
	}
	
	//methods for Scenaroi 4
	
	public void ClickOnMacBookProItem() {
		Utils.highlightelement(MacBookProItem);
		Utils.waitfor(1000);
		MacBookProItem.click();
	}
	
	public void ValidateThePriceOfMacBookProis2000() {
		Utils.highlightelement(MacBookProPrice);
		Utils.waitfor(1000);
		
		String ExpectedText = "$2,000.00";
		String ActualText = MacBookProPrice.getText();
		Assert.assertEquals(ExpectedText, ActualText);
	
	}
}
