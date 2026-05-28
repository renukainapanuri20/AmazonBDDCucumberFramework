package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class DriverFactory {

    public static WebDriver driver;

    public static WebDriver initDriver() {

        try {

            System.out.println("Setting up ChromeDriver...");

            WebDriverManager.chromedriver().setup();

            System.out.println("ChromeDriver Setup Complete");

            ChromeOptions options = new ChromeOptions();

            options.addArguments("--remote-allow-origins=*");

            options.addArguments("--disable-notifications");

            options.addArguments("--start-maximized");

            options.addArguments("--disable-blink-features=AutomationControlled");

            System.out.println("Launching Chrome Browser...");

            driver = new ChromeDriver(options);

            System.out.println("Browser Launched Successfully");

            driver.manage().timeouts()
                    .implicitlyWait(Duration.ofSeconds(10));

        } catch (Exception e) {

            System.out.println("Driver Error: " + e.getMessage());

            e.printStackTrace();
        }

        return driver;
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public static void quitDriver() {

        try {

            if(driver != null) {

                driver.quit();

                driver = null;
            }

        } catch (Exception e) {

            System.out.println("Browser not closed properly");
        }
    }
}