package Framework.TestCases;

import Framework.Utility.CartMethods;
import Framework.Utility.CheckoutMethods;
import Framework.Utility.DriverFactory;
import Framework.Utility.ProductMethods;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC013_CheckoutNavigation extends BaseTest {

    @Test
    public void checkoutTest() throws InterruptedException {

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

        CheckoutMethods checkout =
                new CheckoutMethods(
                        DriverFactory.getDriver());

        checkout.proceedToCheckout();

        String currentUrl =
                DriverFactory.getDriver()
                        .getCurrentUrl();

        Assert.assertTrue(
                currentUrl.contains("checkout"),
                "Checkout Page Not Opened");

        System.out.println(
                "Checkout Page Opened Successfully");
    }
}