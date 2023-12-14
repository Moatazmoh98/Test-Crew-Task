package HomePage;

import base.BaseTests;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.HomePage;

public class HomePageStepdef extends BaseTests {
    HomePage homePage = new HomePage(driver);

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
    @Then("the Lite package price is 15 SAR/month for KSA")
    public void checkThatLitePackageCostAndCurrencyIsCorrectForKsa(){
        Assert.assertEquals(homePage.getPriceAndCurrencyOrder().getText(),"15.00 SAR/month");
    }
    @Then("the Classic package price is 25 SAR/month for KSA")
    public void checkThatClassicPackageCostAndCurrencyIsCorrectForKsa(){
        Assert.assertEquals(homePage.getPriceAndCurrencyOrder().getText(),"25.00 SAR/month");
    }
    @Then("the Premium package price is 60 SAR/month for KSA")
    public void checkThatPremiumPackageCostAndCurrencyIsCorrectForKsa(){
        Assert.assertEquals(homePage.getPriceAndCurrencyOrder().getText(),"60.00 SAR/month");
    }
    @Then("the Lite package price is 2 BHD/month for BAH")
    public void checkThatLitePackageCostAndCurrencyIsCorrectForBah(){
        Assert.assertEquals(homePage.getPriceAndCurrencyOrder().getText(),"2.00 BHD/month");
    }
    @Then("the Classic package price is 3 BHD/month for BAH")
    public void checkThatClassicPackageCostAndCurrencyIsCorrectForBah(){
        Assert.assertEquals(homePage.getPriceAndCurrencyOrder().getText(),"3.00 BHD/month");
    }
    @Then("the Premium package price is 6 BHD/month for BAH")
    public void checkThatPremiumPackageCostAndCurrencyIsCorrectForBah(){
        Assert.assertEquals(homePage.getPriceAndCurrencyOrder().getText(),"6.00 BHD/month");
    }
    @Then("the Lite package price is 1.2 KWD/month for KUW")
    public void checkThatLitePackageCostAndCurrencyIsCorrectForKuw(){
        Assert.assertEquals(homePage.getPriceAndCurrencyOrder().getText(),"1.2 KWD/month");
    }
    @Then("the Classic package price is 2.5 KWD/month for KUW")
    public void checkThatClassicPackageCostAndCurrencyIsCorrectForKuw(){
        Assert.assertEquals(homePage.getPriceAndCurrencyOrder().getText(),"2.5 KWD/month");
    }
    @Then("the Premium package price is 4.8 KWD/month for KUW")
    public void checkThatPremiumPackageCostAndCurrencyIsCorrectForKuw(){
        Assert.assertEquals(homePage.getPriceAndCurrencyOrder().getText(),"4.8 KWD/month");
    }
}

