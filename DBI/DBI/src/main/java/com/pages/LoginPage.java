package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginPage {

    private WebDriver driver;




    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    private By username = By.id("username");
    private By password = By.id("password");
    private By loginButton = By.xpath("//span[contains(text(),'Login')]");
    private By forgotPasswordLink = By.xpath("//a[contains(text(),'Forgot ')]");



    public void doLogin(String uname, String pwd)throws Exception{
        driver.findElement(username).sendKeys(uname);
        driver.findElement(password).sendKeys(pwd);
        driver.findElement(loginButton).click();
        Thread.sleep(3000);
    }


}
