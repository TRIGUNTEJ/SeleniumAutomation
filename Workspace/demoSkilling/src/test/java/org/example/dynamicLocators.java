package org.example;
import io.github.bonigarcia.wdm.WebDriverManager;import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class dynamicLocators {
    @Test
void test()    {
    WebDriver driver;
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
    driver.get("https://lms.kluniversity.in/login/index.php");
    driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("2100031077");
    driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("trigun@020903");
    driver.findElement(By.xpath("//*[@id=\"loginbtn\"]")).submit();    }
}