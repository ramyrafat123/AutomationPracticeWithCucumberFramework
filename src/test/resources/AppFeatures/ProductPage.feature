Feature: Product Page Feature

 
  Scenario: Select “Blouses” Subcategory in “Women” Category
    Given user navigate to Women Category 
    When User Select “Blouses” Subcategory  
    Then User get page with title "Blouses - My Store"