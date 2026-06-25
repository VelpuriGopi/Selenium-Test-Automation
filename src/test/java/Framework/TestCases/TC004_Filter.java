package Framework.TestCases;

import Framework.TestCases.Base.BaseTest;
import Framework.Utility.DriverFactory;
import Framework.Utility.FilterMethods;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC004_Filter extends BaseTest {

    @Test
    public void verifyHammerFilter() throws InterruptedException {

        FilterMethods filter =
                new FilterMethods(
                        DriverFactory.getDriver());

        filter.selectHammerFilter();

        Assert.assertTrue(
                filter.getFilteredProductCount() > 0,
                "No Products Displayed After Applying Filter");

        System.out.println(
                "Filter Applied Successfully");
    }
}