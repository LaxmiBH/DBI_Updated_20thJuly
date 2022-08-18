Feature: Add Break Record Functionality

  Scenario: Verify Break Record
    Given User has logged in to application
    When User clicks on "Remote Payroll" option from left panel
    When User clicks on "Punch Clock With Coding" option on Remote PayrollPage

    When User clicks on "Select Payroll Group"
    And User selects "Automation Payroll Group"

    When User clicks on "Select Employee"
    And User selects "(#2020) Emp02, Automation"

    When User clicks on "Punch In" button
    Then User clicks on "Select Pay Type"
    And User selects "Salary Pay"
    When User clicks on Submit Coding button

    Then User clicks on "Edit Punch Clock Records" button

    When User clicks on "Choose Record to Add" button
    Then User clicks on "Break Record" button
    And "Add Break Record" popup should be displayed
    And Close button for "Break Record" should be displayed
    Then "Add Break" button should be disable
    When User clicks "Select a Break" dropdown
    And Select "Taken/NotTaken" from dropdown
    Then "Add Break" button should be Enable
    When Click on "Add Break" button
    Then "Break created successfully" message should displayed on UI

    And User clicks on "Delete Break" button
    And User clicks "Yes" on popup
    Then "Break successfully deleted!" message should displayed on UI

    When User clicks on "Choose Record to Add" button
    Then User clicks on "Break Record" button
    When User clicks "Select a Break" dropdown
    And Select "TakenPaid" from dropdown
    When Click on "Add Break" button
    Then "Please select a set of codings to apply to this paid break" message should displayed on UI
    And "Current" checkBox should be displayed
    And "Custom Coding" checkBox should be displayed
    And Click on "Custom Coding" checkbox
    And Click on "Submit" button
    Then "Break created successfully" message should displayed on UI

    And User clicks on "Delete Break" button
    And User clicks "Yes" on popup
    Then "Break successfully deleted!" message should displayed on UI

    When User clicks on "Choose Record to Add" button
    Then User clicks on "Break Record" button
    When User clicks "Select a Break" dropdown
    And Select "StartTimeOnly" from dropdown
    And "Start time" textbox User Enter "3:15"
    And User clicks on time "PM"
    Then Click on "Add Break" button
    Then "Break created successfully" message should displayed on UI

    And User clicks on "Delete Break" button
    And User clicks "Yes" on popup
    Then "Break successfully deleted!" message should displayed on UI

    When User clicks on "Choose Record to Add" button
    Then User clicks on "Break Record" button
    When User clicks "Select a Break" dropdown
    And Select "Start&EndTime" from dropdown
    And "Start time" textbox User Enter "8:30"
    And User clicks on time "PM"
    And "End time" textbox User Enter "9:00"
    And User clicks on End time "PM"
    Then Click on "Add Break" button
    Then "Break created successfully" message should displayed on UI

    And User clicks on "Delete Break" button
    And User clicks "Yes" on popup
    Then "Break successfully deleted!" message should displayed on UI

    And User clicks on "Delete Punch Clock Record" button
    And User clicks "Yes" on popup
    Then "Punch Clock record was successfully deleted" message should displayed on UI