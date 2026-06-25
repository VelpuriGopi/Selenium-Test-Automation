package Framework.TestCases;

import Framework.TestCases.Base.BaseTest;
import Framework.Utility.CartMethods;
import Framework.Utility.DriverFactory;
import Framework.Utility.ProductMethods;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC019_CartCountValidation
        extends BaseTest {

    @Test
    public void cartCountValidationTest() {

        ProductMethods product =
                new ProductMethods(
                        DriverFactory.getDriver());

        product.clickFirstProduct();

        CartMethods cart =
                new CartMethods(
                        DriverFactory.getDriver());

        cart.addProductToCart();

        String cartCount =
                cart.getCartCount();

        System.out.println(
                "Cart Count : "
                        + cartCount);

        Assert.assertEquals(
                cartCount,
                "1",
                "Cart Count Mismatch");

        System.out.println(
                "Cart Count Validation Successful");
    }
}