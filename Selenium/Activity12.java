package Activities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity12 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();

        try {
            driver.get("https://training-support.net/webelements/dynamic-content");

            System.out.println("Page title is: " + driver.getTitle());

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

            // Click the "Click me!" button
            WebElement button = driver.findElement(By.xpath("//button[contains(text(),'Click me')]"));
            button.click();

            // Wait until any element contains the word 'release'
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'release')]")));

            // Find the element containing 'release' and print its text
            WebElement releaseText = driver.findElement(By.xpath("//*[contains(text(),'release')]"));
            System.out.println("Text after clicking button: " + releaseText.getText());

        } finally {
            driver.quit();
        }
    }
}
