package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class skill12 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get("https://www.browserstack.com/users/sign_in");
        driver.findElement(By.id("user_email_login")).sendKeys("mailtometrigun@mgmail.com");
        driver.findElement(By.id("user_password")).sendKeys("Trigun@1234");
        driver.findElement(By.id("user_submit")).submit();
        Thread.sleep(9000);
        driver.get("https://www.browserstack.com/users/sign_out");
        Thread.sleep(7000);
        driver.quit();
    }
}