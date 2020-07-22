#Author: Paty GUrbangeldiyeva patyshagulg@gmail.com
#url = https://www.saucedemo.com/#
Feature: Sauce Demo Login
  
  Description: US-3421 The purpose of this feature file is 
  					to automate sauce demo app login feature with valid and invalid credentials
  Acceptance Criteria: I want to automate

  Background: 
    Given user is on login page

  Scenario: invalid login
    When user enter invalid username
    And user enter invalid password
    And user click on login button
    Then user see the error message

  Scenario: invalid login
    #Given user is on login page
    When user enter invalid username as "Aysa"
    And user enter invalid password as "123Aysa"
    And user click on login button
    Then user see the error message

  Scenario Outline: invalid login
    #Given user is on login page
    When user enter invalid username as "Aysa"
    And user enter invalid password as "123Aysa"
    And user click on login button
    Then user see the error message
      | userName |  | password |
      | Admin    |  | hello    |
      | aysa     |  | hello    |
