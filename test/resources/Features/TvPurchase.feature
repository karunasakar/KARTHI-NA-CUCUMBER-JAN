#Author: your.email@your.domain.com
@tv @both @sanity
Feature: TV feature

  Scenario: Tv purchase validation
    Given user launches flipkart application
    And user login by entering valid crendentials
    When user search tv
    And user click on the tv name
    Then user click on add to cart

  