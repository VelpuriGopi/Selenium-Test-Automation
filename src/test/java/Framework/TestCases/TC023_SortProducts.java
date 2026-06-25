
package Framework.TestCases;

import Framework.Utility.DriverFactory;
import Framework.Utility.SortMethods;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC023_SortProducts
        extends BaseTest {

    @Test
    public void sortProductsTest()
            throws InterruptedException {

        SortMethods sort =
                new SortMethods(
                        DriverFactory.getDriver());

        sort.sortByPriceHighToLow();

        Thread.sleep(3000);

        String pageSource =
                DriverFactory.getDriver()
                        .getPageSource();

        Assert.assertTrue(
                pageSource.length() > 0,
                "Products Not Displayed");

        System.out.println(
                "Sort Validation Successful");
    }
}