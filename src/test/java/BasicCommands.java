import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class BasicCommands {
    public static void main(String [] args){
        // Initialize the driver
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        // Initialize the javascript executor
        JavascriptExecutor jse = (JavascriptExecutor)driver;

        // Navigate to the URL
        driver.get("https://letcode.in/");
        driver.manage().window().maximize();
        // Implicit Wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        // Explicit Wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Click on the explore workspace
        WebElement exploreWorkspace = driver.findElement(By.xpath("//h2[.='Workspace']/following-sibling::a"));
        //jse.executeScript("arguments[0].scrollIntoView(true);", exploreWorkspace);
        // Scroll Down
        jse.executeScript("window.scrollBy(0,550)");
        System.out.println("Element has been scrolled down");
        //jse.executeScript("arguments[0].click();", exploreWorkspace);
        exploreWorkspace.click();
        System.out.println("Element has been Clicked successfully");

        // Validate the URL
        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(currentUrl, "https://letcode.in/test");
        driver.quit();
    }
}
