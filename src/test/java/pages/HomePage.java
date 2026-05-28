package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

    WebDriver driver;

    // Constructor
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
    By searchBox = By.id("twotabsearchtextbox");

    By todaysDealsLink =
            By.xpath("//a[contains(text(),'Today')]");

    By hamburgerMenu =
            By.id("nav-hamburger-menu");

    By mobileMenu =
            By.xpath("//div[text()='Mobiles, Computers']");

    By mobilePhonesOption =
            By.xpath("//a[contains(text(),'All Mobile Phones')]");

    // Methods

    public void launchApplication() {

        driver.get("https://www.amazon.in");

        System.out.println("Amazon Opened");
    }

    public void searchProduct(String productName) {

        driver.findElement(searchBox).sendKeys(productName);

        driver.findElement(searchBox).sendKeys(Keys.ENTER);
    }

    public void clickTodaysDeals() {

        driver.findElement(todaysDealsLink).click();
    }

    public void clickHamburgerMenu() {

        driver.findElement(hamburgerMenu).click();
    }

    public void clickMobilesMenu() {

        driver.findElement(mobileMenu).click();
    }

    public void selectMobilePhones() {

        driver.findElement(mobilePhonesOption).click();
    }
}