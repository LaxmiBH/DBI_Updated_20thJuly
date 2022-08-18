Feature: Full Day Punches Functionality

  Scenario: Verify Full Day Punches
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
    Then User clicks on "Add Full-Day Punches" button

    And "Add Punches for Full Day" popup should be displayed
    And Close button for "Add Punches for Full Day" should be displayed
    And TimezoneBox of "Timezone" should be displayed
    Then "Add Punch Coding" button with title should be displayed
    And  "StartOnly#2" break should be displayed to User
    And  "Start And End Break#1" break should be displayed to User
    And  "StartOnly#3" break should be displayed to User
    And  "Tea/Cofee" break should be displayed to User
    And  "Dinner" break should be displayed to User
    Then User Scroll down popup upto "Create All Punches"
    And  "Start And End Break#2" break should be displayed to User
    And "Out" textBox should be displayed
    And  "Cofee" break should be displayed to User
    And  "Lunch" break should be displayed to User
    And User Scroll up popup upto "Add Punches for Full Day"

    And User clicks on "Add Punch Coding" button
    Then User clicks on "Select Pay Type"
    And User selects "Salary Pay"
    Then User clicks on Submit Coding button
    Then User clicks on Clear Time Value button of "StartOnly#2"
    Then User clicks on Clear Time Value button of "Start And End Break#1"
    Then User clicks on Clear Time Value button of "StartOnly#3"
    Then User Scroll down popup upto "Create All Punches"
    And "Start And End Break#2" textbox User Enter "3:00"
    And User selects PM of "Start And End Break#2"
    And "Start And End Break#2" textbox User Enter "3:45"
    And User selects PM of "Start And End Break#2"
    And "Out" textbox User Enter "9:00"
    And User selects PM of "Out"
    Then Click on "Create All Punches" button

    And "All punches were created successfully!" message should displayed on UI

    And User clicks on "Delete Punch Clock Record" button
    And User clicks "Yes" on popup
    And User clicks on "Delete Punch Clock Record" button
    And "Are you sure you want to delete this Punch?" message should be displayed on popup
    And User clicks "Yes" on popup