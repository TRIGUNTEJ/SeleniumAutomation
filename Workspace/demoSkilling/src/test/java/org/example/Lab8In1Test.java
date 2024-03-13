package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Lab8In1Test {

    @Test
    public void testWebAppTitle() {
        WebDriver driver;
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get("https://www.amazon.in/");
        String actualTitle = driver.getTitle();
        String expectedTitle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
        Assert.assertEquals(actualTitle, expectedTitle, "Title mismatch");
    }

    @Test
    public void testWebAppURL() {
        WebDriver driver;
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get("https://www.amazon.in/");
        String actualURL = driver.getCurrentUrl();
        String expectedURL = "https://www.amazon.in/";
        Assert.assertEquals(actualURL, expectedURL, "URL mismatch");
    }
}
