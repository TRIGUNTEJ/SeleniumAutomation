package org.example;
import  io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class skill3 {
    public static void main(String[] args) {
    WebDriver driver;
    WebDriverManager.firefoxdriver().setup();
    driver = new FirefoxDriver();
    driver.get("https://amazon.in");
    String title = driver.getTitle();
    String expTitle = driver.getCurrentUrl();
        if (title.contains(expTitle)) {
            System.out.println("Task 1: Title verification PASSED!");
        } else {
            System.out.println("Task 1: Title verification FAILED!");
        }
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("IQOO NEO 7");
        driver.findElement(By.id("nav-search-submit-button")).click();
        //Check whether the selected result page for the selected category
        String pageTitle = driver.getTitle();
        if(pageTitle.contains("IQOO NEO 7"))
        {
            System.out.println("Showing products in the query");
        } else {
            System.out.println("Not displaying any product.");
        }
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,3000);");
        js.executeScript("window.scrollBy(0,-1000);");



    }
}