#Author: Paty GUrbangeldiyeva patyshagulg@gmail.com
#url = https://www.saucedemo.com/#
Feature: Sauce Demo Login
  

  Scenario: invalid login
    Given user is on login page
    When user enter invalid username 
		|admin|
		|regular|
    And user enter invalid password as "123Aysa"
    And user click on login button
    Then user see the error message

 