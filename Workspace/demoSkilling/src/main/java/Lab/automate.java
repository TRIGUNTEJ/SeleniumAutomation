package Lab;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
public class automate {
    public static void main(String[] args) {
        WebDriver driver;
        System.out.println("testing on open browser");
        WebDriverManager.firefoxdriver();
        driver = new FirefoxDriver();
        driver.get("https://www.amazon.org");
        System.out.println(driver.getTitle());
        Actions an=new Actions(driver);
        Actions actions = an.moveToElement(driver.findElement(By.cssSelector("div.nav-line-1-container")));
        an.keyDown(Keys.SHIFT).sendKeys("bluetooth").build().perform();
        an.moveToElement(driver.findElement(By.cssSelector("input#twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("bluetooth").build().perform();
    }
}