package Activities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {
    public static void main(String[] args) {
        // Initialize Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Open the login form page
        driver.get("https://training-support.net/webelements/login-form/");

        // Get and print the page title using WebDriver API
        String pageTitle = driver.getTitle();
        System.out.println("Page title is: " + pageTitle);

        // Locate username field using XPath and enter text
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");

        // Locate password field using XPath and enter text
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("password");

        // Locate and click the login button using XPath
        driver.findElement(By.xpath("//button[text()='Submit']")).click();

        // Get and print the confirmation message using XPath
        String message = driver.findElement(By.xpath("//h1")).getText();
        System.out.println("Login message: " + message);

        // Close the browser
        driver.quit();
    }
}
