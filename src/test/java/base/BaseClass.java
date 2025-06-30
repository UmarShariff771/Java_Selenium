package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
    WebDriver driver = new ChromeDriver();

    public void type (WebElement ele, String text){
        ele.clear();
        ele.sendKeys(text);
        log("Cleared and typed the text");
    }
    public void log(String text){
        System.out.println(text);
    }
    public boolean isDisplayed(WebElement ele){
        return ele.isDisplayed();
    }
}
