package Framework.TestCases;

import Framework.Utility.ConfigReader;
import Framework.Utility.DriverFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTest {

    @BeforeSuite
    public void setup() {

        DriverFactory.initializeDriver();
    }

    @AfterSuite
    public void tearDown() throws InterruptedException {

        ConfigReader config =
                new ConfigReader();

        Thread.sleep(
                config.getCloseDelay() * 1000);

        DriverFactory.quitDriver();
    }
}