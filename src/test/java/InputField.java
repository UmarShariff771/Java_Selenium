import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class InputField {
    public static void main(String[]args){
        WebDriverManager.chromedriver();
        WebDriver driver = new ChromeDriver();
        JavascriptExecutor jse = (JavascriptExecutor)driver;

        // Navigate to the Input Field
        driver.get("https://letcode.in/");
        driver.manage().window().maximize();
        jse.executeScript("window.scrollBy(0,550)");
        WebElement exploreWorkspace = driver.findElement(By.xpath("//h2[.='Workspace']/following-sibling::a"));
        exploreWorkspace.click();
        WebElement editButton = driver.findElement(By.xpath("//a[.=' Edit ']"));
        editButton.click();

        // Perform actions on Edit
        // TC001
        driver.findElement(By.id("fullName")).sendKeys("Edward Kenway");
        // TC002
        driver.findElement(By.id("join")).sendKeys(" Pirate Captain", Keys.TAB);
        // TC003
        driver.switchTo().activeElement().getAttribute("value").contains("ortonikc");
        String getValue = driver.findElement(By.id("getMe")).getAttribute("value");
        System.out.println("The value is "+ getValue);
        Assert.assertEquals(getValue, "ortonikc");
        // TC004
        driver.findElement(By.id("clearMe")).clear();
        // TC005
        boolean enabled = driver.findElement(By.id("noEdit")).isEnabled();
        System.out.println("The field is enabled : " + enabled);
        // TC006
        String readOnly = driver.findElement(By.id("dontwrite")).getDomAttribute("readonly");
        System.out.println("The field is readonly : " + readOnly);
    }
}
