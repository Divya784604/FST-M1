package Activities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.Alert;
import java.time.Duration;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Activity20 {
    public static void main(String[] args) {
        // Create new Firefox driver instance
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try {
            // Open the page
            driver.get("https://training-support.net/webelements/alerts");

            // Print the page title
            System.out.println("Page title: " + driver.getTitle());

            // Locate and click the button to open the PROMPT alert
            driver.findElement(By.xpath("//button[contains(text(), 'Prompt')]")).click();

            // Wait for the alert to be present
            wait.until(ExpectedConditions.alertIsPresent());

            // Switch to the alert
            Alert promptAlert = driver.switchTo().alert();

            // Print the alert text
            System.out.println("Alert text: " + promptAlert.getText());

            // Type "Awesome!" into the prompt
            promptAlert.sendKeys("Awesome!");

            // Accept the alert (click OK)
            promptAlert.accept();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}
