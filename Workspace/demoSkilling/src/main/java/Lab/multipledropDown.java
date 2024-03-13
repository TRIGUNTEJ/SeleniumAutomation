package Lab;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class multipledropDown {
    public static void main(String[] args) throws Exception {

        WebDriver driver;
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
        Thread.sleep(2000);

        // MULTIPLE SELECTION DROP DOWN EXAMPLE
        WebElement ideElement = driver.findElement(By.id("ide"));
        Select ideDropDown = new Select(ideElement);
        ideDropDown.selectByIndex(0);
        ideDropDown.selectByValue("ij");
        ideDropDown.selectByVisibleText("NetBeans");
        ideDropDown.deselectByVisibleText("IntelliJ IDEA");
        List<WebElement> selectedOptions = ideDropDown.getAllSelectedOptions();
        for (WebElement selectedOption : selectedOptions) {
               System.out.println("Selected visible text---" + selectedOption.getText());}

    }
}
