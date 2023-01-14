package co.choucair.tests.stepDefinition;

import configuration.WebDriver;
import cucumber.api.java.Before;
import cucumber.api.java.After;
import org.choucair.reporting.Reporter;
import co.choucair.utils.WebData;
import static java.lang.String.format;

public class webHooks {

    private static WebDriver driver;

    @Before
    public static void setUp() {

        Reporter.info("Deleting all cookies");
        driver = new WebDriver(WebData.returnData("browser"));
        driver.getDriver().manage().deleteAllCookies();
        Reporter.info(format("Navigating to %s", WebData.returnData("url")));
        driver.getDriver().get(WebData.returnData("url"));
        driver.getDriver().manage().window().maximize();
    }

    @After
    public static void tearDown() {
        Reporter.info("Closing the browser");
        driver.getDriver().quit();
    }


    public static org.openqa.selenium.WebDriver getDriver() {
        return driver.getDriver();
    }
}
