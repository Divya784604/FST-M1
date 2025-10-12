package Activities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class Activity9 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();

        try {
            driver.get("https://training-support.net/webelements/keyboard-events");

            System.out.println("Page title is: " + driver.getTitle());

            // Explicit wait
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            // Wait for the input box to be present and visible
            WebElement inputField = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input#text"))
            );

            String textToType = "Hello from Selenium!";
            inputField.sendKeys(textToType);

            // Wait for the message to appear after typing
            WebElement message = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.id("keyPressed"))
            );

            System.out.println("Message displayed: " + message.getText());

        } finally {
            driver.quit();
        }
    }
}
