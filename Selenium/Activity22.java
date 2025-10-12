package Activities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity22 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try {
            // Open the URL
            driver.get("https://training-support.net/webelements/popups");

            // Print the title
            System.out.println("Page title: " + driver.getTitle());

            // Find the button and click it to open the popup
            WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button.ui.fluid.large.blue.button")));
            loginButton.click();

            // Wait for the popup to appear (wait for username field)
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));

            // Enter credentials
            driver.findElement(By.id("username")).sendKeys("admin");
            driver.findElement(By.id("password")).sendKeys("password");

            // Click submit
            driver.findElement(By.cssSelector("button.ui.button")).click();

            // Wait for the message after login and print it
            WebElement message = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("action-confirmation")));
            System.out.println("Login message: " + message.getText());

        } finally {
            // Close the browser
            driver.quit();
        }
    }
}
