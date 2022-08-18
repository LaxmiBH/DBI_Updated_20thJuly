Feature: Edit Coded Interval Functionality

  Scenario: Edit Coded Interval
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

    And Verify the Expands Button on Punch Interval
    And User clicks on Expand Button

    Then "Edit Coded Interval" button with title should be displayed
    And User clicks on "Edit Coded Interval" button
    And "Edit Coded Interval" popup should be displayed
    And Close button for "Edit Coded Interval" should be displayed
    And "Start time" label should be displayed
    And "AM" on PopUp should be Displayed
    And "PM" on PopUp should be Displayed
    And TimezoneBox of "Start time" should be displayed
    And "Punch History" button with title should be displayed
    And "GPS not collected for this punch" button with title should be displayed
    Then "Update Coding for Punch" button with title should be displayed
    Then "Update" button should be displayed

    Then User clicks on "Update Coding for Punch" button
    Then "Update Coding for Punch" popup should be displayed
    Then "(#0) 0" should be displayed on Add Coding to Punch popup
    Then  User clicks on Clear Selection button of "Pay Type"
    And User clicks on "Select Pay Type"
    And User selects "Regular Hourly Pay"
    Then User clicks on Submit Coding button
    And Clicks on "Update" btn
    Then "Coded interval updated successfully" message should displayed on UI

    Then User clicks on Collapse Button


    And User clicks on "Delete Punch Clock Record" button
    And User clicks "Yes" on popup
    Then "Punch Clock record was successfully deleted" message should displayed on UI

