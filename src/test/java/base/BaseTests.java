package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;

import java.time.Duration;

public class BaseTests {
     protected WebDriver driver;

    public void setUp(){
        ChromeOptions options = new ChromeOptions();
        driver=new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://subscribe.stctv.com/sa-en");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));

    }

    @AfterClass
    public void tearDown(){driver.quit();}

}
