@EducationQuali @Common1 @test
Feature: Education Quali Register application

  Background: Navigate to application
    Given User navigate to KuchToh application
    Given Delete User details for the username UserName_Test1

  @EducationQualification
  Scenario:Education qualification page
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


  @EducationQualification
  Scenario:With Two Education qualification
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
    When User click on add education field
    When User enter Second Education Details
      |MSR|Test|2021|
    Then User click on Next Button
    Then Verify User lands on Basic details page

  @EducationQualification
  Scenario:Sub Education qualification
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
    When User click on add education field
    When User click on Sub education field
    Then User Verify second qualification details not present