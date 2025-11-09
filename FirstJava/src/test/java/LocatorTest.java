import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocatorTest {
    public static void main(String[] args){

        WebDriver driver=new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/");
        // id locator
        driver.findElement(By.id("small-searchterms")).sendKeys("Laptop");
        // class locator
        driver.findElement(By.className("search-box-button")).click();
        driver.manage().window().maximize();
        driver.quit();
    }
}
