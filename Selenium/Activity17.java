package Activities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.List;

public class Activity17 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        try {
            driver.get("https://training-support.net/webelements/selects");
            System.out.println("Page title: " + driver.getTitle());

            // Find all select elements
            List<WebElement> selects = driver.findElements(By.tagName("select"));
            WebElement multiSelect = null;

            for (WebElement sel : selects) {
                String multipleAttr = sel.getAttribute("multiple");
                if (multipleAttr != null) {
                    multiSelect = sel;
                    break;
                }
            }

            if (multiSelect == null) {
                System.out.println("Multi-select element not found.");
                return;
            }

            Select select = new Select(multiSelect);

            // 1. Select "HTML" by visible text
            select.selectByVisibleText("HTML");

            // 2. Select 4th, 5th, 6th options by index (index starts from 0)
            select.selectByIndex(3); // Java
            select.selectByIndex(4); // Python
            select.selectByIndex(5); // C#

            // 3. Select "Node" using visible text (since value doesn't exist)
            select.selectByVisibleText("Node");

            // 4. Deselect 5th option (Python)
            select.deselectByIndex(4);

            // Print selected options
            System.out.println("Selected options:");
            for (WebElement option : select.getAllSelectedOptions()) {
                System.out.println("- " + option.getText());
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}
