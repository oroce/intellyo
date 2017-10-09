package com.intellyo.java.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import java.util.concurrent.TimeUnit;

public class SeleniumUtils {

    WebDriver unitDriver;

    private static SeleniumUtils instance = null;

    private SeleniumUtils() {}

    public static SeleniumUtils getInstance() {
        if(instance == null) {
            instance = new SeleniumUtils();
        }
        return instance;
    }

    public void openWebpage(String url){
        this.unitDriver = new HtmlUnitDriver();
        this.unitDriver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
        this.unitDriver.get(url);
        this.unitDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public void closeWebDriver(){
        unitDriver.close();
    }

    public boolean isElementPresents(By path) {
        try {
            unitDriver.findElement(path);
            System.out.println("The " + path + " element found");
            return true;
        } catch (NoSuchElementException  e) {
            System.out.println("The " + path + " element NOT found");
            return false;
        }
    }

    public void findelementWithTimeout(By xpath){
        unitDriver.findElement(xpath);
    }

    public void writeTotextBox(By path, String text) {
        unitDriver.findElement(path).sendKeys(text);
    }

    public void clickOnElement(By path) {
        unitDriver.findElement(path).click();
    }

    public void sleep(int seconds){
        try {
            Thread.sleep(seconds * 1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
