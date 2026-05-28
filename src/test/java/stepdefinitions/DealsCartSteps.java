package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.DealsPage;

public class DealsCartSteps {

    DealsPage dealsPage = new DealsPage();

    @When("User clicks Today's Deals")
    public void user_clicks_todays_deals() {

        dealsPage.openTodaysDeals();
    }

    @When("User selects third deal")
    public void user_selects_third_deal() throws InterruptedException {

        dealsPage.selectThirdDeal();
    }

    @When("User adds item to cart")
    public void user_adds_item_to_cart() throws InterruptedException {

        dealsPage.addItemToCart();
    }

    @Then("Verify cart quantity")
    public void verify_cart_quantity() {

        dealsPage.verifyCart();
    }
}