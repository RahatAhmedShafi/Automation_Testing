import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ChromeTest {

    public static void main(String[] args){
//        System.out.println("Hello Dhaka");
//        WebDriver driver =new ChromeDriver();
       WebDriver driver=new FirefoxDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        driver.quit();
    }
}
