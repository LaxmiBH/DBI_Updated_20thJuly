Feature: Shift-Break as Start And End Time Paid Functionality

  Scenario: Start And End Time Paid
    Given User has logged in to application

    When User clicks on "Remote Payroll" option from left panel
    When User clicks on "System Settings" option on Remote PayrollPage

    And "Punch Clock" option from left on Remote Payroll Settings should be displayed
    And User clicks on "Punch Clock" option from left on Remote Payroll Settings
    Then "Manage Punch Clock Breaks" button should be displayed

    When User clicks "Manage Punch Clock Breaks" button on Remote Payroll Settings
    When User clicks on "Add a Punch Clock Shift-Break" button on Manage Punch Clock Breaks

    When User clicks "Break Type" dropdown on Add a Punch Clock Shift-Break
    And Select "Start & End Time" from Break Type dropdown
    And In "Name:" textbox User Enter "SEPaid"
    And In "Abbreviation:" textbox User Enter "Paid"
    And In "Code:" textbox User Enter "SE-45"
    And In Duration User Enter "M:" as "45"
    And In MaxDuration User Enter "M:" as "50"
    And User clicks "Is Paid:" checkbox
    When User Scroll down popup upto Create New Break button
    And In "Suggested Early Start:" textbox User Enter "2:00"
    And User selects PM for "Suggested Early Start:"
    And In "Suggested Late Start:" textbox User Enter "2:40"
    And User selects PM for "Suggested Late Start:"
    And In "Suggested Early End:" textbox User Enter "2:30"
    And User selects PM for "Suggested Early End:"
    And In "Suggested Late End:" textbox User Enter "3:00"
    And User selects PM for "Suggested Late End:"
    And User clicks "Create New Break" button
    Then "New punch clock break created successfully!" message should be displayed on popup

    When User enters "SEPaid" characters in Search bar
    Then Break "SEPaid" should be displayed

    When User clicks on "Remote Payroll" option from left panel
    When User clicks on "Punch Clock With Coding" option on Remote PayrollPage

    When User clicks on "Select Payroll Group"
    And User selects "Automation Payroll Group"
    Then User clicks on "Select Employee"
    And User selects "(#2020) Emp02, Automation"
    When User clicks on "Punch In" button
    Then User clicks on "Select Pay Type"
    And User selects "Salary Pay"
    When User clicks on Submit Coding button

    Then User clicks "Start Only#1" dropdown on Attendance Punch Clock
    And Select "SEPaid" break from dropdown
    And "Length: 45 min" length should be displayed
    And "Suggested start:" suggested time should be displayed
    And User clicks "START BREAK" button
    Then "Successfully started the break" message should displayed on UI

    And "End this break" button with title should be displayed

    Then User clicks on "Edit Punch Clock Records" button
    Then User clicks on Expand Button
    And "Break Record Detail" button with title should be displayed
    And "Delete Break" button with title should be displayed
    Then User clicks on "Delete Break" button
    And User clicks "Yes" on popup
    And User clicks on "Delete Punch Clock Record" button
    And User clicks "Yes" on popup
    And User close "Edit Punch Clock Records" popup

    When User clicks on "Remote Payroll" option from left panel
    When User clicks on "System Settings" option on Remote PayrollPage
    And User clicks on "Punch Clock" option from left on Remote Payroll Settings
    When User clicks "Manage Punch Clock Breaks" button on Remote Payroll Settings
    Then Delete the "SEPaid" break from Manage Punch Clock Breaks
    And Click "Yes" button on popup
