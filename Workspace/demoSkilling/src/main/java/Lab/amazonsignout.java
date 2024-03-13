package Lab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class amazonsignout {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "path_to_geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.amazon.com");

        WebElement signInLink = driver.findElement(By.id("nav-link-accountList"));
        signInLink.click();

        WebElement emailField = driver.findElement(By.id("ap_email"));
        emailField.sendKeys("9502280711");

        WebElement continueButton = driver.findElement(By.id("continue"));
        continueButton.click();

        WebElement passwordField = driver.findElement(By.id("ap_password"));
        passwordField.sendKeys("Trigun@020903");

        WebElement signInButton = driver.findElement(By.id("signInSubmit"));
        signInButton.click();

        WebElement accountListLink = driver.findElement(By.id("nav-link-accountList"));
        accountListLink.click();

        WebElement signOutButton = driver.findElement(By.id("nav-item-signout"));
        signOutButton.click();

        driver.manage().deleteAllCookies();

        driver.quit();
    }
}
