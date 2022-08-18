Feature: Attendance Punch Feature

  Scenario: Verify Attendance Punch Clock UI
    Given User has logged in to application
    When User clicks on "Remote Payroll" option from left panel
    When User clicks on "Punch Clock With Coding" option on Remote PayrollPage

  Then "Attendance Punch Clock" label should be displayed to User
    And "Page Settings" button with title should be displayed
    And "Edit Punch Clock Records" button with title should be displayed
    And Verify current date
    And Verify current time
    When User clicks on "Change Date" button
    And Verify the current date should be highlighted
    And Verify the future date should be disable
    And User clicks on "Change Date" button
    And "Select Payroll Group" should be displayed
    And "Select Employee" should be displayed
    And "Punch " button should be disable

    When User clicks on "Select Payroll Group"
    Then "Select Payroll Group" popup should be displayed
    And "No Selected Items to Clear" button with title should be displayed
    And "Change to List View" button with title should be displayed
    And Close Button of "Select Payroll Group" popup should be displayed
    And SearchTextBox on popup should be displayed
    And Status dropdown for "Active Payroll Groups" should be displayed with below options
      |Active Payroll Groups|
      |Inactive Payroll Groups|
      |Archived Payroll Groups|
      |Unarchived Payroll Groups|

    When User enters "AB Payroll Group" characters in Search bar
    Then Payroll group "AB Payroll Group" should be displayed
    And User Clicks on Remove Button
    And  User enters "ABCDE" characters in Search bar
    Then "No Records Found" message should be displayed
    And User Clicks on Remove Button

    And User selects "Automation Payroll Group"
    Then "Payroll Group: Automation Payroll Group" should be displayed on Attendance Punch Clock page
    And "Punch " button should be disable

    When User clicks on "Select Employee"
    Then "Select Employee" popup should be displayed
    And "No Selected Items to Clear" button with title should be displayed
    And "Change to List View" button with title should be displayed
    And Close Button of "Select Employee" popup should be displayed
    And SearchTextBox on popup should be displayed
    And Status dropdown for "Active Employees" should be displayed with below options
      |Active Employees|
      |Inactive Employees|
      |Archived Employees|
      |Unarchived Employees|

    When User enters "Emp02" characters in Search bar
    Then Payroll group "(#2020) Emp02, Automation" should be displayed
    And User Clicks on Remove Button
    And  User enters "EMPLY" characters in Search bar
    Then "No Records Found" message should be displayed
    And User Clicks on Remove Button

    And User selects "(#2020) Emp02, Automation"
    Then "Automation Emp02" should be displayed on Attendance Punch Clock page
    And "Punch In" button with title should be displayed
