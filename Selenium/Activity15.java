package Activities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity15 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        try {
            driver.get("https://training-support.net/webelements/dynamic-attributes");
            System.out.println("Page title is: " + driver.getTitle());

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            // Try multiple locator strategies for username
            WebElement username = null;
            try {
                username = driver.findElement(By.xpath("//input[@name='username']"));
            } catch (Exception e) {
                username = driver.findElement(By.xpath("//input[contains(@placeholder, 'User')]"));
            }

            WebElement password = null;
            try {
                password = driver.findElement(By.xpath("//input[@type='password' and not(contains(@placeholder,'Confirm'))]"));
            } catch (Exception e) {
                password = driver.findElement(By.xpath("//input[contains(@placeholder, 'Pass')]"));
            }

            WebElement confirmPassword = null;
            try {
                confirmPassword = driver.findElement(By.xpath("//input[contains(@placeholder, 'Confirm')]"));
            } catch (Exception e) {
                // maybe skip if not present
            }

            WebElement email = null;
            try {
                email = driver.findElement(By.xpath("//input[contains(@placeholder, 'Email')]"));
            } catch (Exception e) {
                // skip if not present
            }

            username.sendKeys("myUsername");
            password.sendKeys("myPassword");
            if (confirmPassword != null) {
                confirmPassword.sendKeys("myPassword");
            }
            if (email != null) {
                email.sendKeys("myemail@example.com");
            }

            WebElement signUpBtn = driver.findElement(By.xpath("//button[contains(text(),'Sign Up')]"));
            signUpBtn.click();

            // Wait for some success / confirmation message
            WebElement successMsg = wait.until(ExpectedConditions.visibilityOfElementLocated(
                    By.xpath("//*[contains(text(), 'success') or contains(text(), 'Thank you') or contains(@id,'action')]")
            ));

            System.out.println("Success message: " + successMsg.getText());

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}
