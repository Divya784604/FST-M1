package Activities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Activity13 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();

        try {
            driver.get("https://training-support.net/webelements/tables");

            System.out.println("Page title is: " + driver.getTitle());

            // Check for iframes
            List<WebElement> frames = driver.findElements(By.tagName("iframe"));
            System.out.println("Number of iframes: " + frames.size());

            if (frames.size() > 0) {
                driver.switchTo().frame(0); // switch to first iframe
            }

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table")));

            // Find rows and columns
            List<WebElement> rows = driver.findElements(By.xpath("//table/tbody/tr"));
            int rowCount = rows.size();

            List<WebElement> cols = driver.findElements(By.xpath("//table/tbody/tr[1]/td"));
            int colCount = cols.size();

            System.out.println("Number of rows: " + rowCount);
            System.out.println("Number of columns: " + colCount);

            // Cells in the third row
            List<WebElement> thirdRowCells = driver.findElements(By.xpath("//table/tbody/tr[3]/td"));
            System.out.print("Cells in the third row: ");
            for (WebElement cell : thirdRowCells) {
                System.out.print(cell.getText() + " ");
            }
            System.out.println();

            // Cell at second row, second column
            WebElement cellValue = driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]"));
            System.out.println("Cell value at 2nd row, 2nd column: " + cellValue.getText());

        } finally {
            driver.quit();
        }
    }
}
