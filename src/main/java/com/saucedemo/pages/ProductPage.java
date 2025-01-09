package com.saucedemo.pages;

import org.openqa.selenium.By;

public class ProductPage extends BasePage {

    private By productHeader = By.xpath("//div[text()='Products']");

    public boolean isProductHeaderDisplayed(String productName) {

        return find(productHeader).isDisplayed();
    }
}
