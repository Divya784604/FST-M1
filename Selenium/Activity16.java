package Activities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Activity16 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        try {
            driver.get("https://training-support.net/webelements/selects");
            System.out.println("Page title: " + driver.getTitle());

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            // Suppose the visible dropdown trigger is a div/span with class "ui dropdown" (inspect page to get actual class)
            WebElement dropdownTrigger = wait.until(
                ExpectedConditions.elementToBeClickable(By.cssSelector(".ui.dropdown"))
            );
            dropdownTrigger.click();

            // Wait for options list to appear
            List<WebElement> options = wait.until(
                ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector(".menu .item"))
            );

            // Select by visible text — e.g. Option 2
            for (WebElement opt : options) {
                if (opt.getText().equals("Option 2")) {
                    opt.click();
                    break;
                }
            }

            // Re-open dropdown to select by index
            dropdownTrigger.click();
            options = wait.until(
                ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector(".menu .item"))
            );
            // third option = index 2
            options.get(2).click();

            // Re-open dropdown to select by value
            dropdownTrigger.click();
            options = wait.until(
                ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector(".menu .item"))
            );
            for (WebElement opt : options) {
                String val = opt.getAttribute("data-value"); // or inspect attribute carrying value
                if ("4".equals(val)) {
                    opt.click();
                    break;
                }
            }

            // To print all visible option texts
            System.out.println("All options:");
            dropdownTrigger.click();
            options = wait.until(
                ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector(".menu .item"))
            );
            for (WebElement opt : options) {
                System.out.println(opt.getText());
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}
