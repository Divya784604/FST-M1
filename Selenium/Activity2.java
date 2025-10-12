package Activities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {
    public static void main(String[] args) {
        // Initialize Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Open the login page
        driver.get("https://training-support.net/webelements/login-form/");

        // Get and print the title of the page
        String pageTitle = driver.getTitle();
        System.out.println("Page title is: " + pageTitle);

        // Enter username
        driver.findElement(By.id("username")).sendKeys("admin");

        // Enter password
        driver.findElement(By.id("password")).sendKeys("password");

        // Click the "Log in" button
        driver.findElement(By.xpath("//button[text()='Submit']")).click();

        // Optional: Print the confirmation message
        String message = driver.findElement(By.tagName("h1")).getText();
        System.out.println("Login message: " + message);

        // Close the browser
        driver.quit();
    }
}

