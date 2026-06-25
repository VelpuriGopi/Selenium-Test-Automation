package Framework.TestCases;

import Framework.Utility.DriverFactory;
import Framework.Utility.ProductMethods;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC018_ProductStockValidation
        extends BaseTest {

    @Test
    public void productStockValidationTest() {

        ProductMethods product =
                new ProductMethods(
                        DriverFactory.getDriver());

        product.clickFirstProduct();

        boolean inStock =
                product.isProductInStock();

        System.out.println(
                "Product In Stock : "
                        + inStock);

        Assert.assertTrue(
                inStock,
                "Product Is Out Of Stock");

        System.out.println(
                "Stock Validation Successful");
    }
}