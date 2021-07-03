@Admin

Feature: Admin Login

  Background: Navigate to application

    Given User navigate to KuchToh application

#Prerequisite - Already user created with admin right with given phone number and pwd
  Scenario:Admin booking details
    When User Enter Mobile Number 9689201855
    When User Enter Password testing
    Then Click on Get Started Button
    Then Click on Admin Panel
    Then Click on Booking Details
    And Verify Booking Details


  Scenario:Verify search consultant
    When User Enter Mobile Number 9689201855
    When User Enter Password testing
    Then Click on Get Started Button
    Then Click on Admin Panel
    Then Click on Admin Search Consultant
    And Verify Search Consultant


  Scenario: Verify Booking status
    When User Enter Mobile Number 9689201855
    When User Enter Password testing
    Then Click on Get Started Button
    Then Click on Admin Panel
    Then Click on Booking Details
    And Verify Booking Status


  Scenario:Basic Details page
    When User Enter Mobile Number 9689201855
    When User Enter Password testing
    Then Click on Get Started Button
    Then Click on Admin Panel
    Then Click on Admin Details
    And Verify Admin User Count


  Scenario:Basic Toogle Function
    When User Enter Mobile Number 9689201855
    When User Enter Password testing
    Then Click on Get Started Button
    Then Click on Admin Panel
    Then Click on Admin Details
    Then verify Toggle disable

