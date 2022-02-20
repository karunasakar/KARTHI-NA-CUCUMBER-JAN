#Author: karthi@your.domain.com
@mobile @both @sanity @reg
Feature: Mobile Purchase

Background:
    Given user launches flipkart application
    And user login by entering valid crendentials

 Scenario: Mobile purchase validation
    When user search mobile
    And user click on the mobile name
    Then user click on add to cart

  Scenario: Mobile purchase validation by one dim list
    When user search mobile by one dim list
      | realme | iPhone | SAMSUNG |
    And user click on the mobile name
    Then user click on add to cart

@smoke
  Scenario: Mobile purchase validation by one dim map
    When user search mobile by one dim map
      | realme | realme  |
      | iphone | iPhone  |
      | sam    | SAMSUNG |
    And user click on the mobile name
    Then user click on add to cart 

  Scenario Outline: 
    When user search mobile "<phone_name>"
    And user click on the mobile name
    Then user click on add to cart

    Examples: 
      | phone_name |
      | realme     |
      | iPhone     |
      | SAMSUNG    |
