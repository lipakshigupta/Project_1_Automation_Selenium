@Booking @Common1 @demo1
Feature: Booking

  Background: Navigate to application
    Given User navigate to KuchToh application
    Given User Clean Otp for Mobile Number 9689201866
    Given Delete User details for the username UserName_Test2
    When User Enters Registration Details as Below
      |UserName_Test2|9689201866|Test123|
    Then User Enter OTP 9689201866
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
    When User select Available for consultant
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

    Then User enters Consultant page Data
      |00:15|00:45|Tue|India| Dentist|Consultation|2020|400|
    Then User click on Next Button
    Then User enter Establishment Details
      |Testname|1995|
    Then User enter Address India
    Then User click on Next Button
    Then User click Finish
    Then Verify User get Congratulation page
    Then Click ok on Congratulation page

    Given User re-navigate to KuchToh application
    Given Delete User details for the username UserName_Test1
    When User Enters Registration Details as Below
      |UserName_Test1|9689201865|Test123|
    Then User Enter OTP 9689201865


  @Booking @SearchConsultant
    Scenario:Search Consultant
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
      When User select Available for consultant
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
      Then User enters Consultant page Data
      |00:15|00:45|Tue|India| Dentist|Consultation|2020|400|
      Then User click on Next Button
      Then User enter Establishment Details
      |Testname|1995|
      Then User enter Address India
      Then User click on Next Button
      Then User click Finish
      Then Verify User get Congratulation page
      Then Click ok on Congratulation page
      And User Click on BookNow
      Then User Search Consultant
      And User click on search Button

  @Booking
  Scenario:Verify Service field Error message
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
    When User select Available for consultant
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
    Then User enters Consultant page Data
      |00:15|00:45|Tue|India| Dentist|Consultation|2020|400|
    Then User click on Next Button
    Then User enter Establishment Details
      |Testname|1995|
    Then User enter Address India
    Then User click on Next Button
    Then User click Finish
    Then Verify User get Congratulation page
    Then Click ok on Congratulation page
    And User Click on BookNow
    And User click on search Button
    Then User Verify Service field Error message

  @Booking
  Scenario:Verify Establishment Error message
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
    When User select Available for consultant
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
    Then User enters Consultant page Data
      |00:15|00:45|Tue|India| Dentist|Consultation|2020|400|
    Then User click on Next Button
    Then User enter Establishment Details
      |Testname|1995|
    Then User enter Address India
    Then User click on Next Button
    Then User click Finish
    Then Verify User get Congratulation page
    Then Click ok on Congratulation page
    And User Click on BookNow
    And User click on search Button
    Then User Verify Establishment Error message


  @Booking
  Scenario:Verify Specialization Error message
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
    When User select Available for consultant
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
    Then User enters Consultant page Data
      |00:15|00:45|Tue|India| Dentist|Consultation|2020|400|
    Then User click on Next Button
    Then User enter Establishment Details
      |Testname|1995|
    Then User enter Address India
    Then User click on Next Button
    Then User click Finish
    Then Verify User get Congratulation page
    Then Click ok on Congratulation page
    And User Click on BookNow
    And User click on search Button
    Then User Verify Specialization Error message


  @Boorrrking
  Scenario:Cancel Booking
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
    When User select Available for consultant
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
    Then User enters Consultant page Data
      |00:15|00:45|Tue|India| Dentist|Consultation|2020|400|
    Then User click on Next Button
    Then User enter Establishment Details
      |Testname|1995|
    Then User enter Address India
    Then User click on Next Button
    Then User click Finish
    Then Verify User get Congratulation page
    Then Click ok on Congratulation page
    And User Click on BookNow
    Then User Search Consultant
    And User click on search Button
    And User Verify able to click on More Detials
    And User Book consultant from calendar 2021-07-06 00:30
    Then User Cancel Booking Phone: 9689201866
    Then Verify Booking is cancelled

  @Boorrrking
  @Booking@ondemo
  Scenario:Verify Booking In calendar
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
    When User select Available for consultant
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
    Then User enters Consultant page Data
      |00:15|00:45|Tue|India| Dentist|Consultation|2020|400|
    Then User click on Next Button
    Then User enter Establishment Details
      |Testname|1995|
    Then User enter Address India
    Then User click on Next Button
    Then User click Finish
    Then Verify User get Congratulation page
    Then Click ok on Congratulation page
    And User Click on BookNow
    Then User Search Consultant
    And User click on search Button
    And User Verify able to click on More Detials
    And User Book consultant from calendar 2021-07-06 00:15
    And User Verify calendar



