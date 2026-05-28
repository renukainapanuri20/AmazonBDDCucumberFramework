package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class MobilePage {

    WebDriver driver;

    public MobilePage(WebDriver driver) {
        this.driver = driver;
    }

    // Locator for mobile titles

    By mobileResults =
            By.xpath("//span[contains(@class,'a-size-medium')]");

    // Scroll Down

    public void scrollDownPage() {

        JavascriptExecutor js =
                (JavascriptExecutor) driver;

        js.executeScript(
                "window.scrollBy(0,3000)");
    }

    // Get last displayed item

    public String getLastDisplayedMobile() {

        WebDriverWait wait =
                new WebDriverWait(driver,
                        Duration.ofSeconds(20));

        wait.until(ExpectedConditions
                .visibilityOfAllElementsLocatedBy(mobileResults));

        List<WebElement> mobiles =
                driver.findElements(mobileResults);

        WebElement lastMobile =
                mobiles.get(mobiles.size() - 1);

        String mobileName =
                lastMobile.getText();

        System.out.println(
                "Last Displayed Mobile : "
                        + mobileName);

        return mobileName;
    }
}