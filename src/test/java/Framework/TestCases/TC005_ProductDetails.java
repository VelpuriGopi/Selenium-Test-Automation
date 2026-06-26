package Framework.TestCases;

import Framework.Base.BaseTest;
import Framework.Utility.DriverFactory;
import Framework.Utility.ProductMethods;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC005_ProductDetails extends BaseTest {

    @Test
    public void verifyProductDetails() {

        ProductMethods product =
                new ProductMethods(
                        DriverFactory.getDriver());

        product.clickFirstProduct();

        String productName =
                product.getProductName();

        System.out.println(
                "Product Name : "
                        + productName);

        Assert.assertTrue(
                product.isAddToCartDisplayed(),
                "Add To Cart Button Not Displayed");

        System.out.println(
                "Product Details Verified Successfully");
    }
}