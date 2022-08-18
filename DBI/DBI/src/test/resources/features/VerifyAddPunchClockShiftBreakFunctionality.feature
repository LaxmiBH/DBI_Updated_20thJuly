Feature: Add a Punch Clock Shift-Break Functionality

  Scenario: Add a Punch Clock Shift-Break
    Given User has logged in to application
    When User clicks on "Remote Payroll" option from left panel
    When User clicks on "System Settings" option on Remote PayrollPage

    And "Punch Clock" option from left on Remote Payroll Settings should be displayed
    And User clicks on "Punch Clock" option from left on Remote Payroll Settings
    Then "Manage Punch Clock Breaks" button should be displayed

    When User clicks "Manage Punch Clock Breaks" button on Remote Payroll Settings
    When User clicks on "Add a Punch Clock Shift-Break" button on Manage Punch Clock Breaks
    Then Popup of "Add a Punch Clock Shift-Break" should be displayed
    And  Close button of "Add a Punch Clock Shift-Break" popup should be displayed

    And "Break Type:" label should be displayed
    And Dropdown Values for "Break Type:" should be displayed
      |Taken / Not Taken|
      |Start Time Only|
      |Start & End Time|

    And "Name:" label should be displayed
    And TextBox for "Name:" should be displayed
    And "Abbreviation:" label should be displayed
    And TextBox for "Abbreviation:" should be displayed
    And "Code:" label should be displayed
    And TextBox for "Code:" should be displayed
    And "Duration:" label should be displayed
    And "Max Duration:" label should be displayed
    And "Punch Rounding:" label should be displayed
    And Dropdown Values for "Punch Rounding:" should be displayed
      |No Rounding|
      |Quarter-Hour|
      |Half-Hour|
      |Full-Hour|

    And "Is Meal:" label should be displayed
    And CheckBox for "Is Meal:" should be displayed
    And "Is Paid:" label should be displayed
    And CheckBox for "Is Paid:" should be displayed
    And "Required:" label should be displayed
    And CheckBox for "Required:" should be displayed


    When User Scroll down popup upto Create New Break button
    And "Suggested Early Start:" label should be displayed
    And TextBox for "Suggested Early Start:" should be displayed
    And AM for "Suggested Early Start:" should be displayed
    And PM for "Suggested Early Start:" should be displayed
    And TimezoneBox for "Suggested Early Start:" should be displayed

    And "Suggested Late Start:" label should be displayed
    And TextBox for "Suggested Late Start:" should be displayed
    And AM for "Suggested Late Start:" should be displayed
    And PM for "Suggested Late Start:" should be displayed
    And TimezoneBox for "Suggested Late Start:" should be displayed

    And "Suggested Early End:" label should be displayed
    And TextBox for "Suggested Early End:" should be displayed
    And AM for "Suggested Early End:" should be displayed
    And PM for "Suggested Early End:" should be displayed
    And TimezoneBox for "Suggested Early End:" should be displayed

    And "Suggested Late End:" label should be displayed
    And TextBox for "Suggested Late End:" should be displayed
    And AM for "Suggested Late End:" should be displayed
    And PM for "Suggested Late End:" should be displayed
    And TimezoneBox for "Suggested Late End:" should be displayed

    And "Is Strict:" label should be displayed
    And CheckBox for "Is Strict:" should be displayed
    Then "Create New Break" button should be displayed on popup

    And In "Name:" textbox User Enter "Laxmikant"
    And In "Abbreviation:" textbox User Enter "abcde"
    And In "Code:" textbox User Enter "R1613"
    And In Duration User Enter "H:" as "1"
    And In Duration User Enter "M:" as "15"
    And In MaxDuration User Enter "H:" as "1"
    And In MaxDuration User Enter "M:" as "30"
    And User clicks "Punch Rounding" dropdown on Add a Punch Clock Shift-Break
    And Select "No Rounding" from Punch Rounding dropdown
    And  User clicks "Is Meal:" checkbox
    When User Scroll down popup upto Create New Break button
    And User clicks "Create New Break" button
    Then "Value for \"type\" is required" message should displayed

    And User Scroll up popup upto Break Type

    When User clicks "Break Type" dropdown on Add a Punch Clock Shift-Break
    And Select "Taken / Not Taken" from Break Type dropdown
    And User clear "Name" textbox
    When User Scroll down popup upto Create New Break button
    And User clicks "Create New Break" button
    Then "Value for \"name\" is required" message should displayed
