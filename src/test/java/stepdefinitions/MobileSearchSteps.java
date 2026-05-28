package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.Assert;

import pages.HomePage;
import pages.MobilePage;
import utilities.DriverFactory;

public class MobileSearchSteps {

    HomePage homePage =
            new HomePage(DriverFactory.getDriver());

    MobilePage mobilePage =
            new MobilePage(DriverFactory.getDriver());

    String lastMobile;

    @When("User searches for mobiles")
    public void user_searches_for_mobiles() {

        homePage.searchProduct("Mobiles");
    }

    @And("User scrolls down the page")
    public void user_scrolls_down_the_page() {

        mobilePage.scrollDownPage();
    }

    @Then("User captures last displayed mobile details")
    public void user_captures_last_displayed_mobile_details() {

        lastMobile =
                mobilePage.getLastDisplayedMobile();

        Assert.assertFalse(lastMobile.isEmpty());
    }
}