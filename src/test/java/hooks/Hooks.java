package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.DriverFactory;

public class Hooks {

    @Before
    public void setup() {

        System.out.println("Starting Browser");

        DriverFactory.initDriver();
    }

    @After
    public void tearDown(Scenario scenario) {

        try {

            if (scenario.isFailed()) {

                byte[] screenshot =
                        ((TakesScreenshot) DriverFactory.getDriver())
                                .getScreenshotAs(OutputType.BYTES);

                scenario.attach(screenshot,
                        "image/png",
                        "Failure Screenshot");
            }

        } catch (Exception e) {

            System.out.println("Screenshot Failed");
        }

        finally {

            System.out.println("Closing Browser");

            DriverFactory.quitDriver();
        }
    }
}