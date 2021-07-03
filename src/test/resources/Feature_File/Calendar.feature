@Calendar @Common1 @demo1@test
Feature: Calendar

  Background: Navigate to application
    Given User navigate to KuchToh application
    Given Delete User details for the username UserName_Test1
    When User Enters Registration Details as Below
      |UserName_Test1|9689201865|Test123|
    Then User Enter OTP 9689201865

  @Booking @Calendar
  Scenario:Calendar verification
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
      |Degree/Certificate proof of Doctor |C://Users//Kislaye Raj//Pictures//Untitled.png  |
    Then User click on Next Button
    Then User click Finish
    Then User click ok on Finish popup
    Then User enter Establishment Details
      |Testname|1995|
    Then User enter Address India
    Then User click on Next Button
    Then User click Finish
    Then Click ok on Congratulation page
    And User Click on BookNow
    Then User Search Consultant
    And User click on search Button
    And User Book consultant from calendar
#    And User Click on Calendar
    Then User Verify month on calendar
    And User Verify week on calendar
    And User Verify day on calendar