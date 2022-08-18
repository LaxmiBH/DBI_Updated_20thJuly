package com.qa.factory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {

    public WebDriver driver;

    public static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<>();

    public WebDriver init_driver(String browser){
        System.out.println("Browser : - "+browser);

        if (browser.contains("chrome")){
            System.out.println("In if condition browser : - "+browser);
        }


            WebDriverManager.chromedriver().setup();
            tlDriver.set(new ChromeDriver());


        getDriver().manage().deleteAllCookies();
        getDriver().manage().window().maximize();
        return getDriver();
    }

    public static WebDriver getDriver(){
        return tlDriver.get();
    }
}
