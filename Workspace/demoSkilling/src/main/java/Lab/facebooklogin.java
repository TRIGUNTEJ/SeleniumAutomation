package Lab;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class facebooklogin {
    public static void main(String[] args)
    {
        WebDriver driver;
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get("https://www.facebook.com/login/");
        driver.findElement(By.id("email")).sendKeys("9502280711");
        driver.findElement(By.id("pass")).sendKeys("trigun@0209");
        driver.findElement(By.id("loginbutton")).click();

    }
}
