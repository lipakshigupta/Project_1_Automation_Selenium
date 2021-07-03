@Login @Common1 @demo1
Feature: Login application

  Background: Navigate to application
    Given User navigate to KuchToh application
    Given Delete User details for the username UserName_Test1

#  @Login
#  Scenario:Login To the application
#    When User Enter Mobile Number 9689201869
#    When User Enter Password Kuchtoh
#    Then Click on Get Started Button
#    Then Verify User Land on Next Page
#
#  @Login
#  Scenario:Login To the application
#    When User Enter Mobile Number 9632587412
#    When User Enter Password kkll
#    Then Click on Get Started Button
#    Then Verify User Get Error Message for password

  @Successful
  Scenario:Successful login
    When User Enters Registration Details as Below
      |UserName_Test1|9689201865|Test123|
    Then User Enter OTP 9689201865
    Then User should Land on medical registration page
    When User enter Registration number 12345
    When User enter Registration council Andhra Pradesh State Dental Council
    When User enter Registration year 1999
    Then User click on Next Button
    Then Verify User lands on Education page
    When User enter Qualification Details
      |MSR|Doctor|1995|
    Then User click on Next Button
    Then Verify User lands on Basic details page
    When User enter basic Details
      |2021/06/15|update_email|
    Then User click on Next Button
    Then Verify user lands on service page
    When User select Looking for consultant
    Then User click on Next Button
    Then Verify user lands on Document upload page
    Then User Upload files
      |Frame                      |path|
      |Photo ID proof             |C://Users//Kislaye Raj//Pictures//Untitled.png  |
      |Photo                      |C://Users//Kislaye Raj//Pictures//Untitled.png  |
      |Registration proof         |C://Users//Kislaye Raj//Pictures//Untitled.png  |
      |Degree/Certificate proof   |C://Users//Kislaye Raj//Pictures//Untitled.png  |
    Then User click on Next Button
    Then User click Finish
    Then User click ok on Finish popup
    Then User Logout application
    When User Enter Mobile Number 9689201865
    When User Enter Password Test123
    Then Click on Get Started Button
    Then Verify User Land on Next Page

