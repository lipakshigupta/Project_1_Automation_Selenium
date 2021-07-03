@MedicalReg @Common1 @test
Feature: Medical Register application

  Background: Navigate to application
    Given User navigate to KuchToh application
    Given Delete User details for the username UserName_Test1
    When User Enters Registration Details as Below
      |UserName_Test1|9689201865|Test123|
    Then User Enter OTP 9689201865

  @MedicalReg
  Scenario:Medical Register To the application
    Then User should Land on medical registration page
    When User enter Registration number 12345
    When User enter Registration council Andhra Pradesh State Dental Council
    When User enter Registration year 1999
    Then User click on Next Button
    Then Verify User lands on Education page

  @MedicalReg
  Scenario:Medical Register number error
    Then User should Land on medical registration page
    When User enter Registration council Andhra Pradesh State Dental Council
    When User enter Registration year 1999
    Then User click on Next Button
    Then Verify User Get reg error message

  @MedicalReg @aa
  Scenario:Medical Register council error
    Then User should Land on medical registration page
    When User enter Registration number 12345
    When User enter Registration year 1999
    Then User click on Next Button
    Then Verify User Get Reg council error message

  @MedicalReg
  Scenario:Medical Register year error
    Then User should Land on medical registration page
    When User enter Registration number 12345
    When User enter Registration council Andhra Pradesh State Dental Council
    Then User click on Next Button
    Then Verify User Get Reg yr error message
