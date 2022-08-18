Feature: Edit Punch Clock Records

  Scenario: Verify Edit Punch Clock Records Feature
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

    And "Edit Punch Clock Records" button with title should be displayed
    When User clicks on "Edit Punch Clock Records" button
    Then "Edit Punch Clock Records" popup should be displayed
    And Close button for "Edit Punch Clock Records" should be displayed
    And "Automation Payroll Group" payroll group name should be displayed
    And "Automation Emp02" employee name should be displayed
    And Date should be displayed in this format "MM/DD/YYYY"
    And "Previous Day" button with title should be displayed
    And "Choose Record to Add" button with title should be displayed
    And "Edit Punch Clock Record" button with title should be displayed
    And "Delete Punch Clock Record" button with title should be displayed
    And "GPS not collected for this punch" button with title should be displayed
    And "Photo not captured for this punch" button with title should be displayed
    And "Signature not captured for this punch" button with title should be displayed
    And Verify the Expands Button on Punch Interval
    And "Punch History" button with title should be displayed
    And "Add Punch Clock Record" button with title should be displayed


    Then Red cross button in front of "Automation Payroll Group" should be displayed
    When User clicks red cross of "Automation Payroll Group"
    Then "Please select a payroll group" on PopUp should be Displayed
    And "Automation Emp02" employee name should be displayed
    And Date should be displayed in this format "MM/DD/YYYY"
    Then "Please select a payroll group" on PopUp should be Displayed

    When User clicks on search icon of "Payroll Group"
    Then "Select Payroll Group" popup should be displayed
    And User selects "Automation Payroll Group"
    And "Automation Payroll Group" payroll group name should be displayed
    And "Automation Emp02" employee name should be displayed

    Then Red cross button in front of "Automation Emp02" should be displayed
    When User clicks red cross of "Automation Emp02"
    Then "Please select an employee" on PopUp should be Displayed

    And User clicks on search icon of "Employee"
    Then "Select Employee" popup should be displayed
    And User selects "(#2020) Emp02, Automation"
    And "Automation Emp02" employee name should be displayed

    When User clicks on "Previous Day" button

    And "Next Day" button with title should be displayed
    When User clicks on "Next Day" button

    Then User clicks on "Punch History" button
    Then "View Punch Record History" popup should be displayed
    And Close button for "View Punch Record History" should be displayed
    Then Source "Punch Clock" should be displayed for punch in
    And "Coding Detail" button with title should be displayed
    Then User close the popup of "View Punch Record History"


    And User clicks on "Delete Punch Clock Record" button
    And User clicks "Yes" on popup