
Feature: feature to test login functionality


  Scenario: Check login is successful with valid credentials
    
    Given: user is on login page
    When: user enters username and password
		And : user clicks login button
    Then : user is navigated to home page
    
  #Scenario Outline: Check login is successful with valid credentials
    #
    #Given: user is on login page
    #When: user enters <username> and <password>
#		And : user clicks login button
    #Then : user is navigated to home page
#
    #Examples: 
    #| username | password |
    #|user1 | pass1 |