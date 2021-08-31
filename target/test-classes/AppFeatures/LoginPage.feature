Feature: Login Page Feature

 
  Scenario: Login Page title
    Given user is on login page 
    When user gets the title of the page 
    Then page title should be "Login - My Store"


  Scenario: Forget Password Link
    Given user is on login page
    Then forget password link should be displayed

  Scenario: Login with correct credentials
    Given user is on login page
    When user enters username "ramyrafat997@gmail.com"
    And user enters password "ramy1029384756"
    And user click on login button
    Then user gets the title of the page 
    And page title should be "My account - My Store"
