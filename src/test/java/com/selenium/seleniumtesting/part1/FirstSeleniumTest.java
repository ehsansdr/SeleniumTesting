package com.selenium.seleniumtesting.part1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass; // use this import not junit
import org.testng.annotations.Test;
public class FirstSeleniumTest {

    // the purpose is control web and element
    WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        // this will opne Chrome and shoe the test perocess
        // you can perform some setting for this like maximise();
        driver.manage().window();

        // and will go to this url and observ the elementmnt in it
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @AfterClass
    public void tearDown() {
        // you can close the web browser with these 2 ways
        driver.quit(); // this close every window   the standard for selenium
        // driver.close(); // this close the current window
        // do not have them both
    }

    @Test

    public void firstLoginIntoAnnotation() throws InterruptedException {
        // first find the element and then perform the action

        Thread.sleep(2 * 1000);

        // in this url that we want to perform the action have
        // lots of element and component
        // and they have attribite like id and name and tag we can find them
        // by they link or attribute of tag it depends on the situation

        // find element
        WebElement username = driver.findElement(By.name("username"));
        // perform action
        username.sendKeys("Admin");


        // find element
        var password = driver.findElement(By.name("password"));
        // find element
        password.sendKeys("admin123");

        Thread.sleep(2 * 1000);

        // if the web page only have this tag to can use that
        driver.findElement(By.tagName("button")).click();
        Thread.sleep(2 * 1000);
        String actualResult = driver.findElement(By.tagName("h6")).getText();
        String expectResult = "Dashboard";

        Assert.assertEquals(actualResult,expectResult);
    }




}
