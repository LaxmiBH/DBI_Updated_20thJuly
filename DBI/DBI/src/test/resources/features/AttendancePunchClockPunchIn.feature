Feature: Attendance Punch In Feature

  Scenario: Verify Attendance Punch In Feature
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
    And Close button for "Add Coding to Punch" should be displayed
    And "Clear Coding" button with title should be displayed
    And "No available default codings" button with title should be displayed
    Then "Pay Type" should be displayed on popup
    Then "Job" should be displayed on popup
    Then "Cost Code" should be displayed on popup
    Then "Job Cost Category" should be displayed on popup
    Then "GL Account" should be displayed on popup
    Then "Department" should be displayed on popup
    Then "Certified Class" should be displayed on popup
    Then "Union" should be displayed on popup
    Then "Union Local" should be displayed on popup
    Then "Union Class" should be displayed on popup

    And User clicks on "Select Pay Type"
    Then "Select Pay Type" popup should be displayed
    And "Change to List View" button with title should be displayed
    And Close button for "Select Pay Type" popup should be displayed
    And "No Selected Items to Clear" button with title should be displayed
    And SearchTextBox on popup should be displayed
    And Status dropdown for "Active Pay Type" should be displayed with below options
      |Active Pay Type|
      |Inactive Pay Type|
      |Archived Pay Type|
      |Unarchived Pay Type|
    When User enters "Salary Pay" characters in Search bar
    Then Selected Value "Salary Pay" should be displayed
    And User Clicks on Remove Button
    And  User enters "ABCDE" characters in Search bar
    Then "No Records Found" message should be displayed
    And User Clicks on Remove Button
    When User selects "Salary Pay"
    Then "(#0) Salary Pay" should be displayed on Add Coding to Punch popup
    And Clear Selection button for "Pay Type" should be displayed
    Then  User clicks on Clear Selection button of "Pay Type"


    When User clicks on "Select Job"
    Then "Select Job" popup should be displayed
    And "Change to List View" button with title should be displayed
    And Close button for "Select Job" popup should be displayed
    And "No Selected Items to Clear" button with title should be displayed
    And SearchTextBox on popup should be displayed
    And Status dropdown for "Active Jobs" should be displayed with below options
      |Active Jobs|
      |Inactive Jobs|
      |Archived Jobs|
      |Unarchived Jobs|
    When User enters "Auto Job 01" characters in Search bar
    Then Selected Value "Auto Job 01" should be displayed
    And User Clicks on Remove Button
    And  User enters "ABCDE" characters in Search bar
    Then "No Records Found" message should be displayed
    And User Clicks on Remove Button
    When User selects "Auto Job 01"
    Then "(##03-111) Auto Job 01" should be displayed on Add Coding to Punch popup
    And "Select Cost Code" should be Enable
    And "Select Job Cost Category" should be Enable
    And "Select GL Account" should be disable
    And "Select Department" should be disable
    And Clear Selection button for "Job" should be displayed
    Then  User clicks on Clear Selection button of "Job"
    Then User clicks on "Select Job"
    And User selects "Auto Job 01"


    And User clicks on "Select Cost Code"
    Then "Select Cost Code" popup should be displayed
    And "Change to List View" button with title should be displayed
    And Close button for "Select Cost Code" popup should be displayed
    And "No Selected Items to Clear" button with title should be displayed
    And SearchTextBox on popup should be displayed
    And Status dropdown for "Active Cost Codes" should be displayed with below options
      |Active Cost Codes|
      |Inactive Cost Codes|
      |Archived Cost Codes|
      |Unarchived Cost Codes|
    When User enters "Furnishings" characters in Search bar
    Then Selected Value "FURNISHINGS" should be displayed
    And User Clicks on Remove Button
    And  User enters "ABCDE" characters in Search bar
    Then "No Records Found" message should be displayed
    And User Clicks on Remove Button
    When User selects "Project Coordination"
    Then "(#1-041) Project Coordination" should be displayed on Add Coding to Punch popup
    And Clear Selection button for "Job Cost Code" should be displayed
    Then  User clicks on Clear Selection button of "Job Cost Code"
    Then User clicks on "Select Cost Code"
    And User selects "Project Coordination"


    And User clicks on "Select Job Cost Category"
    Then "Select Job Cost Category" popup should be displayed
    And "Change to List View" button with title should be displayed
    And Close button for "Select Job Cost Category" popup should be displayed
    And "No Selected Items to Clear" button with title should be displayed
    And SearchTextBox on popup should be displayed
    And Status dropdown for "Active Job Cost Categories" should be displayed with below options
      |Active Job Cost Categories|
      |Inactive Job Cost Categories|
      |Archived Job Cost Categories|
      |Unarchived Job Cost Categories|
    When User enters "Equipment" characters in Search bar
    Then Selected Value "Equipment" should be displayed
    And User Clicks on Remove Button
    And  User enters "ABCDE" characters in Search bar
    Then "No Records Found" message should be displayed
    And User Clicks on Remove Button
    When User selects "Equipment"
    Then "(#E) Equipment" should be displayed on Add Coding to Punch popup
    And Clear Selection button for "Job Cost Category" should be displayed
    Then User clicks on Clear Selection button of "Job Cost Category"


    Then  User clicks on Clear Selection button of "Job"


    And User clicks on "Select GL Account"
    Then "Select GL Account" popup should be displayed
    And "Change to List View" button with title should be displayed
    And Close button for "Select GL Account" popup should be displayed
    And "No Selected Items to Clear" button with title should be displayed
    And SearchTextBox on popup should be displayed
    And Status dropdown for "Active GL Accounts" should be displayed with below options
      |Active GL Accounts|
      |Inactive GL Accounts|
      |Archived GL Accounts|
      |Unarchived GL Accounts|
    When User enters "Automation" characters in Search bar
    Then Selected Value "Automation Account" should be displayed
    And User Clicks on Remove Button
    And  User enters "ABCDE" characters in Search bar
    Then "No Records Found" message should be displayed
    And User Clicks on Remove Button
    When User selects "Automation Account"
    Then "(##10-1002) Automation Account" should be displayed on Add Coding to Punch popup
    And "Select Job" should be disable
    And "Select Job Cost" should be disable
    And "Select Job Cost Category" should be disable
    And Clear Selection button for "GL Account" should be displayed
    Then User clicks on Clear Selection button of "GL Account"


    And User clicks on "Select Department"
    Then "Select Department" popup should be displayed
    And "Change to List View" button with title should be displayed
    And Close button for "Select Department" popup should be displayed
    And "No Selected Items to Clear" button with title should be displayed
    And SearchTextBox on popup should be displayed
    And Status dropdown for "Active Departments" should be displayed with below options
      |Active Departments|
      |Inactive Departments|
      |Archived Departments|
      |Unarchived Departments|
    When User enters "Executive" characters in Search bar
    Then Selected Value "Executive" should be displayed
    And User Clicks on Remove Button
    And  User enters "ABCDE" characters in Search bar
    Then "No Records Found" message should be displayed
    And User Clicks on Remove Button
    When User selects "Executive"
    Then "(#1) Executive" should be displayed on Add Coding to Punch popup
    And Clear Selection button for "Department" should be displayed
    Then User clicks on Clear Selection button of "Department"
    
    And User clicks on "Select Certified Class"
    Then "Select Certified Class" popup should be displayed
    And "Change to List View" button with title should be displayed
    And Close button for "Select Certified Class" popup should be displayed
    And "No Selected Items to Clear" button with title should be displayed
    And SearchTextBox on popup should be displayed
    And Status dropdown for "Active Certified Classes" should be displayed with below options
      |Active Certified Classes|
      |Inactive Certified Classes|
      |Archived Certified Classes|
      |Unarchived Certified Classes|
    When User enters "Drywall" characters in Search bar
    Then Selected Value "Drywall" should be displayed
    And User Clicks on Remove Button
    And  User enters "ABCDE" characters in Search bar
    Then "No Records Found" message should be displayed
    And User Clicks on Remove Button
    When User selects "Drywall"
    Then "(#DW) Drywall" should be displayed on Add Coding to Punch popup
    And Clear Selection button for "Certified Class" should be displayed
    Then User clicks on Clear Selection button of "Certified Class"

    And User clicks on "Select Union"
    Then "Select Union" popup should be displayed
    And "Change to List View" button with title should be displayed
    And Close button for "Select Union" popup should be displayed
    And "No Selected Items to Clear" button with title should be displayed
    And SearchTextBox on popup should be displayed
    And Status dropdown for "Active Unions" should be displayed with below options
      |Active Unions|
      |Inactive Unions|
      |Archived Unions|
      |Unarchived Unions|
    When User enters "Ironworkers" characters in Search bar
    Then Selected Value "Ironworkers" should be displayed
    And User Clicks on Remove Button
    And  User enters "ABCDE" characters in Search bar
    Then "No Records Found" message should be displayed
    And User Clicks on Remove Button
    When User selects "Ironworkers"
    Then "(#IRON) Ironworkers" should be displayed on Add Coding to Punch popup
    And "Select Union Local" should be Enable
    And "Select Union Class" should be Enable
    And Clear Selection button for "Union" should be displayed
    Then User clicks on Clear Selection button of "Union"
    And User clicks on "Select Union"
    And User selects "Ironworkers"

    And User clicks on "Select Union Local"
    Then "Select Union Local" popup should be displayed
    And "Change to List View" button with title should be displayed
    And Close button for "Select Union Local" popup should be displayed
    And "No Selected Items to Clear" button with title should be displayed
    And SearchTextBox on popup should be displayed
    And Status dropdown for "Active Union Locals" should be displayed with below options
      |Active Union Locals|
      |Inactive Union Locals|
      |Archived Union Locals|
      |Unarchived Union Locals|
    When User enters "Local 29" characters in Search bar
    Then Selected Value "Local 29" should be displayed
    And User Clicks on Remove Button
    And  User enters "ABCDE" characters in Search bar
    Then "No Records Found" message should be displayed
    And User Clicks on Remove Button
    When User selects "Local 29"
    Then "(#29) Local 29" should be displayed on Add Coding to Punch popup
    And Clear Selection button for "Union Local" should be displayed
    Then User clicks on Clear Selection button of "Union Local"

    And User clicks on "Select Union Class"
    Then "Select Union Classes" popup should be displayed
    And "Change to List View" button with title should be displayed
    And Close button for "Select Union Class" popup should be displayed
    And "No Selected Items to Clear" button with title should be displayed
    And SearchTextBox on popup should be displayed
    And Status dropdown for "Active Union Classes" should be displayed with below options
      |Active Union Classes|
      |Inactive Union Classes|
      |Archived Union Classes|
      |Unarchived Union Classes|
    When User enters "Journeyman" characters in Search bar
    Then Selected Value "Journeyman" should be displayed
    And User Clicks on Remove Button
    And  User enters "ABCDE" characters in Search bar
    Then "No Records Found" message should be displayed
    And User Clicks on Remove Button
    When User selects "Journeyman"
    Then "(#J) Journeyman" should be displayed on Add Coding to Punch popup
    And Clear Selection button for "Union Class" should be displayed
    Then User clicks on Clear Selection button of "Union Class"

    Then User clicks on "Clear Coding" button

    Then User clicks on "Select Pay Type"
    And User selects "Salary Pay"
    Then User clicks on "Select Job"
    And User selects "Auto Job 01"
    And "Select GL Account" should be disable
    And "Select Department" should be disable

    Then User clicks on "Clear Coding" button

    Then User clicks on "Select Pay Type"
    And User selects "Salary Pay"
    Then User clicks on "Select GL Account"
    And User selects "Automation Account"
    Then User clicks on "Select Department"
    And User selects "Executive"
    Then "Select Job" should be disable
    And "Select Job Cost" should be disable
    And "Select Job Cost Category" should be disable

    Then User clicks on "Clear Coding" button
    When User clicks on Submit Coding button
    Then "Pay Type is required" message should displayed on UI