package Activities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity6 {
    public static void main(String[] args) {
        // Start Firefox browser
        WebDriver driver = new FirefoxDriver();

        // Open the dynamic controls page
        driver.get("https://training-support.net/webelements/dynamic-controls");

        // Print the page title
        System.out.println("Page title is: " + driver.getTitle());

        // Find the checkbox input element
        WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));

        // Check if checkbox is selected initially
        System.out.println("Checkbox selected: " + checkbox.isSelected());

        // Click the checkbox to select it
        checkbox.click();

        // Check again if checkbox is selected
        System.out.println("Checkbox selected after click: " + checkbox.isSelected());

        // Close the browser
        driver.quit();
    }
}
