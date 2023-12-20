package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import properties.PropertiesHandler;
import java.time.Duration;
import io.qameta.allure.Allure;
import org.testng.annotations.Test;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;


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
    public static void assertElementClickable(WebDriver driver, WebElement by) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(by));
        Assert.assertNotNull(element, "Element should be clickable");
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

}
