Feature: Split Coded Interval Functionality

  Scenario: Split Coded Interval for Precentage
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

    Then "Split Coded Interval" button with title should be displayed
    And User clicks on "Split Coded Interval" button
    And "Split Time Interval" popup should be displayed
    And Close button for "Split Time Interval" should be displayed
    And "Start Time" label should be displayed to User
    And "New Interval Start Time" label should be displayed to User
    And  "New Interval Start Time" textBox should be displayed
    And "AM" on PopUp should be Displayed
    And "PM" on PopUp should be Displayed
    And "Add Coding" button with title should be displayed
    And "Split Time" button should be displayed

    And "New Interval Start Time" textbox User Enter "5:00"
    And User clicks on time "PM"
    And Click on "Split Time" button
  Then "Coding is required for new interval" message should displayed on UI

    Then User clicks on "Add Coding" button
    And "Add Coding" popup should be displayed
    And User clicks on "Select Pay Type"
    And User selects "Salary Pay"
    Then User clicks on Submit Coding button
    And Click on "Split Time" button
    Then "Distribution successfully split!" message should displayed on UI

    And User clicks on "Split Coded Interval" button
    And "Split Time Interval" popup should be displayed
    And "Time Available" label should be displayed to User
    And Dropdown Values of "Split by" should be displayed
      |Percentage|
      |Hours/Min|
      |Hours|
      |Time|
    When User clicks "Split by" dropdown
    And Select "Percentage" from Split dropdown
    And "New Interval Duration" textbox User Enter "50"
    Then User clicks on "Add Coding" button
    And "Add Coding" popup should be displayed
    And User clicks on "Select Pay Type"
    And User selects "Salary Pay"
    Then User clicks on Submit Coding button
    And Click on "Split Time" button
    Then "Distribution successfully split!" message should displayed on UI


    Then User click "Delete Coded Interval" button for deletion
    And Click on "Distribute time between remaining" button
    Then "Coded interval successfully deleted" message should displayed on UI

    Then User click "Delete Coded Interval" button for deletion
    And Click on "Delete coded interval" button

    Then User clicks on Collapse Button

    And User clicks on "Delete Punch Clock Record" button
    And User clicks "Yes" on popup
    Then "Punch Clock record was successfully deleted" message should displayed on UI

    Scenario: Split Coded Interval for Hours/Min
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

      Then "Split Coded Interval" button with title should be displayed
      And User clicks on "Split Coded Interval" button


      And "New Interval Start Time" textbox User Enter "5:00"
      And User clicks on time "PM"
      Then User clicks on "Add Coding" button
      And User clicks on "Select Pay Type"
      And User selects "Salary Pay"
      Then User clicks on Submit Coding button
      And Click on "Split Time" button
      Then "Distribution successfully split!" message should displayed on UI

      And User clicks on "Split Coded Interval" button
      And In Duration for "H:" enter "1"
      And In Duration for "M:" enter "10"
      Then User clicks on "Add Coding" button
      And User clicks on "Select Pay Type"
      And User selects "Salary Pay"
      Then User clicks on Submit Coding button
      And Click on "Split Time" button
      Then "Distribution successfully split!" message should displayed on UI


      Then User click "Delete Coded Interval" button for deletion
      And Click on "Distribute time between remaining" button
      Then "Coded interval successfully deleted" message should displayed on UI

      Then User click "Delete Coded Interval" button for deletion
      And Click on "Delete coded interval" button

      Then User clicks on Collapse Button

      And User clicks on "Delete Punch Clock Record" button
      And User clicks "Yes" on popup
      Then "Punch Clock record was successfully deleted" message should displayed on UI