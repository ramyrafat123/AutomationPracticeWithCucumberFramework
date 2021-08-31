Feature: Account Page feature
  

  Background:
    Given user has already logged in to application
    |username|password|
    |ramyrafat997@gmail.com|ramy1029384756|
  
  
  Scenario: Accounts Page Title
    Given user is on Accounts page 
    When user gets the title of the page 
    Then page title should be "My account - My Store"
    

  
  Scenario: Accounts section count
    Given user is on Accounts page 
    Then user get accounts section 
    |Order history and details|
    |My credit slips|
    |My addresses|
    |My personal information|
    |My wishlists|
    And account section count should be 5