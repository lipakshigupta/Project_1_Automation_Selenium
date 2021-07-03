@Registration @Common1 @test
Feature: Register application

  Background: Navigate to application
    Given User navigate to KuchToh application
    Given Delete User details for the username UserName_Test1

  @Registration @sd
  Scenario:Register To the application
    When User Enters Registration Details as Below
      |UserName_Test1|9689201865|Test123|
    Then User Enter OTP 9689201865
    Then User should Land on medical registration page

  @Registration @Negative
  Scenario:Register To the application
    When User Enters Registration Details as Below
      |Test|9689201865|Test123|
    Then Verify User should get username error message

  @Registration @Negative
  Scenario:Register To the application
    When User Enters Registration Details as Below
      |UserName_Test1|9689201|Test123|
    Then Verify User should get invalid phoneno error message

  @Registration @Negative
  Scenario:Register To the application
    When User Enters Registration Details as Below
      |UserName_Test1|9689201865|Tes|
    Then Verify User Get Error Message for password

  @Registration @Negative
  Scenario:Register To the application
    When User Enter UserName UserName_Test1
    When User Enter Mobile Number 9689201865
    When User Enter Password Test123
    When User Accept Term and conditions
    Then Click on Get Started Button
    Then Verify User should get basic qualification error message

  @Registration @Negative@debug
  Scenario:Register To the application
    When User Enter UserName UserName_Test1
    When User Enter Mobile Number 9689201865
    When User Enter Password Test123
    When User Enter Basic Qualification
    Then Click on Get Started Button
    Then Verify User should get term condition error message