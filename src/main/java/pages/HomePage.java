package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends basePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    private final By countriesList = By.id("arrow");
    private final By bahrainLogo = By.id("bh");
    private final By ksaLogo = By.id("sa");
    private final By kuwaitLogo = By.id("kw");
    private final By litePlan = By.id("name-lite");
    private final By liteCurrency = By.id("currency-lite");
    private final By CostAndCurrencyOrder = By.id("order-tier-price");
    private final By startYourTrialForLite = By.id("lite-selection");
    private final By classicPlan = By.id("name-classic");
    private final By classicCurrency = By.id("currency-classic");
    private final By startYourTrialForClassic = By.id("classic-selection");
    private final By premiumPlan = By.id("name-premium");
    private final By premiumCurrency = By.id("currency-premium");
    private final By startYourTrialForPremium= By.id("premium-selection");


    public WebElement getCountriesList() {
        return driver.findElement(countriesList);
    }

    public WebElement getLiteElement() {
        return driver.findElement(litePlan);
    }
    public WebElement GetStartYourTrialButtonForLite(){
        return driver.findElement(startYourTrialForLite);
    }
    public WebElement GetStartYourTrialButtonForClassic(){
        return driver.findElement(startYourTrialForClassic);
    }
    public WebElement GetStartYourTrialButtonForPremium(){return driver.findElement(startYourTrialForPremium);}

    public WebElement getPremiumElement() {
        return driver.findElement(premiumPlan);
    }

    public WebElement getClassicElement() {
        return driver.findElement(classicPlan);
    }

    public WebElement getLitePriceElement() {
        return driver.findElement(liteCurrency);
    }
    public WebElement getPriceAndCurrencyOrder(){
        return driver.findElement(CostAndCurrencyOrder);
    }

    public WebElement getClassicPriceElement() {
        return driver.findElement(classicCurrency);
    }

    public WebElement getPremiumPriceElement() {
        return driver.findElement(premiumCurrency);
    }

    public WebElement getKsaLogo() {
        return driver.findElement(ksaLogo);
    }

    public WebElement getKuwaitLogo() {
        return driver.findElement(kuwaitLogo);
    }

    public WebElement getBahrainLogo() {
        return driver.findElement(bahrainLogo);
    }

}
