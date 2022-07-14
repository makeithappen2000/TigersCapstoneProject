@All
Feature: Retail Page

Background:
Given User is on Retail website
And User click on MyAccount
When User click on Login
And User enter username 'IamGreat@gmail.com' and password 'Herat040'
And User click on Login button
Then User should be logged in to MyAccount dashboard

@Affiliate
Scenario: Register as an Affiliate user with Cheque Payment Method
When User click on 'Register for an Affiliate Account' link
And User fill affiliate form with below information
|company|website|taxID|paymentMethod|ChequePayeeName|
|Tigers|goOn.com|12-34-567-890|Cheque|Friend|
And User check on About us check box
And User click on continue button
Then User should see a success message

@EditAffiliate
Scenario: Edit your affiliate information from Paypal payment method to Bank Transfer
When User click on the 'Edit your affiliate information' link
And user click on Bank Transfer radio button
And User fill Bank information with below information
|bankName|abaNumber|swiftCode|accountName|accountNumber|
|CapitalOne|'356897'|ABJOKP|Kind|'345908156'|
And User click on continue button
Then User should see a success message

@EditAccount
Scenario: Edit your account information
When User click on what says 'Edit your account information' link
And User modify below information
|firstname|lastName|email|telephone|
|GreatGenious|Jahan|IamGreat@gmail.com|5679563581|
And User click on continue button
Then User should see the message 'Success: Your account has been successfully updated.' 
