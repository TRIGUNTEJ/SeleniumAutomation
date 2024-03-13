package Lab;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class singledropdown {
    public static void main(String[] args) throws Exception {

        WebDriver driver;
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
        Thread.sleep(2000);

        // SINGLE SELECTION DROP DOWN
        WebElement courseElement = driver.findElement(By.id("course"));
        Select courseNameDropdown = new Select(courseElement);
        courseNameDropdown.selectByIndex(1);
        Thread.sleep(3000);
        courseNameDropdown.selectByVisibleText("Java");
        Thread.sleep(2000);
        courseNameDropdown.selectByValue("python");

        String selectedText = courseNameDropdown.getFirstSelectedOption().getText();
        System.out.println("Selected visible text: " + selectedText);

        driver.quit();
    }
}
