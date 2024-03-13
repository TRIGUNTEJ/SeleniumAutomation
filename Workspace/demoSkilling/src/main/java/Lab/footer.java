package Lab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class footer {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.walmart.com/");
        WebElement footer = driver.findElement(By.xpath("//footer"));
        List<WebElement> footerLinks = footer.findElements(By.tagName("a"));
        int numberOfFooterLinks = footerLinks.size();
        System.out.println("Number of links in the Walmart footer: " + numberOfFooterLinks);
    }
}

