package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class DropdownExamples {
    public static void main(String[] args) throws InterruptedException, IOException ,Exception {
        WebDriver driver;
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
        Thread.sleep(2000);

        // SINGLE SELECTION DROP DOWN
        WebElement courseElement = driver.findElement(By.id("course"));
        Select courseNameDropdown = new Select(courseElement);
        List<WebElement> courseNameDropDownOptions = courseNameDropdown.getOptions();

        for (WebElement option : courseNameDropDownOptions) {
            System.out.println(option.getText());
        }
        courseNameDropdown.selectByIndex(1);
        Thread.sleep(1000);
        courseNameDropdown.selectByVisibleText("Java");
        TakesScreenshot ts = (TakesScreenshot)driver;
        File file = ts.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file,new File("./Screen/Image2.png"));
        Thread.sleep(2000);
        courseNameDropdown.selectByValue("python");
        File fil = ts.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(fil,new File("./Screen/Image3.png"));
        String selectedText = courseNameDropdown.getFirstSelectedOption().getText();
        System.out.println("Selected visible text: " + selectedText);
        // MULTIPLE SELECTION DROP DOWN EXAMPLE
        WebElement ideElement = driver.findElement(By.id("ide"));
        Select ideDropDown = new Select(ideElement);
        List<WebElement> ideDropDownOptions = ideDropDown.getOptions();
        for (WebElement option : ideDropDownOptions) {
            System.out.println(option.getText());
        }
        ideDropDown.selectByIndex(0);
        ideDropDown.selectByValue("ij");
        ideDropDown.selectByVisibleText("NetBeans");
        ideDropDown.deselectByVisibleText("IntelliJ IDEA");
        File fi = ts.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(fi,new File("./Screen/Image4.png"));

        List<WebElement> selectedOptions = ideDropDown.getAllSelectedOptions();

        for (WebElement selectedOption : selectedOptions) {
            System.out.println("Selected visible text: " + selectedOption.getText());
        }

    }
}
