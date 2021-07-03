@SelectService @Common1 @test
Feature: Select Service

  Background: Navigate to application
    Given User navigate to KuchToh application
    Given Delete User details for the username UserName_Test1
    When User Enters Registration Details as Below
      |UserName_Test1|9689201865|Test123|
    Then User Enter OTP 9689201865

  @service
  Scenario:Looking for consultant
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

  @service
  Scenario:Available for consultant
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
    When User select Available for consultant
    Then User click on Next Button
    Then Verify user lands on Document upload page

  @service
  Scenario:Both Service Selection page
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
    When User select Available for consultant
    When User select Looking for consultant
    Then User click on Next Button
    Then Verify user lands on Document upload page

