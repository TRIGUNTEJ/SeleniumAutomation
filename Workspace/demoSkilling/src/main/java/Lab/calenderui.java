package Lab;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class calenderui {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://calendar.google.com");
        WebElement currentDateElement = driver.findElement(By.xpath("//div[contains(@class,'xY') and contains(@class,'x1')]"));
        String currentDate = currentDateElement.getText();
        System.out.println("Current Date: " + currentDate);
        driver.quit();
    }
}
