package Activities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity10 {
    public static void main(String[] args) {
        // Set up driver (make sure geckodriver is in your PATH)
        WebDriver driver = new FirefoxDriver();

        try {
            driver.get("https://training-support.net/webelements/drag-drop");

            // Print the page title
            String title = driver.getTitle();
            System.out.println("Page title is: " + title);

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            // Wait for the ball and dropzones to be present
            WebElement ball = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("draggable")));
            WebElement dropzone1 = driver.findElement(By.id("droppable"));
            WebElement dropzone2 = driver.findElement(By.id("dropzone2"));

            Actions actions = new Actions(driver);

            // Drag the ball to Dropzone 1
            actions.clickAndHold(ball).moveToElement(dropzone1).release().build().perform();

            // Verify ball is in Dropzone 1
            boolean inDropzone1 = dropzone1.getText().contains("Dropped!");
            System.out.println("Ball dropped in Dropzone 1: " + inDropzone1);

            // Drag the ball to Dropzone 2
            // Need to get the ball again (sometimes the reference changes after drag)
            ball = driver.findElement(By.id("draggable"));

            actions.clickAndHold(ball).moveToElement(dropzone2).release().build().perform();

            // Verify ball is in Dropzone 2
            boolean inDropzone2 = dropzone2.getText().contains("Dropped!");
            System.out.println("Ball dropped in Dropzone 2: " + inDropzone2);

        } finally {
            // Close the browser
            driver.quit();
        }
    }
}
