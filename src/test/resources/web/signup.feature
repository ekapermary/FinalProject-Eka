@signup
Feature: Sign up Demoblaze

  Scenario: user sign up account Demoblaze with existing data
    Given user on the home page
    When user click Sign up button
    And user input username "ekapermary"
    And user input password "welcome"
    And user click Sign Up
    Then user show message "This user already exist."
