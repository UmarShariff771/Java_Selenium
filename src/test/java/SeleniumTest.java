import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumTest {
    @Test
    void setup(){
        // Initialize the web driver
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // Navigate to the site
        driver.get("https://v2.angular.io/");
        WebElement getStarted = driver.findElement(By.xpath("//h1 /following-sibling::a[.='Get Started']"));
        getStarted.getCssValue("href").contains("/docs/ts/latest/quickstart.html");
        getStarted.click();
    }
}
