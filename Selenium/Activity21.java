package Activities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.Set;

public class Activity21 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        try {
            driver.get("https://training-support.net/webelements/tabs");
            System.out.println("Page title: " + driver.getTitle());
            System.out.println("Page Source length: " + driver.getPageSource().length());
            System.out.println("Iframes count: " + driver.findElements(By.tagName("iframe")).size());

            // Pause 5 seconds to ensure page is loaded (for testing)
            Thread.sleep(5000);

            // Try locating button by text
            WebElement newTabButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Open New Tab']")));
            newTabButton.click();

            wait.until(ExpectedConditions.numberOfWindowsToBe(2));
            Set<String> windowHandles = driver.getWindowHandles();
            System.out.println("Window Handles: " + windowHandles);

            String originalWindow = driver.getWindowHandle();

            for (String window : windowHandles) {
                if (!window.equals(originalWindow)) {
                    driver.switchTo().window(window);
                    break;
                }
            }

            System.out.println("New tab title: " + driver.getTitle());
            System.out.println("Message on new tab: " + driver.findElement(By.cssSelector("div.content")).getText());

        } finally {
            driver.quit();
        }
    }
}
