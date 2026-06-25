package Framework.TestCases;

import Framework.TestCases.Base.BaseTest;
import Framework.Utility.DriverFactory;
import Framework.Utility.SearchMethods;
import Framework.Utility.SearchResultMethods;
import Framework.Utility.TestDataReader;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC003_Search extends BaseTest {

    @Test
    public void searchProductTest() {

        SearchMethods search =
                new SearchMethods(
                        DriverFactory.getDriver());

        TestDataReader data =
                new TestDataReader();

        search.searchProduct(
                data.getData("searchProduct"));

        SearchResultMethods result =
                new SearchResultMethods(
                        DriverFactory.getDriver());

        Assert.assertTrue(
                result.isProductPresent(
                        data.getData("searchProduct")),
                "Product Not Found In Search Results");

        System.out.println(
                "Search Test Passed");
    }
}