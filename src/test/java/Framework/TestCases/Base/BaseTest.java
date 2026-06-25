package Framework.TestCases.Base;

import Framework.Utility.ConfigReader;
import Framework.Utility.DriverFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import Framework.Reporting.TestListener;

@Listeners(TestListener.class)
public class BaseTest {

    @BeforeClass
    public void setup() {
        DriverFactory.initializeDriver();
    }

    @AfterClass
    public void tearDown() throws InterruptedException {

        ConfigReader config = new ConfigReader();

        Thread.sleep(config.getCloseDelay() * 1000);

        DriverFactory.quitDriver();
    }
}