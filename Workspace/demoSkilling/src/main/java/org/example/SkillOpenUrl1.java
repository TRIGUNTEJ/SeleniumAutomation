package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class SkillOpenUrl1 {

    public static void main(String[] args)
    {
        System.out.println("Welcome");
        WebDriver driver;
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
       // driver.get("https://www.gmail.com");
        driver.get("https://twitter.com");
        //driver.quit();
    }
}
