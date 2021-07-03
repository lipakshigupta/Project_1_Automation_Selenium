@UploadDocument @Common1 @test
Feature: Upload Document

  Background: Navigate to application
    Given User navigate to KuchToh application
    Given Delete User details for the username UserName_Test1
    When User Enters Registration Details as Below
      |UserName_Test1|9689201865|Test123|
    Then User Enter OTP 9689201865

  @Upload
  Scenario:Upload Document page
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

  @Upload
  Scenario:Upload Based on Education page
    Then User should Land on medical registration page
    When User enter Registration number 12345
    When User enter Registration council Andhra Pradesh State Dental Council
    When User enter Registration year 1999
    Then User click on Next Button
    Then Verify User lands on Education page
    When User enter Qualification Details
      |MSR|Doctor|1995|
    When User click on add education field
    When User enter Second Education Details
      |MSR|Test|2021|
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
      |Degree/Certificate proof of MSR    |C://Users//Kislaye Raj//Pictures//Untitled.png  |
    Then User click on Next Button
    Then User click Finish

  @FinishPage
  Scenario:Finish page
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
    Then Verify after finish user get successfull message



