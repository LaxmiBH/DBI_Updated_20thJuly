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


public class RemotePayrollPageNewSteps {

    private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
    private HomePage homePage = new HomePage(DriverFactory.getDriver());
    private RemotePayrollPage remotePayroll = new RemotePayrollPage(DriverFactory.getDriver());
    private ConfigReader configReader = new ConfigReader();
    Properties prop;

    @And("Break type dropdown for {string} should be displayed with below options")
    public void breakTypeDropdownForShouldBeDisplayedWithBelowOptions(String name, DataTable table)
    {
        List<String> expectedOptions = table.asList();
        System.out.println("Expected options are : - " + expectedOptions);
        List<String> actualOptions = remotePayroll.verifyStatusDropdownValuesOnPopup(name);
        System.out.println("Actual options are : - " + actualOptions);
        Assert.assertEquals("Expected values and actual values don't match", expectedOptions, actualOptions);
    }

    @And("User clicks {string} button on Remote Payroll Settings")
    public void userClicksButtonOnRemotePayrollSettings(String btn)
    {
        remotePayroll.clickOnButton(btn);
    }

    @And("{string} button with title should be displayed on Manage Punch Clock Breaks")
    public void buttonWithTitleShouldBeDisplayedOnManagePunchClockBreaks(String buttonName) {
        Assert.assertTrue(remotePayroll.verifyButtonDisplayedWithTitle(buttonName));
    }

    @And("SearchTextBox on Manage Punch Clock Breaks popup should be displayed")
    public void searchtextboxOnManagePunchClockBreaksPopupShouldBeDisplayed()
    {
        Assert.assertTrue(remotePayroll.verifySearchTextBox());
    }

    @And("{string} label should be displayed")
    public void labelShouldBeDisplayed(String label)
    {
        Assert.assertTrue(remotePayroll.verifyLabel(label));
    }


    @When("User Scroll down popup upto Create New Break button")
    public void userScrollDownPopupUptoCreateNewBreakButton()
    {
        remotePayroll.scrollDown();
    }

    @When("User Scroll up popup upto Break Type")
    public void userScrollUpPopupUptoBreakType()
    {
        remotePayroll.scrollUp();
    }

    @And("TextBox for {string} should be displayed")
    public void textboxForShouldBeDisplayed(String label)
    {
        Assert.assertTrue(remotePayroll.verifyTextBox(label));
    }


    @And("CheckBox for {string} should be displayed")
    public void checkboxForShouldBeDisplayed(String label)
    {
        Assert.assertTrue(remotePayroll.verifyCheckBox(label));
    }

    @And("TimezoneBox for {string} should be displayed")
    public void timezoneboxForShouldBeDisplayed(String label)
    {
        Assert.assertTrue(remotePayroll.verifyTimezoneBox(label));
    }

    @And("Dropdown Values for {string} should be displayed")
    public void dropdownValuesForShouldBeDisplayed(String name, DataTable table)
    {
        List<String> expectedOptions = table.asList();
        System.out.println("Expected options are : - " + expectedOptions);
        List<String> actualOptions = remotePayroll.verifyDropdownValues(name);
        System.out.println("Actual options are : - " + actualOptions);
        Assert.assertEquals("Expected values and actual values don't match", expectedOptions, actualOptions);

    }

    @And("In {string} textbox User Enter {string}")
    public void inTextboxUserEnter(String label, String text)
    {
        remotePayroll.entertextinTextbox(label,text);
    }

    @And("In Duration User Enter {string} as {string}")
    public void inDurationUserEnterAs(String hrMin, String digit)
    {
        remotePayroll.enterDuration(hrMin,digit);
    }

    @And("In MaxDuration User Enter {string} as {string}")
    public void inMaxDurationUserEnterAs(String hrMin, String digit)
    {
        remotePayroll.enterMaxDuration(hrMin,digit);
    }


    @And("User clicks {string} dropdown on Add a Punch Clock Shift-Break")
    public void userClicksDropdownOnAddAPunchClockShiftBreak(String label)
    {
        remotePayroll.userClicksOnDropdown(label);
    }

    @And("User clicks {string} dropdown on Manage Punch Clock Breaks")
    public void userClicksDropdownOnManagePunchClockBreaks(String label)
    {
        remotePayroll.userClicksOnDropdown(label);
    }

    @And("Select {string} from Punch Rounding dropdown")
    public void selectFromPunchRoundingDropdown(String val)
    {
        remotePayroll.selectPunchRoundingDropdownValues(val);
    }

    @And("User clicks {string} checkbox")
    public void userClicksCheckbox(String chkbox)
    {
        remotePayroll.clickOnCheckBox(chkbox);
    }


    @Then("{string} message should displayed")
    public void messageShouldDisplayed(String mesg)
    {
        Assert.assertTrue(remotePayroll.verifyMessage(mesg));
    }


    @And("Select {string} from Type dropdown")
    public void selectFromTypeDropdown(String val)
    {
        remotePayroll.selectTypeDropdownValues(val);
    }

    @And("Select {string} from Break Type dropdown")
    public void selectFromBreakTypeDropdown(String val)
    {
        remotePayroll.selectBreakTypeDropdownValues(val);
    }


    @And("User clear {string} textbox")
    public void userClearTextbox(String txtboxName)
    {
        remotePayroll.clearTextbox(txtboxName);
    }

    @When("User enters {string} in Search bar")
    public void userEntersInSearchBar(String enterText) {
        remotePayroll.enterTextInSearchBoxOnRemotePayrollPage(enterText);
    }

    @Then("User Move Cursor on the Break {string}")
    public void userMoveCursorOnTheBreak(String breakName)
    {
        remotePayroll.moveCursorOnBreak(breakName);
    }

    @And("Verify the {string} button should be dispalyed")
    public void verifyTheButtonShouldBeDispalyed(String buttonName)
    {
        Assert.assertTrue(remotePayroll.verifyButtonDisplayedWithTitle(buttonName));
    }

    @Then("{string} break should be displayed")
    public void breakShouldBeDisplayed(String breakName)
    {
        Assert.assertTrue(remotePayroll.verifyBreakName(breakName));

    }

    @When("User clicks on {string} button on Manage Punch Clock Breaks")
    public void userClicksOnButtonOnManagePunchClockBreaks(String buttonName) throws Exception {
        remotePayroll.clickButtonWithTitle(buttonName);
    }

    @Then("Popup of {string} should be displayed")
    public void popupOfShouldBeDisplayed(String expectedTitle) {
        String actualTitle = remotePayroll.verifyPopupTitle(expectedTitle);
        Assert.assertEquals(expectedTitle, actualTitle);
    }

    @And("Close button of {string} popup should be displayed")
    public void closeButtonForShouldBeDisplayed(String popup) {

        remotePayroll.verifyClosebuttonOnpopUp(popup);
    }

    @And("User click on Remove Button")
    public void userClicksOnRemoveButton()
    {
        remotePayroll.clickOnRemoveButton();
    }

    @And("AM for {string} should be displayed")
    public void amForShouldBeDisplayed(String labelName)
    {
        Assert.assertTrue(remotePayroll.verifyAM(labelName));
    }

    @And("PM for {string} should be displayed")
    public void pmForShouldBeDisplayed(String labelName)
    {
        Assert.assertTrue(remotePayroll.verifyPM(labelName));
    }

    @And("{string} button should be displayed on popup")
    public void buttonShouldBeDisplayedOnPopup(String buttonName)
    {
        Assert.assertTrue(remotePayroll.verifyButton(buttonName));
    }

    @Then("Delete the {string} break from Manage Punch Clock Breaks")
    public void deleteTheBreakFromManagePunchClockBreaks(String breakName)
    {
        remotePayroll.deletePunchShiftBreak(breakName);
    }

    @And("Click {string} button on popup")
    public void clickButtonOnPopup(String buttonName)
    {
        remotePayroll.clickBtnOnPopup(buttonName);
    }

    @And("User selects PM for {string}")
    public void userSelectsPMOf(String labelName)
    {
        remotePayroll.clickOnTimePM(labelName);
    }

    @And("User selects AM for {string}")
    public void userSelectsAMOf(String labelName)
    {
        remotePayroll.clickOnTimeAM(labelName);
    }

}
