package org.example;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;

public class QRcode {
    public static void main(String[] args) {
        WebDriver driver;
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get("https://qrcode.meetheed.com/qrcode_examples.php");

        // Capture screenshot of the entire webpage
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,600);");


        try {
            // Read QR code from the screenshot using ZXing
            BufferedImage bufferedImage = ImageIO.read(screenshot);
            Result result = new MultiFormatReader().decode(new BinaryBitmap(new HybridBinarizer(new BufferedImageLuminanceSource(bufferedImage))));
            String qrCodeData = result.getText();

            // Print the QR code data
            System.out.println("QR Code Data: " + qrCodeData);
        } catch (Exception e) {
            System.err.println("Error decoding QR code: " + e.getMessage());
        }
    }
}
