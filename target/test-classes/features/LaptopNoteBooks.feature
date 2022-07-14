@All
Feature: Laptop & NoteBooks

Background: 
Given User is on Retail website
When user click on Laptop & NoteBook tab
And user click on Show all Laptop & NoteBook option

@MacBook
Scenario: Add and Remove a Mac book from Cart
And user click on MacBook item
And user click add to Cart button
Then User should see a message 'Sucess: You have added MacBook to your shopping car!' 
And user should see item(s)-602.00 showed to the cart
And user click on cart option
And user click on red X button to remove the item from cart
Then item should be removed and cart show 0 item(s)

@Product
Scenario: Product Comparison
And user click on product comparison icon on 'MacBook' 
And user clicks on the product comparison icon named 'MacBook Air' 
Then User should see a message 'Sucess: You have added MacBook Air to your product comparison' 
And user click on Product comparison link
Then user should see Product comparison Chart

@AddingItem
Scenario: Adding an item to Wish list
And user click on heart icon to add 'Sony VaIO' laptop to wish list
Then User should get a message 'Your must login or create an account to save Sony save Sony VAIO to your wish list!'

@ValidatePrice
Scenario: Validate the price of MacBook Prop is 20000
And user click on 'MacBook pro' item
Then user should see '2,000.00' price tag is present on UI.
