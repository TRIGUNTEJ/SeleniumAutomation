package Lab;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LmsLogin {
    public static void main(String[] args)
        {WebDriver driver;
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
            driver.get("https://lms.kluniversity.in/login/index.php");
            driver.findElement(By.id("username")).sendKeys("2100031077");
            driver.findElement(By.id("password")).sendKeys("Ammalu@82");
            driver.findElement(By.id("loginbtn")).click();

        }
    }


