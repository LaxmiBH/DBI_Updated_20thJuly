Feature: Add Punch Clock Record Functionality of Missing Punch

  Scenario: Add Punch Clock Record
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

    When User clicks on "Add Punch Clock Record" button
    Then "Time" textbox User Enter "10:00"
    And User selects PM of "Time"
    And  User click on Direction "Out"
    Then Click on "Create New Punch" button
    Then "Punch created successfully" message should be displayed on popup
    And User close "Edit Punch Clock Records" popup
    And Verify the "Punches" should be displayed on right side


    Then User clicks on "Edit Punch Clock Records" button
    And "Edit Punch Clock Record" button with title should be displayed
    And User clicks on "Edit Punch Clock Record" button
    Then "Time" textbox User Enter "12:00"
    And  User click on Direction "In"
    Then Click on "Update Coding" button
    Then User clicks on Clear Selection button of "Pay Type"
    And User clicks on "Select Pay Type"
    And User selects "Salary Pay"
    When User clicks on Submit Coding button
    Then Click on "Update Punch" button

    Then "Punch updated successfully" message should be displayed on popup

    And User close "Edit Punch Clock Records" popup
    And Verify the "Punches" should be displayed on right side

    And User clicks on Expand Button
    And Coding Type "Pay Type" with value "(#0) 0" should be displayed on Punch Intervals
    Then User clicks on Collapse Button

    Then User clicks on "Edit Punch Clock Records" button

    And User clicks on "Delete Punch Clock Record" button
    And User clicks "Yes" on popup
    And User clicks on "Delete Punch Clock Record" button
    And User clicks "Yes" on popup
