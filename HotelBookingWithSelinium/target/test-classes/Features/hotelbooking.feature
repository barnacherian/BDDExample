#Author: rvikash
Feature: HotelBooking Form Validation 

Scenario: Validate all details -FirstName,LastName,Email,Mobile
Given HotelBooking page for validation 
When  checking title of hotel booking 
Then  check title is Hotel Booking
When  Enter Submit without entering firstname
Then  Get Alert with 'Please fill the First Name'
When  Enter Submit without entering lastname
Then  Get Alert with 'Please fill the Last Name'
When  Enter Submit without entering email
Then  Get Alert with 'Please fill the Email'
When  Enter Submit with invalid  email
Then  Get Alert with 'Please enter valid Email Id.'
When  Enter Submit without entering mobile number 
Then  Get Alert with 'Please fill the Mobile No.'
When  Enter Submit with invalid  mobile number
Then  Get Alert with 'Please enter valid Contact no.'
When  Enter Submit selecting City
Then  Get Alert with Please select city
When  Enter Submit selecting state
Then  Get Alert with Please select state

