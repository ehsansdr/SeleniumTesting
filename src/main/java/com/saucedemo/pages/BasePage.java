package com.saucedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public  class BasePage {
    // abstract is not require but it helps to prevent any child class to instantiate this

    // this class hase only one role
    // is to be parent to our page object classes

    public static WebDriver driver; // so all the page object classes can acces the browser

    public void setDriver(WebDriver driver) {
        BasePage.driver = driver;
    }


    protected WebElement find(By locator) {
        return driver.findElement(locator);
    }

    protected void set(By locator, String text) {
        find(locator).clear();
        find(locator).sendKeys(text);
    }h

    protected void click(By locator) {
        find(locator).click();
    }

}
