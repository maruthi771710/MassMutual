Feature: Login page feature

Scenario: Toatl  balance on the screen
Given user is  on the screen 
When user counts the Value1,value2,value3,value4
And value5
Then total count should be displayed as $1,000,000.00

Scenario: verfy the values on the screen are greater than zero
Given user is on the screen
When user verifies the values 
Then All values should be greater than zero 

Scenario: verify the values are formatted as currencies
Given user is on the screen
When user verifies curriences symbols
Then All the values should appear/display with Currency symbol




