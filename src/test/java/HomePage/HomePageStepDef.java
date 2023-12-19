package HomePage;

import base.BaseTests;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.HomePage;
import properties.PropertiesHandler;

public class HomePageStepDef extends BaseTests {
    HomePage homePage = new HomePage(driver);
    PropertiesHandler pro = new PropertiesHandler();
    private final String userDataPath = (System.getProperty(("user.dir")+ "src/main/resources/userData.properties"));
    private final String configDataPath = (System.getProperty(("user.dir")+ "src/main/resources/userData.properties"));
    private final String userName = pro.loadDataFromPropertiesFile(userDataPath).getProperty("username");
    private final String password = pro.loadDataFromPropertiesFile(userDataPath).getProperty("password");
    private final String mobile = pro.loadDataFromPropertiesFile(userDataPath).getProperty("mobile");

    private final String homePageUrl = pro.loadDataFromPropertiesFile(configDataPath).getProperty("url");



    @Given("StcTv website is opened")
    public void stcTvWebsiteIsOpened() {
        setUp();
    }

    @When("press on Arrow countries List")
    public void pressOnCountriesArrow() {
        homePage.getCountriesList().click();

    }

    @When("select Bahrain Logo")
    public void pressOnBahrainLogo() {
        homePage.getBahrainLogo().click();

    }

    @When("select Kuwait Logo")
    public void pressOnKuwaitLogo() {
        homePage.getKuwaitLogo().click();

    }

    @When("select country name  {string}")
    public void selectCountryName(String country) {

        switch (country) {
            case "KSA":
                homePage.getKsaLogo().click();
                break;
            case "Bahrain":
                homePage.getBahrainLogo().click();
                break;
            case "kuwait":
                homePage.getKuwaitLogo().click();
                break;
            default:
                break;

        }
    }

    @When("press on start your trial for lite")
    public void pressOnStartYourTrailButtonForLite() {
        homePage.GetStartYourTrialButtonForLite().click();
    }

    @When("press on start your trial for classic")
    public void pressOnStartYourTrailButtonForClassic() {
        homePage.GetStartYourTrialButtonForClassic().click();
    }

    @When("press on start your trial for Premium")
    public void pressOnStartYourTrailButtonForPremium() {
        homePage.GetStartYourTrialButtonForPremium().click();
    }

    @Then("packageLite should be visible")
    public void checkThatLitePackageIsDisplayed() {
        Assert.assertTrue(homePage.getLiteElement().isDisplayed());
    }

    @Then("packageClassic should be matched")
    public void checkThatClassicPackageIsDisplayed() {
        Assert.assertTrue(homePage.getClassicElement().isDisplayed());
    }

    @Then("packagePremium should be displayed")
    public void checkThatPremiumPackageIsDisplayed() {
        Assert.assertTrue(homePage.getPremiumElement().isDisplayed());
    }

    @Then("the lite package price is {string}")
    public void checkLitePackagePriceIsCorrect(String litePrice) {
        Assert.assertEquals(homePage.getLitePriceElement().getText(), litePrice);
    }

    @Then("the classic package price is {string}")
    public void checkClassicPackagePriceIsCorrect(String classicPrice) {
        Assert.assertEquals(homePage.getClassicPriceElement().getText(), classicPrice);
    }

    @Then("the premium package price is {string}")
    public void checkPremiumPackagePriceIsCorrect(String premiumPrice) {
        Assert.assertEquals(homePage.getPremiumPriceElement().getText(), premiumPrice);
    }

    @Then("the Lite package price is correct for KSA")
    public void checkThatLitePackageCostAndCurrencyIsCorrectForKsa() {
        Assert.assertEquals(homePage.getPriceAndCurrencyOrder().getText(), "15.00 SAR/month");
    }

    @Then("the Classic package price is correct for KSA")
    public void checkThatClassicPackageCostAndCurrencyIsCorrectForKsa() {
        Assert.assertEquals(homePage.getPriceAndCurrencyOrder().getText(), "25.00 SAR/month");
    }

    @Then("the Premium package price is correct for KSA")
    public void checkThatPremiumPackageCostAndCurrencyIsCorrectForKsa() {
        Assert.assertEquals(homePage.getPriceAndCurrencyOrder().getText(), "60.00 SAR/month");
    }

    @Then("the Lite package price is correct for BAH")
    public void checkThatLitePackageCostAndCurrencyIsCorrectForBah() {
        Assert.assertEquals(homePage.getPriceAndCurrencyOrder().getText(), "2.00 BHD/month");
    }

    @Then("the Classic package price is correct for BAH")
    public void checkThatClassicPackageCostAndCurrencyIsCorrectForBah() {
        Assert.assertEquals(homePage.getPriceAndCurrencyOrder().getText(), "3.00 BHD/month");
    }

    @Then("the Premium package price is correct for BAH")
    public void checkThatPremiumPackageCostAndCurrencyIsCorrectForBah() {
        Assert.assertEquals(homePage.getPriceAndCurrencyOrder().getText(), "6.00 BHD/month");
    }

    @Then("the Lite package price is correct for KUW")
    public void checkThatLitePackageCostAndCurrencyIsCorrectForKuw() {
        Assert.assertEquals(homePage.getPriceAndCurrencyOrder().getText(), "1.2 KWD/month");
    }

    @Then("the Classic package price is correct for KUW")
    public void checkThatClassicPackageCostAndCurrencyIsCorrectForKuw() {
        Assert.assertEquals(homePage.getPriceAndCurrencyOrder().getText(), "2.5 KWD/month");
    }

    @Then("the Premium package price is correct for KUW")
    public void checkThatPremiumPackageCostAndCurrencyIsCorrectForKuw() {
        Assert.assertEquals(homePage.getPriceAndCurrencyOrder().getText(), "4.8 KWD/month");
    }


    @When("press on sign in button")
    public void userPressOnSignInButton() {
        homePage.getSignIn().click();
    }

    @When("fill user name field with data")
    public void fillUserNameFieldWithData() {
        homePage.getUserName().sendKeys(userName);
    }

    @When("press on submit button")
    public void pressOnSubmitButton() {
        homePage.getSubmit().click();
    }

    @And("fill password field with data")
    public void fillPasswordFieldWithData() {
        homePage.getPassword().sendKeys(password);

    }

    @Then("an error message should be displayed")
    public void anErrorMessageShouldBeDisplayed() {
        Assert.assertTrue(homePage.getErrorMessage().isDisplayed());
    }

    @When("press on back button")
    public void pressOnBackButton() {
        driver.navigate().back();
    }

    @Then("check that the language is not change")
    public void checkThatTheLanguageIsNotChange() {
        Assert.assertEquals(driver.getCurrentUrl(), homePageUrl);
    }

    @When("press on Activate button")
    public void pressOnActivateButton() {
        homePage.getActivateButton().click();

    }

    @When("type in mobile phone text field")
    public void typeInMobilePhoneTextField() {
        homePage.getMobilePhoneTextField().sendKeys(mobile);
    }

    @When("press on edit hypertext")
    public void pressOnEditHypertext() {
        homePage.getEditButton().click();
    }

    @Then("mobile phone text filed should be reset")
    public void mobilePhoneTextFiledShouldBeReset() {
        Assert.assertNull(homePage.getMobilePhoneTextField().getText());
    }


    @Then("mobile phone text filed should exist")
    public void mobilePhoneTextFiledShouldExist() {
        Assert.assertTrue(homePage.getMobilePhoneTextField().isDisplayed());
    }
}

