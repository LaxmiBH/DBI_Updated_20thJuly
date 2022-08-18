Feature: Add New Log Entry

  Scenario: Verify Add New Log Entry Feature
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

    Then "Add a log entry" button with title should be displayed
    When User clicks on "Add a log entry" button
    Then "Punch Clock Log Entries" popup should be displayed
    And Close button for "Punch Clock Log Entries" should be displayed
    And "New Log Entry" textbox should be displayed
    And "Add New Log Entry" button should be displayed

    Then User enter the "Alan" into "New Log Entry" textbox
    And User clicks "Add New Log Entry" button
    Then "Punch Clock log entry created successfully" message should displayed on UI

    And "hh2 Admin" should be displayed on Log Entry popup
    And Entered entry "Alan" should be displayed
    And "Automation Payroll Group" should be displayed on Log Entry popup
    And "Edit Log Entry" button with title should be displayed
    And "Delete Log Entry" button with title should be displayed

    When User clicks on "Edit Log Entry" button
    Then "Save Changes" button with title should be displayed
    And User update log entry "Alan" to "Walker"
    And User clicks on "Save Changes" button
    Then "Punch Clock log entry successfully updated" message should displayed on UI

    And User clicks on "Delete Log Entry" button
    And "Are you sure you want to delete this log entry?" message should be displayed on popup
    Then User clicks "Yes" button
    And "Punch clock log entry was successfully deleted" message should displayed on UI

    Then User close "Punch Clock Log Entries" popup

    When User clicks on "Edit Punch Clock Records" button

    And User clicks on "Delete Punch Clock Record" button
    And "Are you sure you want to delete this Punch?" message should be displayed on popup
    And User clicks "Yes" on popup