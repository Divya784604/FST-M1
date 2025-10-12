package Activities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.Alert;

public class Activity18 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();

        try {
            // Open the URL
            driver.get("https://training-support.net/webelements/alerts");

            // Print the page title
            System.out.println("Page title: " + driver.getTitle());

            // Find and click the button to open the simple alert
            driver.findElement(By.id("simple")).click();

            // Switch focus to alert
            Alert simpleAlert = driver.switchTo().alert();

            // Get the text from the alert and print it
            System.out.println("Alert text: " + simpleAlert.getText());

            // Accept the alert
            simpleAlert.accept();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}
