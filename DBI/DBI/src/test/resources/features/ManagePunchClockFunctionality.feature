Feature: Manage Punch CLock Breaks Functionality

  Scenario: Manage Punch CLock Breaks
    Given User has logged in to application
    When User clicks on "Remote Payroll" option from left panel
    When User clicks on "System Settings" option on Remote PayrollPage

    And "Punch Clock" option from left on Remote Payroll Settings should be displayed
    And User clicks on "Punch Clock" option from left on Remote Payroll Settings
    Then "Manage Punch Clock Breaks" button should be displayed

    When User clicks "Manage Punch Clock Breaks" button on Remote Payroll Settings
    Then "Manage Punch Clock Breaks" popup should be displayed

    And SearchTextBox on Manage Punch Clock Breaks popup should be displayed
    And Close button of "Manage Punch Clock Breaks" popup should be displayed
    And "Add a Punch Clock Shift-Break" button with title should be displayed on Manage Punch Clock Breaks
    And  Break type dropdown for "Type" should be displayed with below options
      |All|
      |Taken / Not Taken|
      |Start Time Only|
      |Start & End Time|

    Then User Move Cursor on the Break "Taken/NotTaken"
    And Verify the "Punch Clock Shift-Break Detail" button should be dispalyed
    And Verify the "Delete Punch Clock Shift Break" button should be dispalyed

    When User enters "StartTimeOnly" in Search bar
    Then "StartTimeOnly" break should be displayed
    And User click on Remove Button
    When User enters "Cofee" in Search bar
    Then "No Punch Clock Breaks have been defined" message should be displayed
    And User click on Remove Button

    When User clicks "Type" dropdown on Manage Punch Clock Breaks
    And Select "Taken / Not Taken" from Type dropdown
    Then User clicks "Type" dropdown on Manage Punch Clock Breaks
    And Select "Start Time Only" from Type dropdown
    Then User clicks "Type" dropdown on Manage Punch Clock Breaks
    And Select "Start & End Time" from Type dropdown
