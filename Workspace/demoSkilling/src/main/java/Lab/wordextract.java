package Lab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.concurrent.TimeUnit;

public class wordextract {
    public static void main(String[] args) {
        WebDriver driver = null;
        try {
            driver = new FirefoxDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

            driver.get("https://www.wikipedia.org/");

            WebElement searchBox = driver.findElement(By.id("searchInput"));
            searchBox.sendKeys("education");
            searchBox.submit();

            driver.findElement(By.id("firstHeading")).click();

            WebElement paragraph = driver.findElement(By.xpath("//div[@class='mw-parser-output']/p[1]"));
            String text = paragraph.getText();

            String targetWord = "knowledge";

            if (text.contains(targetWord)) {
                System.out.println("Extracted word: " + targetWord);
            } else {
                System.out.println("The word \"" + targetWord + "\" is not found in the sentence.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (driver != null) {
                driver.quit();
            }
        }
    }
}
