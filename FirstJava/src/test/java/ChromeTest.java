import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeTest {

    public static void main(String[] args){
//        System.out.println("Hello Dhaka");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.bbc.com/news");
        driver.manage().window().maximize();
        driver.quit();
    }
}
