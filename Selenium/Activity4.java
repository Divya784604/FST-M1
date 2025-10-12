package Activities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4 {
    public static void main(String[] args) {
        // Start Firefox browser
        WebDriver driver = new FirefoxDriver();

        // Open the target-practice page
        driver.get("https://training-support.net/webelements/target-practice");

        // Get and print the page title
        String title = driver.getTitle();
        System.out.println("Page title is: " + title);

        // 3rd header using XPath and print its text
        WebElement thirdHeader = driver.findElement(By.xpath("//h3[text()='Third header']"));
        System.out.println("Third header text: " + thirdHeader.getText());

        // 5th header using XPath and print its color
        WebElement fifthHeader = driver.findElement(By.xpath("//h5"));
        String fifthHeaderColor = fifthHeader.getCssValue("color");
        System.out.println("Fifth header color: " + fifthHeaderColor);

        // Purple button using class name and print all its classes
        WebElement purpleButton = driver.findElement(By.className("purple"));
        System.out.println("Purple button classes: " + purpleButton.getAttribute("class"));

        // Slate button using CSS Selector and print its text
        WebElement slateButton = driver.findElement(By.cssSelector("button.ui.slate.button"));
        System.out.println("Slate button text: " + slateButton.getText());

        // Close the browser
        driver.quit();
    }
}
