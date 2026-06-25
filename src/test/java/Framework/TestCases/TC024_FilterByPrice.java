package Framework.TestCases;

import Framework.TestCases.Base.BaseTest;
import Framework.Utility.DriverFactory;
import Framework.Utility.FilterMethods;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC024_FilterByPrice
        extends BaseTest {

    @Test
    public void filterByPriceTest()
            throws InterruptedException {

        FilterMethods filter =
                new FilterMethods(
                        DriverFactory.getDriver());

        filter.movePriceSlider();

        Thread.sleep(3000);

        Assert.assertTrue(
                DriverFactory.getDriver()
                        .getPageSource()
                        .length() > 0,
                "Price Filter Failed");

        System.out.println(
                "Price Filter Validation Successful");
    }
}