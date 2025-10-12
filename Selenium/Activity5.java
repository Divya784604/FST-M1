package Activities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity5 {
    public static void main(String[] args) {
        // Initialize Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Open the page
        driver.get("https://training-support.net/webelements/dynamic-controls");

        // Print the title of the page
        System.out.println("Page title is: " + driver.getTitle());

        // Find the checkbox element
        WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));

        // Check if the checkbox is displayed
        System.out.println("Checkbox visible: " + checkbox.isDisplayed());

        // Click the 'Remove Checkbox' button
        WebElement removeButton = driver.findElement(By.id("toggleCheckbox"));
        removeButton.click();

        // Wait until the checkbox disappears
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.invisibilityOf(checkbox));

        // Try to check again if checkbox is visible (it should not be)
        try {
            checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
            System.out.println("Checkbox visible after removal: " + checkbox.isDisplayed());
        } catch (Exception e) {
            System.out.println("Checkbox is no longer present on the page.");
        }

        // Close the browser
        driver.quit();
    }
}
