package Lab;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class gmaillogin {
    public static void main(String[] args)
    {
        WebDriver driver;
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get("https://accounts.google.com/InteractiveLogin/identifier?continue=http%3A%2F%2Fsupport.google.com%2Fmail%2Fanswer%2F56256%3Fhl%3Den&ec=GAZAdQ&hl=en&passive=true&sjid=18073975439911361081-AP&ifkv=AeDOFXhHgWv_xMIclguECfBFv1-ypEf58GY9T6z0k_lqA5iPLvkmXJVrybHrL_qnDLWUQZGNXZROlg&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
        driver.findElement(By.id("identifierId")).sendKeys("mailtometrigun@gmail.com");
        driver.findElement(By.id("identifierNext")).click();
        driver.findElement(By.id("password")).sendKeys("trigun@020903");
        driver.findElement(By.id("identifierNext")).submit();

    }
}
