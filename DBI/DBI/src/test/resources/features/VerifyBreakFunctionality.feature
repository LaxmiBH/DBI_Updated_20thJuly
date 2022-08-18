Feature: Verify Break Functionality

Scenario: Break Functionality

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

  Then User clicks on dropdown on Attendance Punch Clock
  And User clicks on dropdown on Attendance Punch Clock

  Then User clicks on "View All Breaks" button
  And Required Break "Start And End Break#2" should be displayed
  And Required Break "Start Only#1" should be displayed
  And "Close Detail View" button with title should be displayed

  And "Edit Punch Clock Records" button with title should be displayed
  Then User clicks on "Edit Punch Clock Records" button

  And "Please select an Employee and Payroll Group" button with title should be displayed
  When User clicks on search icon of "Payroll Group"
  Then "Select Payroll Group" popup should be displayed
  And User selects "Automation Payroll Group"
  And User clicks on search icon of "Employee"
  Then "Select Employee" popup should be displayed
  And User selects "(#2020) Emp02, Automation"
  And Date should be displayed in this format "MM/DD/YYYY"
  And "Previous Day" button with title should be displayed

  And User clicks on "Delete Punch Clock Record" button
  And User clicks "Yes" on popup