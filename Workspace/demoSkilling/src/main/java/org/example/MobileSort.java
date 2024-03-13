package org.example;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MobileSort {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.amazon.in/");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobile phones");
        driver.findElement(By.id("nav-search-submit-button")).click();

        driver.findElement(By.cssSelector("#a-autoid-0-announce")).click();
        driver.findElement(By.id("s-result-sort-select_1")).click();

        List<String> mobileNames = new ArrayList<>();
        List<String> sortedMobileNames;

        List<WebElement> elements = driver.findElements(By.cssSelector("span.a-text-normal"));
        for (WebElement mobileNameElement : elements) {
            mobileNames.add(mobileNameElement.getText());
        }

        sortedMobileNames = new ArrayList<>(mobileNames);
        Collections.sort(sortedMobileNames);

        if (mobileNames.equals(sortedMobileNames)) {
            System.out.println("Mobiles are sorted correctly by name.");
        } else {
            System.out.println("Mobiles are not sorted correctly by name.");
        }
    }
}
