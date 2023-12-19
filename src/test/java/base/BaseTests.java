package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import properties.PropertiesHandler;

import java.time.Duration;


public class BaseTests {
    protected WebDriver driver;
    PropertiesHandler pro = new PropertiesHandler();


    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        String configDataPath = "src/main/resources/config.properties";
        String Url = pro.loadDataFromPropertiesFile(configDataPath).getProperty("url");
        driver.get(Url);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

}
