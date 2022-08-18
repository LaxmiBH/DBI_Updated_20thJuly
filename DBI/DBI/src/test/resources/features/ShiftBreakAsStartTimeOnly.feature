Feature: Shift-Break as Start Time Only Functionality

  Scenario: Start Time Only Strict without Earliest and Latest start
    Given User has logged in to application

    When User clicks on "Remote Payroll" option from left panel
    When User clicks on "System Settings" option on Remote PayrollPage

    And "Punch Clock" option from left on Remote Payroll Settings should be displayed
    And User clicks on "Punch Clock" option from left on Remote Payroll Settings
    Then "Manage Punch Clock Breaks" button should be displayed

    When User clicks "Manage Punch Clock Breaks" button on Remote Payroll Settings
    When User clicks on "Add a Punch Clock Shift-Break" button on Manage Punch Clock Breaks

    When User clicks "Break Type" dropdown on Add a Punch Clock Shift-Break
    And Select "Start Time Only" from Break Type dropdown
    And In "Name:" textbox User Enter "STStrict"
    And In "Abbreviation:" textbox User Enter "stric"
    And In "Code:" textbox User Enter "ST-45"
    And In Duration User Enter "M:" as "45"
    When User Scroll down popup upto Create New Break button
    And In "Suggested Late Start:" textbox User Enter "1:30"
    And User selects PM for "Suggested Late Start:"
    And User clicks "Is Strict:" checkbox

    And User clicks "Create New Break" button
    Then "Value for \"earliestStartTime\" is required" message should displayed
    Then User clicks on Clear Time Value button of "Latest Start:"

    And In "Earliest Start:" textbox User Enter "10:00"
    And User selects AM for "Earliest Start:"
    And User clicks "Create New Break" button
    Then "Value for \"latestStartTime\" is required" message should displayed
