Feature: User log in the website


  Background:user is on the login page
    Given User is on XFleet Login page


 # User Story:
  #As a user, I should be able to login with correct credentials to different
  #accounts. And dashboard or quick launchpad should be displayed.
# (Acceptance Criteria 1)
 # Accounts are: Driver, sales manager, store manager


  @FLTAPS-1766
  Scenario Outline: XFleet Login functionality verification

    When user enters username "<username>"
    And user enters password "<password>"
    And user clicks the login button
    Then user sees "<homepage>"


    Examples: search values will be as below listed


    | username       |  password              | homepage         |
    |  user1         | UserUser123            |  Quick Launchpad |
    | storemanager91 | UserUser123            |   Dashboard      |
    |salesmanager114 | UserUser123            |   Dashboard      |


 # User Story: (Acceptance Criteria 2)
  # As a user I should be able to see "Invalid username or password." when entered invalid credentials


  @FLTAPS-1803
  Scenario Outline:User should be able to see "Invalid username or password."

    When user enters username "<username>"
    And user enters password "<password>"
    And user clicks the login button
    Then user sees the alert of "<InvalidAlert>"


    Examples: search values will be as below listed


      | username       |  password              |           InvalidAlert                 |
      |  user1         | UserUser               |  Invalid user name or password.       |
      | storemanager91 | kkailgr              |   Invalid user name or password.      |
      |salesmanager114 | 11049582               |   Invalid user name or password.      |
      |  user2000      | UserUser123            |  Invalid user name or password.       |
      |storemanager111 | UserUser123            |   Invalid user name or password.      |
      |salesmanager199 | UserUser123            |   Invalid user name or password.      |




 #  User Story: (Acceptance Criteria 3)
    #  # As a user I should be able to see "Please fill out this field" message if the password or username is empty

    @FLTAPS-1805
    Scenario Outline: User should be able to see "Please fill out this field" if the password or username is empty


    When user enters username "<username>"
    And user enters password "<password>"
    And user clicks the login button
    Then user sees the message of "<error_message>"


      Examples:
        | username       | password    | error_message               |
        |   user11       |             | Please fill out this field. |
        | storemanager83 |             | Please fill out this field. |
        |salesmanager127 |             | Please fill out this field. |
        |                | UserUser123 | Please fill out this field. |
        |                | UserUser123 | Please fill out this field. |
        |                | UserUser123 | Please fill out this field. |






    # User Story: (Acceptance Criteria 4)
    # As a user I should be able to see ‘Forgot Password’ page after clicking on the "Forgot your password?" link

  @FLTAPS-1806
        Scenario: User should be able to see "Forgot Password" page

        When user clicks the Forgot your password? button
        Then user lands on the "Forgot Password" page




        #User story: (Acceptance Criteria 5)
        #As a  user I should be able to see "Remember Me" link exists and is clickable on the login page

  @FLTAPS-1807
  Scenario: User should be able to see "Remember Me" link and click it on.

        When user sees the Remember Me link on the login page
        Then user can click the Remember Me checkbox


     #User story: (Acceptance Criteria 6)
        #As a  user I should be able to see  the password in bullet signs by default

  @FLTAPS-1808
  Scenario: User should be able to see the password in bullet signs by default.

    When user enters password
    Then user can see the password in bullet signs


    # User story :(Acceptance Criteria 7)
    #  As a user I should be able to press ‘Enter’ key correctly on the login page.

   @FLTAPS-1809
     Scenario: User should be able to press ‘Enter’ key correctly on the login page.


         When user enters username
         Then user can pass through to the password box
         And user enters the password
         Then user can  click the login button


#User Story : (Acceptance Criteria 8)
# All users can see their own usernames in the profile menu, after successful login

   @FLTAPS-1810
     # A BUG REPORT WILL BE WRITTEN FOR THIS AC8
  Scenario Outline: Users should be able to see their own usernames in the profile menu, after successful login


    When user enters username "<username>"
    And user enters password "<password>"
    And user clicks the login button
    Then user sees "<name>" in the profile menu


    Examples: search values will be as below listed


      | username       |  password              |     name               |
      |  user1         | UserUser123            |    John Doe            |
      | storemanager91 | UserUser123            |    John Doe            |
      |salesmanager114 | UserUser123            |    John Doe            |