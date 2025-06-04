@signup
Feature: Sign up Demoblaze

  Scenario : user sign up account Demoblaze
    Given user on the home page
    When user click Sign up button
    And user input username "ekapermary"
    And user input password "welcome"
    And user click Sign Up
    Then user show message "Sign Up successful"
