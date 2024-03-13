package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StaticLocators {

    @Test
    public void testSearchGoogle() {
        WebDriver driver;
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get("https://www.google.co.in/");

        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Selenium testing");
        searchBox.submit();

        WebElement results = driver.findElement(By.id("result-stats"));
        Assert.assertTrue(results.isDisplayed(), "Search results not displayed");

        driver.quit();
    }

    @Test
    public void testGoogleLogo() {
        WebDriver driver;
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get("https://www.google.co.in/");

        WebElement logo = driver.findElement(By.className("lnXdpd"));
        Assert.assertTrue(logo.isDisplayed(), "Google logo not displayed");

        driver.quit();
    }

    @Test
    public void testGoogleImages() {
        WebDriver driver;
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get("https://www.google.co.in/");

        WebElement imagesLink = driver.findElement(By.linkText("Images"));
        imagesLink.click();

        String expectedTitle = "Google Images";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Not on the Google Images page");

        driver.quit();
    }
}