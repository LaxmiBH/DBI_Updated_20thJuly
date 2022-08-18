Feature: Add Punch Records Functionality

  Scenario: Verify Add Punch Records
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
    And "Choose Record to Add" popup should be displayed
    And Close button for "Choose Record to Add" should be displayed
    And "Add punch record" button with title should be displayed
    And "Break Record" button with title should be displayed
    And "Add Full-Day Punches" button with title should be displayed

    Then User clicks on "Add punch record" button
    And "Add New Punch Clock Record" popup should be displayed
    And Close button for "Add New Punch Clock Record" should be displayed
    And "Clear time value" button with title should be displayed
    And "AM" on PopUp should be Displayed
    And "PM" on PopUp should be Displayed
    And "In" on PopUp should be Displayed
    And "Out" on PopUp should be Displayed
    And "Create New Punch" on PopUp should be Displayed

    When User clicks on "Clear time value" button
    And  User click on Direction "In"
    Then Click on "Create New Punch" button
    Then "Punch time is required" message should be displayed on popup
    And User close the popup of "Add New Punch Clock Record"

    When User clicks on "Choose Record to Add" button
    Then User clicks on "Add punch record" button
    And User selects AM of "Time"
    Then Click on "Create New Punch" button
    Then "Punch direction is required" message should be displayed on popup

    And User selects PM of "Time"
    And  User click on Direction "In"
    And User clicks on "Create New Punch" of Add New Punch Clock Record
    Then User clicks on "Select Pay Type"
    And User selects "Salary Pay"
    When User clicks on Submit Coding button
    Then "Punch created successfully" message should be displayed on popup

    When User clicks on "Choose Record to Add" button
    Then User clicks on "Add punch record" button
    And User selects PM of "Time"
    And  User click on Direction "Out"
    Then Click on "Create New Punch" button

    And User clicks on "Delete Punch Clock Record" button
    And User clicks "Yes" on popup
    And User clicks on "Delete Punch Clock Record" button
    And User clicks "Yes" on popup
    And User clicks on "Delete Punch Clock Record" button
    And User clicks "Yes" on popup
