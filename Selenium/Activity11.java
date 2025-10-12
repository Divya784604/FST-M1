package Activities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity11 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();

        try {
            driver.get("https://training-support.net/webelements/dynamic-controls");

            // Print the page title
            String title = driver.getTitle();
            System.out.println("Page title is: " + title);

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            // Locate checkbox and toggle button
            By checkboxLocator = By.cssSelector("input[type='checkbox']");
            WebElement toggleButton = driver.findElement(By.xpath("//button[text()='Toggle Checkbox']"));

            // Find checkbox and confirm it's displayed
            WebElement checkbox = driver.findElement(checkboxLocator);
            System.out.println("Checkbox displayed: " + checkbox.isDisplayed());

            // Click toggle to remove checkbox
            toggleButton.click();

            // Wait for checkbox to disappear
            wait.until(ExpectedConditions.invisibilityOfElementLocated(checkboxLocator));
            System.out.println("Checkbox removed.");

            // Toggle checkbox again to add it back
            toggleButton.click();

            // Wait for checkbox to appear
            wait.until(ExpectedConditions.visibilityOfElementLocated(checkboxLocator));
            checkbox = driver.findElement(checkboxLocator);

            // Select the checkbox
            checkbox.click();
            System.out.println("Checkbox selected.");

        } finally {
            // Close browser
            driver.quit();
        }
    }
}
