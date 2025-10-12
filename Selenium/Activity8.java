package Activities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class Activity8 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();

        try {
            driver.get("https://training-support.net/webelements/mouse-events");

            System.out.println("Page title is: " + driver.getTitle());

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            // If needed, switch to iframe
            // driver.switchTo().frame(0);

            WebElement cargoLockBtn = wait.until(
                ExpectedConditions.elementToBeClickable(By.xpath("//*[contains(., 'Cargo.lock')]"))
            );
            cargoLockBtn.click();

            WebElement cargoTomlBtn = wait.until(
                ExpectedConditions.elementToBeClickable(By.xpath("//*[contains(., 'Cargo.toml')]"))
            );
            cargoTomlBtn.click();

            WebElement message = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.id("actionConfirm"))
            );
            System.out.println("Message: " + message.getText());

            // Continue with double click and right click actions...

        } finally {
            driver.quit();
        }
    }
}
