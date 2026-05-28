package stepdefinitions;

import io.cucumber.java.en.Given;
import pages.HomePage;
import utilities.DriverFactory;

public class CommonSteps {

    HomePage homePage =
            new HomePage(DriverFactory.getDriver());

    @Given("User launches Amazon website")
    public void user_launches_amazon_website() {

        homePage.launchApplication();
    }
}