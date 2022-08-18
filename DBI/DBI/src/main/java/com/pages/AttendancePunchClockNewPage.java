package com.pages;

import org.openqa.selenium.*;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AttendancePunchClockNewPage {

    private WebDriver driver;

    public AttendancePunchClockNewPage(WebDriver driver) {
        this.driver = driver;
    }


    private String LABEL_XPATH = "//div[contains(text(),'LABELNAME')]";
    private By Date = By.xpath("//span[contains(@class,'CurrentTimeAndDateBar-Styled__dateBox')]");
    private By Day = By.xpath("//span[contains(@class,'CurrentTimeAndDateBar-Styled__weekdayBox')]");
    private By Month = By.xpath("//span[contains(@class,'CurrentTimeAndDateBar-Styled__monthYearBox')]");
    private By Time = By.xpath("//span[contains(@class,'CurrentTimeAndDateBar-Styled__clockBox')]");
    private By PunchTime = By.xpath("//div[contains(@class,'PunchPane-Styled__punchTime')]");
    private String PunchInTime = "//div[contains(text(),'PUNCHTIME')]";
    private String PunchOutTime = "//div[contains(text(),'PUNCHOUTTIME')]";
    private By SearchTextBox = By.xpath("//input[@placeholder=\"Type a keyword and hit 'Enter' to search\"]");
    private String TitleXpath = "//span[contains(text(),'TITLENAME')]";
    private String ButtonXpath = "//button[contains(text(),'BUTTONNAME')]";
    private String GroupNameXpath = "//button//span[contains(text(),'GROUPNAME')]";
    private String ButtonWithTitleXpath = "//button[@title='BUTTONNAME']";
    private String CodeNameXpath = "//div[contains(text(),'CODENAME')]";
    private By DropdownButton = By.xpath("//button[@title='Edit Punch Clock Records']//following::button");
    private By EmployeeManagementIcon = By.xpath("//i[@title='Employee Management']");
    private By CrewManagementIcon = By.xpath("//i[@title='Crew Management']");
    private String StatusDropdownValuesXpath = "//div//label[contains(text(),'DROPDOWNNAME')]//following::ul/li";
    private String StatusDropdownArrowXpath_1 = "//label[contains(text(),'DROPDOWNNAME')]//following-sibling::div";
    private String ClosePopupWindowXpath = "//span[contains(text(),'POPUPNAME')]//following::button[@aria-label='Close']";
    private String ClosePopupBtn = "//span[contains(text(),'POPUPNAME')]//following::i[contains(@class,'fas fa-times')]";
    private String PayrollGroupName = "//input[@title='GROUPNAME']";
    private String DateOnPopUp = "//input[@placeholder='DATE']";
    private String RedCross = "//input[@title='REDCROSS']//following::button";
    private String SearchIcon = "//span[contains(text(),'PAYROLLGROUP')]//following::button";
    private String SelectDate = "//table//td//span[contains(text(),'DATE')]";
    private By Expand = By.xpath("//i[@class='far fa-angle-down']");
    private By Collapse = By.xpath("//i[@class='far fa-angle-up']");
    private String DeletePunchRecord = "//div[contains(text(),'TIME')]//following::button[@title='Delete Punch Clock Record']";
    private String Message = "//div[contains(text(),'MESSAGE')]";
    private String Direction = "//div[contains(text(),'Direction')]//following::span[contains(text(),'DIRECT')]";

    private String Timing = "//div[contains(text(),'Time')]//following::span[contains(text(),'TIME')]";
    private String PunchDelete = "//div[contains(text(),'PUNCHTIME')]//following::button[@title='Delete Punch Clock Record']";
    private String PunchExpand = "//div[contains(text(),'PUNCHTIME')]//following::i[@class='far fa-angle-down']";
    private String PunchCollapse = "//div[contains(text(),'PUNCHTIME')]//following::i[@class='far fa-angle-up']";
    private String AddPunch = "//div[contains(text(),'PUNCHTIME')]//following::button[@title='Add Punch Clock Record']";
    private String TextBox1 = "//textarea[@placeholder='TEXTBOX']";
    private String Textarea = "//textarea[contains(text(),'ENTRY')]";
    private By removeButton = By.xpath("//input[@placeholder=\"Type a keyword and hit 'Enter' to search\"]//following::button");

    private By DropdownOnAttpunClock = By.xpath("//label[contains(@class,p-dropdown-label)]");
    private By DropdownArrow = By.xpath("//div[contains(@class,'p-dropdown-trigger')]");
    private String BreakValuesOnAttpunClock = "//label[contains(text(),'Start Only#1')]//parent::div//ul/li[@aria-label='BREAK']";
    private String StatusDropdownArrow_2 = "//div[contains(text(),'LABELNAME')]//following-sibling::div";
    private String DropdownValuesXpath = "//div[contains(text(),'LABELNAME')]//parent::div//ul/li";
    private String DropdownValues = "//label[contains(text(),'BREAKNAME')]//parent::div//ul/li";
    private String SelectSplitDropdownValues = "//div[contains(text(),'Split by')]//parent::div//ul/li[contains(text(),'VALUE')]";
    private String SelectBreakDropdownValues = "//label[contains(text(),'Select a Break')]//parent::div//ul/li[@aria-label='BREAK']";
    private String SelectBreakValAttPunchClock = "//span[contains(text(),'*')]//parent::div//ul/li[@aria-label='BREAK']";
    private String LengthOfBreak = "//span[contains(text(),'LENGTH')]";
    private By HighlightCurrentDate = By.xpath("//span[contains(@class,'p-highlight')]");
    private By DisableFutureDate = By.xpath("//span[contains(@class,'p-highlight')]//following::span[contains(@class,'p-disabled')]");
    private String PrevDate = "//span[contains(text(),'PREVDATE')]";
    private By ClockIcon = By.xpath("//span[contains(@class,'CurrentTimeAndDateBar-Styled__clockIcon')]");//following::div[contains(@class,'CurrentTimeAndDateBar-Styled__dateTimeBox')]");
    private By ClockBox = By.xpath("//span[contains(@class,'CurrentTimeAndDateBar-Styled__clockBox')]");
    private By ClockDeetBox = By.xpath("//span[contains(@class,'CurrentTimeAndDateBar-Styled__clockDeetsBox')]");
    private String MsgOnPopup = "//span[contains(text(),'MESSAGE')]";
    private String Button = "//span[contains(text(),'BUTTONNAME')]//parent::button";
    private String Button2 = "//span[contains(text(),'BUTTONNAME')]//following::button";
    private By PuncheIntervals = By.xpath("//div[contains(@class,'PunchesSidebar-Styled__punchesPanel')]");
    private String Punches = "//div[contains(text(),'PUNCHES')]";
    private String PunchCodingType = "//button[contains(text(),'CODINGTYPE')]";
    private String ClearSelection = "//div[contains(text(),'CODINGTYPE')]//following::button[@title='Clear Selection']";
    private By ToolTipIcon =By.xpath("//i[contains(@class,'PunchClockBreaks-Styled__infoIcon')]");
    private String CodingDetails = "//div[@title='CODINGTYPE']";
    private String CodingValues = "//div[contains(text(),'CODINGVALUE')]";
    private By Calender = By.xpath("//span[contains(@class,'p-calendar DatePickerPR')]");
    private String CheckBox = "//div[contains(text(),'LABELNAME')]//following::button";
    private String TextBox2 = "//div[contains(text(),'LABELNAME')]//following::input";
    private String EndTime = "//div[contains(text(),'End time')]//following::span[contains(text(),'TIME')]";
    private String TimezoneBox = "//div[contains(text(),'LABEL')]//following::input[@placeholder='Select a Timezone']";
    private String DurationHrAndMin = "//div[contains(text(),'LABEL')]//following::input";
    private String DeleteCodeInterval = "//div[contains(text(),'INCOMPLETE')]//following::button[@title='BUTTONNAME']";
    private String LogEntriesLabel = "//span[contains(text(),'Punch Clock Log Entries')]//following::div[contains(text(),'LABELNAME')]";
    private String ClearTimeValue = "//div[contains(text(),'LABELNAME')]//following::button[@title='Clear time value']";
    private String AM_Btn = "//div[contains(text(),'LABELNAME')]//following::span[contains(text(),'AM')]";
    private String PM_Btn = "//div[contains(text(),'LABELNAME')]//following::span[contains(text(),'PM')]";
    private String RequiredEle ="//span[contains(@title,'Required')]//parent::div[contains(text(),'REQELEMENT')]";
    private By ClearAllSelections = By.xpath("//button[@title='Clear All Selections']");


    public boolean verifyLabel(String labelName) {
        String xpath = LABEL_XPATH.replace("LABELNAME", labelName);
        return driver.findElement(By.xpath(xpath)).isDisplayed();
    }

    public boolean verifyLogEntriesLabel(String labelName) {
        String xpath = LogEntriesLabel.replace("LABELNAME", labelName);
        return driver.findElement(By.xpath(xpath)).isDisplayed();
    }

    public String verifyPageTitle() {
        return driver.getTitle();
    }

    public String verifyDate() {
        String date = driver.findElement(Date).getText();
        return date;
    }

    public String verifyDay() {
        String day = driver.findElement(Day).getText();
        return day;
    }

    public String verifyMonth() {
        String month = driver.findElement(Month).getText();
        return month;
    }

    public String verifyTime() {
        String time = driver.findElement(Time).getText();
        return time;
    }

    public String verifyPunchTime() {
        String punchTime = driver.findElement(PunchTime).getText();
        return punchTime;
    }

    public boolean verifyPunchInTime(String punchingTime) {
        String xpath = PunchInTime.replace("PUNCHTIME", punchingTime);
        return driver.findElement(By.xpath(xpath)).isDisplayed();
    }
    public boolean verifyPunchOutTime(String punchoutTime) {
        String xpath = PunchOutTime.replace("PUNCHOUTTIME", punchoutTime);
        return driver.findElement(By.xpath(xpath)).isDisplayed();
    }

    public boolean verifyPayrollGroupLabel(String labelName) {
        String xpath = LABEL_XPATH.replace("LABELNAME", labelName);
        return driver.findElement(By.xpath(xpath)).isDisplayed();
    }


    public boolean verifyButtonDisplayed(String labelName) {
        String xpath = ButtonXpath.replace("BUTTONNAME", labelName);
        return driver.findElement(By.xpath(xpath)).isDisplayed();
    }

    public boolean verifyButtonDisplayedWithTitle(String buttonName) {
        String xpath = ButtonWithTitleXpath.replace("BUTTONNAME", buttonName);
        return driver.findElement(By.xpath(xpath)).isDisplayed();
    }

    public boolean verifyClearAllSelction()
    {

        WebElement element = driver.findElement(ClearAllSelections);

        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].scrollIntoView(true);", element);
       /* Actions act = new Actions(driver);
        act.moveToElement(driver.findElement(ClearAllSelections)).perform();*/
        return driver.findElement(ClearAllSelections).isDisplayed();
    }

    public void clickOnClearAllSelction()
    {

        /*WebElement element = driver.findElement(ClearAllSelections);

        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].scrollIntoView(true);", element);
        element.click();*/
        Actions act = new Actions(driver);
        act.moveToElement(driver.findElement(ClearAllSelections)).perform();
        driver.findElement(ClearAllSelections).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public boolean verifyButtonisDisable(String buttonName) {
        String xpath = ButtonWithTitleXpath.replace("BUTTONNAME", buttonName);
        return driver.findElement(By.xpath(xpath)).isEnabled();
    }

    public boolean verifyButtonisEnableOrDisable(String buttonName)
    {
        String xpath = Button.replace("BUTTONNAME", buttonName);
        return driver.findElement(By.xpath(xpath)).isEnabled();
    }

    public boolean verifyButtonisDisplayed(String buttonName)
    {
        String xpath = Button.replace("BUTTONNAME", buttonName);
        return driver.findElement(By.xpath(xpath)).isDisplayed();
    }

    public void userClickOnButton(String buttonName)
    {

        String xpath = Button.replace("BUTTONNAME", buttonName);
        driver.findElement(By.xpath(xpath)).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void userClickOnButton2(String buttonName)
    {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        String xpath = Button2.replace("BUTTONNAME", buttonName);
        driver.findElement(By.xpath(xpath)).click();
    }

    public boolean verifySearchBoxOnPayrollGroup() {

        return driver.findElement(SearchTextBox).isDisplayed();
    }

    public void enterTextInSearchBoxOnPayrollGroup(String text) {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(SearchTextBox).clear();
        driver.findElement(SearchTextBox).sendKeys(text);
        driver.findElement(SearchTextBox).sendKeys(Keys.ENTER);
    }

    public boolean verifyGroupTemplateOnPayrollGroupPopup(String groupName) {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String xpath = GroupNameXpath.replace("GROUPNAME", groupName);
        return driver.findElement(By.xpath(xpath)).isDisplayed();
    }

    public boolean verifyValuesinAddCodingtoPunch(String groupName) {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String xpath = GroupNameXpath.replace("GROUPNAME", groupName);
        return driver.findElement(By.xpath(xpath)).isDisplayed();
    }

    public String verifyPopupTitle(String title) {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        String xpath = TitleXpath.replace("TITLENAME", title);
        return driver.findElement(By.xpath(xpath)).getText();
    }

    public void clickOnPopupTitle(String title) {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String xpath = Button.replace("BUTTONNAME", title);
        driver.findElement(By.xpath(xpath)).click();
    }

    public void clickButtonOnAttendancePunchClockPage(String buttonName) {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String xpath = ButtonXpath.replace("BUTTONNAME", buttonName);

        driver.findElement(By.xpath(xpath)).click();


    }

    public void selectGroupFromSelectPayrollGroupPopup(String groupName) {

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String xpath = GroupNameXpath.replace("GROUPNAME", groupName);
        driver.findElement(By.xpath(xpath)).click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void selectValueforAddCodingtoPunchp(String groupName) {

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String xpath = GroupNameXpath.replace("GROUPNAME", groupName);
        driver.findElement(By.xpath(xpath)).click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public String getButtonNameOnAttendancePunchClockPage(String buttonName) {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String xpath = ButtonXpath.replace("BUTTONNAME", buttonName);
        return driver.findElement(By.xpath(xpath)).getText();
    }

    public void clickButtonWithTitleOnAttendancePunchClockPage(String buttonName) {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String xpath = ButtonWithTitleXpath.replace("BUTTONNAME", buttonName);
        driver.findElement(By.xpath(xpath)).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public String getCodeNameOnUpdateCodingPopup(String codeName) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String xpath = CodeNameXpath.replace("CODENAME", codeName);
        return driver.findElement(By.xpath(xpath)).getText();
    }

    public void clickButtonWithJavascriptExecutor() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement button = driver.findElement(By.xpath("//button//span[contains(text(),'Submit Coding')]"));
        js.executeScript("arguments[0].click();", button);

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void clickDropdownButton() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(DropdownButton).click();
    }

    public boolean verifyEmployeeManagementIcon() {
        return driver.findElement(EmployeeManagementIcon).isDisplayed();
    }

    public boolean verifyCrewManagementIcon() {
        return driver.findElement(CrewManagementIcon).isDisplayed();
    }

    public List verifyStatusDropdownValuesOnSelectPayrollGroupPopup(String name) {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String arrowXpath = StatusDropdownArrowXpath_1.replace("DROPDOWNNAME", name);
        driver.findElement(By.xpath(arrowXpath)).click();

        String valuesXpath = StatusDropdownValuesXpath.replace("DROPDOWNNAME", name);
        List<String> actualValues = new ArrayList<>();
        List<WebElement> values = driver.findElements(By.xpath(valuesXpath));
        for (WebElement allValues : values) {
            actualValues.add(allValues.getText());
        }
        return actualValues;
    }


    public boolean verifycloseButtonofPopupWindow(String popupName) {
        String xpath = ClosePopupWindowXpath.replace("POPUPNAME", popupName);
        return driver.findElement(By.xpath(xpath)).isDisplayed();
    }

    public void closePopupWindow(String popupName) {
        String xpath = ClosePopupWindowXpath.replace("POPUPNAME", popupName);
        driver.findElement(By.xpath(xpath)).click();
    }

    public boolean verifyClosebuttonOnpopUp(String popupName) {
        String xpath = ClosePopupBtn.replace("POPUPNAME", popupName);
        return driver.findElement(By.xpath(xpath)).isDisplayed();
    }

    public void closePunchCodingPopup(String popupName) {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        String xpath = ClosePopupBtn.replace("POPUPNAME", popupName);
        driver.findElement(By.xpath(xpath)).click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public boolean verifyPayrollGroupName(String groupName) {
        String xpath = PayrollGroupName.replace("GROUPNAME", groupName);
        return driver.findElement(By.xpath(xpath)).isDisplayed();
    }

    public boolean verifyDateonPopup(String date) {
        String xpath = DateOnPopUp.replace("DATE", date);
        return driver.findElement(By.xpath(xpath)).isDisplayed();
    }


    public boolean verifyRedCross(String redcross) {
        String xpath = RedCross.replace("REDCROSS", redcross);
        return driver.findElement(By.xpath(xpath)).isDisplayed();
    }

    public void clickOnRedCross(String redcross) {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String xpath = RedCross.replace("REDCROSS", redcross);
        driver.findElement(By.xpath(xpath)).click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public boolean verifyRedCrossOnPopUp(String group) {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String xpath = SearchIcon.replace("PAYROLLGROUP", group);
        return driver.findElement(By.xpath(xpath)).isDisplayed();

    }

    public void clickOnSearchIcon(String group) {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String xpath = SearchIcon.replace("PAYROLLGROUP", group);
        driver.findElement(By.xpath(xpath)).click();

    }

    public void clickOnDateonPopup(String date) {

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public void selectDate(String dateInDigit) {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String xpath = SelectDate.replace("DATE", dateInDigit);
        driver.findElement(By.xpath(xpath)).click();
    }


    public boolean verifyExpands() {
        return driver.findElement(Expand).isDisplayed();
    }

    public void clickOnExpands() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(Expand).click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public boolean verifyCollapse() {
        return driver.findElement(Collapse).isDisplayed();
    }

    public void clickOnCollapse() {
        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(Collapse).click();
    }


    public boolean verifyDirection(String direction) {
        String xpath = Direction.replace("DIRECT", direction);
        return driver.findElement(By.xpath(xpath)).isDisplayed();

    }

    public void clickOnDirection(String direction) {

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String xpath = Direction.replace("DIRECT", direction);
        driver.findElement(By.xpath(xpath)).click();

    }

    public void clickOnTime(String time) {

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String xpath = Timing.replace("TIME", time);
        driver.findElement(By.xpath(xpath)).click();

    }

    public void clickOnEndTime(String time) {

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String xpath = EndTime.replace("TIME", time);
        driver.findElement(By.xpath(xpath)).click();

    }

    public void clickOnDeletePunch(String time) {

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String xpath = PunchDelete.replace("PUNCHTIME", time);
        driver.findElement(By.xpath(xpath)).click();

    }

    public void clickOnAddPunch(String time) {

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String xpath = AddPunch.replace("PUNCHTIME", time);
        driver.findElement(By.xpath(xpath)).click();

    }

    public boolean verifyTextBox(String textbox) {
        String xpath = TextBox1.replace("TEXTBOX", textbox);
        return driver.findElement(By.xpath(xpath)).isDisplayed();
    }

    public boolean verifyButton(String button) {
        String xpath = TitleXpath.replace("TITLENAME", button);
        return driver.findElement(By.xpath(xpath)).isDisplayed();
    }


    public void enterNewEntry(String entry, String textbox) {

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String xpath = TextBox1.replace("TEXTBOX", textbox);
        driver.findElement(By.xpath(xpath)).sendKeys(entry);

    }


    public void clickOnButton(String button) {

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String xpath = Button.replace("BUTTONNAME", button);
        driver.findElement(By.xpath(xpath)).click();

        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public void updateLogEntry(String entry1, String entry2) {

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String xpath = Textarea.replace("ENTRY", entry1);
        driver.findElement(By.xpath(xpath)).clear();
        driver.findElement(By.xpath(xpath)).sendKeys(entry2);

    }

    public String verifyTheEnteredEntry(String entry) {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String xpath = CodeNameXpath.replace("CODENAME", entry);
        return driver.findElement(By.xpath(xpath)).getText();
    }

    public boolean verifyOptionfromLeft(String option) {

        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        String xpath = LABEL_XPATH.replace("LABELNAME", option);
        return driver.findElement(By.xpath(xpath)).isDisplayed();

    }

    public void clickOnOptionfromLeft(String option) {

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        String xpath = LABEL_XPATH.replace("LABELNAME", option);
        driver.findElement(By.xpath(xpath)).click();

    }

    public List verifyBreakDropdownValuesOnManagePunchClockBreak(String name) {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String arrowXpath = StatusDropdownArrowXpath_1.replace("DROPDOWNNAME", name);
        driver.findElement(By.xpath(arrowXpath)).click();

        String valuesXpath = StatusDropdownValuesXpath.replace("DROPDOWNNAME", name);
        List<String> actualValues = new ArrayList<>();
        List<WebElement> values = driver.findElements(By.xpath(valuesXpath));
        for (WebElement allValues : values) {
            actualValues.add(allValues.getText());
        }
        return actualValues;
    }


    public boolean verifySearchTextBox() {
        return driver.findElement(SearchTextBox).isDisplayed();
    }

    public void enterTextInSearchBoxOnManageBreaks(String text) {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(SearchTextBox).clear();
        driver.findElement(SearchTextBox).sendKeys(text);
        driver.findElement(SearchTextBox).sendKeys(Keys.ENTER);
    }

    public boolean verifyBreakName(String breakName) {

        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        String xpath = CodeNameXpath.replace("CODENAME", breakName);
        return driver.findElement(By.xpath(xpath)).isDisplayed();
    }


    public void clickOnRemoveButton() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(removeButton).click();
    }

    public boolean verifyMessageOnPopupWhenClickonRemoveBtn(String msg) {
        String xpath = MsgOnPopup.replace("MESSAGE", msg);
        return driver.findElement(By.xpath(xpath)).isDisplayed();
    }

    public void clickOnDropdown() {

        driver.findElement(DropdownArrow).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public List verifyDropdownValueOnAttendancePunchClock(String brek) {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        String valuesXpath = DropdownValues.replace("BREAKNAME", brek);

        List<String> dropdownValues = new ArrayList<String>();

        List<WebElement> values = driver.findElements(By.xpath(valuesXpath));

        for (WebElement allValues : values) {

            dropdownValues.add(allValues.getText());
        }

        return dropdownValues;
    }

    public void selectBreakValAttPunchClock(String value) {

        String xpath = SelectBreakValAttPunchClock.replace("BREAK", value);
        driver.findElement(By.xpath(xpath)).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void selectBreakDropdownValues(String value) {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String xpath = SelectBreakDropdownValues.replace("BREAK", value);
        driver.findElement(By.xpath(xpath)).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public void selectBreaksOnAttPunchClock(String value) {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String xpath = BreakValuesOnAttpunClock.replace("BREAK", value);
        driver.findElement(By.xpath(xpath)).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public boolean verifyLengthOfBreak(String length) {
        String xpath = LengthOfBreak.replace("LENGTH", length);
        return driver.findElement(By.xpath(xpath)).isDisplayed();
    }

    public boolean verifyHighlightCurrentDate() {
        return driver.findElement(HighlightCurrentDate).isDisplayed();
    }

    public boolean verifyDisableFutureDate() {
        return driver.findElement(DisableFutureDate).isDisplayed();
    }

    public void clickOnPrevDate(String date) {

        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String xpath = PrevDate.replace("PREVDATE", date);
        driver.findElement(By.xpath(xpath)).click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();

        }
    }

    public boolean verifyClockIconisDisable() {
        return driver.findElement(ClockIcon).isDisplayed();
    }

    public boolean verifyClockBoxDisable() {
        return driver.findElement(ClockBox).isDisplayed();
    }

    public boolean verifyClockDeetBoxDisable() {
        return driver.findElement(ClockDeetBox).isDisplayed();
    }


    public boolean verifyPunchIntervalsDisplayoNot() {
        return driver.findElement(PuncheIntervals).isEnabled();
    }

    public boolean verifyPunches(String punch) {
        String xpath = Punches.replace("PUNCHES", punch);
        return driver.findElement(By.xpath(xpath)).isEnabled();
    }


    public boolean verifyTheBreakTypeDropdown() {
        return driver.findElement(DropdownOnAttpunClock).isDisplayed();
    }

    public String verifyTheBreakTypeDropdownwithDefaulteBreak() {

        //String xpath = DropdownOnAttpunClock.replace("BREAKNAME", breakName);
        return driver.findElement(DropdownOnAttpunClock).getText();
    }

    public boolean verifyClosePopupWindow(String popupName) {
        String xpath = ClosePopupWindowXpath.replace("POPUPNAME", popupName);
        return driver.findElement(By.xpath(xpath)).isDisplayed();
    }

    public boolean verifyValuesSelectedonAddCodingtoPunch(String selectValue) {
        String xpath = LABEL_XPATH.replace("LABELNAME", selectValue);
        return driver.findElement(By.xpath(xpath)).isDisplayed();
    }

    public boolean verifyDisableCodingType(String codingType) {
        String xpath = PunchCodingType.replace("CODINGTYPE", codingType);
        return driver.findElement(By.xpath(xpath)).isEnabled();
    }

    public boolean verifyCodingTypeisEnable(String codingType) {
        String xpath = PunchCodingType.replace("CODINGTYPE", codingType);
        return driver.findElement(By.xpath(xpath)).isEnabled();
    }

    public boolean verifyClearSelection(String codingType) {

        String xpath = ClearSelection.replace("CODINGTYPE", codingType);
       return driver.findElement(By.xpath(xpath)).isDisplayed();
    }

    public void clickOnClearSelection(String codingType) {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String xpath = ClearSelection.replace("CODINGTYPE", codingType);
        driver.findElement(By.xpath(xpath)).click();
    }

    public void clickOnClearTimeValue(String labelName) {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String xpath = ClearTimeValue.replace("LABELNAME", labelName);
        driver.findElement(By.xpath(xpath)).click();
    }


    public boolean verifyMessage(String msg) {

        String xpath = Message.replace("MESSAGE", msg);
        return driver.findElement(By.xpath(xpath)).isDisplayed();
    }

    public boolean verifyToolTipIcon() {

        return driver.findElement(ToolTipIcon).isDisplayed();
    }

    public boolean verifyCodingDetailswithValues(String codingType,String codingValues)
    {
        String xpath = CodingDetails.replace("CODINGTYPE", codingType);
        driver.findElement(By.xpath(xpath)).isDisplayed();
        String xpath2 = CodingValues.replace("CODINGVALUE", codingValues);
        return driver.findElement(By.xpath(xpath2)).isDisplayed();
    }

    public boolean verifyCheckBox(String labelName) {
        String xpath = CheckBox.replace("LABELNAME", labelName);
        return driver.findElement(By.xpath(xpath)).isDisplayed();
    }

    public void clickOnCheckBox(String labelName) {
        String xpath = CheckBox.replace("LABELNAME", labelName);
        driver.findElement(By.xpath(xpath)).click();
    }

    public void entertextinTextbox(String labelName,String txt)
    {

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String xpath = TextBox2.replace("LABELNAME", labelName);
        driver.findElement(By.xpath(xpath)).clear();
        driver.findElement(By.xpath(xpath)).sendKeys(txt);


    }

    public boolean verifyTextBox2(String labelName) {

        String xpath = TextBox2.replace("LABELNAME", labelName);
        WebDriverWait wait2 = new WebDriverWait(driver, 15);
        wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));

        return driver.findElement(By.xpath(xpath)).isDisplayed();
    }

    public void scrollDown(String labelName)
    {

        String xpath = Button.replace("BUTTONNAME", labelName);
        WebElement m =  driver.findElement(By.xpath(xpath));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        //This will scroll the web page till end.
        js.executeScript("arguments[0].scrollIntoView(true);", m);;
    }


    public void scrollUp(String labelName)
    {
        String xpath = TitleXpath.replace("TITLENAME", labelName);
        WebElement m = driver.findElement(By.xpath(xpath));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        //This will scroll the web page till end.
        js.executeScript("arguments[0].scrollIntoView(true);", m);
    }

    public boolean verifyTimezoneBox(String labelName) {
        String xpath = TimezoneBox.replace("LABEL", labelName);
        return driver.findElement(By.xpath(xpath)).isDisplayed();
    }

    public List verifyDropdownValues(String labelName) {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String arrowXpath = StatusDropdownArrow_2.replace("LABELNAME", labelName);
        driver.findElement(By.xpath(arrowXpath)).click();


        String valuesXpath = DropdownValuesXpath.replace("LABELNAME", labelName);
        List<String> actualValues = new ArrayList<>();
        List<WebElement> values = driver.findElements(By.xpath(valuesXpath));
        for (WebElement allValues : values) {
            actualValues.add(allValues.getText());
        }
        driver.findElement(By.xpath(arrowXpath)).click();
        return actualValues;
    }

    public void userClicksDropdownOnAttpunchClock(String labelName) {

        String arrowXpath =  StatusDropdownArrowXpath_1.replace("DROPDOWNNAME", labelName);
        driver.findElement(By.xpath(arrowXpath)).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public void userClicksOnDropdown(String labelName) {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String arrowXpath =  StatusDropdownArrow_2.replace("LABELNAME", labelName);
        driver.findElement(By.xpath(arrowXpath)).click();

    }

    public void selectSplitDropdownValues(String value)
    {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String xpath = SelectSplitDropdownValues.replace("VALUE",value);
        driver.findElement(By.xpath(xpath)).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void enterDuration(String hRandMin,String numb)
    {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        String xpath = DurationHrAndMin.replace("LABEL", hRandMin);

        WebElement element= driver.findElement(By.xpath(xpath));
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.elementToBeClickable(element));

        element.sendKeys(numb);

    }



    public void userClickOnDeleteCodeInterval(String buttonName)
    {

        String xpath = DeleteCodeInterval.replace("BUTTONNAME", buttonName);
        driver.findElement(By.xpath(xpath)).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void clickOnTimeAM(String labelNAme) {

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String xpath = AM_Btn.replace("LABELNAME", labelNAme);
        driver.findElement(By.xpath(xpath)).click();

    }
    public void clickOnTimePM(String labelNAme) {

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String  xpath = PM_Btn.replace("LABELNAME", labelNAme);
        WebDriverWait wait2 = new WebDriverWait(driver, 10);
        wait2.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
        driver.findElement(By.xpath(xpath)).click();

    }

    public boolean verifyRequiredlement(String reqEle) {
        String xpath =RequiredEle.replace("REQELEMENT", reqEle);
        return driver.findElement(By.xpath(xpath)).isDisplayed();
    }


}

