package Examples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstTest {
    public static void main(String[] args) {
        // Create a driver object
        WebDriver driver = new FirefoxDriver(); // ChromeDriver() or EdgeDriver()

        // Open the page
        driver.get("https://training-support.net");

        // Verify using the page title
        System.out.println("Page title is: " + driver.getTitle());

        // Interactions

        // Close the browser
        driver.quit();
    }
}