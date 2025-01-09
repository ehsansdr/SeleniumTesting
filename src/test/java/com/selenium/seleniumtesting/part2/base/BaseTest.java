package com.selenium.seleniumtesting.part2.base;

import com.saucedemo.pages.BasePage;
import com.saucedemo.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {

    protected WebDriver driver;
    protected BasePage basePage;
    protected LoginPage loginPage;
    private String url = "https://";

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url); // load the application
        basePage = new BasePage();
        basePage.setDriver(driver);
        loginPage = new LoginPage();


    }

    @AfterClass
    public void tearDown() {
        driver.quit(); // quit the driver and close the browser
    }



}
