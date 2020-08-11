@tag
Feature: Login
  As a Procore admin, I only want authorized users able to log in successfully so unauthorized users cannot access private information.

  Background: 
    Given The Login page is loaded successfully

  Scenario Outline: Log in unsuccessful with invalid account
    When I attempt login with invalid "<username>" username and "<password>" password
    Then There is an error message for invalid password: "The email address or password you entered is not valid."

    Examples: 
      | username         | password    	|
      | fake@procore.com | fakefakefake	|
      
  Scenario Outline: Login successfully
    Given The Login page is loaded successfully
    When I log into Procore with valid "<username>" username and "<password>" password
    Then The Company Selector Page is loaded successfully

    Examples: 
      | username         	| password	|
      | admin@procore.com | password	|