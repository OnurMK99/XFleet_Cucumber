Feature: User logs out the website


  Background: :user is on the Home page
    Given User is on XFleet Login page



 # User Story:(Acceptance Criteria 1)
  #As a user, I should be able to log out and end up on the login page.
 # Accounts are: Driver, sales manager, store manager

  @FLTAPS-1811
  Scenario Outline: XFleet Log out functionality verification

    When user enters username "<username>"
    And user enters password "<password>"
    And user clicks the login button
    And user is on  title page
    And user clicks Logout Dropdown menu
    And user clicks Logout button in the Dropdown menu
    Then user sees Login Page



    Examples: search values will be as below listed


      | username       |  password              |
      |  user1         | UserUser123            |
      | storemanager91 | UserUser123            |
      |salesmanager114 | UserUser123            |


    #User Story (Acceptance Criteria 2)
    #As I user, I can not go to the home page again by clicking the step back button after successfully logging out.
    # # Accounts are: Driver, sales manager, store manager

  @FLTAPS-1812
    Scenario Outline: XFleet stepback functionality verification

      When user enters username "<username>"
      And user enters password "<password>"
      And user clicks the login button
      And user is on  title page
      And user clicks Logout Dropdown menu
      And user clicks Logout button in the Dropdown menu
      And user sees Login Page
      And user clicks the stepback button
      Then user cannot see homepage title


      Examples: search values will be as below listed


        | username       |  password              |
        |  user1         | UserUser123            |
        | storemanager91 | UserUser123            |
        |salesmanager114 | UserUser123            |



        #User Story (Acceptance Criteria 3)
    #As I user,I must be logged out if I close the open tab (all tabs if there are multiple open app tabs).
    # # Accounts are: Driver, sales manager, store manager

  @FLTAPS-1921
  Scenario Outline: XFleet open tab closing functionality verification

    When user enters username "<username>"
    And user enters password "<password>"
    And user clicks the login button
    And user is on  title page
    And user closes the open website tab and tabs
    And user reenters the website
    Then user cannot land on the title page






   Examples: search values will be as below listed


     | username       |  password              |
     |  user1         | UserUser123            |
     | storemanager91 | UserUser123            |
     |salesmanager114 | UserUser123            |

















