package Activities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity7 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();

        driver.get("https://training-support.net/webelements/dynamic-controls");

        System.out.println("Page title is: " + driver.getTitle());

        WebElement inputField = driver.findElement(By.xpath("//input[@type='text']"));

        System.out.println("Input field enabled: " + inputField.isEnabled());

        // Locate button by its exact visible text
        WebElement enableButton = driver.findElement(By.xpath("//button[text()='Enable Input']"));
        enableButton.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(inputField));

        System.out.println("Input field enabled after clicking enable: " + inputField.isEnabled());

        driver.quit();
    }
}
