@tag
Feature: Automation practice application

  @tag1
  Scenario: Register with an invalid id
    Given User is at the Home page
    When user navigates to the Login Page
    And enters invalid email id
    Then error message comes
       
	@tag2
  Scenario: Register with a valid id
    When user navigates to the Login Page
    And enters valid email id
    Then successfully registered
    
  @tag3
  Scenario: Check MegaMenu
    When user hovers on DRESSES
    And clicks on SUMMER DRESSES
    Then megamenu working fine

  @tag4
  Scenario: Select a dress and validate in cart
 	 When user selects a dress
 	 And enters quantity as two and clicks on add to cart and validate details
 	 
