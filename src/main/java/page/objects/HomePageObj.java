package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import core.Base;
import utilities.Utils;

public class HomePageObj extends Base {

	public HomePageObj() {
		PageFactory.initElements(driver, this);
	}

	// Loactors for scenario 1

	@FindBy(xpath = "//button[@class='btn btn-link dropdown-toggle']")
	private WebElement CurrencyTab;

	@FindBy(xpath = "//button[text()='€ Euro']")
	private WebElement Euro;

	// locators for scenario 2
	@FindBy(xpath = "//span[text()='Shopping Cart']")
	private WebElement ShoppingCartTab;

	@FindBy(xpath = "//div[@id='content']//p")
	private WebElement ShoppingCartMessage;

	// Methods For Scenario 1
	public void ClickOnCurrency() {
		Utils.highlightelement(CurrencyTab);
		Utils.waitfor(1000);
		CurrencyTab.click();
	}

	public void ChooseEuro() {
		Utils.highlightelement(Euro);
		Utils.waitfor(1000);
		Euro.click();
	}

	public void ChangesOfCurrencyTab() {
		Utils.highlightelement(CurrencyTab);
		Utils.waitfor(1000);
		CurrencyTab.isDisplayed();
	}

	// Methods For Scenario 2
	public void ClickOnShoopingCart() {
		Utils.highlightelement(ShoppingCartTab);
		Utils.waitfor(1000);
		ShoppingCartTab.click();
	}

	public boolean ValidateShoppingCartMessage() {
		Utils.highlightelement(ShoppingCartMessage);
		Utils.waitfor(1000);
		if (ShoppingCartMessage.isDisplayed()) {
			return true;
		} else {
			return false;
		}
	}
}