package Activities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Activity14 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();

        try {
            // Open browser and navigate to the page
            driver.get("https://training-support.net/webelements/tables");

            // Print the page title
            System.out.println("Page title is: " + driver.getTitle());

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table")));

            // Find number of rows and columns
            List<WebElement> rows = driver.findElements(By.xpath("//table/tbody/tr"));
            int rowCount = rows.size();

            List<WebElement> cols = driver.findElements(By.xpath("//table/thead/tr/th"));
            int colCount = cols.size();

            System.out.println("Number of rows: " + rowCount);
            System.out.println("Number of columns: " + colCount);

            // Find and print the Book Name in the 5th row (assuming Book Name is in 2nd column)
            String bookNameBeforeSort = driver.findElement(By.xpath("//table/tbody/tr[5]/td[2]")).getText();
            System.out.println("Book Name in 5th row before sort: " + bookNameBeforeSort);

            // Click the Price header to sort by price ascending (assuming Price is 3rd or 4th column, adjust as needed)
            // Let's find the index of "Price" header dynamically:
            int priceColumnIndex = -1;
            for (int i = 1; i <= colCount; i++) {
                String headerText = driver.findElement(By.xpath("//table/thead/tr/th[" + i + "]")).getText();
                if (headerText.equalsIgnoreCase("Price")) {
                    priceColumnIndex = i;
                    break;
                }
            }

            if (priceColumnIndex == -1) {
                System.out.println("Price column not found!");
                return;
            }

            // Click the Price header to sort
            driver.findElement(By.xpath("//table/thead/tr/th[" + priceColumnIndex + "]")).click();

            // Wait for the table to resort (a short sleep or better wait for change in content)
            Thread.sleep(2000);  // simple wait, replace with better wait if you want

            // Get the Book Name in 5th row again after sort
            String bookNameAfterSort = driver.findElement(By.xpath("//table/tbody/tr[5]/td[2]")).getText();
            System.out.println("Book Name in 5th row after sort: " + bookNameAfterSort);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}
