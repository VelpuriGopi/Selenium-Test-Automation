package Framework.Utility;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class DriverFactory {

    private static WebDriver driver;

    public static WebDriver initializeDriver() {

        ConfigReader config = new ConfigReader();

        String browser = config.getBrowser();

        switch (browser.toLowerCase()) {

            case "chrome":

                WebDriverManager.chromedriver().setup();

                ChromeOptions options = new ChromeOptions();

                // Required for GitHub Actions (Linux)
                if (System.getProperty("os.name").toLowerCase().contains("linux")) {

                    options.addArguments("--headless=new");
                    options.addArguments("--no-sandbox");
                    options.addArguments("--disable-dev-shm-usage");
                    options.addArguments("--window-size=1920,1080");
                }

                driver = new ChromeDriver(options);
                break;

            default:
                throw new RuntimeException(
                        "Browser not supported : " + browser);
        }

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(
                Duration.ofSeconds(config.getImplicitWait()));

        driver.get(config.getBaseUrl());

        return driver;
    }

    public static WebDriver getDriver() {

        return driver;
    }

    public static void quitDriver() {

        if (driver != null) {

            driver.quit();
        }
    }
}