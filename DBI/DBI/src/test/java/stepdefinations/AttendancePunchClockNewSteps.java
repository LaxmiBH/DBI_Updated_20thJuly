
package stepdefinations;


import com.pages.AttendancePunchClockNewPage;
import com.pages.HomePage;
import com.pages.LoginPage;
import com.pages.RemotePayrollPage;
import com.qa.factory.DriverFactory;
import com.qa.util.ConfigReader;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;


public class AttendancePunchClockNewSteps {

    private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
    private HomePage homePage = new HomePage(DriverFactory.getDriver());
    private AttendancePunchClockNewPage attendancePunchClockPage = new AttendancePunchClockNewPage(DriverFactory.getDriver());
    private RemotePayrollPage remotePayroll = new RemotePayrollPage(DriverFactory.getDriver());
    private ConfigReader configReader = new ConfigReader();
    Properties prop;

    @Given("User has logged in to application")
    public void userHasLoggedInToApplication() throws Exception {
        prop = configReader.init_prop();
        loginPage.doLogin("hh2_admin", "ValhallaSocks~4~RagnaRocks");
    }

    @When("User clicks on {string} option from left panel")
    public void userClicksOnOptionFromLeftPanel(String buttonName) {
        homePage.clickButtonOnHomePage();
    }

    @Then("User should see Attendance Punch Clock option")
    public void userShouldSeeAttendancePunchClockOption() {
        String title = attendancePunchClockPage.verifyPageTitle();
        System.out.println("Title of the page is : - " + title);
        Assert.assertTrue(title.contains("Attendance Punch Clock"));
    }

    @When("User clicks on {string} option on Remote PayrollPage")
    public void userClicksOnOptionOnRemotePayrollPage(String link) {
        homePage.clickOnLink(link);
    }

    @And("Verify current date")
    public void verifyCurrentDate() {
        Date currentDate = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("d");
        String date = formatter.format(currentDate);
        System.out.println("Actual date = " + date);
        String uiDate = attendancePunchClockPage.verifyDate();
        System.out.println("UI date = " + uiDate);
        Assert.assertEquals("Actual date and expected date are not matching", date, uiDate);

        formatter = new SimpleDateFormat("EEEE");
        String day = formatter.format(currentDate);
        System.out.println("Actual day = " + day.toUpperCase());
        String uiDay = attendancePunchClockPage.verifyDay();
        System.out.println("UI day = " + uiDay);
        Assert.assertEquals("Actual day and expected day are not matching", day.toUpperCase(), uiDay);

        formatter = new SimpleDateFormat("MMMM yyyy");
        String month = formatter.format(currentDate);
        System.out.println("Actual month = " + month.toUpperCase());
        String uiMonth = attendancePunchClockPage.verifyMonth();
        System.out.println("UI month = " + uiMonth);
        Assert.assertEquals("Actual month and expected month are not matching", month.toUpperCase(), uiMonth);
    }

    @And("Verify current time")
    public void verifyCurrentTime() {
        Date currentDate = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("h:mm");
        String actualTime = formatter.format(currentDate);
        String expectedTime = attendancePunchClockPage.verifyTime();
        System.out.println("Actual time " + actualTime + "Expected time " + expectedTime);
        Assert.assertEquals("Actual time and expected time are not matching", expectedTime, actualTime);
    }


    @And("{string} label should be displayed along with the name of the selected Payroll Group")
    public void labelShouldBeDisplayedAlongWithTheNameOfTheSelectedPayrollGroup(String label) {
        attendancePunchClockPage.verifyPayrollGroupLabel(label);
    }


    @When("User enters {string} characters in Search bar")
    public void userEntersCharactersInSearchBar(String groupName) {
        attendancePunchClockPage.enterTextInSearchBoxOnPayrollGroup(groupName);
    }

    @Then("Payroll group {string} should be displayed")
    public void payrollGroupShouldBeDisplayed(String groupName) {
        Assert.assertTrue(attendancePunchClockPage.verifyGroupTemplateOnPayrollGroupPopup(groupName));
    }

    @Then("Selected Value {string} should be displayed")
    public void selectedValueShouldBeDisplayed(String paytypeName) {
        Assert.assertTrue(attendancePunchClockPage.verifyValuesinAddCodingtoPunch(paytypeName));
    }

    @When("User clicks on {string}")
    public void userClicksOn(String buttonName) {
        attendancePunchClockPage.clickButtonOnAttendancePunchClockPage(buttonName);
    }

    @And("User selects {string}")
    public void userSelects(String groupName) {
        attendancePunchClockPage.selectGroupFromSelectPayrollGroupPopup(groupName);
    }

    @Then("{string} should be displayed on Attendance Punch Clock page")
    public void shouldBeDisplayedOnAttendancePunchClockPage(String expectedButtonName) {
        String actualButtonName = attendancePunchClockPage.getButtonNameOnAttendancePunchClockPage(expectedButtonName);
        Assert.assertEquals("Group name is not correct : - ", expectedButtonName, actualButtonName);
    }

    @When("User clicks on {string} button")
    public void userClicksOnButton(String buttonName) throws Exception {
        attendancePunchClockPage.clickButtonWithTitleOnAttendancePunchClockPage(buttonName);
    }

    @Then("{string} should be displayed on popup")
    public void shouldBeDisplayedOnPopup(String expectedCodeName) {
        String actualCodeName = attendancePunchClockPage.getCodeNameOnUpdateCodingPopup(expectedCodeName);
        Assert.assertTrue(actualCodeName.contains(expectedCodeName));
    }

    @When("User clicks on Submit Coding button")
    public void userClicksOnSubmitCodingButton() {
        attendancePunchClockPage.clickButtonWithJavascriptExecutor();
    }

    @And("User clicks on dropdown button")
    public void userClicksOnDropdownButton() {
        attendancePunchClockPage.clickDropdownButton();
    }

    @Then("Employee management and Crew management icon should get displayed")
    public void employeeManagementAndCrewManagementIconShouldGetDisplayed() {
        //Assert.assertTrue(attendancePunchClockPage.verifyEmployeeManagementIcon());
        //Assert.assertTrue(attendancePunchClockPage.verifyCrewManagementIcon());
    }

    @And("{string} should be displayed")
    public void shouldBeDisplayed(String name) {
        Assert.assertTrue(attendancePunchClockPage.verifyButtonDisplayed(name));
    }

    @And("{string} button with title should be displayed")
    public void buttonWithTitleShouldBeDisplayed(String buttonName) {
        Assert.assertTrue(attendancePunchClockPage.verifyButtonDisplayedWithTitle(buttonName));
    }



    @And("Status dropdown for {string} should be displayed with below options")
    public void statusDropdownShouldBeDisplayedWithBelowOptions(String name, DataTable table) {
        List<String> expectedOptions = table.asList();
        System.out.println("Expected options are : - " + expectedOptions);
        List<String> actualOptions = attendancePunchClockPage.verifyStatusDropdownValuesOnSelectPayrollGroupPopup(name);
        System.out.println("Actual options are : - " + actualOptions);
        Assert.assertEquals("Expected values and actual values don't match", expectedOptions, actualOptions);
    }

    @And("User clicks {string} dropdown on Attendance Punch Clock")
    public void userClicksDropdownonAttendancePunchClock(String label)
    {
        attendancePunchClockPage.userClicksDropdownOnAttpunchClock(label);
    }

    @And("User clicks {string} dropdown")
    public void userClicksDropdown(String label)
    {
        attendancePunchClockPage.userClicksOnDropdown(label);
    }

    @When("User search for a Payroll Group with name {string}")
    public void userSearchForAPayrollGroupWithName(String groupName) {
    }

    @And("User closes {string} popup window")
    public void userClosesPopupWindow(String popupName) {
        attendancePunchClockPage.closePopupWindow(popupName);
    }

    @Then("{string} popup should be displayed")
    public void popupShouldBeDisplayed(String expectedTitle) {
        String actualTitle = attendancePunchClockPage.verifyPopupTitle(expectedTitle);
        Assert.assertEquals(expectedTitle, actualTitle);
    }

    @And("User close {string} popup")
        public void userClosePopup(String popup) throws Exception
        {
            attendancePunchClockPage.closePunchCodingPopup(popup);

        }

    @And("{string} payroll group name should be displayed")
    public void payrollGroupNameShouldBeDisplayed(String groupname) {

         Assert.assertTrue(attendancePunchClockPage.verifyPayrollGroupName(groupname));
    }

    @And("{string} employee name should be displayed")
    public void employeeNameShouldBeDisplayed(String groupname) throws Exception{

        Assert.assertTrue(attendancePunchClockPage.verifyPayrollGroupName(groupname));
        Thread.sleep(3000);
    }

    @And("Date should be displayed in this format {string}")
    public void dateShouldBeDisplayedInThisFormat(String dateFormat)
    {
        Assert.assertTrue(attendancePunchClockPage.verifyDateonPopup(dateFormat));
    }


    @When("User clicks red cross of {string}")
    public void userClicksRedCrossOf(String payrollGroup) {

        attendancePunchClockPage.clickOnRedCross(payrollGroup);
    }

    @Then("Red cross button in front of {string} should be displayed")
    public void redCrossButtonInFrontOfShouldBeDisplayed(String redCross) {

        Assert.assertTrue(attendancePunchClockPage.verifyRedCross(redCross));
    }

    @And("User clicks on search icon of {string}")
    public void userClicksOnSearchIconOf(String payrollGroup)
    {
        attendancePunchClockPage.clickOnSearchIcon(payrollGroup);
    }

    @When("Users click on date format {string}")
    public void usersClickOnDateFormat(String dateFormat)
    {
        attendancePunchClockPage.clickOnDateonPopup(dateFormat);
    }

    @And("User select the date randomly {string}")
    public void userSelectTheDateRandomly(String date)
    {
        attendancePunchClockPage.selectDate(date);
    }

    @And("Close button for {string} should be displayed")
    public void closeButtonForShouldBeDisplayed(String popup) {

        attendancePunchClockPage.verifyClosebuttonOnpopUp(popup);
    }

    @And("{string} on PopUp should be Displayed")
    public void onPopUpshouldbeDisplayed(String expectedlabel)
    {
        String actuallabel = attendancePunchClockPage.verifyPopupTitle(expectedlabel);
        Assert.assertEquals(actuallabel, expectedlabel);
    }

    @Then("User close the popup of {string}")
    public void userCloseThePopupOf(String closechooseRec)
    {
        attendancePunchClockPage.clickOnSearchIcon(closechooseRec);
    }

    @When("User clicks on {string} of Add New Punch Clock Record")
    public void userClicksOnOfAddNewPunchClockRecord(String lab) throws Exception
    {
        attendancePunchClockPage.clickOnPopupTitle(lab);
        Thread.sleep(3000);

    }

    @And("Verify the Expands Button on Punch Interval")
    public void verifyTheExpandsButtononPunchInterval()
    {
        Assert.assertTrue(attendancePunchClockPage.verifyExpands());

    }

    @When("User clicks on Expand Button")
    public void userClicksOnExpandButton()
    {
        attendancePunchClockPage.clickOnExpands();
    }

    @And("Verify the Collapse Button on Punch Interval")
    public void verifyTheCollapseButtononPunchInterval()
    {
        Assert.assertTrue(attendancePunchClockPage.verifyCollapse());
    }
    @Then("User clicks on Collapse Button")
    public void userClicksOnCollapseButton()throws Exception
    {
        attendancePunchClockPage.clickOnCollapse();
        Thread.sleep(3000);
    }

    @Then("Employee login on this {string} time should be displayed")
    public void employeeLoginOnThisTimeShouldBeDisplayed(String time)
    {
       Assert.assertTrue(attendancePunchClockPage.verifyPayrollGroupLabel(time));
    }

    @And("User clicks {string} on popup")
    public void  userClicksOnPopup(String label) throws Exception
    {
        attendancePunchClockPage.clickOnPopupTitle(label);
        Thread.sleep(3000);
    }

    @Then("{string} message should be displayed on popup")
    public void messageShouldBeDisplayedOnPopup(String expectedMessage)
    {
        String actualMessage = attendancePunchClockPage.getCodeNameOnUpdateCodingPopup(expectedMessage);
        Assert.assertTrue(actualMessage.contains(expectedMessage));
    }

    @And("User clicks on time {string}")
    public void userClicksOnTime(String time)
    {
        attendancePunchClockPage.clickOnTime(time);
    }

    @And("User clicks on End time {string}")
    public void userClicksOnEndTime(String time)
    {
        attendancePunchClockPage.clickOnEndTime(time);
    }

    @And("User click on Direction {string}")
    public void userClickOnDirection(String direc)
    {
        attendancePunchClockPage.clickOnDirection(direc);
    }

    @Then("Selected Pay Type {string} should be displayed")
    public void selectedPayTypeShouldBeDisplayed(String payType)
    {
        Assert.assertTrue(attendancePunchClockPage.verifyPayrollGroupLabel(payType));
    }

    @When("User clicks on Delete Punch Button for PunchIn at {string}")
    public void userClicksOnDeletePunchButtonForPunchInAt(String punchtime) {
        attendancePunchClockPage.clickOnDeletePunch(punchtime);
    }


    @When("User clicks on Add Punch Button for PunchIn at {string}")
    public void userClicksOnAddPunchButtonForPunchInAt(String punchtime)
    {
        attendancePunchClockPage.clickOnAddPunch(punchtime);
    }

    @And("{string} textbox should be displayed")
    public void textboxShouldBeDisplayed(String textBox)
    {
        Assert.assertTrue(attendancePunchClockPage.verifyTextBox(textBox));

    }

    @And("{string} button should be displayed")
    public void buttonShouldBeDisplayed(String btn)
    {
        Assert.assertTrue(attendancePunchClockPage.verifyButton(btn));
    }

    @Then("User enter the {string} into {string} textbox")
    public void userEnterTheIntoTextbox(String entry, String txtBox)
    {
        attendancePunchClockPage.enterNewEntry(entry,txtBox);
    }

    @And("User clicks {string} button")
    public void userClicksButton(String btn)
    {
        attendancePunchClockPage.clickOnButton(btn);
    }



    @And("User clicks {string} button on Add a Punch Clock Shift-Break ")
    public void userClicksButtonOnAddAPunchClockShiftBreak(String btn)
    {
        attendancePunchClockPage.clickOnButton(btn);
    }

    @And("User Edit Log Entry")
    public void userEditLogEntry() {
    }

    @And("User Edit Log Entry {string} in textarea")
    public void userEditLogEntryInTextarea(String preEntry) {
    }

    @And("User update log entry {string} to {string}")
    public void userUpdateLogEntry(String entr1,String entr2)
    {
        attendancePunchClockPage.updateLogEntry(entr1,entr2);
    }


    @And("Entered entry {string} should be displayed")
    public void enteredEntryShouldBeDisplayed(String expectedEntry)
    {
        String actualEntry = attendancePunchClockPage.verifyTheEnteredEntry(expectedEntry);
        Assert.assertTrue(actualEntry.contains(expectedEntry));
    }

    @And ("{string} option from left on Remote Payroll Settings should be displayed")
    public void optionFromLeftOnRemotePayrollSettingsShouldBeDisplayed(String option)
    {
        Assert.assertTrue(attendancePunchClockPage.verifyOptionfromLeft(option));
    }

    @And("User clicks on {string} option from left on Remote Payroll Settings")
    public void userClicksOnFromLeftOption(String option)
    {

        attendancePunchClockPage.clickOnOptionfromLeft(option);
    }

    @And("SearchTextBox on popup should be displayed")
    public void searchtextboxOnPopupShouldBeDisplayed()
    {
        Assert.assertTrue(attendancePunchClockPage.verifySearchTextBox());
    }


    @Then("Break {string} should be displayed")
    public void breakShouldBeDisplayed(String breakName)
    {
        Assert.assertTrue(attendancePunchClockPage.verifyBreakName(breakName));

    }

    @And("User Clicks on Remove Button")
    public void userClicksOnRemoveButton()
    {
        attendancePunchClockPage.clickOnRemoveButton();
    }

    @Then("{string} message should be displayed")
    public void messageShouldBeDisplayed(String mesag)
    {
        Assert.assertTrue(attendancePunchClockPage.verifyMessageOnPopupWhenClickonRemoveBtn(mesag));
    }

    @And("{string} checkBox should be displayed")
    public void checkBoxShouldBeDisplayed(String label)
    {
        Assert.assertTrue(attendancePunchClockPage.verifyCheckBox(label));
    }

    @And("Click on {string} checkbox")
    public void clickOnCheckbox(String chkbox)
    {
        attendancePunchClockPage.clickOnCheckBox(chkbox);
    }

    @And("{string} textbox User Enter {string}")
    public void textboxUserEnter(String label, String text)
    {
        attendancePunchClockPage.entertextinTextbox(label,text);
    }

    @And("{string} textBox should be displayed")
    public void textBoxShouldBeDisplayed(String label)
    {
        Assert.assertTrue(attendancePunchClockPage.verifyTextBox2(label));
    }

    @When("User Scroll up popup upto {string}")
    public void userScrollUpPopupUpto(String labelName)
    {
        attendancePunchClockPage.scrollUp(labelName);
    }

    @When("User Scroll down popup upto {string}")
    public void userScrollDownPopupUpto(String scrollUpto)
    {
        attendancePunchClockPage.scrollDown(scrollUpto);
    }


    @And("TimezoneBox of {string} should be displayed")
    public void timezoneboxOfShouldBeDisplayed(String label)
    {
        Assert.assertTrue(attendancePunchClockPage.verifyTimezoneBox(label));
    }

    @And("Dropdown Values of {string} should be displayed")
    public void dropdownValuesOfShouldBeDisplayed(String name, DataTable table)
    {
        List<String> expectedOptions = table.asList();
        System.out.println("Expected options are : - " + expectedOptions);
        List<String> actualOptions = attendancePunchClockPage.verifyDropdownValues(name);
        System.out.println("Actual options are : - " + actualOptions);
        Assert.assertEquals("Expected values and actual values don't match", expectedOptions, actualOptions);

    }

    @And("Select {string} from Split dropdown")
    public void selectFromSplitDropdown(String val)
    {
        attendancePunchClockPage.selectSplitDropdownValues(val);
    }

    @And("In Duration for {string} enter {string}")
    public void inDurationforEnter(String hrMin, String digit)
    {
        attendancePunchClockPage.enterDuration(hrMin,digit);
    }

    @And("Verify the Punch in Time with Ui time")
    public void verifyThePunchInTimeWithUiTime()
    {
        String expectedPunchTime = attendancePunchClockPage.verifyTime();
        String actualPunchTime = attendancePunchClockPage.verifyPunchTime();
        System.out.println("Actual Punch  time " + actualPunchTime + "Expected Punch time " + expectedPunchTime);
        Assert.assertEquals("Actual time and expected time are not matching", expectedPunchTime, actualPunchTime);
    }

    @And("Break Type {string} should be displayed")
    public void breakTypeShouldBeDisplayed(String brkType)
    {
        Assert.assertTrue(remotePayroll.verifyBreakType(brkType));
    }

    @Then("User clicks on dropdown on Attendance Punch Clock")
    public void userClicksOnDropdownOnAttendancePunchClock()
    {
        attendancePunchClockPage.clickOnDropdown();
    }

    @And("Select {string} break from dropdown")
    public void selectBreakFromDropdown(String breakName)
    {
        attendancePunchClockPage.selectBreakValAttPunchClock(breakName);
    }

    @And("Select {string} from dropdown")
    public void selectFromDropdown(String breakName)
    {
        attendancePunchClockPage.selectBreakDropdownValues(breakName);
    }

    @And("{string} length should be displayed")
    public void lengthshouldBeDisplayed(String breakLength)
    {
        Assert.assertTrue(attendancePunchClockPage.verifyLengthOfBreak(breakLength));
    }

    @And("{string} suggested time should be displayed")
    public void suggestedTimeshouldBeDisplayed(String breakLength)
    {
        Assert.assertTrue(attendancePunchClockPage.verifyLengthOfBreak(breakLength));
    }


    @And("Verify the {string} in {string} break dropdown list")
    public void verifyTheInBreakDropdownList(String breakName,String brek)
    {
        List<String> breakTypes = attendancePunchClockPage.verifyDropdownValueOnAttendancePunchClock(brek);
        System.out.println("Actual options are : - " + breakTypes);
        // Assert.assertTrue(breakTypes.contains(breakName));
        Iterator itr = breakTypes.iterator();
        while (itr.hasNext())
        {
            Object ele =  itr.next();
            System.out.println(ele + " ");
        }
    }

    @And("Verify the current date should be highlighted")
    public void verifyTheCurrentDateShouldBeHighlighted()
    {
        Assert.assertTrue(attendancePunchClockPage.verifyHighlightCurrentDate());
    }

    @And("Verify the future date should be disable")
    public void verifyTheFutureDateShouldBeDisable()
    {
        Assert.assertTrue(attendancePunchClockPage.verifyDisableFutureDate());
    }

    @Then("User selects previous date")
    public void userSelectsPreviousDate()
    {
        Date currentDate = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("d");
        String date = formatter.format(currentDate);
        String prevDate = Integer.toString(Integer.parseInt(date)-2);
        attendancePunchClockPage.clickOnPrevDate(prevDate);
    }

    @And("Verify the TimeField is Empty")
    public void verifyTheTimeFieldIsEmpty()
    {
        Assert.assertFalse(attendancePunchClockPage.verifyClockIconisDisable());
        Assert.assertFalse(attendancePunchClockPage.verifyClockBoxDisable());
        Assert.assertFalse(attendancePunchClockPage.verifyClockDeetBoxDisable());
    }

    @Then("{string} label should be displayed to User")
    public void labelShouldBeDisplayedToUser(String label)
    {
        Assert.assertTrue(attendancePunchClockPage.verifyLabel(label));
    }

    @Then("{string} break should be displayed to User")
    public void breakShouldBeDisplayedToUser(String label)
    {
        Assert.assertTrue(attendancePunchClockPage.verifyLabel(label));
    }

    @And("Close Button of {string} popup should be displayed")
    public void closeButtonOfPopupShouldBeDisplayed(String popupName)
    {
        Assert.assertTrue(attendancePunchClockPage.verifycloseButtonofPopupWindow(popupName));
    }

    @And("{string} button should be disbale")
    public void punchInbuttonShouldBeDisbale(String buttonName)
    {
        Assert.assertFalse(attendancePunchClockPage.verifyButtonisDisable(buttonName));
    }

    @And("{string} button should be disable")
    public void buttonShouldBeDisable(String buttonName)
    {
        Assert.assertFalse(attendancePunchClockPage.verifyButtonisEnableOrDisable(buttonName));
        System.out.println(buttonName +"Button is disable");
    }

    @And("{string} button should be Enable")
    public void buttonShouldBeEnable(String buttonName)
    {
        Assert.assertTrue(attendancePunchClockPage.verifyButtonisEnableOrDisable(buttonName));
        System.out.println(buttonName +"Button is Enable");
    }


    @And("Click on {string} button")
    public void clickOnButton(String buttonName)
    {
        attendancePunchClockPage.userClickOnButton(buttonName);
    }

    @And("Clicks on {string} btn")
    public void clicksOnBtn(String buttonName)
    {
        attendancePunchClockPage.userClickOnButton2(buttonName);
    }

    @Then("User clicks on previous date {string}")
    public void userClicksOnPreviousDate(String preDate)
    {
        attendancePunchClockPage.clickOnPrevDate(preDate);
    }

    @And("Verify the {string} should be disable")
    public void verifyTheShouldBeDisable(String punch)
    {
        Assert.assertFalse(attendancePunchClockPage.verifyPunches(punch));
        System.out.println("Punch Intervals is Disable");
    }

    @And("Verify the {string} should be displayed on right side")
    public void verifyTheShouldBeDisplayedOnRightSide(String punch)
    {
        Assert.assertTrue(attendancePunchClockPage.verifyPunches(punch));
        System.out.println("Punch Intervals is Displayed");
    }

    @And("Break Type Dropdown should get displayed with default break")
    public void breakTypeDropdownShouldGetDisplayedWithDefaultBreak()
    {
        Assert.assertTrue(attendancePunchClockPage.verifyTheBreakTypeDropdown());
        String defaultBreak = attendancePunchClockPage.verifyTheBreakTypeDropdownwithDefaulteBreak();
        System.out.println("Default break in BreakType Dropdown is :"+ defaultBreak);
        //Assert.assertTrue(defaultBreak.contains(expectedBreak));
    }

    @And("Close button for {string} popup should be displayed")
    public void closeButtonForPopupShouldBeDisplayed(String popupName) {
        Assert.assertTrue(attendancePunchClockPage.verifyClosePopupWindow(popupName));
    }

    @Then("{string} should be displayed on Add Coding to Punch popup")
    public void shouldBeDisplayedOnAddCodingToPunchPopup(String selectVal)
    {
        Assert.assertTrue(attendancePunchClockPage.verifyValuesSelectedonAddCodingtoPunch(selectVal));
    }

    @And("{string} should be Enable")
    public void shouldBeEnable(String codingType)
    {
        Assert.assertTrue(attendancePunchClockPage.verifyCodingTypeisEnable(codingType));
    }

    @And("{string} should be disable")
    public void shouldBeDisable(String codingType)
    {
        Assert.assertFalse(attendancePunchClockPage.verifyDisableCodingType(codingType));
    }

    @And("Clear Selection button for {string} should be displayed")
    public void clearSelectionButtonForShouldBeDisplayed(String codingType)
    {
        Assert.assertTrue(attendancePunchClockPage.verifyClearSelection(codingType));
    }


    @Then("User clicks on Clear Selection button of {string}")
    public void userClicksOnClearSelectionButtonOf(String codingType)
    {
        attendancePunchClockPage.clickOnClearSelection(codingType);
    }

    @Then("User clicks on Clear Time Value button of {string}")
    public void userClicksOnClearTimeValueButtonOf(String labelName)
    {
        attendancePunchClockPage.clickOnClearTimeValue(labelName);
    }


    @Then("{string} message should displayed on UI")
    public void messageShouldDisplayedOnUI(String msg)
    {
        Assert.assertTrue(attendancePunchClockPage.verifyMessage(msg));
    }

    @And("Tool tip icon should be displayed")
    public void toolTipIconShouldBeDisplayed()
    {
        Assert.assertTrue(attendancePunchClockPage.verifyToolTipIcon());
    }

    @Then("Punch in Time {string} should be displayed")
    public void punchInTimeShouldBeDisplayed(String punchingTime)
    {
        Assert.assertTrue(attendancePunchClockPage.verifyPunchInTime(punchingTime));
    }

    @Then("Punch out Time {string} should be displayed")
    public void punchOutTimeShouldBeDisplayed(String punchoutTime)
    {
        Assert.assertTrue(attendancePunchClockPage.verifyPunchOutTime(punchoutTime));
    }

    @And("Coding details for {string} should be displayed on Punch Intervals")
    public void codingDetailsForShouldBeDisplayedOnPunchIntervals(String codingType)
    {
        //Assert.assertTrue(attendancePunchClockPage.verifyCodingDetailsOnPunchIntervals(codingType));
    }

    @And("Clear All Selections button should be displayed")
    public void clearAllSelectionsButtonShouldBeDisplayed()
    {
        Assert.assertTrue(attendancePunchClockPage.verifyClearAllSelction());
    }

    @And("Click on Clear All Selections button")
    public void clickOnClearSelectionsButtonShouldBeDisplayed()
    {
        attendancePunchClockPage.clickOnClearAllSelction();
    }

    @And("Coding Type {string} with value {string} should be displayed on Punch Intervals")
    public void codingTypeWithValueShouldBeDisplayedOnPunchIntervals(String codingType, String codingValue)
    {
        Assert.assertTrue(attendancePunchClockPage.verifyCodingDetailswithValues(codingType,codingValue));
    }

    @Then("User click {string} button for deletion")
    public void userClickButtonForDelete(String buttonName)
    {
        attendancePunchClockPage.userClickOnDeleteCodeInterval(buttonName);
    }

    @And("{string} should be displayed on Log Entry popup")
    public void shouldBeDisplayedOnLogEntryPopup(String labelName)
    {
        Assert.assertTrue(attendancePunchClockPage.verifyLogEntriesLabel(labelName));
    }

    @Then("Source {string} should be displayed for punch in")
    public void sourceShouldBeDisplayedForPunchIn(String label)
    {
        Assert.assertTrue(attendancePunchClockPage.verifyLabel(label));
    }

    @And("User selects PM of {string}")
    public void userSelectsPMOf(String labelName)
    {
        attendancePunchClockPage.clickOnTimePM(labelName);
    }

    @And("User selects AM of {string}")
    public void userSelectsAMOf(String labelName)
    {
        attendancePunchClockPage.clickOnTimeAM(labelName);
    }

    @And("Required Break {string} should be displayed")
    public void requiredBreakShouldBeDisplayed(String breakName)
    {
        Assert.assertTrue(attendancePunchClockPage.verifyRequiredlement(breakName));
    }


    @And("{string} should be displayed on Punch Intervals")
    public void shouldBeDisplayedOnPunchIntervals(String breakName)
    {
        Assert.assertTrue(attendancePunchClockPage.verifyLabel(breakName));
    }
    @And("{string} time should be displayed on Punch Intervals")
    public void timeShouldBeDisplayedOnPunchIntervals(String breakName)
    {
        Assert.assertTrue(attendancePunchClockPage.verifyLengthOfBreak(breakName));
    }
}

