package com.pages;

import org.openqa.selenium.*;
import java.util.ArrayList;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.JavascriptExecutor;

public class RemotePayrollPage
{
    private WebDriver driver;

    public RemotePayrollPage(WebDriver driver) {
        this.driver = driver;
    }

    private String BerakButton = "//div//span[contains(text(),'BUTTON')]";
    private String LABEL_XPATH = "//div[contains(text(),'LABELNAME')]";
    private String CheckBox = "//div[contains(text(),'LABELNAME')]//following::button";
    private String TextBox = "//div[contains(text(),'LABELNAME')]//following::input";
    private String TimezoneBox = "//div[contains(text(),'LABEL')]//following::input[@placeholder='Select a Timezone']";
    private String Button = "//span[contains(text(),'BUTTONNAME')]";
    private String StatusDropdownArrowXpath = "//div[contains(text(),'LABELNAME')]//following-sibling::div";
    private String DropdownValuesXpath = "//div[contains(text(),'LABELNAME')]//parent::div//ul/li";
    private String DurationHrAndMin = "//div[contains(text(),'LABEL')]//following::input";
    private String MaxDurationHrAndMin = "//div[contains(text(),'Max Duration')]//following::div[contains(text(),'LABEL')]//following::input";
    private String SelectDropdownValuesType = "//div[contains(text(),'Type')]//parent::div//ul/li[contains(text(),'VALUE')]";
    private String SelectDropdownValuesBreakType = "//div[contains(text(),'Break Type:')]//parent::div//ul/li[contains(text(),'VALUE')]";
    private String SelectDropdownValuesPounding = "//div[contains(text(),'Punch Rounding:')]//parent::div//ul/li[contains(text(),'VALUE')]";
    private String Message = "//li[text()='MESSAGE']";
    private String ButtonXpath = "//button[@data-view='BUTTONNAME']";
    private String ButtonWithTitleXpath = "//button[@title='BUTTONNAME']";
    private String StatusDropdownValuesXpath = "//button[@title='Add a Punch Clock Shift-Break']//parent::div//ul//li";
    private By SearchTextBox = By.xpath("//input[@placeholder=\"Type a keyword and hit 'Enter' to search\"]");
    private String CodeNameXpath = "//div[contains(text(),'CODENAME')]";
    private String TitleXpath = "//span[contains(text(),'TITLENAME')]";
    private By removeButton = By.xpath("//input[@placeholder=\"Type a keyword and hit 'Enter' to search\"]//following::button");
    private String HrAndMin = "//div[contains(text(),'LABEL')]//following::input";
    private String ClosePopupButton = "//span[contains(text(),'POPUPNAME')]//following::i[contains(@class,'fas fa-times')]";
    private String AM_Btn = "//div[contains(text(),'LABELNAME')]//following::span[contains(text(),'AM')]";
    private String PM_Btn = "//div[contains(text(),'LABELNAME')]//following::span[contains(text(),'PM')]";
    private String DeletePunchShiftBreak = "//div[contains(text(),'BREAKNAME')]//following::button[@title='Delete Punch Clock Shift Break']";
    private String Button2 = "//span[contains(text(),'BUTTONNAME')]//parent::button";
    public boolean verifyLabel(String labelName) {
        String xpath = LABEL_XPATH.replace("LABELNAME", labelName);
        return driver.findElement(By.xpath(xpath)).isDisplayed();
    }

    public boolean verifyTimezoneBox(String labelName) {
        String xpath = TimezoneBox.replace("LABEL", labelName);
        return driver.findElement(By.xpath(xpath)).isDisplayed();
    }

    public boolean verifyButton(String btnName) {
        String xpath = Button.replace("BUTTONNAME", btnName);
        return driver.findElement(By.xpath(xpath)).isDisplayed();
    }

    public boolean verifyButtonDisplayedWithTitle(String buttonName) {
        String xpath = ButtonWithTitleXpath.replace("BUTTONNAME", buttonName);
        return driver.findElement(By.xpath(xpath)).isDisplayed();
    }

    public boolean verifyBreakName(String breakName) {

        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        String xpath = CodeNameXpath.replace("CODENAME", breakName);
        return driver.findElement(By.xpath(xpath)).isDisplayed();
    }

    public boolean verifyCheckBox(String labelName) {
        String xpath = CheckBox.replace("LABELNAME", labelName);
        return driver.findElement(By.xpath(xpath)).isDisplayed();
    }


    public boolean verifyTextBox(String labelName) {
        String xpath = TextBox.replace("LABELNAME", labelName);
        return driver.findElement(By.xpath(xpath)).isDisplayed();
    }

    public void clickBtnOnPopup(String buttonName) {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String xpath = Button.replace("BUTTONNAME", buttonName);
        driver.findElement(By.xpath(xpath)).click();
    }

    public void scrollDown()
    {

        WebElement m = driver.findElement(By.xpath("//div//span[contains(text(),'Create New Break')]"));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        //This will scroll the web page till end.
        js.executeScript("arguments[0].scrollIntoView(true);", m);;

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public void scrollUp()
    {

        WebElement m = driver.findElement(By.xpath("//div[contains(text(),'Break Type:')]"));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        //This will scroll the web page till end.
        js.executeScript("arguments[0].scrollIntoView(true);", m);;

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }


    public List verifyStatusDropdownValuesOnPopup(String name) {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String arrowXpath = StatusDropdownArrowXpath.replace("LABELNAME", name);
        driver.findElement(By.xpath(arrowXpath)).click();

        String valuesXpath = "//button[@title='Add a Punch Clock Shift-Break']//parent::div//ul/li";
        List<String> actualValues = new ArrayList<>();
        List<WebElement> values = driver.findElements(By.xpath(valuesXpath));
        for (WebElement allValues : values) {
            actualValues.add(allValues.getText());
        }

        driver.findElement(By.xpath(arrowXpath)).click();
        return actualValues;

    }

    public List verifyDropdownValues(String labelName) {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String arrowXpath = StatusDropdownArrowXpath.replace("LABELNAME", labelName);
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

    public void entertextinTextbox(String labelName,String txt)
    {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String xpath = TextBox.replace("LABELNAME", labelName);
        driver.findElement(By.xpath(xpath)).clear();
        driver.findElement(By.xpath(xpath)).sendKeys(txt);

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void clearTextbox(String labelName) {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String xpath = TextBox.replace("LABELNAME", labelName);
        driver.findElement(By.xpath(xpath)).clear();
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

      element.click();
        element.clear();
        element.sendKeys(numb);

    }

    public void enterMaxDuration(String hRandMin,String numb)
    {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        String xpath = MaxDurationHrAndMin.replace("LABEL", hRandMin);

        WebElement element= driver.findElement(By.xpath(xpath));
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.elementToBeClickable(element));

        element.click();
        element.clear();
        element.sendKeys(numb);

    }

    public void userClicksOnDropdown(String labelName) {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String arrowXpath = StatusDropdownArrowXpath.replace("LABELNAME", labelName);
        driver.findElement(By.xpath(arrowXpath)).click();

    }

    public void selectPunchRoundingDropdownValues(String value)
    {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String xpath = SelectDropdownValuesPounding.replace("VALUE",value);
        driver.findElement(By.xpath(xpath)).click();
    }

    public void selectTypeDropdownValues(String value)
    {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String xpath = SelectDropdownValuesType.replace("VALUE",value);
        driver.findElement(By.xpath(xpath)).click();
    }

    public void selectBreakTypeDropdownValues(String value)
    {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String xpath = SelectDropdownValuesBreakType.replace("VALUE",value);
        driver.findElement(By.xpath(xpath)).click();
    }


    public void clickOnCheckBox(String labelName) {
        String xpath = CheckBox.replace("LABELNAME", labelName);
        driver.findElement(By.xpath(xpath)).click();
    }

    public boolean verifyMessage(String msg) {
        String xpath = Message.replace("MESSAGE", msg);
        return driver.findElement(By.xpath(xpath)).isDisplayed();
    }

    public boolean verifyBreakType(String brkType) {
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        String xpath = LABEL_XPATH.replace("LABELNAME", brkType);
        return driver.findElement(By.xpath(xpath)).isDisplayed();
    }


    public boolean verifySearchTextBox() {
        return driver.findElement(SearchTextBox).isDisplayed();
    }

    public void enterTextInSearchBoxOnRemotePayrollPage(String text) {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(SearchTextBox).clear();
        driver.findElement(SearchTextBox).sendKeys(text);
        driver.findElement(SearchTextBox).sendKeys(Keys.ENTER);
    }

    public void moveCursorOnBreak(String breakName)
    {
        Actions act = new Actions(driver);
       String xpath = LABEL_XPATH.replace("LABELNAME", breakName);
       act.moveToElement(driver.findElement(By.xpath(xpath))).perform();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public void clickOnButton(String button) {

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String xpath = TitleXpath.replace("TITLENAME", button);
        driver.findElement(By.xpath(xpath)).click();

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public String verifyPopupTitle(String title) {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        String xpath = TitleXpath.replace("TITLENAME", title);
        return driver.findElement(By.xpath(xpath)).getText();
    }

    public void clickButtonWithTitle(String buttonName) {

        String xpath = ButtonWithTitleXpath.replace("BUTTONNAME", buttonName);
        driver.findElement(By.xpath(xpath)).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void clickOnRemoveButton() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(removeButton).click();
    }

    public boolean verifyClosebuttonOnpopUp(String popupName) {
        String xpath = ClosePopupButton.replace("POPUPNAME", popupName);
        return driver.findElement(By.xpath(xpath)).isDisplayed();
    }

    public boolean verifyTextBox2(String labelName) {

        String xpath = TextBox.replace("LABELNAME", labelName);
        WebDriverWait wait2 = new WebDriverWait(driver, 15);
        wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));

        return driver.findElement(By.xpath(xpath)).isDisplayed();
    }

    public boolean verifyAM(String labelName) {

        String xpath = AM_Btn.replace("LABELNAME", labelName);
        return driver.findElement(By.xpath(xpath)).isDisplayed();

    }

    public boolean verifyPM(String labelNAme) {

        String xpath = PM_Btn.replace("LABELNAME", labelNAme);
        return driver.findElement(By.xpath(xpath)).isDisplayed();

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

    public void deletePunchShiftBreak(String breakName)
    {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Actions act = new Actions(driver);
        String xpath1 = LABEL_XPATH.replace("LABELNAME", breakName);
        act.moveToElement(driver.findElement(By.xpath(xpath1))).perform();

        String xpath2 = DeletePunchShiftBreak.replace("BREAKNAME", breakName);
        driver.findElement(By.xpath(xpath2)).click();
    }

}

