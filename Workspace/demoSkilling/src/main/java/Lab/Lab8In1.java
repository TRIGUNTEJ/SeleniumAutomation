package Lab;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Lab8In1 {
    public static void main(String[] args) {
                WebDriver driver;
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                driver.get("https://www.amazon.in");
                String pageTitle = driver.getTitle();
                System.out.println("Page Title: " + pageTitle);
                String pageUrl = driver.getCurrentUrl();
                System.out.println("Page URL: " + pageUrl);


        }

    }
