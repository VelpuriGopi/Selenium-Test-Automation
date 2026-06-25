package Framework.TestCases;

import Framework.Utility.DriverFactory;
import Framework.Utility.SearchMethods;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class TC022_SearchNoResults extends BaseTest {

    @Test
    public void searchNoResultsTest() {

        SearchMethods search =
                new SearchMethods(
                        DriverFactory.getDriver());

        search.searchProduct(
                "jehdlsiuh");

        WebDriverWait wait =
                new WebDriverWait(
                        DriverFactory.getDriver(),
                        Duration.ofSeconds(15));

        wait.until(driver ->
                driver.getPageSource()
                        .contains("There are no products found."));

        String pageSource =
                DriverFactory.getDriver()
                        .getPageSource();

        Assert.assertTrue(
                pageSource.contains(
                        "There are no products found."),
                "No Results Message Not Displayed");

        System.out.println(
                "No Results Validation Successful");
    }
}