@startPage
Feature: Launch Start page and Test Home Page

  Scenario Outline: Validation of Start Page Home Page and clicks on any dropdown "<value>" without sign in
    	Given User launch Browser and enters url "https://dsportalapp.herokuapp.com/"
    	When User clicks on Get Started button
    	Then The user  should be successfully redirected to home page
    	When The user clicks on data structure dropdown
    	Then The user select any dropdown menu "<value>"
    	Then It should Alert the user with the message "You are not logged in"
    	When The user click any of the Get started button "<value>" in home page
    	Then It should Alert the user with the message "You are not logged in"
    	Examples: 
      | value |  
      | Arrays |