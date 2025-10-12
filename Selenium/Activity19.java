package Activities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.Alert;
import java.time.Duration;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Activity19 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try {
            driver.get("https://training-support.net/webelements/alerts");

            System.out.println("Page title: " + driver.getTitle());

            // Locate Confirm alert button by partial button text
            driver.findElement(By.xpath("//button[contains(text(), 'Confirm')]")).click();

            // Wait for alert and switch to it
            wait.until(ExpectedConditions.alertIsPresent());
            Alert alert = driver.switchTo().alert();

            System.out.println("Alert text: " + alert.getText());

            alert.accept();

            // Open the confirm alert again
            driver.findElement(By.xpath("//button[contains(text(), 'Confirm')]")).click();

            wait.until(ExpectedConditions.alertIsPresent());
            alert = driver.switchTo().alert();

            alert.dismiss();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}
