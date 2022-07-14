package page.objects;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import core.Base;
import utilities.Utils;

public class RetailPageObj extends Base{

	public RetailPageObj() {
		
		PageFactory.initElements(driver, this);
	}
	
	//loactors for every step under background keyword.
	@FindBy(xpath = "//span[text()='My Account']")
	private WebElement MyAccountTab;
	
	@FindBy(xpath = "//a[text()='Login']")
	private WebElement LoginTab;
	
	@FindBy(xpath = "//input[@name='email']")
	private WebElement UsernameField;
	
	@FindBy(xpath = "//input[@name='password']")
	private WebElement PasswordField;
	
	@FindBy(xpath = "//input[@value='Login']")
	private WebElement logingButton;
	
	@FindBy(xpath ="//h2[text()='My Account']")
	private WebElement MyAccountDashBoard;
	
	
	//locators for scenario 1.
	@FindBy(xpath = "//a[contains(text(),'affiliate')]")
	private WebElement AffliateAccountLink;
	
	@FindBy(xpath = "//input[@name='company']")
	private WebElement CompanyName;
	
	@FindBy(xpath = "//input[@name='website']")
	private WebElement WebsiteName;
	
	@FindBy(xpath = "//input[@name='tax']")
	private WebElement TaxIdField;
	
	@FindBy(xpath = "//input[@value='cheque']")
	private WebElement PaymentMehtod;
	
	@FindBy(xpath = "//input[@name='cheque'] ")
	private WebElement chequePayeeName;
	
	@FindBy(xpath = "//input[@name='agree'] ")
	private WebElement AboutUsCheckBox;
	
	@FindBy(xpath = "//input[@value='Continue']")
	private WebElement ContinueButton;
	
	@FindBy(css = "div[class='alert alert-success alert-dismissible']")
	private WebElement successMessage;
	
	//Locators for scenario 2.
	
	@FindBy(xpath ="//a[contains(text(),'Edit your affiliate')]")
	private WebElement EditYourAffiliateAccount;
	
	@FindBy(xpath = "//input[@value='bank']")
	private WebElement BankTransferButton;
	
	//loactors for the information form of Bank Transfer.
	@FindBy(xpath = "//input[@name='bank_name']")
	private WebElement BankNameF;
	
	@FindBy(xpath = "//input[@id='input-bank-branch-number']")
	private WebElement ABAField;
	
	@FindBy(xpath = "//input[@name='bank_swift_code']")
	private WebElement SwiftCodeF;
	
	@FindBy(xpath = "//input[@name='bank_account_name']")
	private WebElement AccountNameF;
	
	@FindBy(xpath = "//input[@name='bank_account_number']")
	private WebElement AccountNumberF;
	
	//Using the "ContinueButton" for this step as well, Because both locatrs and steps are the same
	//and we will only need on method for both.
	//also using the "successMessage" loactor to validte the success Message for our Bank Transfter
	//account after it's created.
	
	
	//Locators for scenario 3
	@FindBy(xpath = "//a[contains(text(),'account information')]")
	private WebElement EditYourAccount;
	
	@FindBy(xpath = "//input[@name='firstname']")
	private WebElement FirstNameF;
	
	@FindBy(xpath = "//input[@name='lastname']")
	private WebElement lastnameF;
	
	@FindBy(xpath = "//input[@name='email']")
	private WebElement EmailF;
	
	@FindBy(xpath = "//input[@name='telephone']")
	private WebElement TelephoneF;
	
	//Using the locator of "ContinueButton" variable for this step to click on contine button.
	//And Using the locator of "successMessage" variable to validte the message we get.
	
	//Methods for background steps.
	public void ClickOnMyAccountTab() {
		Utils.highlightelement(MyAccountTab);
		Utils.waitfor(1000);
		MyAccountTab.click();
	}
	
	public void ClickOnLogInLink() {
		Utils.highlightelement(LoginTab);
		Utils.waitfor(1000);
		LoginTab.click();
	}
	
	public void EnterUserNameAndPassword(String username, String Password) {
		Utils.highlightelement(UsernameField);
		Utils.waitfor(1000);
		UsernameField.sendKeys(username);
		
		Utils.highlightelement(PasswordField);
		Utils.waitfor(1000);
		PasswordField.sendKeys(Password);
	}
	
	public void ClickOnLoginButton() {
		Utils.highlightelement(logingButton);
		Utils.waitfor(1000);
		logingButton.click();
	}
	
	public void ValidteMyAccountDashBoard() {
		Utils.highlightelement(MyAccountDashBoard);
		Utils.waitfor(1000);
		Assert.assertTrue(MyAccountDashBoard.isDisplayed());
	}
	
	//Methods for scenario 1
	
	public void ClickOnAffiliateAccountLink() {
		Utils.highlightelement(AffliateAccountLink);
		Utils.waitfor(1000);
		AffliateAccountLink.click();
	}
	
	public void EnterCompanyName(String Campany) {
		Utils.highlightelement(CompanyName);
		Utils.waitfor(1000);
		CompanyName.sendKeys(Campany);
	}
	
	public void EnterWebSiteName(String WebSiteName) {
		Utils.highlightelement(WebsiteName);
		Utils.waitfor(1000);
		WebsiteName.sendKeys(WebSiteName);
	}
	
	public void EnterTaxId(String taxId) {
		Utils.highlightelement(TaxIdField);
		Utils.waitfor(1000);
		TaxIdField.sendKeys(taxId);
	}
	
	public void ClickOnChequePaymentMethod(String paymentMethods) {
		Utils.highlightelement(PaymentMehtod);
		Utils.waitfor(1000);
		Utils.clickWithJSE(PaymentMehtod);
	}
	
	public void EnterChequePayeeName(String PayeeName) {
		Utils.highlightelement(chequePayeeName);
		Utils.waitfor(1000);
		chequePayeeName.sendKeys(PayeeName);
	}
	
	public void ClickOnAboutUsCheckBox() {
		Utils.highlightelement(AboutUsCheckBox);
		Utils.waitfor(1000);
		AboutUsCheckBox.click();
	}
	
	public void ClickOnContinueButton() {
		Utils.highlightelement(ContinueButton);
		Utils.waitfor(1000);
		ContinueButton.click();
	}
	
	public void ValidateThessuccessMessage() {
		Utils.highlightelement(successMessage);
		Utils.waitfor(1000);
		Assert.assertTrue(successMessage.isDisplayed());
	}
	
	//Methods For Scenario 2
	
	public void ClickOnEditYourAffiliateLink() {
		Utils.highlightelement(EditYourAffiliateAccount);
		Utils.waitfor(1000);
		EditYourAffiliateAccount.click();
	}
	
	public void ClickOnBankTransferButton() {
		Utils.highlightelement(BankTransferButton);
		Utils.waitfor(1000);
		BankTransferButton.click();
	}
	
	public void EnterBankName(String BankName) {
		Utils.highlightelement(BankNameF);
		Utils.waitfor(1000);
		BankNameF.sendKeys(BankName);
	}
	
	public void EnterABAnumber(String ABANumber) {
		Utils.highlightelement(ABAField);
		Utils.waitfor(1000);
		ABAField.sendKeys(ABANumber);
	}
	
	public void EnterSwiftCode(String swiftCode) {
		Utils.highlightelement(SwiftCodeF);
		Utils.waitfor(1000);
		SwiftCodeF.sendKeys(swiftCode);
		
	}
	
	public void EnterAccountName(String accountName) {
		Utils.highlightelement(AccountNameF);
		Utils.waitfor(1000);
		AccountNameF.sendKeys(accountName);
	}
	
	public void EnterAccountNumber(String AcountNumber) {
		Utils.highlightelement(AccountNumberF);
		Utils.waitfor(1000);
		AccountNumberF.sendKeys(AcountNumber);
		
		//we will use the "ClickOnContinueButton" method for scenario 2 second step from last.
		
		//And we also use the "ValidateThessuccessMessage" to validte the success message we get
		//because both locators for both differnt success message are the same.
	}
	
	public void ClickOnEdityouraccountinformation() {
		Utils.highlightelement(EditYourAccount);
		Utils.waitfor(1000);
		EditYourAccount.click();
	}
	
	public void EnterFirstName(String Name) {
		Utils.highlightelement(FirstNameF);
		Utils.waitfor(1000);
		FirstNameF.clear();
		FirstNameF.sendKeys(Name);
	}
	
	public void EnterLastName(String lastname) {
		Utils.highlightelement(lastnameF);
		Utils.waitfor(1000);
		lastnameF.clear();
		lastnameF.sendKeys(lastname);
	}
	
	public void EnterEmail(String email) {
		Utils.highlightelement(EmailF);
		Utils.waitfor(1000);
		EmailF.clear();
		EmailF.sendKeys(email);
	}
	
	public void EnterTelephone(String telephone) {
		Utils.highlightelement(TelephoneF);
		Utils.waitfor(1000);
		TelephoneF.clear();
		TelephoneF.sendKeys(telephone);
		//using the same continue button methods and successmessage to validate both.
	}
	
	public void ValidateDispalyedMessage() {
		Assert.assertTrue(successMessage.isDisplayed());
	}
}
