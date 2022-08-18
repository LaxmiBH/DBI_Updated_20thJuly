Feature: Verify Update Coding functionality for Punch In

  Scenario: Update Coding Functionality

    Given User has logged in to application
    When User clicks on "Remote Payroll" option from left panel
    When User clicks on "Punch Clock With Coding" option on Remote PayrollPage

    When User clicks on "Select Payroll Group"
    And User selects "Automation Payroll Group"
    Then "Payroll Group: Automation Payroll Group" should be displayed on Attendance Punch Clock page

    When User clicks on "Select Employee"
    And User selects "(#2020) Emp02, Automation"
    Then "Automation Emp02" should be displayed on Attendance Punch Clock page

    When User clicks on "Punch In" button
    Then "Add Coding to Punch" popup should be displayed

    And User close "Add Coding to Punch" popup
    Then "SUCCESS: Punch IN recorded" message should displayed on UI

    And User clicks on Expand Button
    And "No coding found" label should be displayed to User
    Then User clicks on Collapse Button


    Then "Update Coding" button with title should be displayed
    When User clicks on "Update Coding" button
    Then "Add Coding to Punch" popup should be displayed

    Then User clicks on "Select Pay Type"
    And User selects "Salary Pay"
    Then User clicks on "Select Job"
    And User selects "Auto Job 01"
    Then User clicks on "Select Cost Code"
    And User selects "Project Coordination"
    Then User clicks on "Select Job Cost Category"
    And User selects "Equipment"
    Then User clicks on "Select Certified Class"
    And User selects "Drywall"
    Then User clicks on "Select Union"
    And User selects "Ironworkers"
    Then User clicks on "Select Union Local"
    And User selects "Local 29"
    Then User clicks on "Select Union Class"
    And User selects "Journeyman"

    When User clicks on Submit Coding button
    Then "SUCCESS: Coding change recorded" message should displayed on UI

    And Verify the Expands Button on Punch Interval
    And User clicks on Expand Button

    And Coding Type "Pay Type" with value "(#0) 0" should be displayed on Punch Intervals
    And Coding Type "Job" with value "Auto Job 01" should be displayed on Punch Intervals
    And Coding Type "Cost Code" with value "Project Coordination" should be displayed on Punch Intervals
    And Coding Type "Job Cost Category" with value "Equipment" should be displayed on Punch Intervals
    And Coding Type "Certified Class" with value "Drywall" should be displayed on Punch Intervals
    And Coding Type "Union" with value "Ironworkers" should be displayed on Punch Intervals
    And Coding Type "Union Local" with value "Local 29" should be displayed on Punch Intervals
    And Coding Type "Union Class" with value "Journeyman" should be displayed on Punch Intervals

    And Verify the Collapse Button on Punch Interval
    Then User clicks on Collapse Button

    Then "Payroll Group: Automation Payroll Group" should be displayed on Attendance Punch Clock page
    And "Automation Emp02" should be displayed on Attendance Punch Clock page
    Then "Update Coding" button with title should be displayed
    And "Add a log entry" button with title should be displayed
    And "Start this break" button with title should be displayed
    And Break Type Dropdown should get displayed with default break
    And Tool tip icon should be displayed
    And "View All Breaks" button with title should be displayed
    And Verify the "Punches" should be displayed on right side
    And "Last Punch:" on PopUp should be Displayed
    And "Punch " button should be disable

    Then "Punch Out" button with title should be displayed
    Then User clicks on "Punch Out" button

    When User clicks on "Edit Punch Clock Records" button

    And User clicks on "Delete Punch Clock Record" button
    And User clicks "Yes" on popup
    And User clicks on "Delete Punch Clock Record" button
    And "Are you sure you want to delete this Punch?" message should be displayed on popup
    And User clicks "Yes" on popup
    Then "Punch Clock record was successfully deleted" message should displayed on UI

