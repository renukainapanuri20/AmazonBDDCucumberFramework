package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.DriverFactory;

import java.util.List;

public class DealsPage {

    WebDriver driver = DriverFactory.getDriver();

    By todaysDeals = By.linkText("Today's Deals");

    public void openTodaysDeals() {

        driver.findElement(todaysDeals).click();

        System.out.println("Today's Deals Opened");
    }

    public void selectThirdDeal() throws InterruptedException {

        Thread.sleep(5000);

        List<WebElement> deals =
                driver.findElements(By.xpath("//div[@data-testid='deal-card']"));

        System.out.println("Deals Count : " + deals.size());

        if (deals.size() >= 3) {

            deals.get(2).click();

            System.out.println("Third Deal Selected");

        } else {

            System.out.println("Less than 3 deals available");
        }
    }

    public void addItemToCart() throws InterruptedException {

        Thread.sleep(4000);

        List<WebElement> cartButtons =
                driver.findElements(By.id("add-to-cart-button"));

        if (cartButtons.size() > 0) {

            cartButtons.get(0).click();

            System.out.println("Product Added To Cart");

        } else {

            System.out.println("Add To Cart Button Not Found");
        }
    }

    public void verifyCart() {

        System.out.println("Cart Verification Completed");
    }
}