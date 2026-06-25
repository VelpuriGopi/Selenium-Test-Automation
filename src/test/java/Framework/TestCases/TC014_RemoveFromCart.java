package Framework.TestCases;

import Framework.Utility.CartMethods;
import Framework.Utility.DriverFactory;
import Framework.Utility.ProductMethods;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC014_RemoveFromCart extends BaseTest {

    @Test
    public void removeFromCartTest() {

        ProductMethods product =
                new ProductMethods(
                        DriverFactory.getDriver());

        product.openSecondProduct();

        CartMethods cart =
                new CartMethods(
                        DriverFactory.getDriver());

        cart.addProductToCart();

        System.out.println(
                "Product Added To Cart");

        cart.openCart();

        String cartCountBefore =
                cart.getCartCount();

        System.out.println(
                "Cart Count Before Remove : "
                        + cartCountBefore);

        Assert.assertEquals(
                cartCountBefore,
                "1",
                "Product Not Added To Cart");

        cart.removeProduct();

        String cartCountAfter =
                cart.getCartCount();

        System.out.println(
                "Cart Count After Remove : "
                        + cartCountAfter);

        DriverFactory.getDriver()
                .navigate()
                .refresh();

        String pageSource =
                DriverFactory.getDriver()
                        .getPageSource();

        Assert.assertFalse(
                pageSource.contains("Combination Pliers"),
                "Product Still Present In Cart");

        System.out.println(
                "Product Removed Successfully");
    }
}