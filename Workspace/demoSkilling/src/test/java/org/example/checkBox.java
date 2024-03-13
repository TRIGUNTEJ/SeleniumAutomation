package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class checkBox {
    @Test
    public void test() {
        WebDriver driver;
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get("https://demoqa.com/automation-practice-form");
        driver.manage().window().maximize();

        WebElement checkBoxSelected = driver.findElement(By.cssSelector("label[for='hobbies-checkbox-1']"));
        boolean isSelected = checkBoxSelected.isSelected();
        if(!isSelected) {
            checkBoxSelected.click();
        }

        WebElement checkBoxDisplayed = driver.findElement(By.cssSelector("label[for='hobbies-checkbox-1']"));
        boolean isDisplayed = checkBoxDisplayed.isDisplayed();
        // performing click operation if element is displayed
        if (isDisplayed) {
            checkBoxDisplayed.click();
        }

        WebElement checkBoxEnabled = driver.findElement(By.cssSelector("label[for='hobbies-checkbox-1']"));
        boolean isEnabled = checkBoxEnabled.isEnabled();

        if (isEnabled) {
            checkBoxEnabled.click();
        }
    }
}
